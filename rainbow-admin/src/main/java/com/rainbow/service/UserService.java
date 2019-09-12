package com.rainbow.service;

import com.rainbow.common.exception.ExcelException;
import com.rainbow.model.dto.ExportUserInfoDTO;
import com.rainbow.model.dto.InsertDTO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
public interface UserService {

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




}
