package com.wss.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class EntityTicket {
    private Integer tickeId;

    private String ticketName;

    private BigDecimal ticketPrice;

    private BigDecimal ticketCurprice;

    private Date ticketStarttime;

    private Date ticketEndtime;

    private Integer ticketState;

    private Integer ticketQuantity;

    public Integer getTickeId() {
        return tickeId;
    }

    public void setTickeId(Integer tickeId) {
        this.tickeId = tickeId;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public BigDecimal getTicketCurprice() {
        return ticketCurprice;
    }

    public void setTicketCurprice(BigDecimal ticketCurprice) {
        this.ticketCurprice = ticketCurprice;
    }

    public Date getTicketStarttime() {
        return ticketStarttime;
    }

    public void setTicketStarttime(Date ticketStarttime) {
        this.ticketStarttime = ticketStarttime;
    }

    public Date getTicketEndtime() {
        return ticketEndtime;
    }

    public void setTicketEndtime(Date ticketEndtime) {
        this.ticketEndtime = ticketEndtime;
    }

    public Integer getTicketState() {
        return ticketState;
    }

    public void setTicketState(Integer ticketState) {
        this.ticketState = ticketState;
    }

    public Integer getTicketQuantity() {
        return ticketQuantity;
    }

    public void setTicketQuantity(Integer ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }
}