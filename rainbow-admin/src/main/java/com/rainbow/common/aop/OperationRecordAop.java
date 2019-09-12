package com.rainbow.common.aop;

import cn.hutool.core.util.ArrayUtil;
import com.alibaba.fastjson.JSON;
import com.rainbow.common.annocation.OperationRecord;
import com.rainbow.common.model.ApiResultEntity;
import com.rainbow.mapper.OpreationRecordInfoMapper;
import com.rainbow.model.entity.OpreationRecordInfo;
import com.rainbow.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

/**
 * author  DENGJIE9527
 * date 2019/9/2
 */
@Component
@Aspect
@Order(20)//指定切面的优先级，值越小越高
@Slf4j
public class OperationRecordAop {

    @Resource
    private OpreationRecordInfoMapper opreationRecordInfoMapper;

    private static final String USER = "DJ";

    //指定切入点表达式
    @Pointcut(value = "@annotation(com.rainbow.common.annocation.OperationRecord)")
    public void pointCut(){

    }

    //后置通知
    @AfterReturning(pointcut = "pointCut()",returning = "result")
    public void afterReturnning(JoinPoint joinPoint,Object result){

        OpreationRecordInfo.Builder builder = OpreationRecordInfo.Build();

        try {
            //构造request对象
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            //获取客户端ip
            String clientIp = request.getRemoteAddr();

            //类名
            String className = joinPoint.getTarget().getClass().getName();

            //方法名
            String methodName = joinPoint.getSignature().getName();

            //获取方法上的注解
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            OperationRecord annotation = method.getAnnotation(OperationRecord.class);

            //获取对象数组
            Object[] objects = joinPoint.getArgs();
            if (ArrayUtils.isEmpty(objects)){
                objects = ArrayUtil.newArray(1);
            };

            if (result instanceof ApiResultEntity){
                builder.result(((ApiResultEntity)result).getCode());
            }

            builder.serialNo(StringUtil.getUUID())
                    .clientIp(clientIp)
                    .oprClass(className)
                    .oprMethod(methodName)
                    .oprObject(JSON.toJSONString(objects[0] == null ? "":objects[0]))
                    .type(annotation.operationType().getCode())
                    .des(annotation.desc())
                    .bizType(annotation.bizType())
                    .createBy(USER)
                    .dateCreate(LocalDateTime.now())
                    .updateBy(USER)
                    .dateUpdate(LocalDateTime.now());
        }catch (Exception e){
            log.error("AfterReturning caught error", e);
        }finally {
            //数据入库
            opreationRecordInfoMapper.insertOpreationRecordInfo(builder.build());
        }
    }
}
