package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zs */
public final class C3674zs extends C2237Co<C3674zs> {

    /* renamed from: c */
    public String f10708c = null;

    /* renamed from: d */
    private C2498Ls f10709d = null;

    /* renamed from: e */
    private Integer f10710e = null;

    /* renamed from: f */
    public C2526Ms f10711f = null;

    /* renamed from: g */
    private Integer f10712g = null;

    /* renamed from: h */
    private Integer f10713h = null;

    /* renamed from: i */
    private Integer f10714i = null;

    /* renamed from: j */
    private Integer f10715j = null;

    public C3674zs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C3674zs m14739b(C3641yo yoVar) {
        C2408Io io;
        int i;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d != 10) {
                if (d == 18) {
                    if (this.f10709d == null) {
                        this.f10709d = new C2498Ls();
                    }
                    io = this.f10709d;
                } else if (d == 24) {
                    this.f10710e = Integer.valueOf(yoVar.mo10249h());
                } else if (d == 34) {
                    if (this.f10711f == null) {
                        this.f10711f = new C2526Ms();
                    }
                    io = this.f10711f;
                } else if (d == 40) {
                    this.f10712g = Integer.valueOf(yoVar.mo10249h());
                } else if (d == 48) {
                    i = yoVar.mo10234a();
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f10713h = Integer.valueOf(h);
                } else if (d == 56) {
                    i = yoVar.mo10234a();
                    int h2 = yoVar.mo10249h();
                    C3503ts.m13941a(h2);
                    this.f10714i = Integer.valueOf(h2);
                } else if (d == 64) {
                    i = yoVar.mo10234a();
                    try {
                        int h3 = yoVar.mo10249h();
                        C3503ts.m13941a(h3);
                        this.f10715j = Integer.valueOf(h3);
                    } catch (IllegalArgumentException unused) {
                        yoVar.mo10246e(i);
                        mo7936a(yoVar, d);
                    }
                } else if (!super.mo7936a(yoVar, d)) {
                    return this;
                }
                yoVar.mo10236a(io);
            } else {
                this.f10708c = yoVar.mo10242c();
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m14739b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f10708c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        C2498Ls ls = this.f10709d;
        if (ls != null) {
            ao.mo7833a(2, (C2408Io) ls);
        }
        Integer num = this.f10710e;
        if (num != null) {
            ao.mo7837b(3, num.intValue());
        }
        C2526Ms ms = this.f10711f;
        if (ms != null) {
            ao.mo7833a(4, (C2408Io) ms);
        }
        Integer num2 = this.f10712g;
        if (num2 != null) {
            ao.mo7837b(5, num2.intValue());
        }
        Integer num3 = this.f10713h;
        if (num3 != null) {
            ao.mo7837b(6, num3.intValue());
        }
        Integer num4 = this.f10714i;
        if (num4 != null) {
            ao.mo7837b(7, num4.intValue());
        }
        Integer num5 = this.f10715j;
        if (num5 != null) {
            ao.mo7837b(8, num5.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f10708c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        C2498Ls ls = this.f10709d;
        if (ls != null) {
            c += C2180Ao.m9374b(2, (C2408Io) ls);
        }
        Integer num = this.f10710e;
        if (num != null) {
            c += C2180Ao.m9380c(3, num.intValue());
        }
        C2526Ms ms = this.f10711f;
        if (ms != null) {
            c += C2180Ao.m9374b(4, (C2408Io) ms);
        }
        Integer num2 = this.f10712g;
        if (num2 != null) {
            c += C2180Ao.m9380c(5, num2.intValue());
        }
        Integer num3 = this.f10713h;
        if (num3 != null) {
            c += C2180Ao.m9380c(6, num3.intValue());
        }
        Integer num4 = this.f10714i;
        if (num4 != null) {
            c += C2180Ao.m9380c(7, num4.intValue());
        }
        Integer num5 = this.f10715j;
        return num5 != null ? c + C2180Ao.m9380c(8, num5.intValue()) : c;
    }
}
