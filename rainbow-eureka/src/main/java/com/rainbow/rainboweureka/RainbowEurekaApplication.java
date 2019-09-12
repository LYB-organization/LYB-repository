package com.rainbow.rainboweureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RainbowEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RainbowEurekaApplication.class, args);
    }

}
