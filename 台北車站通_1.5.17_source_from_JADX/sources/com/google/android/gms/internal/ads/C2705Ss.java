package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ss */
public final class C2705Ss extends C2237Co<C2705Ss> {

    /* renamed from: c */
    private Integer f8307c = null;

    /* renamed from: d */
    private C2619Ps f8308d = null;

    /* renamed from: e */
    private C2498Ls f8309e = null;

    public C2705Ss() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2705Ss m11212b(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d != 8) {
                if (d == 18) {
                    if (this.f8308d == null) {
                        this.f8308d = new C2619Ps();
                    }
                    io = this.f8308d;
                } else if (d == 26) {
                    if (this.f8309e == null) {
                        this.f8309e = new C2498Ls();
                    }
                    io = this.f8309e;
                } else if (!super.mo7936a(yoVar, d)) {
                    return this;
                }
                yoVar.mo10236a(io);
            } else {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f8307c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11212b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8307c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2619Ps ps = this.f8308d;
        if (ps != null) {
            ao.mo7833a(2, (C2408Io) ps);
        }
        C2498Ls ls = this.f8309e;
        if (ls != null) {
            ao.mo7833a(3, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8307c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2619Ps ps = this.f8308d;
        if (ps != null) {
            c += C2180Ao.m9374b(2, (C2408Io) ps);
        }
        C2498Ls ls = this.f8309e;
        return ls != null ? c + C2180Ao.m9374b(3, (C2408Io) ls) : c;
    }
}
