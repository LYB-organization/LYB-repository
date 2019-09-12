package com.rainbow.listener;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.google.common.collect.Lists;
import com.rainbow.model.vo.UserInfoEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户数据解析回调类
 * author  dengjie9527
 * date 2019/9/11
 */
@Slf4j
@Service
public class UserInfoListener extends AnalysisEventListener<UserInfoEntity> {

    /**
     * 数据集合
     * 初始化InitialValue
     */

    public final static ThreadLocal<List<UserInfoEntity>> userInfoList = ThreadLocal.withInitial(()->{
        return Lists.newArrayList();
    });


    @Override
    public void invoke(UserInfoEntity userInfoEntity, AnalysisContext analysisContext) {
        log.info("UserInfoListener_invoke_currentRowNum={}", analysisContext.getCurrentRowNum());

        //添加表头行
        userInfoEntity.setCurrentRow(analysisContext.getCurrentRowNum()+1);

        //处理数据
        if(!BeanUtil.isEmpty(userInfoEntity)){
            userInfoList.get().add(userInfoEntity);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("UserInfoListener_doAfterAllAnalysed_totalCount={}", analysisContext.getTotalCount());
    }
}
