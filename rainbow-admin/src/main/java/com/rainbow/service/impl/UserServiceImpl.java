package com.rainbow.service.impl;


import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.rainbow.common.enums.SerialNoEnum;
import com.rainbow.common.exception.ExcelException;
import com.rainbow.common.exception.ServerException;
import com.rainbow.common.service.SerialNoService;
import com.rainbow.enums.ResultCodeEnum;
import com.rainbow.enums.StatusEnum;
import com.rainbow.mapper.UserInfoMapper;
import com.rainbow.model.dto.*;
import com.rainbow.model.entity.UserInfo;
import com.rainbow.model.vo.ExportUserInfoVO;
import com.rainbow.model.vo.QueryUserInfoVO;
import com.rainbow.model.vo.SendSmsVO;
import com.rainbow.model.vo.UserInfoEntity;
import com.rainbow.service.UserService;
import com.rainbow.util.ExcelUtil;
import com.rainbow.util.RedisUtil;
import com.rainbow.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Resource
    private SerialNoService serialNoService;

    @Resource
    private JavaMailSender javaMailSender;

    @Value("${mail.fromMail.addr}")
    private String sendPeople;


    /**
     * 查询用户信息
     * @param dto
     * @return
     */
    @Override
    public List<UserInfo> queryUserInfoList(QueryUserInfoDTO dto) {

        UserInfo build = UserInfo.Build()
                .username(dto.getUsername())
                .status(StatusEnum.VALID.getCode())
                .build();
        List<UserInfo> list = userInfoMapper.queryUserInfo(build);

        return list;
    }

    @Override
    public int addUser(InsertDTO dto) {
        UserInfo build = UserInfo.Build()
                .serialNo(dto.getSerialNo())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();
        return userInfoMapper.insertUserInfo(build);
    }

    @Override
    public void importUserInfo(MultipartFile file) {

        //解析数据
        List<UserInfoEntity> list = null;
        try {
            list = ExcelUtil.readExcel(file, UserInfoEntity.class, 1, 1);
        } catch (ExcelException e) {
            e.printStackTrace();
        }
        log.info("解析数据:UserServiceImpl_readExcel_list={}", JSON.toJSONString(list));
        if (CollectionUtils.isEmpty(list)){
            throw new ServerException(ResultCodeEnum.FAILED);
        }

        //TODO 校验数据
        //数据入库
        int result = userInfoMapper.importUserInfo(list);

    }

    @Override
    public void exportUserInfo(ExportUserInfoDTO dto, HttpServletResponse response) {
        String fileName = "用户信息";

        List<ExportUserInfoVO> exportList = new ArrayList<>();

        List<ExportUserInfoVO> list = userInfoMapper.export(dto);

        exportList.addAll(list);
        log.info("获取用户信息出参:UserServiceImpl_exportUserInfo_list={}", JSON.toJSONString(list));

        try {
            ExcelUtil.writeExcel(response, exportList, fileName, null, ExcelTypeEnum.XLSX, ExportUserInfoVO.class);
        } catch (ExcelException e) {
            log.error("导出失败", e);
            e.printStackTrace();
        }
    }

    /**
     * 将用户信息保存到redis
     * @param dto
     * @return
     */
    @Override
    public int saveUserInfoToRedis(InsertDTO dto) {

        //将数据入库
        UserInfo build = UserInfo.Build()
                .serialNo(serialNoService.generateSerialNo(SerialNoEnum.USER_PK))
                .username(dto.getUsername())
                .password(dto.getPassword())
                .build();

        log.info("UserServiceImpl_exportUserInfo_build={}", build);
        int i = userInfoMapper.insertUserInfo(build);

        //将数据放入缓存中
        boolean result = redisUtil.set(build.getSerialNo(), dto, 60 * 60 * 24);

        if (!result){
            throw new ServerException(ResultCodeEnum.SAVE_REDIS);
        }

        return i;
    }

    /**
     * 根据key获取redis中的数据
     * @param dto
     */
    @Override
    public void getDataByKey(GetDataByKeyDTO dto) {

    }

    /**
     * Springboot整合阿里云短信服务
     * @param dto
     */
    @Override
    public SendSmsVO sendSms(SendSmsDTO dto) {

        //生成四位随机数
        String code = String.valueOf(StringUtil.getRandomId());

        String templateParam = "{'code':"+code+"}";

        DefaultProfile profile = DefaultProfile.getProfile("深圳", "LTAIuendnR1eRxPJ", "u8VypXm1CiwmP7b1wMZzeRg2928T2w");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "深圳");
        request.putQueryParameter("PhoneNumbers", dto.getPhone());
        request.putQueryParameter("SignName", "催清收运营平台");
        request.putQueryParameter("TemplateCode", "SMS_174992215");
        request.putQueryParameter("TemplateParam", templateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            log.info("信息返回参数:UserServiceImpl_getCommonResponse_response={}", response);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }

        return SendSmsVO.builder().verificationCode(code).build();
    }

    /**
     * Springboot整合邮件发送服务
     * @param dto
     */
    @Override
    public void sendEmail(SendEmailDTO dto) {

        //创建邮件对象
        SimpleMailMessage message = new SimpleMailMessage();

        //设置发送人
        message.setFrom(sendPeople);

        //设置目标邮箱号
        message.setTo(dto.getToEmailAddress());

        //设置邮件主题
        message.setSubject(dto.getSubject());

        //设置邮件内容
        message.setText(dto.getContent());


        try {
            javaMailSender.send(message);

            log.info("邮件发送成功!!!");
        }catch (Exception e){
            log.error("发送简单邮件时发生异常。");
        }
    }
}

































