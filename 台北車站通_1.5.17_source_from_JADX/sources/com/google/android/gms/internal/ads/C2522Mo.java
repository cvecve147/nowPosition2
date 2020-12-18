package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mo */
public final class C2522Mo extends C2237Co<C2522Mo> {

    /* renamed from: c */
    public Integer f7590c = null;

    /* renamed from: d */
    private Integer f7591d = null;

    /* renamed from: e */
    public String f7592e = null;

    /* renamed from: f */
    public String f7593f = null;

    /* renamed from: g */
    private String f7594g = null;

    /* renamed from: h */
    public C2552No f7595h = null;

    /* renamed from: i */
    public C2757Uo[] f7596i = C2757Uo.m11357d();

    /* renamed from: j */
    public String f7597j = null;

    /* renamed from: k */
    public C2730To f7598k = null;

    /* renamed from: l */
    private Boolean f7599l = null;

    /* renamed from: m */
    private String[] f7600m;

    /* renamed from: n */
    private String f7601n;

    /* renamed from: o */
    private Boolean f7602o;

    /* renamed from: p */
    private Boolean f7603p;

    /* renamed from: q */
    private byte[] f7604q;

    /* renamed from: r */
    public C2786Vo f7605r;

    /* renamed from: s */
    public String[] f7606s;

    /* renamed from: t */
    public String[] f7607t;

