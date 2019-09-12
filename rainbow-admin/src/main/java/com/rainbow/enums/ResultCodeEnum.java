package com.rainbow.enums;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * author  DENGJIE9527
 * date 2019/7/29
 */
public enum  ResultCodeEnum {

    SUCCESS("000000","成功"),
    FAILED("999999","失败")
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

    ResultCodeEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code获取msg
     */
    public String getMsgByCode(String code){
        if (StringUtils.isBlank(code)){
            return "";
        }
        ResultCodeEnum[] values = ResultCodeEnum.values();
        for (int i = 0; i <values.length ; i++) {
            if (values[i].getCode().equals(code)){
                return values[i].getMsg();
            }
        }
        return "";
    }

    /**
     * 根据msg获取code
     * @param msg
     * @return
     */
    public String getCodeByMsg(String msg){
        if (StringUtils.isBlank(msg)){
            return "";
        }
        ResultCodeEnum[] values = ResultCodeEnum.values();
        for (int i = 0; i <values.length ; i++) {
            if (values[i].getMsg().equals(msg)){
                return values[i].getCode();
            }
        }
        return "";
    }

    /**
     * 获取枚举列表
     */
    public List<ResultCodeEnum> getResultCodeEnumList(){
        List<ResultCodeEnum> list = new ArrayList<>();

        ResultCodeEnum[] values = ResultCodeEnum.values();
        for (int i = 0; i < values.length; i++) {
            list.add(values[i]);
        }

        return list;
    }
}
