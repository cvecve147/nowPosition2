package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class RedeemGiftData {
    @C5598c("current_point")
    private int currentPoint;
    @C5598c("desc")
    private String desc;
    @C5598c("expire_date")
    private String expireDate;
    @C5598c("id")

    /* renamed from: id */
    private int f14136id;
    @C5598c("image")
    private String image;
    @C5598c("name")
    private String name;
    @C5598c("notice")
    private String notice;
    @C5598c("serial")
    private String serial;
    @C5598c("status")
    private int status;
    @C5598c("url")
    private String url;

    public int getCurrentPoint() {
        return this.currentPoint;
    }

    public String getCurrentPointStr() {
        return String.valueOf(this.currentPoint);
    }

    public String getDesc() {
        return this.desc;
    }

    public String getExpireDate() {
        String str = this.expireDate;
        return str != null ? str : "";
    }

    public String getImage() {
        String str = this.image;
        return str != null ? str : "";
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getNotice() {
        String str = this.notice;
        return str != null ? str : "";
    }

    public int getRedeemId() {
        return this.f14136id;
    }

    public String getSerial() {
        String str = this.serial;
        return str != null ? str : "";
    }

    public int getStatus() {
        return this.status;
    }

    public String getUrl() {
        String str = this.url;
        return str != null ? str : "";
    }

    public void setCurrentPoint(int i) {
        this.currentPoint = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExpireDate(String str) {
        this.expireDate = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNotice(String str) {
        this.notice = str;
    }

    public void setRedeemId(int i) {
        this.f14136id = i;
    }

    public void setSerial(String str) {
        this.serial = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