    public C2522Mo() {
        String[] strArr = C2494Lo.f7524f;
        this.f7600m = strArr;
        this.f7601n = null;
        this.f7602o = null;
        this.f7603p = null;
        this.f7604q = null;
        this.f7605r = null;
        this.f7606s = strArr;
        this.f7607t = strArr;
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2522Mo m10608b(com.google.android.gms.internal.ads.C3641yo r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo10243d()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x01c8;
                case 10: goto L_0x01c0;
                case 18: goto L_0x01b8;
                case 26: goto L_0x01b0;
                case 34: goto L_0x0172;
                case 40: goto L_0x0166;
                case 50: goto L_0x0134;
                case 58: goto L_0x012c;
                case 64: goto L_0x0120;
                case 72: goto L_0x0114;
                case 80: goto L_0x00dd;
                case 88: goto L_0x00af;
                case 98: goto L_0x009d;
                case 106: goto L_0x0095;
                case 114: goto L_0x0087;
                case 122: goto L_0x007f;
                case 138: goto L_0x0071;
                case 162: goto L_0x0040;
                case 170: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo7936a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 170(0xaa, float:2.38E-43)
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            java.lang.String[] r2 = r6.f7607t
            if (r2 != 0) goto L_0x001b
            r2 = r1
            goto L_0x001c
        L_0x001b:
            int r2 = r2.length
        L_0x001c:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0026
            java.lang.String[] r3 = r6.f7607t
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0026:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0037
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x0037:
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r6.f7607t = r0
            goto L_0x0000
        L_0x0040:
            r0 = 162(0xa2, float:2.27E-43)
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            java.lang.String[] r2 = r6.f7606s
            if (r2 != 0) goto L_0x004c
            r2 = r1
            goto L_0x004d
        L_0x004c:
            int r2 = r2.length
        L_0x004d:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0057
            java.lang.String[] r3 = r6.f7606s
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0057:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0068
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0068:
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r6.f7606s = r0
            goto L_0x0000
        L_0x0071:
            com.google.android.gms.internal.ads.Vo r0 = r6.f7605r
            if (r0 != 0) goto L_0x007c
            com.google.android.gms.internal.ads.Vo r0 = new com.google.android.gms.internal.ads.Vo
            r0.<init>()
            r6.f7605r = r0
        L_0x007c:
            com.google.android.gms.internal.ads.Vo r0 = r6.f7605r
            goto L_0x00aa
        L_0x007f:
            byte[] r0 = r7.mo10240b()
            r6.f7604q = r0
            goto L_0x0000
        L_0x0087:
            com.google.android.gms.internal.ads.To r0 = r6.f7598k
            if (r0 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.To r0 = new com.google.android.gms.internal.ads.To
            r0.<init>()
            r6.f7598k = r0
        L_0x0092:
            com.google.android.gms.internal.ads.To r0 = r6.f7598k
            goto L_0x00aa
        L_0x0095:
            java.lang.String r0 = r7.mo10242c()
            r6.f7597j = r0
            goto L_0x0000
        L_0x009d:
            com.google.android.gms.internal.ads.No r0 = r6.f7595h
            if (r0 != 0) goto L_0x00a8
            com.google.android.gms.internal.ads.No r0 = new com.google.android.gms.internal.ads.No
            r0.<init>()
            r6.f7595h = r0
        L_0x00a8:
            com.google.android.gms.internal.ads.No r0 = r6.f7595h
        L_0x00aa:
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r0)
            goto L_0x0000
        L_0x00af:
            int r1 = r7.mo10234a()
            int r2 = r7.mo10247f()     // Catch:{ IllegalArgumentException -> 0x010c }
            if (r2 < 0) goto L_0x00c4
            r3 = 4
            if (r2 > r3) goto L_0x00c4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            r6.f7591d = r2     // Catch:{ IllegalArgumentException -> 0x010c }
            goto L_0x0000
        L_0x00c4:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x010c }
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = " is not a valid enum Verdict"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x010c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            throw r3     // Catch:{ IllegalArgumentException -> 0x010c }
        L_0x00dd:
            int r1 = r7.mo10234a()
            int r2 = r7.mo10247f()     // Catch:{ IllegalArgumentException -> 0x010c }
            if (r2 < 0) goto L_0x00f3
            r3 = 9
            if (r2 > r3) goto L_0x00f3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            r6.f7590c = r2     // Catch:{ IllegalArgumentException -> 0x010c }
            goto L_0x0000
        L_0x00f3:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x010c }
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x010c }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = " is not a valid enum ReportType"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x010c }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x010c }
            throw r3     // Catch:{ IllegalArgumentException -> 0x010c }
        L_0x010c:
            r7.mo10246e(r1)
            r6.mo7936a(r7, r0)
            goto L_0x0000
        L_0x0114:
            boolean r0 = r7.mo10248g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f7603p = r0
            goto L_0x0000
        L_0x0120:
            boolean r0 = r7.mo10248g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f7602o = r0
            goto L_0x0000
        L_0x012c:
            java.lang.String r0 = r7.mo10242c()
            r6.f7601n = r0
            goto L_0x0000
        L_0x0134:
            r0 = 50
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            java.lang.String[] r2 = r6.f7600m
            if (r2 != 0) goto L_0x0140
            r2 = r1
            goto L_0x0141
        L_0x0140:
            int r2 = r2.length
        L_0x0141:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x014b
            java.lang.String[] r3 = r6.f7600m
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x014b:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x015c
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x014b
        L_0x015c:
            java.lang.String r1 = r7.mo10242c()
            r0[r2] = r1
            r6.f7600m = r0
            goto L_0x0000
        L_0x0166:
            boolean r0 = r7.mo10248g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f7599l = r0
            goto L_0x0000
        L_0x0172:
            r0 = 34
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            com.google.android.gms.internal.ads.Uo[] r2 = r6.f7596i
            if (r2 != 0) goto L_0x017e
            r2 = r1
            goto L_0x017f
        L_0x017e:
            int r2 = r2.length
        L_0x017f:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.Uo[] r0 = new com.google.android.gms.internal.ads.C2757Uo[r0]
            if (r2 == 0) goto L_0x0189
            com.google.android.gms.internal.ads.Uo[] r3 = r6.f7596i
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0189:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x01a0
            com.google.android.gms.internal.ads.Uo r1 = new com.google.android.gms.internal.ads.Uo
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x0189
        L_0x01a0:
            com.google.android.gms.internal.ads.Uo r1 = new com.google.android.gms.internal.ads.Uo
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r6.f7596i = r0
            goto L_0x0000
        L_0x01b0:
            java.lang.String r0 = r7.mo10242c()
            r6.f7594g = r0
            goto L_0x0000
        L_0x01b8:
            java.lang.String r0 = r7.mo10242c()
            r6.f7593f = r0
            goto L_0x0000
        L_0x01c0:
            java.lang.String r0 = r7.mo10242c()
            r6.f7592e = r0
            goto L_0x0000
        L_0x01c8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2522Mo.m10608b(com.google.android.gms.internal.ads.yo):com.google.android.gms.internal.ads.Mo");
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m10608b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        String str = this.f7592e;
        if (str != null) {
            ao.mo7834a(1, str);
        }
        String str2 = this.f7593f;
        if (str2 != null) {
            ao.mo7834a(2, str2);
        }
        String str3 = this.f7594g;
        if (str3 != null) {
            ao.mo7834a(3, str3);
        }
        C2757Uo[] uoArr = this.f7596i;
        int i = 0;
        if (uoArr != null && uoArr.length > 0) {
            int i2 = 0;
            while (true) {
                C2757Uo[] uoArr2 = this.f7596i;
                if (i2 >= uoArr2.length) {
                    break;
                }
                C2757Uo uo = uoArr2[i2];
                if (uo != null) {
                    ao.mo7833a(4, (C2408Io) uo);
                }
                i2++;
            }
        }
        Boolean bool = this.f7599l;
        if (bool != null) {
            ao.mo7835a(5, bool.booleanValue());
        }
        String[] strArr = this.f7600m;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f7600m;
                if (i3 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i3];
                if (str4 != null) {
                    ao.mo7834a(6, str4);
                }
                i3++;
            }
        }
        String str5 = this.f7601n;
        if (str5 != null) {
            ao.mo7834a(7, str5);
        }
        Boolean bool2 = this.f7602o;
        if (bool2 != null) {
            ao.mo7835a(8, bool2.booleanValue());
        }
        Boolean bool3 = this.f7603p;
        if (bool3 != null) {
            ao.mo7835a(9, bool3.booleanValue());
        }
        Integer num = this.f7590c;
        if (num != null) {
            ao.mo7837b(10, num.intValue());
        }
        Integer num2 = this.f7591d;
        if (num2 != null) {
            ao.mo7837b(11, num2.intValue());
        }
        C2552No no = this.f7595h;
        if (no != null) {
            ao.mo7833a(12, (C2408Io) no);
        }
        String str6 = this.f7597j;
        if (str6 != null) {
            ao.mo7834a(13, str6);
        }
        C2730To to = this.f7598k;
        if (to != null) {
            ao.mo7833a(14, (C2408Io) to);
        }
        byte[] bArr = this.f7604q;
        if (bArr != null) {
            ao.mo7836a(15, bArr);
        }
        C2786Vo vo = this.f7605r;
        if (vo != null) {
            ao.mo7833a(17, (C2408Io) vo);
        }
        String[] strArr3 = this.f7606s;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr4 = this.f7606s;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i4];
                if (str7 != null) {
                    ao.mo7834a(20, str7);
                }
                i4++;
            }
        }
        String[] strArr5 = this.f7607t;
        if (strArr5 != null && strArr5.length > 0) {
            while (true) {
                String[] strArr6 = this.f7607t;
                if (i >= strArr6.length) {
                    break;
                }
                String str8 = strArr6[i];
                if (str8 != null) {
                    ao.mo7834a(21, str8);
                }
                i++;
            }
        }
        super.mo7848a(ao);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo7849c() {
        int c = super.mo7849c();
        String str = this.f7592e;
        if (str != null) {
            c += C2180Ao.m9375b(1, str);
        }
        String str2 = this.f7593f;
        if (str2 != null) {
            c += C2180Ao.m9375b(2, str2);
        }
        String str3 = this.f7594g;
        if (str3 != null) {
            c += C2180Ao.m9375b(3, str3);
        }
        C2757Uo[] uoArr = this.f7596i;
        int i = 0;
        if (uoArr != null && uoArr.length > 0) {
            int i2 = c;
            int i3 = 0;
            while (true) {
                C2757Uo[] uoArr2 = this.f7596i;
                if (i3 >= uoArr2.length) {
                    break;
                }
                C2757Uo uo = uoArr2[i3];
                if (uo != null) {
                    i2 += C2180Ao.m9374b(4, (C2408Io) uo);
                }
                i3++;
            }
            c = i2;
        }
        Boolean bool = this.f7599l;
        if (bool != null) {
            bool.booleanValue();
            c += C2180Ao.m9365a(5) + 1;
        }
        String[] strArr = this.f7600m;
        if (strArr != null && strArr.length > 0) {
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr2 = this.f7600m;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str4 = strArr2[i4];
                if (str4 != null) {
                    i6++;
                    i5 += C2180Ao.m9368a(str4);
                }
                i4++;
            }
            c = c + i5 + (i6 * 1);
        }
        String str5 = this.f7601n;
        if (str5 != null) {
            c += C2180Ao.m9375b(7, str5);
        }
        Boolean bool2 = this.f7602o;
        if (bool2 != null) {
            bool2.booleanValue();
            c += C2180Ao.m9365a(8) + 1;
        }
        Boolean bool3 = this.f7603p;
        if (bool3 != null) {
            bool3.booleanValue();
            c += C2180Ao.m9365a(9) + 1;
        }
        Integer num = this.f7590c;
        if (num != null) {
            c += C2180Ao.m9380c(10, num.intValue());
        }
        Integer num2 = this.f7591d;
        if (num2 != null) {
            c += C2180Ao.m9380c(11, num2.intValue());
        }
        C2552No no = this.f7595h;
        if (no != null) {
            c += C2180Ao.m9374b(12, (C2408Io) no);
        }
        String str6 = this.f7597j;
        if (str6 != null) {
            c += C2180Ao.m9375b(13, str6);
        }
        C2730To to = this.f7598k;
        if (to != null) {
            c += C2180Ao.m9374b(14, (C2408Io) to);
        }
        byte[] bArr = this.f7604q;
        if (bArr != null) {
            c += C2180Ao.m9376b(15, bArr);
        }
        C2786Vo vo = this.f7605r;
        if (vo != null) {
            c += C2180Ao.m9374b(17, (C2408Io) vo);
        }
        String[] strArr3 = this.f7606s;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                String[] strArr4 = this.f7606s;
                if (i7 >= strArr4.length) {
                    break;
                }
                String str7 = strArr4[i7];
                if (str7 != null) {
                    i9++;
                    i8 += C2180Ao.m9368a(str7);
                }
                i7++;
            }
            c = c + i8 + (i9 * 2);
        }
        String[] strArr5 = this.f7607t;
        if (strArr5 == null || strArr5.length <= 0) {
            return c;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr6 = this.f7607t;
            if (i >= strArr6.length) {
                return c + i10 + (i11 * 2);
            }
            String str8 = strArr6[i];
            if (str8 != null) {
                i11++;
                i10 += C2180Ao.m9368a(str8);
            }
            i++;
        }
    }
}
