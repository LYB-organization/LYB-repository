package com.rainbow.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * springboot整合阿里云短信服务接口入参
 * author  dengjie9527
 * date 2019/9/29
 */
@Data
@ApiModel
public class SendSmsDTO {

    @ApiModelProperty(value = "手机号")
    private String phone;
}
