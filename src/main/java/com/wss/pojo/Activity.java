package com.wss.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Activity {
    private int activityId;
    private String activityName;
    private double activityPrice;
    private double activityCurprice;
    private String activityDesc;
    private Date activityStarttime;
    private Date activityEndtime;
}
