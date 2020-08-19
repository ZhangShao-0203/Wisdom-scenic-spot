package com.wss.mapper;

import com.wss.pojo.EntityFood;
import java.util.List;

public interface EntityFoodMapper {
    int deleteByPrimaryKey(Integer foodId);

    int insert(EntityFood record);

    EntityFood selectByPrimaryKey(Integer foodId);

    List<EntityFood> selectAll();

    int updateByPrimaryKey(EntityFood record);
}