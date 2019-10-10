package com.rainbow.service;

import com.rainbow.common.exception.ExcelException;
import com.rainbow.model.dto.*;
import com.rainbow.model.entity.UserInfo;
import com.rainbow.model.vo.SendSmsVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
public interface UserService {

    /**
     * 查询用户信息
     * @param dto
     * @return
     */
    List<UserInfo> queryUserInfoList(QueryUserInfoDTO dto);
    /**
     *新增用户
     * @param dto
     */
    int addUser(InsertDTO dto);

    /**
     * 导入用户信息
     * @param file
     */
    void importUserInfo(MultipartFile file) throws ExcelException;

    /**
     * 导出用户信息
     * @param dto
     */
    void exportUserInfo(ExportUserInfoDTO dto, HttpServletResponse response);

    /**
     * 保存用户信息到redis
     * @param dto
     * @return
     */
    int saveUserInfoToRedis(InsertDTO dto);

    /**
     * 根据key获取redis数据
     * @param dto
     */
    void getDataByKey(GetDataByKeyDTO dto);

    /**
     * Springboot整合阿里云短信服务
     * @param dto
     */
    SendSmsVO sendSms(SendSmsDTO dto);

    /**
     * Springboot整合邮件发送服务
     * @param dto
     */
    void sendEmail(SendEmailDTO dto);


}
