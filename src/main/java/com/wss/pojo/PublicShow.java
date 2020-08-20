package com.wss.pojo;

public class PublicShow {
    private Integer showId;

    private String showName;

    private String showType;

    private String showSite;

    private String showTime;

    private String showState;

    private String showImgs;

    private Integer Page;

    public String getShowImgs() {
        return showImgs;
    }

    public void setShowImgs(String showImgs) {
        this.showImgs = showImgs;
    }

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }
    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getShowSite() {
        return showSite;
    }

    public void setShowSite(String showSite) {
        this.showSite = showSite;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getShowState() {
        return showState;
    }

    public void setShowState(String showState) {
        this.showState = showState;
    }
}