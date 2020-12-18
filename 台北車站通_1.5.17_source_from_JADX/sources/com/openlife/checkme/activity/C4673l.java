package com.openlife.checkme.activity;

import com.openlife.checkme.net.model.AuthLoginMigrateBody;
import com.openlife.checkme.net.model.FbLoginMigrateBody;
import com.openlife.checkme.net.model.LoginMigrateResponse;
import com.openlife.checkme.p094d.C4938a;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4955e;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.l */
public class C4673l implements C4703m {

    /* renamed from: a */
    protected C4955e f13552a = C4955e.m19580a();

    /* renamed from: b */
    protected C4947j f13553b = C4947j.m19536a();

    /* renamed from: a */
    public C6433l<LoginMigrateResponse> mo12973a(AuthLoginMigrateBody authLoginMigrateBody) {
        return this.f13552a.mo13605b().mo13559a(authLoginMigrateBody.getSignature(), authLoginMigrateBody);
    }

    /* renamed from: a */
    public C6433l<LoginMigrateResponse> mo12974a(FbLoginMigrateBody fbLoginMigrateBody) {
        return this.f13552a.mo13605b().mo13565a(fbLoginMigrateBody.getSignature(), fbLoginMigrateBody);
    }

    /* renamed from: a */
    public void mo12975a(String str, String str2, String str3, String str4, String str5, String str6) {
        C4938a d = this.f13553b.mo13553d();
        d.mo13489g(str);
        d.mo13477a(str2);
        d.mo13487f(str3);
        d.mo13479b(str4);
        d.mo13483d(str5);
        d.mo13485e(str6);
    }

    /* renamed from: b */
    public void mo12976b(int i) {
        this.f13553b.mo13554e().mo13531d(i);
    }

    /* renamed from: b */
    public void mo12977b(String str) {
        this.f13553b.mo13554e().mo13538f(str);
    }

    /* renamed from: c */
    public FbLoginMigrateBody mo12978c() {
        return new FbLoginMigrateBody();
    }

    /* renamed from: c */
    public void mo12979c(String str) {
        this.f13553b.mo13554e().mo13541g(str);
    }

    /* renamed from: d */
    public void mo12980d() {
        this.f13553b.mo13553d().mo13497l();
    }

    /* renamed from: d */
    public void mo12981d(String str) {
        this.f13553b.mo13553d().mo13491h(str);
    }

    /* renamed from: e */
    public boolean mo12982e() {
        return this.f13553b.mo13553d().mo13496k();
    }

    /* renamed from: f */
    public AuthLoginMigrateBody mo12983f() {
        return new AuthLoginMigrateBody();
    }

    /* renamed from: h */
    public String mo12984h() {
        return this.f13553b.mo13553d().mo13490h();
    }

    /* renamed from: i */
    public String mo12985i() {
        return this.f13553b.mo13553d().mo13488g();
    }

    /* renamed from: j */
    public int mo12986j() {
        return this.f13553b.mo13554e().mo13527c();
    }
}
