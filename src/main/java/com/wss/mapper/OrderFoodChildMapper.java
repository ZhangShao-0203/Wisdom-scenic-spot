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
    //插入第一表
    int insertInfo();
    //插入第二表
    int insertRecord(OrderFoodRecord orderFoodRecord);
    //插入第三表
    int insertChild(List<OrderFoodChild> children);
}