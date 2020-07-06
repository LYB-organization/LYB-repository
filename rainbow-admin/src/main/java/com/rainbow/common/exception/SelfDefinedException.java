package com.rainbow.common.exception;

import lombok.Builder;

/**
 * @Author xiaoming
 * @Date 2020/7/4
 */

@Builder
public class SelfDefinedException extends Exception {

    public SelfDefinedException (String msg) {
        super(msg);
    }

}
