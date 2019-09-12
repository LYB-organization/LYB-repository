package com.rainbow.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 导入返回实体
 * 实现序列化接口目的:方便存储和传输(Nosql数据库和分布式模块之间的调用)
 * author  dengjie9527
 * date 2019/9/11
 */
@Data
public class PraseBaseResult implements Serializable {

    private List<ParseErrResult> parseErrList;
}
