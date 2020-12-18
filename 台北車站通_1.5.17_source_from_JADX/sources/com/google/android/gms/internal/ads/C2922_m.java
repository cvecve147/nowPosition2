package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads._m */
public final class C2922_m extends C2237Co<C2922_m> {

    /* renamed from: c */
    private Long f8850c = null;

    /* renamed from: d */
    private Long f8851d = null;

    /* renamed from: e */
    public Long f8852e = null;

    /* renamed from: f */
    public Long f8853f = null;

    /* renamed from: g */
    public Long f8854g = null;

    public C2922_m() {
        this.f7295a = -1;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                this.f8850c = Long.valueOf(yoVar.mo10250i());
            } else if (d == 16) {
                this.f8851d = Long.valueOf(yoVar.mo10250i());
            } else if (d == 24) {
                this.f8852e = Long.valueOf(yoVar.mo10250i());
            } else if (d == 32) {
                this.f8853f = Long.valueOf(yoVar.mo10250i());
            } else if (d == 40) {
                this.f8854g = Long.valueOf(yoVar.mo10250i());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Long l = this.f8850c;
        if (l != null) {
            ao.mo7840d(1, l.longValue());
        }
        Long l2 = this.f8851d;
        if (l2 != null) {
            ao.mo7840d(2, l2.longValue());
        }
        Long l3 = this.f8852e;
        if (l3 != null) {
            ao.mo7840d(3, l3.longValue());
        }
        Long l4 = this.f8853f;
        if (l4 != null) {
            ao.mo7840d(4, l4.longValue());
        }
        Long l5 = this.f8854g;
        if (l5 != null) {
            ao.mo7840d(5, l5.longValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Long l = this.f8850c;
        if (l != null) {
            c += C2180Ao.m9373b(1, l.longValue());
        }
        Long l2 = this.f8851d;
        if (l2 != null) {
            c += C2180Ao.m9373b(2, l2.longValue());
        }
        Long l3 = this.f8852e;
        if (l3 != null) {
            c += C2180Ao.m9373b(3, l3.longValue());
        }
        Long l4 = this.f8853f;
        if (l4 != null) {
            c += C2180Ao.m9373b(4, l4.longValue());
        }
        Long l5 = this.f8854g;
        return l5 != null ? c + C2180Ao.m9373b(5, l5.longValue()) : c;
    }
}
