package com.rainbow.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * springboot整合阿里云短信服务出参实体
 * author  dengjie9527
 * date 2019/9/29
 */
@Data
@ApiModel
public class SendSmsVO implements Serializable {

    @ApiModelProperty(value = "验证码")
    private String verificationCode;
}
