package com.rainbow.common.exception;

import com.rainbow.enums.ResultCodeEnum;
import lombok.Data;

/**
 * 服务异常类
 * author  dengjie9527
 * date 2019/9/11
 */
@Data
public class ServerException extends RuntimeException{

    private String code;

    public ServerException(String code,String msg){
        super(msg);
        this.code = code;
    }

    public ServerException(ResultCodeEnum codeEnum){
        super(codeEnum.getMsg());
        this.code = codeEnum.getCode();
    }
}
