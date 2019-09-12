package com.rainbow.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * author  DENGJIE9527
 * date 2019/7/30
 * @author HP
 */
@Data
@ApiModel
public class InsertDTO implements Serializable {

    @ApiModelProperty(value = "唯一标识")
    private String serialNo;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;
}
