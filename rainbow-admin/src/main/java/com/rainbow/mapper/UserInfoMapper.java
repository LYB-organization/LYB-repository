package com.rainbow.mapper;

import com.rainbow.mapper.base.UserInfoBaseMapper;
import com.rainbow.model.dto.ExportUserInfoDTO;
import com.rainbow.model.vo.ExportUserInfoVO;
import com.rainbow.model.vo.UserInfoEntity;

import java.util.List;
/**
*  @author author
*/
public interface UserInfoMapper extends UserInfoBaseMapper{


    /**
     * 用户信息导出
     * @param dto
     * @return
     */
    List<ExportUserInfoVO> export(ExportUserInfoDTO dto);

    /**
     * 导入用户信息入库
     * @param list
     * @return
     */
    int importUserInfo(List<UserInfoEntity> list);
}