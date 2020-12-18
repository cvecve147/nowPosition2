package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class MobileUpdateData {
    @C5598c("expire_date")
    private String expireDate;
    @C5598c("expire_time")
    private String expireTime;
    @C5598c("otp")
    private String otp;

    public String getExpireDate() {
        String str = this.expireDate;
        return str != null ? str : "";
    }

    public String getExpireTime() {
        String str = this.expireTime;
        return str != null ? str : "";
    }

    public String getOtp() {
        String str = this.otp;
        return str != null ? str : "";
    }

    public void setExpireDate(String str) {
        this.expireDate = str;
    }

    public void setExpireTime(String str) {
        this.expireTime = str;
    }

    public void setOtp(String str) {
        this.otp = str;
    }
}
