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
import com.rainbow.mapper.UserInfoMapper;
import com.rainbow.model.dto.ExportUserInfoDTO;
import com.rainbow.model.dto.GetDataByKeyDTO;
import com.rainbow.model.dto.InsertDTO;
import com.rainbow.model.dto.SendSmsDTO;
import com.rainbow.model.entity.UserInfo;
import com.rainbow.model.vo.ExportUserInfoVO;
import com.rainbow.model.vo.SendSmsVO;
import com.rainbow.model.vo.UserInfoEntity;
import com.rainbow.service.UserService;
import com.rainbow.util.ExcelUtil;
import com.rainbow.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", "18127762791");
        request.putQueryParameter("SignName", "[测试专用]阿里云通信");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }

        return null;
    }
}
