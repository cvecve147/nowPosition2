package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ls */
public final class C2498Ls extends C2237Co<C2498Ls> {

    /* renamed from: c */
    private static volatile C2498Ls[] f7536c;

    /* renamed from: d */
    private Integer f7537d = null;

    /* renamed from: e */
    private Integer f7538e = null;

    public C2498Ls() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: d */
    public static C2498Ls[] m10558d() {
        if (f7536c == null) {
            synchronized (C2352Go.f7089c) {
                if (f7536c == null) {
                    f7536c = new C2498Ls[0];
                }
            }
        }
        return f7536c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                this.f7537d = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 16) {
                this.f7538e = Integer.valueOf(yoVar.mo10249h());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f7537d;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        Integer num2 = this.f7538e;
        if (num2 != null) {
            ao.mo7837b(2, num2.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f7537d;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        Integer num2 = this.f7538e;
        return num2 != null ? c + C2180Ao.m9380c(2, num2.intValue()) : c;
    }
}
