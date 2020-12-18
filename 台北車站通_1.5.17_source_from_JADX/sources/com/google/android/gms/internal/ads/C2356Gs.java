package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Gs */
public final class C2356Gs extends C2237Co<C2356Gs> {

    /* renamed from: c */
    private Integer f7095c = null;

    /* renamed from: d */
    private C2498Ls f7096d = null;

    public C2356Gs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2356Gs m9997b(C3641yo yoVar) {
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
                    this.f7095c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 18) {
                if (this.f7096d == null) {
                    this.f7096d = new C2498Ls();
                }
                yoVar.mo10236a((C2408Io) this.f7096d);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9997b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f7095c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        C2498Ls ls = this.f7096d;
        if (ls != null) {
            ao.mo7833a(2, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f7095c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        C2498Ls ls = this.f7096d;
        return ls != null ? c + C2180Ao.m9374b(2, (C2408Io) ls) : c;
    }
}
