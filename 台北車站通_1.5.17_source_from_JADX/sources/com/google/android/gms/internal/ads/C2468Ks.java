package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ks */
public final class C2468Ks extends C2237Co<C2468Ks> {

    /* renamed from: c */
    private static volatile C2468Ks[] f7475c;

    /* renamed from: d */
    private String f7476d = null;

    /* renamed from: e */
    private Integer f7477e = null;

    /* renamed from: f */
    private C2498Ls f7478f = null;

    public C2468Ks() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2468Ks m10477b(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f7476d = yoVar.mo10242c();
            } else if (d == 16) {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f7477e = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 26) {
                if (this.f7478f == null) {
                    this.f7478f = new C2498Ls();
                }
                yoVar.mo10236a((C2408Io) this.f7478f);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: d */
    public static C2468Ks[] m10478d() {
        if (f7475c == null) {
            synchronized (C2352Go.f7089c) {
                if (f7475c == null) {
                    f7475c = new C2468Ks[0];
                }
            }
        }
        return f7475c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m10477b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f7476d;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        Integer num = this.f7477e;
        if (num != null) {
            ao.mo7837b(2, num.intValue());
        }
        C2498Ls ls = this.f7478f;
        if (ls != null) {
            ao.mo7833a(3, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f7476d;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        Integer num = this.f7477e;
        if (num != null) {
            c += C2180Ao.m9380c(2, num.intValue());
        }
        C2498Ls ls = this.f7478f;
        return ls != null ? c + C2180Ao.m9374b(3, (C2408Io) ls) : c;
    }
}
