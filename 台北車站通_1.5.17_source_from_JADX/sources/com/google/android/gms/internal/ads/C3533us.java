package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.us */
public final class C3533us extends C2237Co<C3533us> {

    /* renamed from: c */
    public Integer f10314c = null;

    /* renamed from: d */
    private Integer f10315d = null;

    /* renamed from: e */
    private C3589ws f10316e = null;

    /* renamed from: f */
    public C3617xs f10317f = null;

    /* renamed from: g */
    private C3561vs[] f10318g = C3561vs.m14295d();

    /* renamed from: h */
    private C3645ys f10319h = null;

    /* renamed from: i */
    private C2384Hs f10320i = null;

    /* renamed from: j */
    private C2356Gs f10321j = null;

    /* renamed from: k */
    private C2269Ds f10322k = null;

    /* renamed from: l */
    private C2298Es f10323l = null;

    /* renamed from: m */
    private C2556Ns[] f10324m = C2556Ns.m10767d();

    public C3533us() {
        this.f6812b = null;
        this.f7295a = -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C3533us m14180b(com.google.android.gms.internal.ads.C3641yo r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo10243d()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x013d;
                case 56: goto L_0x0106;
                case 64: goto L_0x00f3;
                case 74: goto L_0x00e1;
                case 82: goto L_0x00d3;
                case 90: goto L_0x0095;
                case 98: goto L_0x0087;
                case 106: goto L_0x0079;
                case 114: goto L_0x006a;
                case 122: goto L_0x005b;
                case 130: goto L_0x004c;
                case 138: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo7936a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 138(0x8a, float:1.93E-43)
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            com.google.android.gms.internal.ads.Ns[] r2 = r6.f10324m
            if (r2 != 0) goto L_0x001b
            r2 = r1
            goto L_0x001c
        L_0x001b:
            int r2 = r2.length
        L_0x001c:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.Ns[] r0 = new com.google.android.gms.internal.ads.C2556Ns[r0]
            if (r2 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.Ns[] r3 = r6.f10324m
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0026:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x003d
            com.google.android.gms.internal.ads.Ns r1 = new com.google.android.gms.internal.ads.Ns
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003d:
            com.google.android.gms.internal.ads.Ns r1 = new com.google.android.gms.internal.ads.Ns
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r6.f10324m = r0
            goto L_0x0000
        L_0x004c:
            com.google.android.gms.internal.ads.Es r0 = r6.f10323l
            if (r0 != 0) goto L_0x0057
            com.google.android.gms.internal.ads.Es r0 = new com.google.android.gms.internal.ads.Es
            r0.<init>()
            r6.f10323l = r0
        L_0x0057:
            com.google.android.gms.internal.ads.Es r0 = r6.f10323l
            goto L_0x00ee
        L_0x005b:
            com.google.android.gms.internal.ads.Ds r0 = r6.f10322k
            if (r0 != 0) goto L_0x0066
            com.google.android.gms.internal.ads.Ds r0 = new com.google.android.gms.internal.ads.Ds
            r0.<init>()
            r6.f10322k = r0
        L_0x0066:
            com.google.android.gms.internal.ads.Ds r0 = r6.f10322k
            goto L_0x00ee
        L_0x006a:
            com.google.android.gms.internal.ads.Gs r0 = r6.f10321j
            if (r0 != 0) goto L_0x0075
            com.google.android.gms.internal.ads.Gs r0 = new com.google.android.gms.internal.ads.Gs
            r0.<init>()
            r6.f10321j = r0
        L_0x0075:
            com.google.android.gms.internal.ads.Gs r0 = r6.f10321j
            goto L_0x00ee
        L_0x0079:
            com.google.android.gms.internal.ads.Hs r0 = r6.f10320i
            if (r0 != 0) goto L_0x0084
            com.google.android.gms.internal.ads.Hs r0 = new com.google.android.gms.internal.ads.Hs
            r0.<init>()
            r6.f10320i = r0
        L_0x0084:
            com.google.android.gms.internal.ads.Hs r0 = r6.f10320i
            goto L_0x00ee
        L_0x0087:
            com.google.android.gms.internal.ads.ys r0 = r6.f10319h
            if (r0 != 0) goto L_0x0092
            com.google.android.gms.internal.ads.ys r0 = new com.google.android.gms.internal.ads.ys
            r0.<init>()
            r6.f10319h = r0
        L_0x0092:
            com.google.android.gms.internal.ads.ys r0 = r6.f10319h
            goto L_0x00ee
        L_0x0095:
            r0 = 90
            int r0 = com.google.android.gms.internal.ads.C2494Lo.m10548a(r7, r0)
            com.google.android.gms.internal.ads.vs[] r2 = r6.f10318g
            if (r2 != 0) goto L_0x00a1
            r2 = r1
            goto L_0x00a2
        L_0x00a1:
            int r2 = r2.length
        L_0x00a2:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.vs[] r0 = new com.google.android.gms.internal.ads.C3561vs[r0]
            if (r2 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.vs[] r3 = r6.f10318g
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x00ac:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x00c3
            com.google.android.gms.internal.ads.vs r1 = new com.google.android.gms.internal.ads.vs
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r7.mo10243d()
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00c3:
            com.google.android.gms.internal.ads.vs r1 = new com.google.android.gms.internal.ads.vs
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r1)
            r6.f10318g = r0
            goto L_0x0000
        L_0x00d3:
            com.google.android.gms.internal.ads.xs r0 = r6.f10317f
            if (r0 != 0) goto L_0x00de
            com.google.android.gms.internal.ads.xs r0 = new com.google.android.gms.internal.ads.xs
            r0.<init>()
            r6.f10317f = r0
        L_0x00de:
            com.google.android.gms.internal.ads.xs r0 = r6.f10317f
            goto L_0x00ee
        L_0x00e1:
            com.google.android.gms.internal.ads.ws r0 = r6.f10316e
            if (r0 != 0) goto L_0x00ec
            com.google.android.gms.internal.ads.ws r0 = new com.google.android.gms.internal.ads.ws
            r0.<init>()
            r6.f10316e = r0
        L_0x00ec:
            com.google.android.gms.internal.ads.ws r0 = r6.f10316e
        L_0x00ee:
            r7.mo10236a((com.google.android.gms.internal.ads.C2408Io) r0)
            goto L_0x0000
        L_0x00f3:
            int r1 = r7.mo10234a()
            int r2 = r7.mo10249h()     // Catch:{ IllegalArgumentException -> 0x0135 }
            com.google.android.gms.internal.ads.C3503ts.m13941a(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            r6.f10315d = r2     // Catch:{ IllegalArgumentException -> 0x0135 }
            goto L_0x0000
        L_0x0106:
            int r1 = r7.mo10234a()
            int r2 = r7.mo10249h()     // Catch:{ IllegalArgumentException -> 0x0135 }
            if (r2 < 0) goto L_0x011c
            r3 = 9
            if (r2 > r3) goto L_0x011c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            r6.f10314c = r2     // Catch:{ IllegalArgumentException -> 0x0135 }
            goto L_0x0000
        L_0x011c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0135 }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0135 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0135 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            java.lang.String r2 = " is not a valid enum AdInitiater"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0135 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0135 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0135 }
        L_0x0135:
            r7.mo10246e(r1)
            r6.mo7936a(r7, r0)
            goto L_0x0000
        L_0x013d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3533us.m14180b(com.google.android.gms.internal.ads.yo):com.google.android.gms.internal.ads.us");
    }

    /* renamed from: a */
    public final /* synthetic */ C2408Io mo7847a(C3641yo yoVar) {
        m14180b(yoVar);
        return this;
    }

    /* renamed from: a */
    public final void mo7848a(C2180Ao ao) {
        Integer num = this.f10314c;
        if (num != null) {
            ao.mo7837b(7, num.intValue());
        }
        Integer num2 = this.f10315d;
        if (num2 != null) {
            ao.mo7837b(8, num2.intValue());
        }
        C3589ws wsVar = this.f10316e;
        if (wsVar != null) {
            ao.mo7833a(9, (C2408Io) wsVar);
        }
        C3617xs xsVar = this.f10317f;
        if (xsVar != null) {
            ao.mo7833a(10, (C2408Io) xsVar);
        }
        C3561vs[] vsVarArr = this.f10318g;
        int i = 0;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10318g;
                if (i2 >= vsVarArr2.length) {
                    break;
                }
                C3561vs vsVar = vsVarArr2[i2];
                if (vsVar != null) {
                    ao.mo7833a(11, (C2408Io) vsVar);
                }
                i2++;
            }
        }
        C3645ys ysVar = this.f10319h;
        if (ysVar != null) {
            ao.mo7833a(12, (C2408Io) ysVar);
        }
        C2384Hs hs = this.f10320i;
        if (hs != null) {
            ao.mo7833a(13, (C2408Io) hs);
        }
        C2356Gs gs = this.f10321j;
        if (gs != null) {
            ao.mo7833a(14, (C2408Io) gs);
        }
        C2269Ds ds = this.f10322k;
        if (ds != null) {
            ao.mo7833a(15, (C2408Io) ds);
        }
        C2298Es es = this.f10323l;
        if (es != null) {
            ao.mo7833a(16, (C2408Io) es);
        }
        C2556Ns[] nsArr = this.f10324m;
        if (nsArr != null && nsArr.length > 0) {
            while (true) {
                C2556Ns[] nsArr2 = this.f10324m;
                if (i >= nsArr2.length) {
                    break;
                }
                C2556Ns ns = nsArr2[i];
                if (ns != null) {
                    ao.mo7833a(17, (C2408Io) ns);
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
        Integer num = this.f10314c;
        if (num != null) {
            c += C2180Ao.m9380c(7, num.intValue());
        }
        Integer num2 = this.f10315d;
        if (num2 != null) {
            c += C2180Ao.m9380c(8, num2.intValue());
        }
        C3589ws wsVar = this.f10316e;
        if (wsVar != null) {
            c += C2180Ao.m9374b(9, (C2408Io) wsVar);
        }
        C3617xs xsVar = this.f10317f;
        if (xsVar != null) {
            c += C2180Ao.m9374b(10, (C2408Io) xsVar);
        }
        C3561vs[] vsVarArr = this.f10318g;
        int i = 0;
        if (vsVarArr != null && vsVarArr.length > 0) {
            int i2 = c;
            int i3 = 0;
            while (true) {
                C3561vs[] vsVarArr2 = this.f10318g;
                if (i3 >= vsVarArr2.length) {
                    break;
                }
                C3561vs vsVar = vsVarArr2[i3];
                if (vsVar != null) {
                    i2 += C2180Ao.m9374b(11, (C2408Io) vsVar);
                }
                i3++;
            }
            c = i2;
        }
        C3645ys ysVar = this.f10319h;
        if (ysVar != null) {
            c += C2180Ao.m9374b(12, (C2408Io) ysVar);
        }
        C2384Hs hs = this.f10320i;
        if (hs != null) {
            c += C2180Ao.m9374b(13, (C2408Io) hs);
        }
        C2356Gs gs = this.f10321j;
        if (gs != null) {
            c += C2180Ao.m9374b(14, (C2408Io) gs);
        }
        C2269Ds ds = this.f10322k;
        if (ds != null) {
            c += C2180Ao.m9374b(15, (C2408Io) ds);
        }
        C2298Es es = this.f10323l;
        if (es != null) {
            c += C2180Ao.m9374b(16, (C2408Io) es);
        }
        C2556Ns[] nsArr = this.f10324m;
        if (nsArr != null && nsArr.length > 0) {
            while (true) {
                C2556Ns[] nsArr2 = this.f10324m;
                if (i >= nsArr2.length) {
                    break;
                }
                C2556Ns ns = nsArr2[i];
                if (ns != null) {
                    c += C2180Ao.m9374b(17, (C2408Io) ns);
                }
                i++;
            }
        }
        return c;
    }
}
