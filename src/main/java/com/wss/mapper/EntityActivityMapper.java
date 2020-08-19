package com.wss.mapper;

import com.wss.pojo.EntityActivity;
import java.util.List;

public interface EntityActivityMapper {
    int deleteByPrimaryKey(Integer activityId);

    int insert(EntityActivity record);

    EntityActivity selectByPrimaryKey(Integer activityId);

    List<EntityActivity> selectAll();

    int updateByPrimaryKey(EntityActivity record);
}