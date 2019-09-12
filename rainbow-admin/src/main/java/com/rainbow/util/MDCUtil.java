package com.rainbow.util;


import org.apache.commons.lang.StringUtils;
import org.slf4j.MDC;

import java.util.UUID;

/**
 * author  DENGJIE9527
 * date 2019/7/29
 */
public class MDCUtil {

    public static void put(String value){
        if (StringUtils.isNotBlank(value)){
            MDC.put("traceId", value);
            return;
        }

    }

    public static String get(){
        return MDC.get("traceId");
    }

    public static void remove(){
        MDC.remove("traceId");
    }

    public static void clear(){
        MDC.clear();
    }
    public static String getTraceId(){
        String traceId = get();

        if (StringUtils.isBlank(traceId)){
            traceId = UUID.randomUUID().toString().replace("-", "");
        }
        return traceId;
    }
}
