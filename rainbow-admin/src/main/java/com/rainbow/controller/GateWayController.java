package com.rainbow.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author  dengjie9527
 * date 2019/10/10
 */
@Api(value = "SpringCould-Gateway网关测试",tags = {"网关测试","Version-1.00"})
@RestController
@RequestMapping("/gateway")
@Slf4j
public class GateWayController {

    /**
     * 给匹配的请求路径添加参数和值
     * AddRequestParameter GatewayFilter
     * @param str
     * @return
     */
    @RequestMapping("/addRequestParameter")
    public String addRequestParameter(String str) {
        return "hello "+str+"!";
    }
}
