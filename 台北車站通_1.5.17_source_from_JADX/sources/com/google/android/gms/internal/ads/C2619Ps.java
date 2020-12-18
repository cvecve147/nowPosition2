package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ps */
public final class C2619Ps extends C2237Co<C2619Ps> {

    /* renamed from: c */
    private Integer f8124c = null;

    public C2619Ps() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2619Ps m10933b(C3641yo yoVar) {
        int h;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                try {
                    h = yoVar.mo10249h();
                    if (h < 0 || h > 3) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(h);
                        sb.append(" is not a valid enum VideoErrorCode");
                    } else {
                        this.f8124c = Integer.valueOf(h);
                    }
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(yoVar.mo10234a());
                    mo7936a(yoVar, d);
                }
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(h);
        sb2.append(" is not a valid enum VideoErrorCode");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m10933b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8124c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8124c;
        return num != null ? c + C2180Ao.m9380c(1, num.intValue()) : c;
    }
}
