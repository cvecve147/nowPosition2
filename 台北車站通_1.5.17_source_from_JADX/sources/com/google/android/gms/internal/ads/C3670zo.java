package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zo */
public final class C3670zo extends C2237Co<C3670zo> {

    /* renamed from: c */
    public Long f10679c = null;

    /* renamed from: d */
    private String f10680d = null;

    /* renamed from: e */
    private byte[] f10681e = null;

    public C3670zo() {
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
                this.f10679c = Long.valueOf(yoVar.mo10250i());
            } else if (d == 26) {
                this.f10680d = yoVar.mo10242c();
            } else if (d == 34) {
                this.f10681e = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Long l = this.f10679c;
        if (l != null) {
            ao.mo7840d(1, l.longValue());
        }
        String str = this.f10680d;
        if (str != null) {
            ao.mo7834a(3, str);
        }
        byte[] bArr = this.f10681e;
        if (bArr != null) {
            ao.mo7836a(4, bArr);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Long l = this.f10679c;
        if (l != null) {
            c += C2180Ao.m9373b(1, l.longValue());
        }
        String str = this.f10680d;
        if (str != null) {
            c += C2180Ao.m9375b(3, str);
        }
        byte[] bArr = this.f10681e;
        return bArr != null ? c + C2180Ao.m9376b(4, bArr) : c;
    }
}
