package com.rainbow.interceptor;


import com.rainbow.common.model.ApiResultEntity;
import com.rainbow.common.request.ResponseHolder;
import com.rainbow.enums.StatusEnum;
import com.rainbow.mapper.RequestRecordInfoMapper;
import com.rainbow.model.entity.RequestRecordInfo;
import com.rainbow.util.MDCUtil;
import com.rainbow.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.InetAddress;
import java.time.LocalDateTime;

@Component
@Slf4j
public class RequestLogInterceptor extends HandlerInterceptorAdapter {

    @Resource
    private RequestRecordInfoMapper requestRecordInfoMapper;

    @Autowired
    private ResponseHolder responseHolder;

    private static String ADMIN = "DJ";

    /**
     * 在业务处理器处理请求之前被调用
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取请求的路径
//        String servletPath = request.getServletPath();
        //获取链路Id
        String traceId = request.getHeader("requestId");

        if (StringUtils.isBlank(traceId)){
            traceId = MDCUtil.getTraceId();
        }

        MDCUtil.put(traceId);

        responseHolder.setStartTime();

        return super.preHandle(request, response, handler);
    }

    /**
     * 在业务处理器处理请求执行完成后，生成视图之前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {






        super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * 在DispatcherServlet完全处理完请求后被调用
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        //获取请求耗时时间
        Long spendTime = responseHolder.getSpendTime();

        //TODO 将请求数据保存到数据库中
        ApiResultEntity apiResultEntity = responseHolder.getApiResultEntity();


        RequestRecordInfo build = RequestRecordInfo.Build()
                .serialNo(StringUtil.getUUID())
                .traceId(MDCUtil.getTraceId())
                .requestPath(request.getServletPath())
                .requestMethod(request.getMethod())
                .spendTime(spendTime)
                .status(StatusEnum.VALID.getCode())
                .remark(ex == null ? null :ex.getMessage())
                .resultCode(apiResultEntity.getCode())
                .resultMsg(apiResultEntity.getMsg())
                .businessType("记录请求日志")
                .serverIp(InetAddress.getLocalHost().getHostAddress())
                .clientIp(request.getRemoteAddr())
                .createdBy(ADMIN)
                .dateCreated(LocalDateTime.now())
                .updatedBy(ADMIN)
                .dateUpdated(LocalDateTime.now())
                .build();

        try {
            log.info("RequestLogInterceptor_insertRequestRecordInfo_build={}", build);
            int result = requestRecordInfoMapper.insertRequestRecordInfo(build);
            log.info("RequestLogInterceptor_insertRequestRecordInfo_result={}", result);
        }catch (Exception e){
            log.error("RequestLogInterceptor_insertRequestRecordInfo_e={}",ex.getMessage());
        }finally {
            responseHolder.remove();
            MDCUtil.remove();
        }
    }
}
