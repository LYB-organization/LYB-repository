package com.rainbow.common.enums;

/**
 * 操作记录枚举
 * author  DENGJIE9527
 * date 2019/9/2
 */
public enum OperationRecordEnum {

    SELECT("0","查找"),
    INSERT("1","新增"),
    UPDATE("2","修改"),
    DELETE("3","删除"),
    UPLOAD("4","上传"),
    DOWNLOAD("5","下载"),
    ;

    private String code;

    private String msg;

    private void setCode(String code){
        this.code = code;
    }

    private void setMsg(String msg){
        this.msg = msg;
    }

    public String getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }

    OperationRecordEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
