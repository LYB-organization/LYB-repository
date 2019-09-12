package com.rainbow.model.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 导出用户信息实体
 * author  DENGJIE9527
 * date 2019/8/22
 */
@Data
@EqualsAndHashCode
public class ExportUserInfoVO extends BaseRowModel {

    @ExcelProperty(value = {"用户编号"},index = 0)
    private String serialNo;

    @ExcelProperty(value = {"姓名"},index = 1)
    private String username;

    @ExcelProperty(value = {"密码"},index = 2)
    private String password;
}
