package com.wss.pojo;

public class PublicNotice {
    private Integer noticeId;

    private String noticeName;

    private String noticeTime;

    private Integer noticeRank;

    private Integer page;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeName() {
        return noticeName;
    }

    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
    }

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Integer getNoticeRank() {
        return noticeRank;
    }

    public void setNoticeRank(Integer noticeRank) {
        this.noticeRank = noticeRank;
    }

    @Override
    public String toString() {
        return "PublicNotice{" +
                "noticeId=" + noticeId +
                ", noticeName='" + noticeName + '\'' +
                ", noticeTime='" + noticeTime + '\'' +
                ", noticeRank=" + noticeRank +
                '}';
    }
}