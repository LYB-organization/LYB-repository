package com.rainbow.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.rainbow.model.entity.UserInfo;
/**
*  @author author
*/
public interface UserInfoBaseMapper {

    int insertUserInfo(UserInfo object);

    int updateUserInfo(UserInfo object);

    int update(UserInfo.UpdateBuilder object);

    List<UserInfo> queryUserInfo(UserInfo object);

    UserInfo queryUserInfoLimit1(UserInfo object);

}