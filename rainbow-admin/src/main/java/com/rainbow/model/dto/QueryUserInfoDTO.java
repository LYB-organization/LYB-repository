package com.rainbow.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 查询用户信息入参实体
 * author  dengjie9527
 * date 2019/10/10
 */
@Data
@ApiModel
public class QueryUserInfoDTO {

    @ApiModelProperty(value = "用户名称")
    private String username;
}
