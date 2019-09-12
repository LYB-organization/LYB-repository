package com.rainbow.common.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * author  DENGJIE9527
 * date 2019/8/22
 */
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger2Config {

    @Bean
    public Docket createRestApi(@Value("${spring.profiles.active}") String env) {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //包路径
                .apis(RequestHandlerSelectors.basePackage("com.rainbow"))
                .paths("prd".equals(env)?PathSelectors.none():PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("天虹平台接口文档")
                //创建人
                .contact(new Contact("深圳天虹平台开发团队", "NA", "544589775@qq.com"))
                //描述
                .description("深圳天虹平台开发团队接口文档")
                //版本
                .version("1.0")
                .build();
    }
}
