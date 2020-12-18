package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ro */
public final class C2673Ro extends C2237Co<C2673Ro> {

    /* renamed from: c */
    private C2700So f8209c = null;

    /* renamed from: d */
    private C2584Oo[] f8210d = C2584Oo.m10840d();

    /* renamed from: e */
    private byte[] f8211e = null;

    /* renamed from: f */
    private byte[] f8212f = null;

    /* renamed from: g */
    private Integer f8213g = null;

    /* renamed from: h */
    private byte[] f8214h = null;

    public C2673Ro() {
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
                if (this.f8209c == null) {
                    this.f8209c = new C2700So();
                }
                yoVar.mo10236a((C2408Io) this.f8209c);
            } else if (d == 18) {
                int a = C2494Lo.m10548a(yoVar, 18);
                C2584Oo[] ooArr = this.f8210d;
                int length = ooArr == null ? 0 : ooArr.length;
                C2584Oo[] ooArr2 = new C2584Oo[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f8210d, 0, ooArr2, 0, length);
                }
                while (length < ooArr2.length - 1) {
                    ooArr2[length] = new C2584Oo();
                    yoVar.mo10236a((C2408Io) ooArr2[length]);
                    yoVar.mo10243d();
                    length++;
                }
                ooArr2[length] = new C2584Oo();
                yoVar.mo10236a((C2408Io) ooArr2[length]);
                this.f8210d = ooArr2;
            } else if (d == 26) {
                this.f8211e = yoVar.mo10240b();
            } else if (d == 34) {
                this.f8212f = yoVar.mo10240b();
            } else if (d == 40) {
                this.f8213g = Integer.valueOf(yoVar.mo10247f());
            } else if (d == 50) {
                this.f8214h = yoVar.mo10240b();
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        C2700So so = this.f8209c;
        if (so != null) {
            ao.mo7833a(1, (C2408Io) so);
        }
        C2584Oo[] ooArr = this.f8210d;
        if (ooArr != null && ooArr.length > 0) {
            int i = 0;
            while (true) {
                C2584Oo[] ooArr2 = this.f8210d;
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
        byte[] bArr = this.f8211e;
        if (bArr != null) {
            ao.mo7836a(3, bArr);
        }
        byte[] bArr2 = this.f8212f;
        if (bArr2 != null) {
            ao.mo7836a(4, bArr2);
        }
        Integer num = this.f8213g;
        if (num != null) {
            ao.mo7837b(5, num.intValue());
        }
        byte[] bArr3 = this.f8214h;
        if (bArr3 != null) {
            ao.mo7836a(6, bArr3);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        C2700So so = this.f8209c;
        if (so != null) {
            c += C2180Ao.m9374b(1, (C2408Io) so);
        }
        C2584Oo[] ooArr = this.f8210d;
        if (ooArr != null && ooArr.length > 0) {
            int i = 0;
            while (true) {
                C2584Oo[] ooArr2 = this.f8210d;
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
        byte[] bArr = this.f8211e;
        if (bArr != null) {
            c += C2180Ao.m9376b(3, bArr);
        }
        byte[] bArr2 = this.f8212f;
        if (bArr2 != null) {
            c += C2180Ao.m9376b(4, bArr2);
        }
        Integer num = this.f8213g;
        if (num != null) {
            c += C2180Ao.m9380c(5, num.intValue());
        }
        byte[] bArr3 = this.f8214h;
        return bArr3 != null ? c + C2180Ao.m9376b(6, bArr3) : c;
    }
}
