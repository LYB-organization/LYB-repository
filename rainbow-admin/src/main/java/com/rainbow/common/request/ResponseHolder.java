package com.rainbow.common.request;

import com.rainbow.common.model.ApiResultEntity;
import org.springframework.core.NamedThreadLocal;
import org.springframework.stereotype.Component;

/**
 * author  DENGJIE9527
 * date 2019/7/29
 */
@Component
public class ResponseHolder {

    private static final ThreadLocal<Long> SPEND_TIME = new NamedThreadLocal<>("SPEND_TIME");

    private static final ThreadLocal<ApiResultEntity> API_RESULT = new NamedThreadLocal<>("API_RESULT");

    public Long getSpendTime(){
        if (SPEND_TIME.get() < 1L){
            return 0L;
        }
        return System.currentTimeMillis()-SPEND_TIME.get();
    }

    public void setStartTime(){
        SPEND_TIME.set(System.currentTimeMillis());
    }

    public void setApiResultEntity(ApiResultEntity entity){
        API_RESULT.set(entity);
    }

    public ApiResultEntity getApiResultEntity(){

        if (API_RESULT.get() == null){
            return ApiResultEntity.Builder.init().bulid();
        }
        return API_RESULT.get();
    }

    public void remove(){
        SPEND_TIME.remove();
        API_RESULT.remove();
    }

}
