package com.wss.service.impl;

import com.wss.mapper.OrderFoodChildMapper;
import com.wss.pojo.OrderFoodChild;
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

    @Override
    public int insertRecord(OrderFoodRecord orderFoodRecord) throws Exception {
        List<OrderFoodChild> child=orderFoodRecord.getItems();
        int second=orderFoodChildMapper.insertRecord(orderFoodRecord);
        int third=0;
        if (second!=0){
            for (int i=0;i<child.size();i++){
                child.get(i).setfParentId(orderFoodRecord.getRecordId());
            }
            third=orderFoodChildMapper.insertChild(child);
            if (third!=0){
                System.out.println("insert  success!");
                //用作返回插入订单的id
                third=orderFoodRecord.getRecordId();
            }else {
                System.out.println("third card insert fail!!!!!!");
            }
        }else{
            System.out.println("second card insert fail!!!!!!");
        }
        return third;
    }
}
