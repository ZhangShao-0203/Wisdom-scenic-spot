package com.wss.pojo;

import lombok.Data;

@Data
public class ProduceCart {
    private int ProduceCartId;
    private Produce produce;
    private int prQuantity;
    private double subTotal;
    private UserTourist userTourist;

    private int produceId;
    private int touristId;

    public double getSubTotal(){
        double d = produce.getProducePrice() * prQuantity;
        return d;
    }
}
