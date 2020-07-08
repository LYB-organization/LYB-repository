package com.rainbow.rainboweureka.statedemo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author xiaoming
 * @Date 2020/7/8
 */

public class AppContext implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static <T> T getBean (Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

}
