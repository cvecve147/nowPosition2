package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vs */
public final class C3561vs extends C2237Co<C3561vs> {

    /* renamed from: c */
    private static volatile C3561vs[] f10393c;

    /* renamed from: d */
    private Integer f10394d = null;

    /* renamed from: e */
    private C2440Js f10395e = null;

    public C3561vs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C3561vs m14294b(C3641yo yoVar) {
        int h;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                try {
                    h = yoVar.mo10249h();
                    if (h < 0 || h > 10) {
                        StringBuilder sb = new StringBuilder(44);
                        sb.append(h);
                        sb.append(" is not a valid enum AdFormatType");
                    } else {
                        this.f10394d = Integer.valueOf(h);
                    }
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(yoVar.mo10234a());
                    mo7936a(yoVar, d);
                }
            } else if (d == 18) {
                if (this.f10395e == null) {
                    this.f10395e = new C2440Js();
                }
                yoVar.mo10236a((C2408Io) this.f10395e);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append(h);
        sb2.append(" is not a valid enum AdFormatType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static C3561vs[] m14295d() {
        if (f10393c == null) {
            synchronized (C2352Go.f7089c) {
                if (f10393c == null) {
                    f10393c = new C3561vs[0];
                }
            }
        }
        return f10393c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m14294b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f10394d;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2440Js js = this.f10395e;
        if (js != null) {
            ao.mo7833a(2, (C2408Io) js);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f10394d;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2440Js js = this.f10395e;
        return js != null ? c + C2180Ao.m9374b(2, (C2408Io) js) : c;
    }
}
