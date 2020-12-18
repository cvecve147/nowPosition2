package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class FbLoginBody extends LoginBaseBody {
    @C5598c("email")
    private String email;
    @C5598c("fb_token")
    private String fbToken;
    @C5598c("fbuid")
    private String fbuid;
    @C5598c("gender")
    private String gender;
    @C5598c("nickname")
    private String nickname;
    @C5598c("vendor_uid")
    private String vendorUid;

    public FbLoginBody() {
        setAccount((String) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FbLoginBody.class != obj.getClass()) {
            return false;
        }
        FbLoginBody fbLoginBody = (FbLoginBody) obj;
        String str = this.fbuid;
        if (str == null ? fbLoginBody.fbuid != null : !str.equals(fbLoginBody.fbuid)) {
            return false;
        }
        String str2 = this.email;
        if (str2 == null ? fbLoginBody.email != null : !str2.equals(fbLoginBody.email)) {
            return false;
        }
        String str3 = this.fbToken;
        if (str3 == null ? fbLoginBody.fbToken != null : !str3.equals(fbLoginBody.fbToken)) {
            return false;
        }
        String str4 = this.nickname;
        if (str4 == null ? fbLoginBody.nickname != null : !str4.equals(fbLoginBody.nickname)) {
            return false;
        }
        String str5 = this.gender;
        if (str5 == null ? fbLoginBody.gender != null : !str5.equals(fbLoginBody.gender)) {
            return false;
        }
        String str6 = this.vendorUid;
        return str6 != null ? str6.equals(fbLoginBody.vendorUid) : fbLoginBody.vendorUid == null;
    }

    public int hashCode() {
        String str = this.fbuid;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fbToken;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.nickname;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.gender;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.vendorUid;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setFbToken(String str) {
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

    public void setVendorId(String str) {
        this.vendorUid = str;
    }
}
