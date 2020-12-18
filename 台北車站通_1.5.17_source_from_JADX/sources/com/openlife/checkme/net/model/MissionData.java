package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class MissionData {
    @C5598c("display_order")
    private int displayOrder;
    @C5598c("distance")
    private float distance;
    @C5598c("grid_image")
    private String gridImage;
    @C5598c("id")

    /* renamed from: id */
    private int f14133id;
    @C5598c("list_image")
    private String listImage;
    @C5598c("list_large_image")
    private String listLargeImage;
    @C5598c("name")
    private String name;
    @C5598c("point")
    private int point;
    @C5598c("status")
    private int status;
    @C5598c("tag")
    private List<Tag> tag;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MissionData.class != obj.getClass()) {
            return false;
        }
        MissionData missionData = (MissionData) obj;
        if (this.f14133id != missionData.f14133id || this.displayOrder != missionData.displayOrder || this.status != missionData.status || this.point != missionData.point || Float.compare(missionData.distance, this.distance) != 0) {
            return false;
        }
        String str = this.name;
        if (str == null ? missionData.name != null : !str.equals(missionData.name)) {
            return false;
        }
        String str2 = this.gridImage;
        if (str2 == null ? missionData.gridImage != null : !str2.equals(missionData.gridImage)) {
            return false;
        }
        String str3 = this.listImage;
        if (str3 == null ? missionData.listImage != null : !str3.equals(missionData.listImage)) {
            return false;
        }
        String str4 = this.listLargeImage;
        if (str4 == null ? missionData.listLargeImage != null : !str4.equals(missionData.listLargeImage)) {
            return false;
        }
        List<Tag> list = this.tag;
        return list != null ? list.equals(missionData.tag) : missionData.tag == null;
    }

    public boolean equalsNotIncludeDistance(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MissionData.class != obj.getClass()) {
            return false;
        }
        MissionData missionData = (MissionData) obj;
        if (this.f14133id != missionData.f14133id || this.displayOrder != missionData.displayOrder || this.status != missionData.status || this.point != missionData.point || Math.abs(missionData.distance - this.distance) > 100.0f) {
            return false;
        }
        String str = this.name;
        if (str == null ? missionData.name != null : !str.equals(missionData.name)) {
            return false;
        }
        String str2 = this.gridImage;
        if (str2 == null ? missionData.gridImage != null : !str2.equals(missionData.gridImage)) {
            return false;
        }
        String str3 = this.listImage;
        if (str3 == null ? missionData.listImage != null : !str3.equals(missionData.listImage)) {
            return false;
        }
        String str4 = this.listLargeImage;
        if (str4 == null ? missionData.listLargeImage != null : !str4.equals(missionData.listLargeImage)) {
            return false;
        }
        List<Tag> list = this.tag;
        return list != null ? list.equals(missionData.tag) : missionData.tag == null;
    }

    public int getDisplayOrder() {
        return this.displayOrder;
    }

    public float getDistance() {
        return this.distance;
    }

    public String getGridImage() {
        String str = this.gridImage;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14133id;
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

    public int getStatus() {
        return this.status;
    }

    public List<Tag> getTag() {
        List<Tag> list = this.tag;
        return list != null ? list : new ArrayList();
    }

    public int hashCode() {
        int i = this.f14133id * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.gridImage;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.listImage;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.listLargeImage;
        int hashCode4 = (((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.displayOrder) * 31) + this.status) * 31) + this.point) * 31;
        float f = this.distance;
        int floatToIntBits = (hashCode4 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        List<Tag> list = this.tag;
        if (list != null) {
            i2 = list.hashCode();
        }
        return floatToIntBits + i2;
    }

    public void setDisplayOrder(int i) {
        this.displayOrder = i;
    }

    public void setGridImage(String str) {
        this.gridImage = str;
    }

    public void setId(int i) {
        this.f14133id = i;
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

    public void setStatus(int i) {
        this.status = i;
    }
}
