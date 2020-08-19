package com.wss.pojo;



import lombok.Data;

import java.util.Date;

@Data
public class Ticket {
    private int ticketId;
    private String ticketName;
    private double ticketPrice;
    private double ticketCurprice;
    private Date ticketStarttime;
    private Date ticketEndtime;
    private int ticketState;
    private int ticketQuantity;

}
