package com.wss.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class OrderFoodRecord {
    private int recordId;
    private Date recordDate;
    private int recordBuyerId;
    private String recordState;
    private List<OrderFoodChild> items;
}
