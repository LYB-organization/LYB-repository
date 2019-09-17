package com.rainbow.common.enums;

/**
 * author  dengjie9527
 * date 2019/9/17
 */
public enum SerialNoEnum {

    USER_SerialNo("U","4",true),

    ;


    private String prefix;
    private String number;
    private boolean isIncludeDate;

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public String getPrefix(){
        return prefix;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public String getNumber(){
        return number;
    }

    public void setIncludeDate(boolean isIncludeDate){
        this.isIncludeDate = isIncludeDate;
    }

    public boolean isIncludeDate(){
        return isIncludeDate;
    }
    /**
     *
     * @param prefix 序列号前缀
     * @param number 序列号数字长度
     * @param isIncludeDate  是否需要日期
     */
    SerialNoEnum(String prefix,String number,boolean isIncludeDate){
        this.prefix = prefix;
        this.number = number;
        this.isIncludeDate = isIncludeDate;
    }
}
