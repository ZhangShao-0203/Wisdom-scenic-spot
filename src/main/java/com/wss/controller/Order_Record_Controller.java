package com.wss.controller;

import com.wss.pojo.OrderFoodRecord;
import com.wss.service.IOrder_Record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}
