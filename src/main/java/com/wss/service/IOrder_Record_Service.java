package com.wss.service;

import com.wss.pojo.OrderFoodRecord;

import java.util.List;

public interface IOrder_Record_Service {

    List<OrderFoodRecord> OrderReview()throws Exception;

    int insertRecord(OrderFoodRecord orderFoodRecord) throws Exception;
}
