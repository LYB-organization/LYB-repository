package com.rainbow.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.rainbow.model.entity.OpreationRecordInfo;
/**
*  @author author
*/
public interface OpreationRecordInfoBaseMapper {

    int insertOpreationRecordInfo(OpreationRecordInfo object);

    int updateOpreationRecordInfo(OpreationRecordInfo object);

    int update(OpreationRecordInfo.UpdateBuilder object);

    List<OpreationRecordInfo> queryOpreationRecordInfo(OpreationRecordInfo object);

    OpreationRecordInfo queryOpreationRecordInfoLimit1(OpreationRecordInfo object);

}