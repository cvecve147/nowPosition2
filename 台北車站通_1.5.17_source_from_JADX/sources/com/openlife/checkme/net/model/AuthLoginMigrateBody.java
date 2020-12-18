package com.openlife.checkme.net.model;

import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4952b;
import p101d.p129g.p152e.p153a.C5598c;

public class AuthLoginMigrateBody extends C4952b {
    @C5598c("email")
    private String email;
    @C5598c("fb_token")
    private String fbToken;
    @C5598c("gender")
    private String gender;
    @C5598c("nickname")
    private String nickname;
    @C5598c("vendor_uid")
    private String vendorUid;

    public AuthLoginMigrateBody() {
        C4938a d = C4947j.m19536a().mo13553d();
        this.vendorUid = d.mo13492i();
        this.email = d.mo13478b();
        this.fbToken = d.mo13480c();
        this.nickname = d.mo13488g();
        this.gender = d.mo13484e();
        setAccount((String) null);
    }

    public AuthLoginMigrateBody(String str, String str2, String str3, String str4, String str5) {
        this.vendorUid = str;
        this.email = str2;
        this.fbToken = str3;
        this.nickname = str4;
        this.gender = str5;
        setAccount((String) null);
    }
}
