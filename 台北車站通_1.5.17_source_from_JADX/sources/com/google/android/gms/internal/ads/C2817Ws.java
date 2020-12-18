package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ws */
public final class C2817Ws extends C2237Co<C2817Ws> {

    /* renamed from: c */
    private Integer f8574c = null;

    /* renamed from: d */
    private C2619Ps f8575d = null;

    public C2817Ws() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2817Ws m11513b(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f8574c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 18) {
                if (this.f8575d == null) {
                    this.f8575d = new C2619Ps();
                }
                yoVar.mo10236a((C2408Io) this.f8575d);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11513b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8574c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2619Ps ps = this.f8575d;
        if (ps != null) {
            ao.mo7833a(2, (C2408Io) ps);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8574c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2619Ps ps = this.f8575d;
        return ps != null ? c + C2180Ao.m9374b(2, (C2408Io) ps) : c;
    }
}
