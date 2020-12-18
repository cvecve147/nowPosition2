package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zn */
public final class C2895Zn extends C2237Co<C2895Zn> {

    /* renamed from: c */
    public byte[] f8693c = null;

    /* renamed from: d */
    public byte[] f8694d = null;

    /* renamed from: e */
    public byte[] f8695e = null;

    /* renamed from: f */
    public byte[] f8696f = null;

    public C2895Zn() {
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
                this.f8693c = yoVar.mo10240b();
            } else if (d == 18) {
                this.f8694d = yoVar.mo10240b();
            } else if (d == 26) {
                this.f8695e = yoVar.mo10240b();
            } else if (d == 34) {
                this.f8696f = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        byte[] bArr = this.f8693c;
        if (bArr != null) {
            ao.mo7836a(1, bArr);
        }
        byte[] bArr2 = this.f8694d;
        if (bArr2 != null) {
            ao.mo7836a(2, bArr2);
        }
        byte[] bArr3 = this.f8695e;
        if (bArr3 != null) {
            ao.mo7836a(3, bArr3);
        }
        byte[] bArr4 = this.f8696f;
        if (bArr4 != null) {
            ao.mo7836a(4, bArr4);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        byte[] bArr = this.f8693c;
        if (bArr != null) {
            c += C2180Ao.m9376b(1, bArr);
        }
        byte[] bArr2 = this.f8694d;
        if (bArr2 != null) {
            c += C2180Ao.m9376b(2, bArr2);
        }
        byte[] bArr3 = this.f8695e;
        if (bArr3 != null) {
            c += C2180Ao.m9376b(3, bArr3);
        }
        byte[] bArr4 = this.f8696f;
        return bArr4 != null ? c + C2180Ao.m9376b(4, bArr4) : c;
    }
}
