package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vo */
public final class C2786Vo extends C2237Co<C2786Vo> {

    /* renamed from: c */
    public String f8458c = null;

    /* renamed from: d */
    public Long f8459d = null;

    /* renamed from: e */
    public Boolean f8460e = null;

    public C2786Vo() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f8458c = yoVar.mo10242c();
            } else if (d == 16) {
                this.f8459d = Long.valueOf(yoVar.mo10245e());
            } else if (d == 24) {
                this.f8460e = Boolean.valueOf(yoVar.mo10248g());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f8458c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        Long l = this.f8459d;
        if (l != null) {
            ao.mo7840d(2, l.longValue());
        }
        Boolean bool = this.f8460e;
        if (bool != null) {
            ao.mo7835a(3, bool.booleanValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f8458c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        Long l = this.f8459d;
        if (l != null) {
            c += C2180Ao.m9373b(2, l.longValue());
        }
        Boolean bool = this.f8460e;
        if (bool == null) {
            return c;
        }
        bool.booleanValue();
        return c + C2180Ao.m9365a(3) + 1;
    }
}
