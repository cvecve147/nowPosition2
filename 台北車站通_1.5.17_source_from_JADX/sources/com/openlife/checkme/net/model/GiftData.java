package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class GiftData {
    @C5598c("category")
    private String category;
    @C5598c("grid_image")
    private String gridImage;
    @C5598c("id")

    /* renamed from: id */
    private int f14130id;
    @C5598c("list_image")
    private String listImage;
    @C5598c("name")
    private String name;
    @C5598c("point")
    private int point;
    @C5598c("status")
    private int status;
    @C5598c("stock")
    private int stock;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GiftData.class != obj.getClass()) {
            return false;
        }
        GiftData giftData = (GiftData) obj;
        if (this.f14130id != giftData.f14130id || this.point != giftData.point || this.stock != giftData.stock || this.status != giftData.status) {
            return false;
        }
        String str = this.name;
        if (str == null ? giftData.name != null : !str.equals(giftData.name)) {
            return false;
        }
        String str2 = this.gridImage;
        if (str2 == null ? giftData.gridImage != null : !str2.equals(giftData.gridImage)) {
            return false;
        }
        String str3 = this.listImage;
        if (str3 == null ? giftData.listImage != null : !str3.equals(giftData.listImage)) {
            return false;
        }
        String str4 = this.category;
        return str4 != null ? str4.equals(giftData.category) : giftData.category == null;
    }

    public String getCategory() {
        String str = this.category;
        return str != null ? str : "";
    }

    public String getGridImage() {
        String str = this.gridImage;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14130id;
    }

    public String getListImage() {
        String str = this.listImage;
        return str != null ? str : "";
    }

    public String getName() {
        String str = this.name;
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

    public int hashCode() {
        int i = this.f14130id * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.gridImage;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.listImage;
        int hashCode3 = (((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.point) * 31) + this.stock) * 31) + this.status) * 31;
        String str4 = this.category;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setGridImage(String str) {
        this.gridImage = str;
    }

    public void setId(int i) {
        this.f14130id = i;
    }

    public void setListImage(String str) {
        this.listImage = str;
    }

    public void setName(String str) {
        this.name = str;
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
