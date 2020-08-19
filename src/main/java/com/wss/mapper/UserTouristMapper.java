package com.wss.mapper;

import com.wss.pojo.UserTourist;
import java.util.List;

public interface UserTouristMapper {
    int deleteByPrimaryKey(Integer touristId);

    //注册游客用户
    int insert(UserTourist record);

    //根据id查询
    UserTourist selectByPrimaryKey(Integer touristId);

    List<UserTourist> selectAll();

    int updateByPrimaryKey(UserTourist record);
}