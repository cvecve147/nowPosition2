package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yn */
public final class C3640yn extends C2237Co<C3640yn> {

    /* renamed from: c */
    private Long f10570c = null;

    /* renamed from: d */
    private Integer f10571d = null;

    /* renamed from: e */
    private Boolean f10572e = null;

    /* renamed from: f */
    private int[] f10573f = C2494Lo.f7519a;

    /* renamed from: g */
    private Long f10574g = null;

    public C3640yn() {
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
                this.f10570c = Long.valueOf(yoVar.mo10250i());
            } else if (d == 16) {
                this.f10571d = Integer.valueOf(yoVar.mo10249h());
            } else if (d == 24) {
                this.f10572e = Boolean.valueOf(yoVar.mo10248g());
            } else if (d == 32) {
                int a = C2494Lo.m10548a(yoVar, 32);
                int[] iArr = this.f10573f;
                int length = iArr == null ? 0 : iArr.length;
                int[] iArr2 = new int[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f10573f, 0, iArr2, 0, length);
                }
                while (length < iArr2.length - 1) {
                    iArr2[length] = yoVar.mo10249h();
                    yoVar.mo10243d();
                    length++;
                }
                iArr2[length] = yoVar.mo10249h();
                this.f10573f = iArr2;
            } else if (d == 34) {
                int c = yoVar.mo10241c(yoVar.mo10249h());
                int a2 = yoVar.mo10234a();
                int i = 0;
                while (yoVar.mo10251j() > 0) {
                    yoVar.mo10249h();
                    i++;
                }
                yoVar.mo10246e(a2);
                int[] iArr3 = this.f10573f;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int[] iArr4 = new int[(i + length2)];
                if (length2 != 0) {
                    System.arraycopy(this.f10573f, 0, iArr4, 0, length2);
                }
                while (length2 < iArr4.length) {
                    iArr4[length2] = yoVar.mo10249h();
                    length2++;
                }
                this.f10573f = iArr4;
                yoVar.mo10244d(c);
            } else if (d == 40) {
                this.f10574g = Long.valueOf(yoVar.mo10250i());
            } else if (!super.mo7936a(yoVar, d)) {
                return this;
            }
        }
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Long l = this.f10570c;
        if (l != null) {
            ao.mo7840d(1, l.longValue());
        }
        Integer num = this.f10571d;
        if (num != null) {
            ao.mo7837b(2, num.intValue());
        }
        Boolean bool = this.f10572e;
        if (bool != null) {
            ao.mo7835a(3, bool.booleanValue());
        }
        int[] iArr = this.f10573f;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f10573f;
                if (i >= iArr2.length) {
                    break;
                }
                ao.mo7837b(4, iArr2[i]);
                i++;
            }
        }
        Long l2 = this.f10574g;
        if (l2 != null) {
            ao.mo7832a(5, l2.longValue());
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int[] iArr;
        int c = super.mo7849c();
        Long l = this.f10570c;
        if (l != null) {
            c += C2180Ao.m9373b(1, l.longValue());
        }
        Integer num = this.f10571d;
        if (num != null) {
            c += C2180Ao.m9380c(2, num.intValue());
        }
        Boolean bool = this.f10572e;
        if (bool != null) {
            bool.booleanValue();
            c += C2180Ao.m9365a(3) + 1;
        }
        int[] iArr2 = this.f10573f;
        if (iArr2 != null && iArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                iArr = this.f10573f;
                if (i >= iArr.length) {
                    break;
                }
                i2 += C2180Ao.m9372b(iArr[i]);
                i++;
            }
            c = c + i2 + (iArr.length * 1);
        }
        Long l2 = this.f10574g;
        return l2 != null ? c + C2180Ao.m9381c(5, l2.longValue()) : c;
    }
}
