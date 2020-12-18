package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.So */
public final class C2700So extends C2237Co<C2700So> {

    /* renamed from: c */
    private Integer f8282c = null;

    /* renamed from: d */
    private byte[] f8283d = null;

    /* renamed from: e */
    private byte[] f8284e = null;

    public C2700So() {
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
            if (d == 8) {
                this.f8282c = Integer.valueOf(yoVar.mo10247f());
            } else if (d == 18) {
                this.f8283d = yoVar.mo10240b();
            } else if (d == 26) {
                this.f8284e = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8282c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        byte[] bArr = this.f8283d;
        if (bArr != null) {
            ao.mo7836a(2, bArr);
        }
        byte[] bArr2 = this.f8284e;
        if (bArr2 != null) {
            ao.mo7836a(3, bArr2);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8282c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        byte[] bArr = this.f8283d;
        if (bArr != null) {
            c += C2180Ao.m9376b(2, bArr);
        }
        byte[] bArr2 = this.f8284e;
        return bArr2 != null ? c + C2180Ao.m9376b(3, bArr2) : c;
    }
}
