package com.wss.mapper;

import com.wss.pojo.UserTourist;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface UserTouristMapper {
    int deleteByPrimaryKey(Integer touristId);

    //注册游客用户
    int insert(UserTourist record);

    //根据id查询
    UserTourist selectByPrimaryKey(Integer touristId);

    List<UserTourist> selectAll();

    int updateByPrimaryKey(UserTourist record);
}