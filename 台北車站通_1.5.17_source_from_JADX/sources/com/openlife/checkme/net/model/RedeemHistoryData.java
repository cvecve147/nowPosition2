package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class RedeemHistoryData {
    @C5598c("expire_date")
    private String expireDate;
    @C5598c("id")

    /* renamed from: id */
    private int f14137id;
    @C5598c("name")
    private String name;
    @C5598c("serial")
    private String serial;
    @C5598c("status")
    private int status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RedeemHistoryData.class != obj.getClass()) {
            return false;
        }
        RedeemHistoryData redeemHistoryData = (RedeemHistoryData) obj;
        if (this.f14137id != redeemHistoryData.f14137id || this.status != redeemHistoryData.status) {
            return false;
        }
        String str = this.name;
        if (str == null ? redeemHistoryData.name != null : !str.equals(redeemHistoryData.name)) {
            return false;
        }
        String str2 = this.serial;
        if (str2 == null ? redeemHistoryData.serial != null : !str2.equals(redeemHistoryData.serial)) {
            return false;
        }
        String str3 = this.expireDate;
        return str3 != null ? str3.equals(redeemHistoryData.expireDate) : redeemHistoryData.expireDate == null;
    }

    public String getExpireDate() {
        String str = this.expireDate;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14137id;
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getSerial() {
        String str = this.serial;
        return str != null ? str : "";
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.f14137id * 31;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.serial;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.expireDate;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.status;
    }

    public void setExpireDate(String str) {
        this.expireDate = str;
    }

    public void setId(int i) {
        this.f14137id = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSerial(String str) {
        this.serial = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
