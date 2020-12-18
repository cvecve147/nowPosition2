package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bs */
public final class C2212Bs extends C2237Co<C2212Bs> {

    /* renamed from: c */
    private Integer f6755c = null;

    /* renamed from: d */
    public String f6756d = null;

    /* renamed from: e */
    private Integer f6757e = null;

    /* renamed from: f */
    private Integer f6758f = null;

    /* renamed from: g */
    private C2526Ms f6759g = null;

    /* renamed from: h */
    public long[] f6760h = C2494Lo.f7520b;

    /* renamed from: i */
    public C3674zs f6761i = null;

    /* renamed from: j */
    private C2184As f6762j = null;

    /* renamed from: k */
    private C2326Fs f6763k = null;

    /* renamed from: l */
    public C3533us f6764l = null;

    public C2212Bs() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* renamed from: b */
    private final C2212Bs m9461b(C3641yo yoVar) {
        C2408Io io;
        while (true) {
            int d = yoVar.mo10243d();
            switch (d) {
                case 0:
                    return this;
                case 72:
                    this.f6755c = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 82:
                    this.f6756d = yoVar.mo10242c();
                    continue;
                case 88:
                    this.f6757e = Integer.valueOf(yoVar.mo10249h());
                    continue;
                case 96:
                    int a = yoVar.mo10234a();
                    try {
                        int h = yoVar.mo10249h();
                        C3503ts.m13941a(h);
                        this.f6758f = Integer.valueOf(h);
                        continue;
                    } catch (IllegalArgumentException unused) {
                        yoVar.mo10246e(a);
                        mo7936a(yoVar, d);
                        break;
                    }
                case 106:
                    if (this.f6759g == null) {
                        this.f6759g = new C2526Ms();
                    }
                    io = this.f6759g;
                    break;
                case 112:
                    int a2 = C2494Lo.m10548a(yoVar, 112);
                    long[] jArr = this.f6760h;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f6760h, 0, jArr2, 0, length);
                    }
                    while (length < jArr2.length - 1) {
                        jArr2[length] = yoVar.mo10250i();
                        yoVar.mo10243d();
                        length++;
                    }
                    jArr2[length] = yoVar.mo10250i();
                    this.f6760h = jArr2;
                    continue;
                case 114:
                    int c = yoVar.mo10241c(yoVar.mo10249h());
                    int a3 = yoVar.mo10234a();
                    int i = 0;
                    while (yoVar.mo10251j() > 0) {
                        yoVar.mo10250i();
                        i++;
                    }
                    yoVar.mo10246e(a3);
                    long[] jArr3 = this.f6760h;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f6760h, 0, jArr4, 0, length2);
                    }
                    while (length2 < jArr4.length) {
                        jArr4[length2] = yoVar.mo10250i();
                        length2++;
                    }
                    this.f6760h = jArr4;
                    yoVar.mo10244d(c);
                    continue;
                case 122:
                    if (this.f6761i == null) {
                        this.f6761i = new C3674zs();
                    }
                    io = this.f6761i;
                    break;
                case 130:
                    if (this.f6762j == null) {
                        this.f6762j = new C2184As();
                    }
                    io = this.f6762j;
                    break;
                case 138:
                    if (this.f6763k == null) {
                        this.f6763k = new C2326Fs();
                    }
                    io = this.f6763k;
                    break;
                case 146:
                    if (this.f6764l == null) {
                        this.f6764l = new C3533us();
                    }
                    io = this.f6764l;
                    break;
                default:
                    if (!super.mo7936a(yoVar, d)) {
                        return this;
                    }
                    continue;
            }
            yoVar.mo10236a(io);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m9461b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f6755c;
        if (num != null) {
            ao.mo7837b(9, num.intValue());
        }
        String str = this.f6756d;
        if (str != null) {
            ao.mo7834a(10, str);
        }
        Integer num2 = this.f6757e;
        int i = 0;
        if (num2 != null) {
            int intValue = num2.intValue();
            ao.mo7831a(11, 0);
            ao.mo7839d(intValue);
        }
        Integer num3 = this.f6758f;
        if (num3 != null) {
            ao.mo7837b(12, num3.intValue());
        }
        C2526Ms ms = this.f6759g;
        if (ms != null) {
            ao.mo7833a(13, (C2408Io) ms);
        }
        long[] jArr = this.f6760h;
        if (jArr != null && jArr.length > 0) {
            while (true) {
                long[] jArr2 = this.f6760h;
                if (i >= jArr2.length) {
                    break;
                }
                ao.mo7832a(14, jArr2[i]);
                i++;
            }
        }
        C3674zs zsVar = this.f6761i;
        if (zsVar != null) {
            ao.mo7833a(15, (C2408Io) zsVar);
        }
        C2184As as = this.f6762j;
        if (as != null) {
            ao.mo7833a(16, (C2408Io) as);
        }
        C2326Fs fs = this.f6763k;
        if (fs != null) {
            ao.mo7833a(17, (C2408Io) fs);
        }
        C3533us usVar = this.f6764l;
        if (usVar != null) {
            ao.mo7833a(18, (C2408Io) usVar);
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        long[] jArr;
        int c = super.mo7849c();
        Integer num = this.f6755c;
        if (num != null) {
            c += C2180Ao.m9380c(9, num.intValue());
        }
        String str = this.f6756d;
        if (str != null) {
            c += C2180Ao.m9375b(10, str);
        }
        Integer num2 = this.f6757e;
        if (num2 != null) {
            c += C2180Ao.m9365a(11) + C2180Ao.m9379c(num2.intValue());
        }
        Integer num3 = this.f6758f;
        if (num3 != null) {
            c += C2180Ao.m9380c(12, num3.intValue());
        }
        C2526Ms ms = this.f6759g;
        if (ms != null) {
            c += C2180Ao.m9374b(13, (C2408Io) ms);
        }
        long[] jArr2 = this.f6760h;
        if (jArr2 != null && jArr2.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                jArr = this.f6760h;
                if (i >= jArr.length) {
                    break;
                }
                i2 += C2180Ao.m9366a(jArr[i]);
                i++;
            }
            c = c + i2 + (jArr.length * 1);
        }
        C3674zs zsVar = this.f6761i;
        if (zsVar != null) {
            c += C2180Ao.m9374b(15, (C2408Io) zsVar);
        }
        C2184As as = this.f6762j;
        if (as != null) {
            c += C2180Ao.m9374b(16, (C2408Io) as);
        }
        C2326Fs fs = this.f6763k;
        if (fs != null) {
            c += C2180Ao.m9374b(17, (C2408Io) fs);
        }
        C3533us usVar = this.f6764l;
        return usVar != null ? c + C2180Ao.m9374b(18, (C2408Io) usVar) : c;
    }
}
