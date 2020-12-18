package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ns */
public final class C2556Ns extends C2237Co<C2556Ns> {

    /* renamed from: c */
    private static volatile C2556Ns[] f7687c;

    /* renamed from: d */
    private C2677Rs f7688d = null;

    /* renamed from: e */
    private C2761Us f7689e = null;

    /* renamed from: f */
    private C2790Vs f7690f = null;

    /* renamed from: g */
    private C2817Ws f7691g = null;

    /* renamed from: h */
    private C2588Os f7692h = null;

    /* renamed from: i */
    private C2705Ss f7693i = null;

    /* renamed from: j */
    private C2647Qs f7694j = null;

    /* renamed from: k */
    private Integer f7695k = null;

    /* renamed from: l */
    private Integer f7696l = null;

    /* renamed from: m */
    private C2498Ls f7697m = null;

    /* renamed from: n */
    private Integer f7698n = null;

    /* renamed from: o */
    private Integer f7699o = null;

    /* renamed from: p */
    private Integer f7700p = null;

    /* renamed from: q */
    private Integer f7701q = null;

    /* renamed from: r */
    private Integer f7702r = null;

    /* renamed from: s */
    private Long f7703s = null;

    public C2556Ns() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: d */
    public static C2556Ns[] m10767d() {
        if (f7687c == null) {
            synchronized (C2352Go.f7089c) {
                if (f7687c == null) {
                    f7687c = new C2556Ns[0];
                }
            }
        }
        return f7687c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            switch (d) {
                case 0:
                    return this;
                case 42:
                    if (this.f7688d == null) {
                        this.f7688d = new C2677Rs();
                    }
                    io = this.f7688d;
                    break;
                case 50:
                    if (this.f7689e == null) {
                        this.f7689e = new C2761Us();
                    }
                    io = this.f7689e;
                    break;
                case 58:
                    if (this.f7690f == null) {
                        this.f7690f = new C2790Vs();
                    }
                    io = this.f7690f;
                    break;
                case 66:
                    if (this.f7691g == null) {
                        this.f7691g = new C2817Ws();
                    }
                    io = this.f7691g;
                    break;
                case 74:
                    if (this.f7692h == null) {
                        this.f7692h = new C2588Os();
                    }
                    io = this.f7692h;
                    break;
                case 82:
                    if (this.f7693i == null) {
                        this.f7693i = new C2705Ss();
                    }
                    io = this.f7693i;
                    break;
                case 90:
                    if (this.f7694j == null) {
                        this.f7694j = new C2647Qs();
                    }
                    io = this.f7694j;
                    break;
                case 96:
                    this.f7695k = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 104:
                    this.f7696l = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 114:
                    if (this.f7697m == null) {
                        this.f7697m = new C2498Ls();
                    }
                    io = this.f7697m;
                    break;
                case 120:
                    this.f7698n = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 128:
                    this.f7699o = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 136:
                    this.f7700p = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 144:
                    this.f7701q = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 152:
                    this.f7702r = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 160:
                    this.f7703s = Long.valueOf(yoVar.mo10250i());
                    continue;
                default:
                    if (!super.mo7936a(yoVar, d)) {
                        return this;
                    }
                    continue;
            }
            yoVar.mo10236a(io);
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        C2677Rs rs = this.f7688d;
        if (rs != null) {
            ao.mo7833a(5, (C2408Io) rs);
        }
        C2761Us us = this.f7689e;
        if (us != null) {
            ao.mo7833a(6, (C2408Io) us);
        }
        C2790Vs vs = this.f7690f;
        if (vs != null) {
            ao.mo7833a(7, (C2408Io) vs);
        }
        C2817Ws ws = this.f7691g;
        if (ws != null) {
            ao.mo7833a(8, (C2408Io) ws);
        }
        C2588Os os = this.f7692h;
        if (os != null) {
            ao.mo7833a(9, (C2408Io) os);
        }
        C2705Ss ss = this.f7693i;
        if (ss != null) {
            ao.mo7833a(10, (C2408Io) ss);
        }
        C2647Qs qs = this.f7694j;
        if (qs != null) {
            ao.mo7833a(11, (C2408Io) qs);
        }
        Integer num = this.f7695k;
        if (num != null) {
            ao.mo7837b(12, num.intValue());
        }
        Integer num2 = this.f7696l;
        if (num2 != null) {
            ao.mo7837b(13, num2.intValue());
        }
        C2498Ls ls = this.f7697m;
        if (ls != null) {
            ao.mo7833a(14, (C2408Io) ls);
        }
        Integer num3 = this.f7698n;
        if (num3 != null) {
            ao.mo7837b(15, num3.intValue());
        }
        Integer num4 = this.f7699o;
        if (num4 != null) {
            ao.mo7837b(16, num4.intValue());
        }
        Integer num5 = this.f7700p;
        if (num5 != null) {
            ao.mo7837b(17, num5.intValue());
        }
        Integer num6 = this.f7701q;
        if (num6 != null) {
            ao.mo7837b(18, num6.intValue());
        }
        Integer num7 = this.f7702r;
        if (num7 != null) {
            ao.mo7837b(19, num7.intValue());
        }
        Long l = this.f7703s;
        if (l != null) {
            ao.mo7832a(20, l.longValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        C2677Rs rs = this.f7688d;
        if (rs != null) {
            c += C2180Ao.m9374b(5, (C2408Io) rs);
        }
        C2761Us us = this.f7689e;
        if (us != null) {
            c += C2180Ao.m9374b(6, (C2408Io) us);
        }
        C2790Vs vs = this.f7690f;
        if (vs != null) {
            c += C2180Ao.m9374b(7, (C2408Io) vs);
        }
        C2817Ws ws = this.f7691g;
        if (ws != null) {
            c += C2180Ao.m9374b(8, (C2408Io) ws);
        }
        C2588Os os = this.f7692h;
        if (os != null) {
            c += C2180Ao.m9374b(9, (C2408Io) os);
        }
        C2705Ss ss = this.f7693i;
        if (ss != null) {
            c += C2180Ao.m9374b(10, (C2408Io) ss);
        }
        C2647Qs qs = this.f7694j;
        if (qs != null) {
            c += C2180Ao.m9374b(11, (C2408Io) qs);
        }
        Integer num = this.f7695k;
        if (num != null) {
            c += C2180Ao.m9380c(12, num.intValue());
        }
        Integer num2 = this.f7696l;
        if (num2 != null) {
            c += C2180Ao.m9380c(13, num2.intValue());
        }
        C2498Ls ls = this.f7697m;
        if (ls != null) {
            c += C2180Ao.m9374b(14, (C2408Io) ls);
        }
        Integer num3 = this.f7698n;
        if (num3 != null) {
            c += C2180Ao.m9380c(15, num3.intValue());
        }
        Integer num4 = this.f7699o;
        if (num4 != null) {
            c += C2180Ao.m9380c(16, num4.intValue());
        }
        Integer num5 = this.f7700p;
        if (num5 != null) {
            c += C2180Ao.m9380c(17, num5.intValue());
        }
        Integer num6 = this.f7701q;
        if (num6 != null) {
            c += C2180Ao.m9380c(18, num6.intValue());
        }
        Integer num7 = this.f7702r;
        if (num7 != null) {
            c += C2180Ao.m9380c(19, num7.intValue());
        }
        Long l = this.f7703s;
        return l != null ? c + C2180Ao.m9381c(20, l.longValue()) : c;
    }
}
