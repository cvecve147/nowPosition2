package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;

public class HomeInfoData {
    private List<MissionData> assignment;
    private List<GiftData> gift;
    private String name;
    private int point;
    private List<MissionData> surrounding;

    public List<MissionData> getAssignment() {
        List<MissionData> list = this.assignment;
        return list != null ? list : new ArrayList();
    }

    public List<GiftData> getGift() {
        List<GiftData> list = this.gift;
        return list != null ? list : new ArrayList();
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

    public List<MissionData> getSurrounding() {
        List<MissionData> list = this.surrounding;
        return list != null ? list : new ArrayList();
    }

    public void setAssignment(List<MissionData> list) {
        this.assignment = list;
    }

    public void setGift(List<GiftData> list) {
        this.gift = list;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPoint(int i) {
        this.point = i;
    }

    public void setSurrounding(List<MissionData> list) {
        this.surrounding = list;
    }
}
