package com.rainbow.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.rainbow.model.entity.RequestRecordInfo;
/**
*  @author author
*/
public interface RequestRecordInfoBaseMapper {

    int insertRequestRecordInfo(RequestRecordInfo object);

    int updateRequestRecordInfo(RequestRecordInfo object);

    int update(RequestRecordInfo.UpdateBuilder object);

    List<RequestRecordInfo> queryRequestRecordInfo(RequestRecordInfo object);

    RequestRecordInfo queryRequestRecordInfoLimit1(RequestRecordInfo object);

}