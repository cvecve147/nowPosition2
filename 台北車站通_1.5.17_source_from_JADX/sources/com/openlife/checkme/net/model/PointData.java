package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class PointData {
    @C5598c("current_point")
    private int currentPoint;
    @C5598c("expired_date")
    private String expiredDate;
    @C5598c("expired_point")
    private int expiredPoint;

    public int getCurrentPoint() {
        return this.currentPoint;
    }

    public String getCurrentPointStr() {
        return String.valueOf(this.currentPoint);
    }

    public String getExpiredDate() {
        String str = this.expiredDate;
        return str != null ? str : "";
    }

    public int getExpiredPoint() {
        return this.expiredPoint;
    }

    public String getExpiredPointStr() {
        return String.valueOf(this.expiredPoint);
    }

    public void setCurrentPoint(int i) {
        this.currentPoint = i;
    }

    public void setExpiredDate(String str) {
        this.expiredDate = str;
    }

    public void setExpiredPoint(int i) {
        this.expiredPoint = i;
    }
}
