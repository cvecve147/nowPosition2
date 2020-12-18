package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Os */
public final class C2588Os extends C2237Co<C2588Os> {

    /* renamed from: c */
    private Integer f8074c = null;

    /* renamed from: d */
    private C2619Ps f8075d = null;

    /* renamed from: e */
    private C2498Ls f8076e = null;

    public C2588Os() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2588Os m10846b(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d != 8) {
                if (d == 18) {
                    if (this.f8075d == null) {
                        this.f8075d = new C2619Ps();
                    }
                    io = this.f8075d;
                } else if (d == 26) {
                    if (this.f8076e == null) {
                        this.f8076e = new C2498Ls();
                    }
                    io = this.f8076e;
                } else if (!super.mo7936a(yoVar, d)) {
                    return this;
                }
                yoVar.mo10236a(io);
            } else {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f8074c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m10846b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8074c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2619Ps ps = this.f8075d;
        if (ps != null) {
            ao.mo7833a(2, (C2408Io) ps);
        }
        C2498Ls ls = this.f8076e;
        if (ls != null) {
            ao.mo7833a(3, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8074c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2619Ps ps = this.f8075d;
        if (ps != null) {
            c += C2180Ao.m9374b(2, (C2408Io) ps);
        }
        C2498Ls ls = this.f8076e;
        return ls != null ? c + C2180Ao.m9374b(3, (C2408Io) ls) : c;
    }
}
