package com.rainbow.util;

import org.springframework.util.StringUtils;

import java.util.UUID;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
public class StringUtil extends StringUtils {

    /**
     * 获取uuid随机数
     * @return
     */
    public static String getUUID(){
        return  UUID.randomUUID().toString().replaceAll("-","" );
    }
}
