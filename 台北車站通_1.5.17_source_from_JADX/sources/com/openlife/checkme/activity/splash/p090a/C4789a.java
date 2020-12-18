package com.openlife.checkme.activity.splash.p090a;

import java.io.Serializable;
import java.util.Locale;
import p101d.p129g.p152e.p153a.C5598c;

/* renamed from: com.openlife.checkme.activity.splash.a.a */
public class C4789a implements Serializable {

    /* renamed from: a */
    public static final String f13785a = Locale.CHINESE.getLanguage();

    /* renamed from: b */
    public static final String f13786b = Locale.ENGLISH.getLanguage();
    @C5598c("userToken")

    /* renamed from: c */
    private String f13787c = "";
    @C5598c("email")

    /* renamed from: d */
    private String f13788d = "";
    @C5598c("nickname")

    /* renamed from: e */
    private String f13789e = "";
    @C5598c("fbuid")

    /* renamed from: f */
    private String f13790f = "";
    @C5598c("fbToken")

    /* renamed from: g */
    private String f13791g = "";
    @C5598c("gender")

    /* renamed from: h */
    private String f13792h = "";
    @C5598c("vendor_uid")

    /* renamed from: i */
    private String f13793i = "";

    /* renamed from: a */
    public C4789a mo13235a(String str) {
        this.f13793i = str;
        return this;
    }

    /* renamed from: a */
    public String mo13236a() {
        return this.f13788d;
    }

    /* renamed from: b */
    public String mo13237b() {
        return this.f13791g;
    }

    /* renamed from: c */
    public String mo13238c() {
        return this.f13790f;
    }

    /* renamed from: d */
    public String mo13239d() {
        return this.f13792h;
    }

    /* renamed from: e */
    public String mo13240e() {
        return this.f13789e;
    }

    /* renamed from: f */
    public String mo13241f() {
        return this.f13787c;
    }

    /* renamed from: g */
    public String mo13242g() {
        return this.f13793i;
    }

    /* renamed from: h */
    public boolean mo13243h() {
        return this.f13787c.isEmpty() && this.f13793i.isEmpty() && this.f13789e.isEmpty() && this.f13792h.isEmpty() && this.f13788d.isEmpty() && this.f13790f.isEmpty() && this.f13791g.isEmpty();
    }

    /* renamed from: i */
    public boolean mo13244i() {
        return !this.f13787c.isEmpty() && this.f13793i.isEmpty() && this.f13789e.isEmpty() && this.f13792h.isEmpty() && this.f13788d.isEmpty() && this.f13790f.isEmpty() && this.f13791g.isEmpty();
    }
}
