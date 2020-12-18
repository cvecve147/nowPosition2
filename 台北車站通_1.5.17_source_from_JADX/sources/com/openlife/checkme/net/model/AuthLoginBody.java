package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;
import p101d.p129g.p152e.p153a.C5598c;

public class AuthLoginBody extends C4952b {
    @C5598c("email")
    private String email = "";
    @C5598c("fb_token")
    private String fbToken = "";
    @C5598c("fbuid")
    private String fbuid = "";
    @C5598c("gender")
    private String gender = "";
    @C5598c("nickname")
    private String nickname = "";
    @C5598c("user_token")
    private String userToken = "";
    @C5598c("vendor_uid")
    private String vendorUid = "";

    public AuthLoginBody(String str, String str2, String str3) {
        this.email = str;
        this.fbuid = str2;
        this.fbToken = str3;
        setAccount((String) null);
    }

    public AuthLoginBody(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.userToken = str;
        this.email = str2;
        this.nickname = str3;
        this.fbuid = str4;
        this.fbToken = str5;
        this.gender = str6;
        this.vendorUid = str7;
        setAccount((String) null);
    }

    public String getEmail() {
        return this.email;
    }

    public String getFbToken() {
        return this.fbToken;
    }

    public String getFbuid() {
        return this.fbuid;
    }

    public String getGender() {
        return this.gender;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public String getVendorUid() {
        return this.vendorUid;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFb_token(String str) {
        this.fbToken = str;
    }

    public void setFbuid(String str) {
        this.fbuid = str;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setUserToken(String str) {
        this.userToken = str;
    }
}
