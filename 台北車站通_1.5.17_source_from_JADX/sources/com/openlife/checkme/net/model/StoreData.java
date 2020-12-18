package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class StoreData {
    @C5598c("display_order")
    private int displayOrder;
    @C5598c("grid_image")
    private String gridImage;
    @C5598c("id")

    /* renamed from: id */
    private int f14139id;
    @C5598c("list_image")
    private String listImage;
    @C5598c("list_large_image")
    private String listLargeImage;
    @C5598c("name")
    private String name;
    @C5598c("point")
    private int point;
    @C5598c("tag")
    private List<Tag> tag;

    public int getDisplayOrder() {
        return this.displayOrder;
    }

    public String getGridImage() {
        String str = this.gridImage;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14139id;
    }

    public String getListImage() {
        String str = this.listImage;
        return str != null ? str : "";
    }

    public String getListLargeImage() {
        String str = this.listLargeImage;
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

    public List<Tag> getTag() {
        List<Tag> list = this.tag;
        return list != null ? list : new ArrayList();
    }

    public void setDisplayOrder(int i) {
        this.displayOrder = i;
    }

    public void setGridImage(String str) {
        this.gridImage = str;
    }

    public void setId(int i) {
        this.f14139id = i;
    }

    public void setListImage(String str) {
        this.listImage = str;
    }

    public void setListLargeImage(String str) {
        this.listLargeImage = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoint(int i) {
        this.point = i;
    }
}
