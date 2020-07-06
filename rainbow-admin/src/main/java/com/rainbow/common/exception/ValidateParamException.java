package com.rainbow.common.exception;

import lombok.Builder;
import lombok.Data;

/**
 * @Author xiaoming
 * @Date 2020/7/4
 */

@Data
@Builder
public class ValidateParamException extends Exception {

    private String code;

    public ValidateParamException (String msg) {
        super(msg);
    }

    public ValidateParamException (String code, String msg) {
        super(msg);
        this.code = code;
    }

}
