package com.rainbow.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 根据key获取redis数据
 * author  dengjie9527
 * date 2019/9/23
 */
@Data
@ApiModel
public class GetDataByKeyDTO implements Serializable {

    @ApiModelProperty(value = "redisKey")
    private String redisKey;
}
