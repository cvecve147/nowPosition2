package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cs */
public final class C2241Cs extends C2237Co<C2241Cs> {

    /* renamed from: c */
    private String f6831c = null;

    /* renamed from: d */
    private Integer f6832d = null;

    /* renamed from: e */
    private int[] f6833e = C2494Lo.f7519a;

    /* renamed from: f */
    private C2498Ls f6834f = null;

    public C2241Cs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2241Cs m9569b(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 10) {
                this.f6831c = yoVar.mo10242c();
            } else if (d == 16) {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f6832d = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 24) {
                int a2 = C2494Lo.m10548a(yoVar, 24);
                int[] iArr = this.f6833e;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f6833e, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yoVar.mo10249h();
                    yoVar.mo10243d();
                    length++;
                }
                iArr2[length] = yoVar.mo10249h();
                this.f6833e = iArr2;
            } else if (d == 26) {
                int c = yoVar.mo10241c(yoVar.mo10249h());
                int a3 = yoVar.mo10234a();
                int i = 0;
                while (yoVar.mo10251j() > 0) {
                    yoVar.mo10249h();
                    i++;
                }
                yoVar.mo10246e(a3);
                int[] iArr3 = this.f6833e;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f6833e, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yoVar.mo10249h();
                    length2++;
                }
                this.f6833e = iArr4;
                yoVar.mo10244d(c);
            } else if (d == 34) {
                if (this.f6834f == null) {
                    this.f6834f = new C2498Ls();
                }
                yoVar.mo10236a((C2408Io) this.f6834f);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9569b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f6831c;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        Integer num = this.f6832d;
        if (num != null) {
            ao.mo7837b(2, num.intValue());
        }
        int[] iArr = this.f6833e;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f6833e;
                if (i >= iArr2.length) {
                    break;
                }
                ao.mo7837b(3, iArr2[i]);
                i++;
            }
        }
        C2498Ls ls = this.f6834f;
        if (ls != null) {
            ao.mo7833a(4, (C2408Io) ls);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int[] iArr;
        int c = super.mo7849c();
        String str = this.f6831c;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        Integer num = this.f6832d;
        if (num != null) {
            c += C2180Ao.m9380c(2, num.intValue());
        }
        int[] iArr2 = this.f6833e;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = this.f6833e;
                if (i >= iArr.length) {
                    break;
                }
                i2 += C2180Ao.m9372b(iArr[i]);
                i++;
            }
            c = c + i2 + (iArr.length * 1);
        }
        C2498Ls ls = this.f6834f;
        return ls != null ? c + C2180Ao.m9374b(4, (C2408Io) ls) : c;
    }
}
