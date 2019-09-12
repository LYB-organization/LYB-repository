package com.rainbow.controller;

import com.rainbow.common.annocation.OperationRecord;
import com.rainbow.common.enums.OperationRecordEnum;
import com.rainbow.common.model.ApiResultEntity;
import com.rainbow.model.dto.ExportUserInfoDTO;
import com.rainbow.model.dto.InsertDTO;
import com.rainbow.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * @author HP
 */
@Api(value = "springboot整合swagger2测试接口",tags = {"springboot整合swagger2测试接口","Version-1.00"})
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "新增用户接口",tags = "新增用户接口",httpMethod = "POST")
    @PostMapping("/insert")
    @OperationRecord(bizType = "用户模块",desc = "新增用户信息",operationType = OperationRecordEnum.INSERT)
    public ApiResultEntity insert(@RequestBody @Validated InsertDTO dto){
        int result = userService.addUser(dto);
        return ApiResultEntity.Builder.init().success().withData(result).bulid();
    }

    @ApiOperation(value = "导入用户信息",tags = "上传用户信息接口",httpMethod = "POST")
    @PostMapping("/importUserInfo")
    public ApiResultEntity importUserInfo(@RequestParam("file") MultipartFile file){
         userService.importUserInfo(file);
        return ApiResultEntity.Builder.init().success().bulid();
    }

    @ApiOperation(value = "导出用户信息",tags = "导出用户信息接口",httpMethod = "POST")
    @PostMapping("/exportUserInfo")
    public void exportUserInfo(@RequestBody ExportUserInfoDTO dto ,HttpServletResponse response){
          userService.exportUserInfo(dto,response);
    }
}
