package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.As */
public final class C2184As extends C2237Co<C2184As> {

    /* renamed from: c */
    private Integer f6705c = null;

    /* renamed from: d */
    private C2526Ms f6706d = null;

    /* renamed from: e */
    private String f6707e = null;

    /* renamed from: f */
    private String f6708f = null;

    public C2184As() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2184As m9404b(C3641yo yoVar) {
        int h;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 40) {
                try {
                    h = yoVar.mo10249h();
                    if (h < 0 || h > 2) {
                        StringBuilder sb = new StringBuilder(40);
                        sb.append(h);
                        sb.append(" is not a valid enum Platform");
                    } else {
                        this.f6705c = Integer.valueOf(h);
                    }
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(yoVar.mo10234a());
                    mo7936a(yoVar, d);
                }
            } else if (d == 50) {
                if (this.f6706d == null) {
                    this.f6706d = new C2526Ms();
                }
                yoVar.mo10236a((C2408Io) this.f6706d);
            } else if (d == 58) {
                this.f6707e = yoVar.mo10242c();
            } else if (d == 66) {
                this.f6708f = yoVar.mo10242c();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(h);
        sb2.append(" is not a valid enum Platform");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9404b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f6705c;
        if (num != null) {
            ao.mo7837b(5, num.intValue());
        }
        C2526Ms ms = this.f6706d;
        if (ms != null) {
            ao.mo7833a(6, (C2408Io) ms);
        }
        String str = this.f6707e;
        if (str != null) {
            ao.mo7834a(7, str);
        }
        String str2 = this.f6708f;
        if (str2 != null) {
            ao.mo7834a(8, str2);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f6705c;
        if (num != null) {
            c += C2180Ao.m9380c(5, num.intValue());
        }
        C2526Ms ms = this.f6706d;
        if (ms != null) {
            c += C2180Ao.m9374b(6, (C2408Io) ms);
        }
        String str = this.f6707e;
        if (str != null) {
            c += C2180Ao.m9375b(7, str);
        }
        String str2 = this.f6708f;
        return str2 != null ? c + C2180Ao.m9375b(8, str2) : c;
    }
}
