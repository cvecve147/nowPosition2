package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Es */
public final class C2298Es extends C2237Co<C2298Es> {

    /* renamed from: c */
    private C2241Cs f6961c = null;

    /* renamed from: d */
    private C2468Ks[] f6962d = C2468Ks.m10478d();

    /* renamed from: e */
    private Integer f6963e = null;

    /* renamed from: f */
    private C2498Ls f6964f = null;

    public C2298Es() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2298Es m9727b(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                if (this.f6961c == null) {
                    this.f6961c = new C2241Cs();
                }
                io = this.f6961c;
            } else if (d == 18) {
                int a = C2494Lo.m10548a(yoVar, 18);
                C2468Ks[] ksArr = this.f6962d;
                int length = ksArr == null ? 0 : ksArr.length;
                C2468Ks[] ksArr2 = new C2468Ks[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f6962d, 0, ksArr2, 0, length);
                }
                while (length < ksArr2.length - 1) {
                    ksArr2[length] = new C2468Ks();
                    yoVar.mo10236a((C2408Io) ksArr2[length]);
                    yoVar.mo10243d();
                    length++;
                }
                ksArr2[length] = new C2468Ks();
                yoVar.mo10236a((C2408Io) ksArr2[length]);
                this.f6962d = ksArr2;
            } else if (d == 24) {
                int a2 = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f6963e = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a2);
                    mo7936a(yoVar, d);
                }
            } else if (d == 34) {
                if (this.f6964f == null) {
                    this.f6964f = new C2498Ls();
                }
                io = this.f6964f;
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
            yoVar.mo10236a(io);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9727b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        C2241Cs cs = this.f6961c;
        if (cs != null) {
            ao.mo7833a(1, (C2408Io) cs);
        }
        C2468Ks[] ksArr = this.f6962d;
        if (ksArr != null && ksArr.length > 0) {
            int i = 0;
            while (true) {
                C2468Ks[] ksArr2 = this.f6962d;
                if (i >= ksArr2.length) {
                    break;
                }
                C2468Ks ks = ksArr2[i];
                if (ks != null) {
                    ao.mo7833a(2, (C2408Io) ks);
                }
                i++;
            }
        }
        Integer num = this.f6963e;
        if (num != null) {
            ao.mo7837b(3, num.intValue());
        }
        C2498Ls ls = this.f6964f;
        if (ls != null) {
            ao.mo7833a(4, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        C2241Cs cs = this.f6961c;
        if (cs != null) {
            c += C2180Ao.m9374b(1, (C2408Io) cs);
        }
        C2468Ks[] ksArr = this.f6962d;
        if (ksArr != null && ksArr.length > 0) {
            int i = 0;
            while (true) {
                C2468Ks[] ksArr2 = this.f6962d;
                if (i >= ksArr2.length) {
                    break;
                }
                C2468Ks ks = ksArr2[i];
                if (ks != null) {
                    c += C2180Ao.m9374b(2, (C2408Io) ks);
                }
                i++;
            }
        }
        Integer num = this.f6963e;
        if (num != null) {
            c += C2180Ao.m9380c(3, num.intValue());
        }
        C2498Ls ls = this.f6964f;
        return ls != null ? c + C2180Ao.m9374b(4, (C2408Io) ls) : c;
    }
}
