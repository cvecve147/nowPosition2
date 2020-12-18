package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Po */
public final class C2615Po extends C2237Co<C2615Po> {

    /* renamed from: c */
    private C2643Qo f8118c = null;

    /* renamed from: d */
    public C2584Oo[] f8119d = C2584Oo.m10840d();

    /* renamed from: e */
    private byte[] f8120e = null;

    /* renamed from: f */
    private byte[] f8121f = null;

    /* renamed from: g */
    private Integer f8122g = null;

    public C2615Po() {
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
                if (this.f8118c == null) {
                    this.f8118c = new C2643Qo();
                }
                yoVar.mo10236a((C2408Io) this.f8118c);
            } else if (d == 18) {
                int a = C2494Lo.m10548a(yoVar, 18);
                C2584Oo[] ooArr = this.f8119d;
                int length = ooArr == null ? 0 : ooArr.length;
                C2584Oo[] ooArr2 = new C2584Oo[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f8119d, 0, ooArr2, 0, length);
                }
                while (length < ooArr2.length - 1) {
                    ooArr2[length] = new C2584Oo();
                    yoVar.mo10236a((C2408Io) ooArr2[length]);
                    yoVar.mo10243d();
                    length++;
                }
                ooArr2[length] = new C2584Oo();
                yoVar.mo10236a((C2408Io) ooArr2[length]);
                this.f8119d = ooArr2;
            } else if (d == 26) {
                this.f8120e = yoVar.mo10240b();
            } else if (d == 34) {
                this.f8121f = yoVar.mo10240b();
            } else if (d == 40) {
                this.f8122g = Integer.valueOf(yoVar.mo10247f());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        C2643Qo qo = this.f8118c;
        if (qo != null) {
            ao.mo7833a(1, (C2408Io) qo);
        }
        C2584Oo[] ooArr = this.f8119d;
        if (ooArr != null && ooArr.length > 0) {
            int i = 0;
            while (true) {
                C2584Oo[] ooArr2 = this.f8119d;
                if (i >= ooArr2.length) {
                    break;
                }
                C2584Oo oo = ooArr2[i];
                if (oo != null) {
                    ao.mo7833a(2, (C2408Io) oo);
                }
                i++;
            }
        }
        byte[] bArr = this.f8120e;
        if (bArr != null) {
            ao.mo7836a(3, bArr);
        }
        byte[] bArr2 = this.f8121f;
        if (bArr2 != null) {
            ao.mo7836a(4, bArr2);
        }
        Integer num = this.f8122g;
        if (num != null) {
            ao.mo7837b(5, num.intValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        C2643Qo qo = this.f8118c;
        if (qo != null) {
            c += C2180Ao.m9374b(1, (C2408Io) qo);
        }
        C2584Oo[] ooArr = this.f8119d;
        if (ooArr != null && ooArr.length > 0) {
            int i = 0;
            while (true) {
                C2584Oo[] ooArr2 = this.f8119d;
                if (i >= ooArr2.length) {
                    break;
                }
                C2584Oo oo = ooArr2[i];
                if (oo != null) {
                    c += C2180Ao.m9374b(2, (C2408Io) oo);
                }
                i++;
            }
        }
        byte[] bArr = this.f8120e;
        if (bArr != null) {
            c += C2180Ao.m9376b(3, bArr);
        }
        byte[] bArr2 = this.f8121f;
        if (bArr2 != null) {
            c += C2180Ao.m9376b(4, bArr2);
        }
        Integer num = this.f8122g;
        return num != null ? c + C2180Ao.m9380c(5, num.intValue()) : c;
    }
}
