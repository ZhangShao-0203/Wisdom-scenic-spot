package com.wss.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class LogOperate {

    private int operateId;
    private String operateName;
    private String operateOperation;
    private String operateMethod;
    private String operateParams;
    private String operateIp;
    private Date operateCarateDate;

}
