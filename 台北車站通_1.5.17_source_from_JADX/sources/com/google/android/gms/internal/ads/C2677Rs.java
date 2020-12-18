package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rs */
public final class C2677Rs extends C2237Co<C2677Rs> {

    /* renamed from: c */
    private Integer f8218c = null;

    /* renamed from: d */
    private C2619Ps f8219d = null;

    /* renamed from: e */
    private Integer f8220e = null;

    /* renamed from: f */
    private Integer f8221f = null;

    /* renamed from: g */
    private Integer f8222g = null;

    public C2677Rs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2677Rs m11093b(C3641yo yoVar) {
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
                    this.f8218c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 18) {
                if (this.f8219d == null) {
                    this.f8219d = new C2619Ps();
                }
                yoVar.mo10236a((C2408Io) this.f8219d);
            } else if (d == 24) {
                this.f8220e = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 32) {
                this.f8221f = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 40) {
                this.f8222g = Integer.valueOf(yoVar.mo10249h());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11093b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8218c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2619Ps ps = this.f8219d;
        if (ps != null) {
            ao.mo7833a(2, (C2408Io) ps);
        }
        Integer num2 = this.f8220e;
        if (num2 != null) {
            ao.mo7837b(3, num2.intValue());
        }
        Integer num3 = this.f8221f;
        if (num3 != null) {
            ao.mo7837b(4, num3.intValue());
        }
        Integer num4 = this.f8222g;
        if (num4 != null) {
            ao.mo7837b(5, num4.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8218c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2619Ps ps = this.f8219d;
        if (ps != null) {
            c += C2180Ao.m9374b(2, (C2408Io) ps);
        }
        Integer num2 = this.f8220e;
        if (num2 != null) {
            c += C2180Ao.m9380c(3, num2.intValue());
        }
        Integer num3 = this.f8221f;
        if (num3 != null) {
            c += C2180Ao.m9380c(4, num3.intValue());
        }
        Integer num4 = this.f8222g;
        return num4 != null ? c + C2180Ao.m9380c(5, num4.intValue()) : c;
    }
}
