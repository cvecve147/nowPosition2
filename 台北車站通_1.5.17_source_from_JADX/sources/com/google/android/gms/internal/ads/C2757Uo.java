package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Uo */
public final class C2757Uo extends C2237Co<C2757Uo> {

    /* renamed from: c */
    private static volatile C2757Uo[] f8391c;

    /* renamed from: d */
    public Integer f8392d = null;

    /* renamed from: e */
    public String f8393e = null;

    /* renamed from: f */
    public C2615Po f8394f = null;

    /* renamed from: g */
    private C2673Ro f8395g = null;

    /* renamed from: h */
    private Integer f8396h = null;

    /* renamed from: i */
    private int[] f8397i = C2494Lo.f7519a;

    /* renamed from: j */
    private String f8398j = null;

    /* renamed from: k */
    public Integer f8399k = null;

    /* renamed from: l */
    public String[] f8400l = C2494Lo.f7524f;

    public C2757Uo() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2757Uo m11356b(C3641yo yoVar) {
        C2408Io io;
        int f;
        while (true) {
            int d = yoVar.mo10243d();
            switch (d) {
                case 0:
                    return this;
                case 8:
                    this.f8392d = Integer.valueOf(yoVar.mo10247f());
                    continue;
                case 18:
                    this.f8393e = yoVar.mo10242c();
                    continue;
                case 26:
                    if (this.f8394f == null) {
                        this.f8394f = new C2615Po();
                    }
                    io = this.f8394f;
                    break;
                case 34:
                    if (this.f8395g == null) {
                        this.f8395g = new C2673Ro();
                    }
                    io = this.f8395g;
                    break;
                case 40:
                    this.f8396h = Integer.valueOf(yoVar.mo10247f());
                    continue;
                case 48:
                    int a = C2494Lo.m10548a(yoVar, 48);
                    int[] iArr = this.f8397i;
                    int length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(a + length)];
                    if (length != 0) {
                        System.arraycopy(this.f8397i, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = yoVar.mo10247f();
                        yoVar.mo10243d();
                        length++;
                    }
                    iArr2[length] = yoVar.mo10247f();
                    this.f8397i = iArr2;
                    continue;
                case 50:
                    int c = yoVar.mo10241c(yoVar.mo10249h());
                    int a2 = yoVar.mo10234a();
                    int i = 0;
                    while (yoVar.mo10251j() > 0) {
                        yoVar.mo10247f();
                        i++;
                    }
                    yoVar.mo10246e(a2);
                    int[] iArr3 = this.f8397i;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f8397i, 0, iArr4, 0, length2);
                    }
                    while (length2 < iArr4.length) {
                        iArr4[length2] = yoVar.mo10247f();
                        length2++;
                    }
                    this.f8397i = iArr4;
                    yoVar.mo10244d(c);
                    continue;
                case 58:
                    this.f8398j = yoVar.mo10242c();
                    continue;
                case 64:
                    try {
                        f = yoVar.mo10247f();
                        if (f < 0 || f > 3) {
                            StringBuilder sb = new StringBuilder(46);
                            sb.append(f);
                            sb.append(" is not a valid enum AdResourceType");
                            break;
                        } else {
                            this.f8399k = Integer.valueOf(f);
                            continue;
                        }
                    } catch (IllegalArgumentException unused) {
                        yoVar.mo10246e(yoVar.mo10234a());
                        mo7936a(yoVar, d);
                        break;
                    }
                case 74:
                    int a3 = C2494Lo.m10548a(yoVar, 74);
                    String[] strArr = this.f8400l;
                    int length3 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(a3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f8400l, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = yoVar.mo10242c();
                        yoVar.mo10243d();
                        length3++;
                    }
                    strArr2[length3] = yoVar.mo10242c();
                    this.f8400l = strArr2;
                    continue;
                default:
                    if (!super.mo7936a(yoVar, d)) {
                        return this;
                    }
                    continue;
            }
            yoVar.mo10236a(io);
        }
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append(f);
        sb2.append(" is not a valid enum AdResourceType");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: d */
    public static C2757Uo[] m11357d() {
        if (f8391c == null) {
            synchronized (C2352Go.f7089c) {
                if (f8391c == null) {
                    f8391c = new C2757Uo[0];
                }
            }
        }
        return f8391c;
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m11356b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        ao.mo7837b(1, this.f8392d.intValue());
        String str = this.f8393e;
        if (str != null) {
            ao.mo7834a(2, str);
        }
        C2615Po po = this.f8394f;
        if (po != null) {
            ao.mo7833a(3, (C2408Io) po);
        }
        C2673Ro ro = this.f8395g;
        if (ro != null) {
            ao.mo7833a(4, (C2408Io) ro);
        }
        Integer num = this.f8396h;
        if (num != null) {
            ao.mo7837b(5, num.intValue());
        }
        int[] iArr = this.f8397i;
        int i = 0;
        if (iArr != null && iArr.length > 0) {
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f8397i;
                if (i2 >= iArr2.length) {
                    break;
                }
                ao.mo7837b(6, iArr2[i2]);
                i2++;
            }
        }
        String str2 = this.f8398j;
        if (str2 != null) {
            ao.mo7834a(7, str2);
        }
        Integer num2 = this.f8399k;
        if (num2 != null) {
            ao.mo7837b(8, num2.intValue());
        }
        String[] strArr = this.f8400l;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f8400l;
                if (i >= strArr2.length) {
                    break;
                }
                String str3 = strArr2[i];
                if (str3 != null) {
                    ao.mo7834a(9, str3);
                }
                i++;
            }
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int[] iArr;
        int c = super.mo7849c() + C2180Ao.m9380c(1, this.f8392d.intValue());
        String str = this.f8393e;
        if (str != null) {
            c += C2180Ao.m9375b(2, str);
        }
        C2615Po po = this.f8394f;
        if (po != null) {
            c += C2180Ao.m9374b(3, (C2408Io) po);
        }
        C2673Ro ro = this.f8395g;
        if (ro != null) {
            c += C2180Ao.m9374b(4, (C2408Io) ro);
        }
        Integer num = this.f8396h;
        if (num != null) {
            c += C2180Ao.m9380c(5, num.intValue());
        }
        int[] iArr2 = this.f8397i;
        int i = 0;
        if (iArr2 != null && iArr2.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                iArr = this.f8397i;
                if (i2 >= iArr.length) {
                    break;
                }
                i3 += C2180Ao.m9372b(iArr[i2]);
                i2++;
            }
            c = c + i3 + (iArr.length * 1);
        }
        String str2 = this.f8398j;
        if (str2 != null) {
            c += C2180Ao.m9375b(7, str2);
        }
        Integer num2 = this.f8399k;
        if (num2 != null) {
            c += C2180Ao.m9380c(8, num2.intValue());
        }
        String[] strArr = this.f8400l;
        if (strArr == null || strArr.length <= 0) {
            return c;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f8400l;
            if (i >= strArr2.length) {
                return c + i4 + (i5 * 1);
            }
            String str3 = strArr2[i];
            if (str3 != null) {
                i5++;
                i4 += C2180Ao.m9368a(str3);
            }
            i++;
        }
    }
}
