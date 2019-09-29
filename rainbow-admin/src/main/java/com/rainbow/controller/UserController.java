package com.rainbow.controller;

import com.rainbow.common.annocation.OperationRecord;
import com.rainbow.common.enums.OperationRecordEnum;
import com.rainbow.common.exception.ExcelException;
import com.rainbow.common.model.ApiResultEntity;
import com.rainbow.model.dto.ExportUserInfoDTO;
import com.rainbow.model.dto.GetDataByKeyDTO;
import com.rainbow.model.dto.InsertDTO;
import com.rainbow.model.dto.SendSmsDTO;
import com.rainbow.model.vo.SendSmsVO;
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
 * @author dengjie9527
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
        try {
            userService.importUserInfo(file);
        } catch (ExcelException e) {
            e.printStackTrace();
        }
        return ApiResultEntity.Builder.init().success().bulid();
    }

    @ApiOperation(value = "导出用户信息",tags = "导出用户信息接口",httpMethod = "POST")
    @PostMapping("/exportUserInfo")
    public void exportUserInfo(@RequestBody ExportUserInfoDTO dto ,HttpServletResponse response){
          userService.exportUserInfo(dto,response);
    }

    @ApiOperation(value = "使用redis生成自增序列号",tags = "使用redis生成自增序列号,保存用户信息到redis",httpMethod = "POST")
    @PostMapping("/saveUserInfoToRedis")
    public ApiResultEntity saveUserInfoToRedis(@RequestBody InsertDTO dto){
        int result = userService.saveUserInfoToRedis(dto);
        return ApiResultEntity.Builder.init().success().withData(result).bulid();
    }

    @ApiOperation(value = "获取redis中保存的信息",tags = "获取redis中保存的信息",httpMethod = "POST")
    @PostMapping("/getDataByKey")
    public ApiResultEntity getDataByKey(@RequestBody GetDataByKeyDTO dto){
        userService.getDataByKey(dto);
        return ApiResultEntity.Builder.init().success().bulid();
    }

    @ApiOperation(value = "springboot整合阿里云短信服务",tags = "springboot整合阿里云短信服务",httpMethod = "POST")
    @PostMapping("/sendSms")
    public ApiResultEntity<SendSmsVO> sendSms(@RequestBody SendSmsDTO dto){
        SendSmsVO entity = userService.sendSms(dto);
        return ApiResultEntity.Builder.init().success().withData(entity).bulid();
    }
}
