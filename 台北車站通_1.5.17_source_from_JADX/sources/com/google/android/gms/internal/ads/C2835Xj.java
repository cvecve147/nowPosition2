package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xj */
public final class C2835Xj extends C2237Co<C2835Xj> {

    /* renamed from: c */
    public String f8614c = null;

    /* renamed from: d */
    public Long f8615d = null;

    /* renamed from: e */
    private String f8616e = null;

    /* renamed from: f */
    private String f8617f = null;

    /* renamed from: g */
    private String f8618g = null;

    /* renamed from: h */
    private Long f8619h = null;

    /* renamed from: i */
    private Long f8620i = null;

    /* renamed from: j */
    private String f8621j = null;

    /* renamed from: k */
    private Long f8622k = null;

    /* renamed from: l */
    private String f8623l = null;

    public C2835Xj() {
        this.f7295a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            switch (d) {
                case 0:
                    return this;
                case 10:
                    this.f8614c = yoVar.mo10242c();
                    break;
                case 16:
                    this.f8615d = Long.valueOf(yoVar.mo10250i());
                    break;
                case 26:
                    this.f8616e = yoVar.mo10242c();
                    break;
                case 34:
                    this.f8617f = yoVar.mo10242c();
                    break;
                case 42:
                    this.f8618g = yoVar.mo10242c();
                    break;
                case 48:
                    this.f8619h = Long.valueOf(yoVar.mo10250i());
                    break;
                case 56:
                    this.f8620i = Long.valueOf(yoVar.mo10250i());
                    break;
                case 66:
                    this.f8621j = yoVar.mo10242c();
                    break;
                case 72:
                    this.f8622k = Long.valueOf(yoVar.mo10250i());
                    break;
                case 82:
                    this.f8623l = yoVar.mo10242c();
                    break;
                default:
                    if (super.mo7936a(yoVar, d)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f8614c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        Long l = this.f8615d;
        if (l != null) {
            ao.mo7840d(2, l.longValue());
        }
        String str2 = this.f8616e;
        if (str2 != null) {
            ao.mo7834a(3, str2);
        }
        String str3 = this.f8617f;
        if (str3 != null) {
            ao.mo7834a(4, str3);
        }
        String str4 = this.f8618g;
        if (str4 != null) {
            ao.mo7834a(5, str4);
        }
        Long l2 = this.f8619h;
        if (l2 != null) {
            ao.mo7840d(6, l2.longValue());
        }
        Long l3 = this.f8620i;
        if (l3 != null) {
            ao.mo7840d(7, l3.longValue());
        }
        String str5 = this.f8621j;
        if (str5 != null) {
            ao.mo7834a(8, str5);
        }
        Long l4 = this.f8622k;
        if (l4 != null) {
            ao.mo7840d(9, l4.longValue());
        }
        String str6 = this.f8623l;
        if (str6 != null) {
            ao.mo7834a(10, str6);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f8614c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        Long l = this.f8615d;
        if (l != null) {
            c += C2180Ao.m9373b(2, l.longValue());
        }
        String str2 = this.f8616e;
        if (str2 != null) {
            c += C2180Ao.m9375b(3, str2);
        }
        String str3 = this.f8617f;
        if (str3 != null) {
            c += C2180Ao.m9375b(4, str3);
        }
        String str4 = this.f8618g;
        if (str4 != null) {
            c += C2180Ao.m9375b(5, str4);
        }
        Long l2 = this.f8619h;
        if (l2 != null) {
            c += C2180Ao.m9373b(6, l2.longValue());
        }
        Long l3 = this.f8620i;
        if (l3 != null) {
            c += C2180Ao.m9373b(7, l3.longValue());
        }
        String str5 = this.f8621j;
        if (str5 != null) {
            c += C2180Ao.m9375b(8, str5);
        }
        Long l4 = this.f8622k;
        if (l4 != null) {
            c += C2180Ao.m9373b(9, l4.longValue());
        }
        String str6 = this.f8623l;
        return str6 != null ? c + C2180Ao.m9375b(10, str6) : c;
    }
}
