package com.wss.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class EntityActivity {
    private Integer activityId;

    private String activityName;

    private BigDecimal activityPrice;

    private BigDecimal activityCurprice;

    private String activityDesc;

    private Date activityStarttime;

    private Date activityEndtime;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public BigDecimal getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(BigDecimal activityPrice) {
        this.activityPrice = activityPrice;
    }

    public BigDecimal getActivityCurprice() {
        return activityCurprice;
    }

    public void setActivityCurprice(BigDecimal activityCurprice) {
        this.activityCurprice = activityCurprice;
    }

    public String getActivityDesc() {
        return activityDesc;
    }

    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc;
    }

    public Date getActivityStarttime() {
        return activityStarttime;
    }

    public void setActivityStarttime(Date activityStarttime) {
        this.activityStarttime = activityStarttime;
    }

    public Date getActivityEndtime() {
        return activityEndtime;
    }

    public void setActivityEndtime(Date activityEndtime) {
        this.activityEndtime = activityEndtime;
    }
}