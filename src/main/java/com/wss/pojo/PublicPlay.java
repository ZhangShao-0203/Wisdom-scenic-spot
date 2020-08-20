package com.wss.pojo;

public class PublicPlay {
    private Integer playId;

    private String playName;

    private Double playPrice;

    private Integer playState;
    private String playImgs;

    private Integer staffId;

    private Integer Page;

    public String getPlayImgs() {
        return playImgs;
    }

    public void setPlayImgs(String playImgs) {
        this.playImgs = playImgs;
    }

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }
    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public Double getPlayPrice() {
        return playPrice;
    }

    public void setPlayPrice(Double playPrice) {
        this.playPrice = playPrice;
    }

    public Integer getPlayState() {
        return playState;
    }

    public void setPlayState(Integer playState) {
        this.playState = playState;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }
}