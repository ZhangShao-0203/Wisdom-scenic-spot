package com.wss.pojo;

public class PublicMap {
    private Integer mapId;

    private String mapTime;
    private Integer Page;
    private String mapXy;

    public String getMapXy() {
        return mapXy;
    }

    public void setMapXy(String mapXy) {
        this.mapXy = mapXy;
    }

    public Integer getPage() {
        return Page;
    }

    public void setPage(Integer page) {
        Page = page;
    }
    public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public String getMapTime() {
        return mapTime;
    }

    public void setMapTime(String mapTime) {
        this.mapTime = mapTime;
    }
}