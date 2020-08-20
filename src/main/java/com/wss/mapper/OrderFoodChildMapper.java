package com.wss.mapper;

import com.wss.pojo.OrderFoodChild;
import com.wss.pojo.OrderFoodRecord;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderFoodChildMapper {
    int deleteByPrimaryKey(Integer fChildId);

    int insert(OrderFoodChild record);

    OrderFoodChild selectByPrimaryKey(Integer fChildId);

    List<OrderFoodChild> selectAll();

    int updateByPrimaryKey(OrderFoodChild record);

    List<OrderFoodRecord> OrderReview();
}