package com.rainbow.util;

import org.springframework.context.ApplicationContext;

/**
 * author  DENGJIE9527
 * date 2019/8/6
 */
public class SpringContextUtil {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext applicationContext){
        SpringContextUtil.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    public static<T> T getBeen(Class<T> Clazz){
        return applicationContext.getBean(Clazz);
    }
}
