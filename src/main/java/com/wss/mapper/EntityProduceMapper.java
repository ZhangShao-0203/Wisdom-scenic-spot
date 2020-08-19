package com.wss.mapper;

import com.wss.pojo.EntityProduce;
import java.util.List;

public interface EntityProduceMapper {
    int deleteByPrimaryKey(Integer produceId);

    int insert(EntityProduce record);

    EntityProduce selectByPrimaryKey(Integer produceId);

    List<EntityProduce> selectAll();

    int updateByPrimaryKey(EntityProduce record);
}