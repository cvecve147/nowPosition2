package com.openlife.checkme.net.model;

import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4947j;
import p101d.p129g.p152e.p153a.C5598c;

public class FbLoginMigrateBody extends LoginBaseBody {
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

    public FbLoginMigrateBody() {
        C4938a d = C4947j.m19536a().mo13553d();
        this.fbuid = d.mo13482d();
        this.email = d.mo13478b();
        this.fbToken = d.mo13480c();
        this.nickname = d.mo13488g();
        this.gender = d.mo13484e();
        setAccount((String) null);
    }
}
