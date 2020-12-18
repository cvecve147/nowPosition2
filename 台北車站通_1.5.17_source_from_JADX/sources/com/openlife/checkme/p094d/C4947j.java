package com.openlife.checkme.p094d;

import android.app.Application;
import android.content.Context;

/* renamed from: com.openlife.checkme.d.j */
public class C4947j {

    /* renamed from: a */
    private static C4947j f14117a = new C4947j();

    /* renamed from: b */
    private Context f14118b;

    /* renamed from: c */
    private C4939b f14119c;

    /* renamed from: d */
    private C4938a f14120d;

    /* renamed from: e */
    private C4946i f14121e;

    /* renamed from: f */
    private C4945h f14122f;

    /* renamed from: a */
    public static C4947j m19536a() {
        C4947j jVar = f14117a;
        return jVar != null ? jVar : new C4947j();
    }

    /* renamed from: a */
    public void mo13550a(Application application) {
        this.f14118b = application.getApplicationContext();
        this.f14119c = new C4939b(this.f14118b);
        this.f14120d = new C4938a(this.f14118b);
        this.f14121e = new C4946i(this.f14118b);
        this.f14122f = new C4945h(this.f14118b);
    }

    /* renamed from: b */
    public Context mo13551b() {
        return this.f14118b;
    }

    /* renamed from: c */
    public C4939b mo13552c() {
        return this.f14119c;
    }

    /* renamed from: d */
    public C4938a mo13553d() {
        return this.f14120d;
    }

    /* renamed from: e */
    public C4946i mo13554e() {
        return this.f14121e;
    }

    /* renamed from: f */
    public C4945h mo13555f() {
        return this.f14122f;
    }
}
