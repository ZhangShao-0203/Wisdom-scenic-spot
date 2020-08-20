package com.wss.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Emergency {
    private int emergencyId;
    private int MapId;
    private Date emergencyTime;
    private String emergencyDesc;
    private int userId;
    private int assistantId;
    private String resultDesc;
    private Date resultTime;
}
