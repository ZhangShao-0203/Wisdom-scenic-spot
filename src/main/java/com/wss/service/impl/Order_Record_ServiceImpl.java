package com.wss.service.impl;

import com.wss.mapper.OrderFoodChildMapper;
import com.wss.pojo.OrderFoodRecord;
import com.wss.service.IOrder_Record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Order_Record_ServiceImpl implements IOrder_Record_Service {

    @Autowired
    private OrderFoodChildMapper orderFoodChildMapper;

    @Override
    public List<OrderFoodRecord> OrderReview() throws Exception {
        return orderFoodChildMapper.OrderReview();
    }
}
