package com.rainbow.common.service;

import com.rainbow.common.enums.SerialNoEnum;

/**
 * 序列号生成接口
 * author  dengjie9527
 * date 2019/9/17
 */
public interface SerialNoService {

    String generateSerialNo(SerialNoEnum serialNoEnum);
}
