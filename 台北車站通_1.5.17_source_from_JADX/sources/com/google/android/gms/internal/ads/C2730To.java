package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.To */
public final class C2730To extends C2237Co<C2730To> {

    /* renamed from: c */
    public Integer f8348c = null;

    /* renamed from: d */
    public String f8349d = null;

    /* renamed from: e */
    public byte[] f8350e = null;

    public C2730To() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2730To m11294b(C3641yo yoVar) {
        int f;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                try {
                    f = yoVar.mo10247f();
                    if (f < 0 || f > 1) {
                        StringBuilder sb = new StringBuilder(36);
                        sb.append(f);
                        sb.append(" is not a valid enum Type");
                    } else {
                        this.f8348c = Integer.valueOf(f);
                    }
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(yoVar.mo10234a());
                    mo7936a(yoVar, d);
                }
            } else if (d == 18) {
                this.f8349d = yoVar.mo10242c();
            } else if (d == 26) {
                this.f8350e = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append(f);
        sb2.append(" is not a valid enum Type");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11294b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f8348c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        String str = this.f8349d;
        if (str != null) {
            ao.mo7834a(2, str);
        }
        byte[] bArr = this.f8350e;
        if (bArr != null) {
            ao.mo7836a(3, bArr);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f8348c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        String str = this.f8349d;
        if (str != null) {
            c += C2180Ao.m9375b(2, str);
        }
        byte[] bArr = this.f8350e;
        return bArr != null ? c + C2180Ao.m9376b(3, bArr) : c;
    }
}
