package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ds */
public final class C2269Ds extends C2237Co<C2269Ds> {

    /* renamed from: c */
    private Integer f6914c = null;

    /* renamed from: d */
    private int[] f6915d = C2494Lo.f7519a;

    public C2269Ds() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2269Ds m9648b(C3641yo yoVar) {
        while (true) {
            int d = yoVar.mo10243d();
            if (d == 0) {
                return this;
            }
            if (d == 8) {
                int a = yoVar.mo10234a();
                try {
                    int h = yoVar.mo10249h();
                    C3503ts.m13941a(h);
                    this.f6914c = Integer.valueOf(h);
                } catch (IllegalArgumentException unused) {
                    yoVar.mo10246e(a);
                    mo7936a(yoVar, d);
                }
            } else if (d == 16) {
                int a2 = C2494Lo.m10548a(yoVar, 16);
                int[] iArr = this.f6915d;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a2 + length)];
                if (length != 0) {
                    System.arraycopy(this.f6915d, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yoVar.mo10249h();
                    yoVar.mo10243d();
                    length++;
                }
                iArr2[length] = yoVar.mo10249h();
                this.f6915d = iArr2;
            } else if (d == 18) {
                int c = yoVar.mo10241c(yoVar.mo10249h());
                int a3 = yoVar.mo10234a();
                int i = 0;
                while (yoVar.mo10251j() > 0) {
                    yoVar.mo10249h();
                    i++;
                }
                yoVar.mo10246e(a3);
                int[] iArr3 = this.f6915d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f6915d, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yoVar.mo10249h();
                    length2++;
                }
                this.f6915d = iArr4;
                yoVar.mo10244d(c);
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9648b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f6914c;
        if (num != null) {
            ao.mo7837b(1, num.intValue());
        }
        int[] iArr = this.f6915d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f6915d;
                if (i >= iArr2.length) {
                    break;
                }
                ao.mo7837b(2, iArr2[i]);
                i++;
            }
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        Integer num = this.f6914c;
        if (num != null) {
            c += C2180Ao.m9380c(1, num.intValue());
        }
        int[] iArr = this.f6915d;
        if (iArr == null || iArr.length <= 0) {
            return c;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f6915d;
            if (i >= iArr2.length) {
                return c + i2 + (iArr2.length * 1);
            }
            i2 += C2180Ao.m9372b(iArr2[i]);
            i++;
        }
    }
}
