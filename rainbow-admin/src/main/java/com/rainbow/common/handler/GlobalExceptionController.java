package com.rainbow.common.handler;

import com.rainbow.common.exception.ServerException;
import com.rainbow.common.exception.ValidateParamException;
import com.rainbow.common.model.ApiResultEntity;
import com.rainbow.enums.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author xiaoming
 * @Date 2020/7/4
 */

@Slf4j
@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResultEntity validateParamExceptionHandler (MethodArgumentNotValidException exception) {
        log.info("参数校验失败:{}", exception.getMessage());
        return ApiResultEntity.Builder
                .init()
                .error(ResultCodeEnum.VALIDATE_PARAM_ERROR)
                .bulid();
    }

    @ExceptionHandler(ValidateParamException.class)
    public ApiResultEntity validateParamExceptionHandler (ValidateParamException exception) {
        log.info("参数校验失败:{}", exception.getMessage());
        return ApiResultEntity.Builder
                .init()
                .error(ResultCodeEnum.VALIDATE_PARAM_ERROR)
                .bulid();
    }

    @ExceptionHandler(ServerException.class)
    public ApiResultEntity runtimeExceptionHandler (ServerException exception) {
        log.info("运行时异常:{}", exception.getMessage());
        return ApiResultEntity.Builder
                .init()
                .error(ResultCodeEnum.SERVER_EXCEPTION)
                .bulid();
    }

    @ExceptionHandler(Exception.class)
    public ApiResultEntity serverExceptionHandler (Exception exception) {
        log.info("未知异常:{}", exception.getMessage());
        return ApiResultEntity.Builder
                .init()
                .error(ResultCodeEnum.FAILED)
                .bulid();
    }

}
