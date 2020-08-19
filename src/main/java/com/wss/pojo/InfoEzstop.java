package com.wss.pojo;

import java.util.Date;

public class InfoEzstop {
    private Integer ezstopId;

    private Integer ezstopUid;

    private Date ezstopAirTime;

    private Date ezstopEndTime;

    private String ezstopParkingAreaCode;

    public Integer getEzstopId() {
        return ezstopId;
    }

    public void setEzstopId(Integer ezstopId) {
        this.ezstopId = ezstopId;
    }

    public Integer getEzstopUid() {
        return ezstopUid;
    }

    public void setEzstopUid(Integer ezstopUid) {
        this.ezstopUid = ezstopUid;
    }

    public Date getEzstopAirTime() {
        return ezstopAirTime;
    }

    public void setEzstopAirTime(Date ezstopAirTime) {
        this.ezstopAirTime = ezstopAirTime;
    }

    public Date getEzstopEndTime() {
        return ezstopEndTime;
    }

    public void setEzstopEndTime(Date ezstopEndTime) {
        this.ezstopEndTime = ezstopEndTime;
    }

    public String getEzstopParkingAreaCode() {
        return ezstopParkingAreaCode;
    }

    public void setEzstopParkingAreaCode(String ezstopParkingAreaCode) {
        this.ezstopParkingAreaCode = ezstopParkingAreaCode;
    }
}