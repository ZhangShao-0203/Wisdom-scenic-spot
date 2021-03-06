package com.wss.controller;

import com.wss.pojo.OrderFoodChild;
import com.wss.pojo.OrderFoodRecord;
import com.wss.service.IOrder_Record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class Order_Record_Controller {

    @Autowired
    private IOrder_Record_Service iOrder_record_service;

    @RequestMapping("/select_record_all")
    public List<OrderFoodRecord> select_record_all()throws Exception{
        return iOrder_record_service.OrderReview();
    }

    //这是插入订单测方法
    @RequestMapping("/insert_record")
    public int insert_record()throws Exception{
        OrderFoodRecord orderFoodRecord=new OrderFoodRecord();
        OrderFoodChild orderFoodChild1=new OrderFoodChild();
        OrderFoodChild orderFoodChild2=new OrderFoodChild();
        orderFoodChild1.setfFoodId(1);
        orderFoodChild1.setfFoodName("华夫饼");
        orderFoodChild1.setfFoodNum(2);
        orderFoodChild2.setfFoodId(2);
        orderFoodChild2.setfFoodName("章鱼烧");
        orderFoodChild2.setfFoodNum(1);
        orderFoodRecord.setRecordDate(new Date());
        orderFoodRecord.setRecordBuyerId(1001);
        orderFoodRecord.setRecordState("wait to pay");
        orderFoodRecord.addToList(orderFoodChild1);
        orderFoodRecord.addToList(orderFoodChild2);

        int msg=iOrder_record_service.insertRecord(orderFoodRecord);
        if (msg!=0){
            System.out.println("main action success");
        }
        else{
            System.out.println("main action fail");
        }
        return 0;
    }



}
