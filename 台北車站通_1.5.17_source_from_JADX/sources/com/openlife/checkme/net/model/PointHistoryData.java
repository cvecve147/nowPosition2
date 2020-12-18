package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class PointHistoryData {
    @C5598c("comment")
    private String comment;
    @C5598c("create_time")
    private String createTime;
    @C5598c("point")
    private int point;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PointHistoryData.class != obj.getClass()) {
            return false;
        }
        PointHistoryData pointHistoryData = (PointHistoryData) obj;
        if (this.point != pointHistoryData.point) {
            return false;
        }
        String str = this.createTime;
        if (str == null ? pointHistoryData.createTime != null : !str.equals(pointHistoryData.createTime)) {
            return false;
        }
        String str2 = this.comment;
        return str2 != null ? str2.equals(pointHistoryData.comment) : pointHistoryData.comment == null;
    }

    public String getComment() {
        String str = this.comment;
        return str != null ? str : "";
    }

    public String getCreateTime() {
        String str = this.createTime;
        return str != null ? str : "";
    }

    public int getPoint() {
        return this.point;
    }

    public String getPointStr() {
        return String.valueOf(this.point);
    }

    public int hashCode() {
        String str = this.createTime;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.comment;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.point;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setPoint(int i) {
        this.point = i;
    }
}
