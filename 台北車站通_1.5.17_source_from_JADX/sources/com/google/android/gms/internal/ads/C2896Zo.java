package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zo */
public final class C2896Zo extends C2237Co<C2896Zo> {

    /* renamed from: c */
    public byte[][] f8697c = C2494Lo.f7525g;

    /* renamed from: d */
    public byte[] f8698d = null;

    /* renamed from: e */
    private Integer f8699e;

    /* renamed from: f */
    public Integer f8700f;

    public C2896Zo() {
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2896Zo m11701b(C3641yo yoVar) {
        int i;
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                int a = C2494Lo.m10548a(yoVar, 10);
                byte[][] bArr = this.f8697c;
                int length = bArr == null ? 0 : bArr.length;
                byte[][] bArr2 = new byte[(a + length)][];
                if (length != 0) {
                    System.arraycopy(this.f8697c, 0, bArr2, 0, length);
                }
                while (length < bArr2.length - 1) {
                    bArr2[length] = yoVar.mo10240b();
                    yoVar.mo10243d();
                    length++;
                }
                bArr2[length] = yoVar.mo10240b();
                this.f8697c = bArr2;
            } else if (d == 18) {
                this.f8698d = yoVar.mo10240b();
            } else if (d == 24) {
                i = yoVar.mo10234a();
                int h = yoVar.mo10249h();
                C3638yl.m14594b(h);
                this.f8699e = Integer.valueOf(h);
            } else if (d == 32) {
                i = yoVar.mo10234a();
                try {
                    int h2 = yoVar.mo10249h();
                    C3638yl.m14595c(h2);
                    this.f8700f = Integer.valueOf(h2);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(i);
                    mo7936a(yoVar, d);
                }
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11701b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        byte[][] bArr = this.f8697c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f8697c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    ao.mo7836a(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.f8698d;
        if (bArr4 != null) {
            ao.mo7836a(2, bArr4);
        }
        Integer num = this.f8699e;
        if (num != null) {
            ao.mo7837b(3, num.intValue());
        }
        Integer num2 = this.f8700f;
        if (num2 != null) {
            ao.mo7837b(4, num2.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        byte[][] bArr = this.f8697c;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.f8697c;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 += C2180Ao.m9377b(bArr3);
                }
                i++;
            }
            c = c + i2 + (i3 * 1);
        }
        byte[] bArr4 = this.f8698d;
        if (bArr4 != null) {
            c += C2180Ao.m9376b(2, bArr4);
        }
        Integer num = this.f8699e;
        if (num != null) {
            c += C2180Ao.m9380c(3, num.intValue());
        }
        Integer num2 = this.f8700f;
        return num2 != null ? c + C2180Ao.m9380c(4, num2.intValue()) : c;
    }
}
