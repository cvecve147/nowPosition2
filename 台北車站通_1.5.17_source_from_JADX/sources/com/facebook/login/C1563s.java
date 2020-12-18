package com.facebook.login;

/* renamed from: com.facebook.login.s */
public enum C1563s {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: h */
    private final boolean f5339h;

    /* renamed from: i */
    private final boolean f5340i;

    /* renamed from: j */
    private final boolean f5341j;

    /* renamed from: k */
    private final boolean f5342k;

    /* renamed from: l */
    private final boolean f5343l;

    /* renamed from: m */
    private final boolean f5344m;

    private C1563s(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5339h = z;
        this.f5340i = z2;
        this.f5341j = z3;
        this.f5342k = z4;
        this.f5343l = z5;
        this.f5344m = z6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6377a() {
        return this.f5343l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo6378b() {
        return this.f5342k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6379c() {
        return this.f5344m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo6380k() {
        return this.f5339h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo6381l() {
        return this.f5340i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo6382m() {
        return this.f5341j;
    }
}
