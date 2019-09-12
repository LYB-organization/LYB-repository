package com.rainbow.common.annocation;

import com.rainbow.common.enums.OperationRecordEnum;

import java.lang.annotation.*;

/**
 * 操作记录注解
 * author  DENGJIE9527
 * date 2019/9/2
 */
@Target(value = {ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperationRecord {

    String desc() default "";

    String bizType() default "";

    OperationRecordEnum operationType();
}
