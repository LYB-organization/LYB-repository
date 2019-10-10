package com.rainbow.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Springboot整合邮件服务入参实体
 * author  dengjie9527
 * date 2019/9/29
 */
@Data
@ApiModel
public class SendEmailDTO {

    @ApiModelProperty(value = "目标邮箱号",required = true)
    private String toEmailAddress;

    @ApiModelProperty(value = "邮件主题")
    private String subject;

    @ApiModelProperty(value = "邮件内容")
    private String content;
}
