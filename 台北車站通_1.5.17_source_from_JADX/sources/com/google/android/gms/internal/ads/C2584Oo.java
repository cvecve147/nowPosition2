package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oo */
public final class C2584Oo extends C2237Co<C2584Oo> {

    /* renamed from: c */
    private static volatile C2584Oo[] f8068c;

    /* renamed from: d */
    public byte[] f8069d = null;

    /* renamed from: e */
    public byte[] f8070e = null;

    public C2584Oo() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: d */
    public static C2584Oo[] m10840d() {
        if (f8068c == null) {
            synchronized (C2352Go.f7089c) {
                if (f8068c == null) {
                    f8068c = new C2584Oo[0];
                }
            }
        }
        return f8068c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f8069d = yoVar.mo10240b();
            } else if (d == 18) {
                this.f8070e = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        ao.mo7836a(1, this.f8069d);
        byte[] bArr = this.f8070e;
        if (bArr != null) {
            ao.mo7836a(2, bArr);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c() + C2180Ao.m9376b(1, this.f8069d);
        byte[] bArr = this.f8070e;
        return bArr != null ? c + C2180Ao.m9376b(2, bArr) : c;
    }
}
