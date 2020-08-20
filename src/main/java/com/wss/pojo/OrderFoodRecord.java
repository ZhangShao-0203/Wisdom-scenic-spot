package com.wss.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class OrderFoodRecord {
    private int recordId;
    private Date recordDate;
    private int recordBuyerId;
    private String recordState;
    private List<OrderFoodChild> items=new ArrayList<OrderFoodChild>();

    public void addToList(OrderFoodChild orderFoodChild){
        this.items.add(orderFoodChild);
    }
}
