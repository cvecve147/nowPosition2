package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qs */
public final class C2647Qs extends C2237Co<C2647Qs> {

    /* renamed from: c */
    private C2526Ms f8161c = null;

    /* renamed from: d */
    private Integer f8162d = null;

    /* renamed from: e */
    private C2619Ps f8163e = null;

    /* renamed from: f */
    private C2498Ls f8164f = null;

    public C2647Qs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2647Qs m11000b(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                if (this.f8161c == null) {
                    this.f8161c = new C2526Ms();
                }
                io = this.f8161c;
            } else if (d == 16) {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f8162d = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 26) {
                if (this.f8163e == null) {
                    this.f8163e = new C2619Ps();
                }
                io = this.f8163e;
            } else if (d == 34) {
                if (this.f8164f == null) {
                    this.f8164f = new C2498Ls();
                }
                io = this.f8164f;
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
            yoVar.mo10236a(io);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11000b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        C2526Ms ms = this.f8161c;
        if (ms != null) {
            ao.mo7833a(1, (C2408Io) ms);
        }
        Integer num = this.f8162d;
        if (num != null) {
            ao.mo7837b(2, num.intValue());
        }
        C2619Ps ps = this.f8163e;
        if (ps != null) {
            ao.mo7833a(3, (C2408Io) ps);
        }
        C2498Ls ls = this.f8164f;
        if (ls != null) {
            ao.mo7833a(4, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        C2526Ms ms = this.f8161c;
        if (ms != null) {
            c += C2180Ao.m9374b(1, (C2408Io) ms);
        }
        Integer num = this.f8162d;
        if (num != null) {
            c += C2180Ao.m9380c(2, num.intValue());
        }
        C2619Ps ps = this.f8163e;
        if (ps != null) {
            c += C2180Ao.m9374b(3, (C2408Io) ps);
        }
        C2498Ls ls = this.f8164f;
        return ls != null ? c + C2180Ao.m9374b(4, (C2408Io) ls) : c;
    }
}
