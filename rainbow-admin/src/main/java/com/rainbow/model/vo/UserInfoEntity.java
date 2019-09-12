package com.rainbow.model.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * author  dengjie9527
 * date 2019/9/11
 */
@Data
@ApiModel
public class UserInfoEntity extends BaseRowModel {

    @ApiModelProperty(value = "当前行数")
    private Integer currentRow;

    @ExcelProperty(value = {"用户编号"},index = 0)
    private String serialNo;

    @ExcelProperty(value = {"姓名"},index = 1)
    private String username;

    @ExcelProperty(value = {"密码"},index = 2)
    private String password;
}
