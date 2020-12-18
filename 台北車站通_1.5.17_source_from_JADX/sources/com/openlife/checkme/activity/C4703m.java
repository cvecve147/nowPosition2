package com.openlife.checkme.activity;

import com.openlife.checkme.net.model.AuthLoginMigrateBody;
import com.openlife.checkme.net.model.FbLoginMigrateBody;
import com.openlife.checkme.net.model.LoginMigrateResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.m */
public interface C4703m {
    /* renamed from: a */
    C6433l<LoginMigrateResponse> mo12973a(AuthLoginMigrateBody authLoginMigrateBody);

    /* renamed from: a */
    C6433l<LoginMigrateResponse> mo12974a(FbLoginMigrateBody fbLoginMigrateBody);

    /* renamed from: a */
    void mo12975a(String str, String str2, String str3, String str4, String str5, String str6);

    /* renamed from: b */
    void mo12976b(int i);

    /* renamed from: b */
    void mo12977b(String str);

    /* renamed from: c */
    FbLoginMigrateBody mo12978c();

    /* renamed from: c */
    void mo12979c(String str);

    /* renamed from: d */
    void mo12980d();

    /* renamed from: d */
    void mo12981d(String str);

    /* renamed from: e */
    boolean mo12982e();

    /* renamed from: f */
    AuthLoginMigrateBody mo12983f();

    /* renamed from: h */
    String mo12984h();

    /* renamed from: i */
    String mo12985i();

    /* renamed from: j */
    int mo12986j();
}
