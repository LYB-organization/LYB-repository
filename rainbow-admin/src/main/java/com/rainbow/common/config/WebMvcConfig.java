package com.rainbow.common.config;

import com.rainbow.interceptor.RequestLogInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * WebMvc配置类
 * author  DENGJIE9527
 * date 2019/7/29
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private RequestLogInterceptor requestLogInterceptor;

    /**
     * 注册拦截器
     * addInterceptor ：拦截器对象
     * excludePathPatterns :指定需要拦截的请求
     * excludePathPatterns :排除需要拦截的请求
     */
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(requestLogInterceptor).addPathPatterns("/**").excludePathPatterns("/doc.html");
    }

    /**
     * 配置静态资源处理
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
