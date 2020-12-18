package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class GiftDetailData {
    @C5598c("desc")
    private String desc;
    @C5598c("id")

    /* renamed from: id */
    private int f14131id;
    @C5598c("image")
    private String image;
    @C5598c("name")
    private String name;
    @C5598c("notice")
    private String notice;
    @C5598c("point")
    private int point;
    @C5598c("status")
    private int status;
    @C5598c("stock")
    private int stock;

    public String getDesc() {
        String str = this.desc;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14131id;
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

    public int getPoint() {
        return this.point;
    }

    public String getPointStr() {
        return String.valueOf(this.point);
    }

    public int getStatus() {
        return this.status;
    }

    public int getStock() {
        return this.stock;
    }

    public String getStockStr() {
        return String.valueOf(this.stock);
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setId(int i) {
        this.f14131id = i;
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

    public void setPoint(int i) {
        this.point = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStock(int i) {
        this.stock = i;
    }
}
