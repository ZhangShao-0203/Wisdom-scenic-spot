package com.wss.pojo;

import java.math.BigDecimal;

public class EntityProduce {
    private Integer produceId;

    private String produceName;

    private BigDecimal producePrice;

    private BigDecimal produceCurprice;

    private String produceUnit;

    public Integer getProduceId() {
        return produceId;
    }

    public void setProduceId(Integer produceId) {
        this.produceId = produceId;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }

    public BigDecimal getProducePrice() {
        return producePrice;
    }

    public void setProducePrice(BigDecimal producePrice) {
        this.producePrice = producePrice;
    }

    public BigDecimal getProduceCurprice() {
        return produceCurprice;
    }

    public void setProduceCurprice(BigDecimal produceCurprice) {
        this.produceCurprice = produceCurprice;
    }

    public String getProduceUnit() {
        return produceUnit;
    }

    public void setProduceUnit(String produceUnit) {
        this.produceUnit = produceUnit;
    }
}