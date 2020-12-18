package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class UserInfoData {
    @C5598c("invite_code")
    private String inviteCode;
    @C5598c("name")
    private String name;
    @C5598c("photo")
    private String photo;

    public String getInviteCode() {
        String str = this.inviteCode;
        return str != null ? str : "";
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getPhoto() {
        String str = this.photo;
        return str != null ? str : "";
    }

    public void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoto(String str) {
        this.photo = str;
    }
}
