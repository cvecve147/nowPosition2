package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class AccountData {
    @C5598c("account")
    private String account;
    @C5598c("email")
    private String email;
    @C5598c("fb_token")
    private String fbToken;
    @C5598c("fb_uid")
    private String fbUid;
    @C5598c("gender")
    private String gender;
    @C5598c("invite_code")
    private String inviteCode;
    @C5598c("nickname")
    private String nickname;
    @C5598c("point")
    private int point;
    @C5598c("user_status")
    private int userStatus;

    public String getAccount() {
        String str = this.account;
        return str != null ? str : "";
    }

    public String getEmail() {
        String str = this.email;
        return str != null ? str : "";
    }

    public String getFbToken() {
        String str = this.fbToken;
        return str != null ? str : "";
    }

    public String getFbUid() {
        String str = this.fbUid;
        return str != null ? str : "";
    }

    public String getGender() {
        String str = this.gender;
        return str != null ? str : "";
    }

    public String getInviteCode() {
        String str = this.inviteCode;
        return str != null ? str : "";
    }

    public String getNickname() {
        String str = this.nickname;
        return str != null ? str : "";
    }

    public int getPoint() {
        return this.point;
    }

    public int getUserStatus() {
        return this.userStatus;
    }

    public void setAccount(String str) {
        this.account = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFbUid(String str) {
        this.fbUid = str;
    }

    public void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setUserStatus(int i) {
        this.userStatus = i;
    }
}
