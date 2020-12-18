package com.openlife.checkme.activity.account;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.UserInfoBody;
import com.openlife.checkme.net.model.UserInfoResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.g */
public class C4471g extends C4673l implements C4468d {
    /* renamed from: a */
    public UserInfoBody mo12606a() {
        return new UserInfoBody();
    }

    /* renamed from: a */
    public C6433l<UserInfoResponse> mo12607a(UserInfoBody userInfoBody) {
        return this.f13552a.mo13605b().mo13586a(userInfoBody.getSignature(), userInfoBody);
    }

    /* renamed from: a */
    public void mo12608a(String str) {
        this.f13553b.mo13553d().mo13489g(str);
    }

    /* renamed from: b */
    public String mo12609b() {
        return this.f13553b.mo13553d().mo13482d();
    }

    /* renamed from: g */
    public void mo12610g(String str) {
        this.f13553b.mo13553d().mo13487f(str);
    }
}
