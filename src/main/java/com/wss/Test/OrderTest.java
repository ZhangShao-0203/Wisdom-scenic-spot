package com.wss.Test;

import com.wss.pojo.OrderFoodChild;
import com.wss.pojo.OrderFoodRecord;
import com.wss.service.IOrder_Record_Service;
import com.wss.service.impl.Order_Record_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class OrderTest {

    public static void main(String[] args) {
        IOrder_Record_Service order_record_service=new Order_Record_ServiceImpl();
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

        try {
            int msg=order_record_service.insertRecord(orderFoodRecord);

            if (msg!=0){
                System.out.println("main action success");
            }
            else{
                System.out.println("main action fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
