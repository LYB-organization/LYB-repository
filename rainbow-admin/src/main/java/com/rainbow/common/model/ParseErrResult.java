package com.rainbow.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * author  dengjie9527
 * date 2019/9/11
 */
@Data
@ApiModel
public class ParseErrResult {

    @ApiModelProperty(value = "错误行号")
    private Integer rowNo;

    @ApiModelProperty(value = "错误信息")
    private String msg;
}
