package com.rainbow.rainbowadmin;

import com.rainbow.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.rainbow.mapper")
@ComponentScan({"com.rainbow.common.**","com.rainbow.common.config","com.rainbow.**"})
@EnableEurekaClient
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "com.rainbow.**")
@Slf4j
public class RainbowAdminApplication {

    public static void main(String[] args) {

        try {
            ApplicationContext context = SpringApplication.run(RainbowAdminApplication.class, args);
            SpringContextUtil.setApplicationContext(context);
        }catch (Exception e){
            log.error("启动报错:{}", e.getMessage());
        }
    }

}
