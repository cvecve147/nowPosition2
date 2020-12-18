package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qo */
public final class C2643Qo extends C2237Co<C2643Qo> {

    /* renamed from: c */
    private byte[] f8153c = null;

    /* renamed from: d */
    private byte[] f8154d = null;

    /* renamed from: e */
    private byte[] f8155e = null;

    public C2643Qo() {
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
                this.f8153c = yoVar.mo10240b();
            } else if (d == 18) {
                this.f8154d = yoVar.mo10240b();
            } else if (d == 26) {
                this.f8155e = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        byte[] bArr = this.f8153c;
        if (bArr != null) {
            ao.mo7836a(1, bArr);
        }
        byte[] bArr2 = this.f8154d;
        if (bArr2 != null) {
            ao.mo7836a(2, bArr2);
        }
        byte[] bArr3 = this.f8155e;
        if (bArr3 != null) {
            ao.mo7836a(3, bArr3);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        byte[] bArr = this.f8153c;
        if (bArr != null) {
            c += C2180Ao.m9376b(1, bArr);
        }
        byte[] bArr2 = this.f8154d;
        if (bArr2 != null) {
            c += C2180Ao.m9376b(2, bArr2);
        }
        byte[] bArr3 = this.f8155e;
        return bArr3 != null ? c + C2180Ao.m9376b(3, bArr3) : c;
    }
}
