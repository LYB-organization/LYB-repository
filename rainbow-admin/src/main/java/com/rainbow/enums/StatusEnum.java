package com.rainbow.enums;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
public enum StatusEnum {

    VALID("0","有效"),
    INVALID("1","无效")
    ;

    private String code;

    private String msg;

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }

    public String getMsg(){
        return msg;
    }
    StatusEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
