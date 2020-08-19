package com.wss.service;

import com.wss.pojo.UserTourist;

import java.util.List;

public interface IUserTouristService {

    int deleteByPrimaryKey(Integer touristId);

    //注册游客用户
    int insert(UserTourist record);

    //根据id查询
    UserTourist selectByPrimaryKey(Integer touristId);

    List<UserTourist> selectAll();

    int updateByPrimaryKey(UserTourist record);
}
