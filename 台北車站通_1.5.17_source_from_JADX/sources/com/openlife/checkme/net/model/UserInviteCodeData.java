package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class UserInviteCodeData {
    @C5598c("bonus_point")
    private int bonusPoint;
    @C5598c("user_point")
    private int userPoint;
    @C5598c("vip")
    private VipBean vip;

    public static class VipBean {
        @C5598c("code")
        private String code;
        @C5598c("vip_type")
        private String vipType;

        public String getCode() {
            String str = this.code;
            return str != null ? str : "";
        }

        public String getVipType() {
            String str = this.vipType;
            return str != null ? str : "";
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setVipType(String str) {
            this.vipType = str;
        }
    }

    public int getBonusPoint() {
        return this.bonusPoint;
    }

    public int getUserPoint() {
        return this.userPoint;
    }

    public VipBean getVip() {
        return this.vip;
    }

    public void setBonusPoint(int i) {
        this.bonusPoint = i;
    }

    public void setUserPoint(int i) {
        this.userPoint = i;
    }

    public void setVip(VipBean vipBean) {
        this.vip = vipBean;
    }
}
