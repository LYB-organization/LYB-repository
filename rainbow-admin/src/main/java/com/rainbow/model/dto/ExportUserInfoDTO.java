package com.rainbow.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 导出用户信息入参实体
 * author  DENGJIE9527
 * date 2019/8/22
 */
@Data
public class ExportUserInfoDTO implements Serializable {

    @ApiModelProperty(value = "用户编号")
    private String serialNo;

    @ApiModelProperty(value = "姓名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "状态 : 0-有效,1-无效")
    private String status;
}
