package com.rainbow.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期转换工具类
 * author  dengjie9527
 * date 2019/9/17
 */
public class DateUtil {

    public static final String dateToString(Date date){
        return new SimpleDateFormat("yyyyMMdd").format(date);
    }
}
