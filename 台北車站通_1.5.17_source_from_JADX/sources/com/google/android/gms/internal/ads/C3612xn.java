package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2577Om;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.xn */
final class C3612xn<T> implements C2493Ln<T> {

    /* renamed from: a */
    private static final Unsafe f10517a = C3210jo.m12751d();

    /* renamed from: b */
    private final int[] f10518b;

    /* renamed from: c */
    private final Object[] f10519c;

    /* renamed from: d */
    private final int f10520d;

    /* renamed from: e */
    private final int f10521e;

    /* renamed from: f */
    private final int f10522f;

    /* renamed from: g */
    private final C3498tn f10523g;

    /* renamed from: h */
    private final boolean f10524h;

    /* renamed from: i */
    private final boolean f10525i;

    /* renamed from: j */
    private final boolean f10526j;

    /* renamed from: k */
    private final boolean f10527k;

    /* renamed from: l */
    private final int[] f10528l;

    /* renamed from: m */
    private final int[] f10529m;

    /* renamed from: n */
    private final int[] f10530n;

    /* renamed from: o */
    private final C2207Bn f10531o;

    /* renamed from: p */
    private final C3066en f10532p;

    /* renamed from: q */
    private final C3039do<?, ?> f10533q;

    /* renamed from: r */
    private final C2263Dm<?> f10534r;

    /* renamed from: s */
    private final C3355on f10535s;

    private C3612xn(int[] iArr, Object[] objArr, int i, int i2, int i3, C3498tn tnVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, C2207Bn bn, C3066en enVar, C3039do<?, ?> doVar, C2263Dm<?> dm, C3355on onVar) {
        C3498tn tnVar2 = tnVar;
        C2263Dm<?> dm2 = dm;
        this.f10518b = iArr;
        this.f10519c = objArr;
        this.f10520d = i;
        this.f10521e = i2;
        this.f10522f = i3;
        this.f10525i = tnVar2 instanceof C2577Om;
        this.f10526j = z;
        this.f10524h = dm2 != null && dm2.mo8001a(tnVar);
        this.f10527k = false;
        this.f10528l = iArr2;
        this.f10529m = iArr3;
        this.f10530n = iArr4;
        this.f10531o = bn;
        this.f10532p = enVar;
        this.f10533q = doVar;
        this.f10534r = dm2;
        this.f10523g = tnVar2;
        this.f10535s = onVar;
    }

    /* renamed from: a */
    private static int m14435a(int i, byte[] bArr, int i2, int i3, Object obj, C3065em emVar) {
        return C3037dm.m12174a(i, bArr, i2, i3, m14471e(obj), emVar);
    }

    /* renamed from: a */
    private static int m14436a(C2493Ln<?> ln, int i, byte[] bArr, int i2, int i3, C2728Tm<?> tm, C3065em emVar) {
        int a = m14438a((C2493Ln) ln, bArr, i2, i3, emVar);
        while (true) {
            tm.add(emVar.f9107c);
            if (a >= i3) {
                break;
            }
            int a2 = C3037dm.m12178a(bArr, a, emVar);
            if (i != emVar.f9105a) {
                break;
            }
            a = m14438a((C2493Ln) ln, bArr, a2, i3, emVar);
        }
        return a;
    }

    /* renamed from: a */
    private static int m14437a(C2493Ln ln, byte[] bArr, int i, int i2, int i3, C3065em emVar) {
        C3612xn xnVar = (C3612xn) ln;
        Object a = xnVar.mo8496a();
        int a2 = xnVar.m14443a(a, bArr, i, i2, i3, emVar);
        xnVar.mo8504c(a);
        emVar.f9107c = a;
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m14438a(com.google.android.gms.internal.ads.C2493Ln r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.C3065em r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12175a((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.ads.C3065em) r10)
            int r8 = r10.f9105a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo8496a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo8500a(r1, r2, r3, r4, r5)
            r6.mo8504c(r9)
            r10.f9107c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.Um r6 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.m14438a(com.google.android.gms.internal.ads.Ln, byte[], int, int, com.google.android.gms.internal.ads.em):int");
    }

    /* renamed from: a */
    private static <UT, UB> int m14439a(C3039do<UT, UB> doVar, T t) {
        return doVar.mo9337f(doVar.mo9320a((Object) t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14440a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.ads.C3065em r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f10517a
            int[] r7 = r0.f10518b
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0168;
                case 52: goto L_0x0158;
                case 53: goto L_0x0148;
                case 54: goto L_0x0148;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0124;
                case 58: goto L_0x010e;
                case 59: goto L_0x00e2;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00a4;
                case 62: goto L_0x013b;
                case 63: goto L_0x0076;
                case 64: goto L_0x0124;
                case 65: goto L_0x012f;
                case 66: goto L_0x0068;
                case 67: goto L_0x005a;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x017c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x017c
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.Ln r2 = r0.m14444a((int) r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = m14437a((com.google.android.gms.internal.ads.C2493Ln) r2, (byte[]) r3, (int) r4, (int) r5, (int) r6, (com.google.android.gms.internal.ads.C3065em) r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0052
            java.lang.Object r3 = r11.f9107c
            goto L_0x0154
        L_0x0052:
            java.lang.Object r3 = r11.f9107c
            java.lang.Object r3 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0154
        L_0x005a:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r11)
            long r3 = r11.f9106b
            long r3 = com.google.android.gms.internal.ads.C3411qm.m13538a((long) r3)
            goto L_0x0150
        L_0x0068:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r11)
            int r3 = r11.f9105a
            int r3 = com.google.android.gms.internal.ads.C3411qm.m13540e(r3)
            goto L_0x0143
        L_0x0076:
            if (r5 != 0) goto L_0x017c
            int r3 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r11)
            int r4 = r11.f9105a
            com.google.android.gms.internal.ads.Sm r5 = r0.m14465c((int) r6)
            if (r5 == 0) goto L_0x009a
            com.google.android.gms.internal.ads.Rm r5 = r5.mo8338a(r4)
            if (r5 == 0) goto L_0x008b
            goto L_0x009a
        L_0x008b:
            com.google.android.gms.internal.ads.eo r1 = m14471e((java.lang.Object) r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo9399a((int) r2, (java.lang.Object) r4)
            r2 = r3
            goto L_0x017d
        L_0x009a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0178
        L_0x00a4:
            if (r5 != r15) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r11)
            int r4 = r11.f9105a
            if (r4 != 0) goto L_0x00b2
            com.google.android.gms.internal.ads.hm r3 = com.google.android.gms.internal.ads.C3150hm.f9434a
            goto L_0x0154
        L_0x00b2:
            com.google.android.gms.internal.ads.hm r3 = com.google.android.gms.internal.ads.C3150hm.m12538a((byte[]) r3, (int) r2, (int) r4)
            r12.putObject(r1, r9, r3)
        L_0x00b9:
            int r2 = r2 + r4
            goto L_0x0178
        L_0x00bc:
            if (r5 != r15) goto L_0x017c
            com.google.android.gms.internal.ads.Ln r2 = r0.m14444a((int) r6)
            r5 = r20
            int r2 = m14438a((com.google.android.gms.internal.ads.C2493Ln) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C3065em) r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d3
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d4
        L_0x00d3:
            r15 = 0
        L_0x00d4:
            if (r15 != 0) goto L_0x00da
            java.lang.Object r3 = r11.f9107c
            goto L_0x0154
        L_0x00da:
            java.lang.Object r3 = r11.f9107c
            java.lang.Object r3 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r15, (java.lang.Object) r3)
            goto L_0x0154
        L_0x00e2:
            if (r5 != r15) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r11)
            int r4 = r11.f9105a
            if (r4 != 0) goto L_0x00ef
            java.lang.String r3 = ""
            goto L_0x0154
        L_0x00ef:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0103
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.C3271lo.m12994a((byte[]) r3, (int) r2, (int) r5)
            if (r5 == 0) goto L_0x00fe
            goto L_0x0103
        L_0x00fe:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11354h()
            throw r1
        L_0x0103:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.ads.C2641Qm.f8145a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b9
        L_0x010e:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r11)
            long r3 = r11.f9106b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x011e
            r15 = 1
            goto L_0x011f
        L_0x011e:
            r15 = 0
        L_0x011f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0154
        L_0x0124:
            if (r5 != r7) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12176a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0162
        L_0x012f:
            r2 = 1
            if (r5 != r2) goto L_0x017c
            long r2 = com.google.android.gms.internal.ads.C3037dm.m12180b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0173
        L_0x013b:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r11)
            int r3 = r11.f9105a
        L_0x0143:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0154
        L_0x0148:
            if (r5 != 0) goto L_0x017c
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r11)
            long r3 = r11.f9106b
        L_0x0150:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0154:
            r12.putObject(r1, r9, r3)
            goto L_0x0178
        L_0x0158:
            if (r5 != r7) goto L_0x017c
            float r2 = com.google.android.gms.internal.ads.C3037dm.m12183d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x0162:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0178
        L_0x0168:
            r2 = 1
            if (r5 != r2) goto L_0x017c
            double r2 = com.google.android.gms.internal.ads.C3037dm.m12181c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x0173:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0178:
            r12.putInt(r1, r13, r8)
            goto L_0x017d
        L_0x017c:
            r2 = r4
        L_0x017d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.m14440a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.ads.em):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x022c, code lost:
        if (r7.f9106b != 0) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022e, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0230, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0231, code lost:
        r11.mo9429a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0234, code lost:
        if (r4 >= r5) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0236, code lost:
        r6 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023c, code lost:
        if (r2 != r7.f9105a) goto L_0x0395;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023e, code lost:
        r4 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0246, code lost:
        if (r7.f9106b == 0) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r4 == 0) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r11.add(com.google.android.gms.internal.ads.C3150hm.f9434a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        r11.add(com.google.android.gms.internal.ads.C3150hm.m12538a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0140, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0142, code lost:
        r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0148, code lost:
        if (r2 != r7.f9105a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014a, code lost:
        r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7);
        r4 = r7.f9105a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (r4 != 0) goto L_0x0138;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14441a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.ads.C3065em r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f10517a
            java.lang.Object r11 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.Tm r11 = (com.google.android.gms.internal.ads.C2728Tm) r11
            boolean r12 = r11.mo8904l()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.ads.Tm r11 = r11.mo8232a(r12)
            sun.misc.Unsafe r12 = f10517a
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x0357;
                case 19: goto L_0x0319;
                case 20: goto L_0x02e1;
                case 21: goto L_0x02e1;
                case 22: goto L_0x02c7;
                case 23: goto L_0x0288;
                case 24: goto L_0x0249;
                case 25: goto L_0x01f8;
                case 26: goto L_0x016d;
                case 27: goto L_0x0153;
                case 28: goto L_0x0128;
                case 29: goto L_0x02c7;
                case 30: goto L_0x00f0;
                case 31: goto L_0x0249;
                case 32: goto L_0x0288;
                case 33: goto L_0x00b0;
                case 34: goto L_0x0070;
                case 35: goto L_0x0357;
                case 36: goto L_0x0319;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02e1;
                case 39: goto L_0x02c7;
                case 40: goto L_0x0288;
                case 41: goto L_0x0249;
                case 42: goto L_0x01f8;
                case 43: goto L_0x02c7;
                case 44: goto L_0x00f0;
                case 45: goto L_0x0249;
                case 46: goto L_0x0288;
                case 47: goto L_0x00b0;
                case 48: goto L_0x0070;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0395
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0395
            com.google.android.gms.internal.ads.Ln r1 = r0.m14444a((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
        L_0x0050:
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = m14437a((com.google.android.gms.internal.ads.C2493Ln) r22, (byte[]) r23, (int) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.C3065em) r27)
            java.lang.Object r8 = r7.f9107c
            r11.add(r8)
            if (r4 >= r5) goto L_0x0395
            int r8 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r9 = r7.f9105a
            if (r2 != r9) goto L_0x0395
            r22 = r1
            r23 = r18
            r24 = r8
            goto L_0x0050
        L_0x0070:
            if (r6 != r10) goto L_0x0094
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x007b:
            if (r1 >= r2) goto L_0x008b
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r1, r7)
            long r4 = r7.f9106b
            long r4 = com.google.android.gms.internal.ads.C3411qm.m13538a((long) r4)
            r11.mo9555a((long) r4)
            goto L_0x007b
        L_0x008b:
            if (r1 != r2) goto L_0x008f
            goto L_0x0396
        L_0x008f:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0094:
            if (r6 != 0) goto L_0x0395
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
        L_0x0098:
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r7)
            long r8 = r7.f9106b
            long r8 = com.google.android.gms.internal.ads.C3411qm.m13538a((long) r8)
            r11.mo9555a((long) r8)
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            goto L_0x0098
        L_0x00b0:
            if (r6 != r10) goto L_0x00d4
            com.google.android.gms.internal.ads.Pm r11 = (com.google.android.gms.internal.ads.C2613Pm) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x00bb:
            if (r1 >= r2) goto L_0x00cb
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r4 = r7.f9105a
            int r4 = com.google.android.gms.internal.ads.C3411qm.m13540e(r4)
            r11.mo8689d(r4)
            goto L_0x00bb
        L_0x00cb:
            if (r1 != r2) goto L_0x00cf
            goto L_0x0396
        L_0x00cf:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x00d4:
            if (r6 != 0) goto L_0x0395
            com.google.android.gms.internal.ads.Pm r11 = (com.google.android.gms.internal.ads.C2613Pm) r11
        L_0x00d8:
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            int r4 = com.google.android.gms.internal.ads.C3411qm.m13540e(r4)
            r11.mo8689d(r4)
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            goto L_0x00d8
        L_0x00f0:
            if (r6 != r10) goto L_0x00f7
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12177a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.C2728Tm<?>) r11, (com.google.android.gms.internal.ads.C3065em) r7)
            goto L_0x0108
        L_0x00f7:
            if (r6 != 0) goto L_0x0395
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12172a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C2728Tm<?>) r6, (com.google.android.gms.internal.ads.C3065em) r7)
        L_0x0108:
            com.google.android.gms.internal.ads.Om r1 = (com.google.android.gms.internal.ads.C2577Om) r1
            com.google.android.gms.internal.ads.eo r3 = r1.zzdtt
            com.google.android.gms.internal.ads.eo r4 = com.google.android.gms.internal.ads.C3067eo.m12291c()
            if (r3 != r4) goto L_0x0113
            r3 = 0
        L_0x0113:
            com.google.android.gms.internal.ads.Sm r4 = r0.m14465c((int) r8)
            com.google.android.gms.internal.ads.do<?, ?> r5 = r0.f10533q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.C2551Nn.m10692a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.ads.eo r3 = (com.google.android.gms.internal.ads.C3067eo) r3
            if (r3 == 0) goto L_0x0125
            r1.zzdtt = r3
        L_0x0125:
            r1 = r2
            goto L_0x0396
        L_0x0128:
            if (r6 != r10) goto L_0x0395
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x0138
        L_0x0132:
            com.google.android.gms.internal.ads.hm r4 = com.google.android.gms.internal.ads.C3150hm.f9434a
            r11.add(r4)
            goto L_0x0140
        L_0x0138:
            com.google.android.gms.internal.ads.hm r6 = com.google.android.gms.internal.ads.C3150hm.m12538a((byte[]) r3, (int) r1, (int) r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x0140:
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x0138
            goto L_0x0132
        L_0x0153:
            if (r6 != r10) goto L_0x0395
            com.google.android.gms.internal.ads.Ln r1 = r0.m14444a((int) r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = m14436a((com.google.android.gms.internal.ads.C2493Ln<?>) r22, (int) r23, (byte[]) r24, (int) r25, (int) r26, (com.google.android.gms.internal.ads.C2728Tm<?>) r27, (com.google.android.gms.internal.ads.C3065em) r28)
            goto L_0x0396
        L_0x016d:
            if (r6 != r10) goto L_0x0395
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01ac
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x0186
        L_0x0182:
            r11.add(r6)
            goto L_0x0191
        L_0x0186:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.C2641Qm.f8145a
            r8.<init>(r3, r1, r4, r9)
        L_0x018d:
            r11.add(r8)
            int r1 = r1 + r4
        L_0x0191:
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r8 = r7.f9105a
            if (r2 != r8) goto L_0x0396
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x01a4
            goto L_0x0182
        L_0x01a4:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.C2641Qm.f8145a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x018d
        L_0x01ac:
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x01b8
        L_0x01b4:
            r11.add(r6)
            goto L_0x01cb
        L_0x01b8:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.ads.C3271lo.m12994a((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x01f3
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.C2641Qm.f8145a
            r9.<init>(r3, r1, r4, r10)
        L_0x01c7:
            r11.add(r9)
            r1 = r8
        L_0x01cb:
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r8 = r7.f9105a
            if (r2 != r8) goto L_0x0396
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            if (r4 != 0) goto L_0x01de
            goto L_0x01b4
        L_0x01de:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.ads.C3271lo.m12994a((byte[]) r3, (int) r1, (int) r8)
            if (r9 == 0) goto L_0x01ee
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.C2641Qm.f8145a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01c7
        L_0x01ee:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11354h()
            throw r1
        L_0x01f3:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11354h()
            throw r1
        L_0x01f8:
            r1 = 0
            if (r6 != r10) goto L_0x0220
            com.google.android.gms.internal.ads.fm r11 = (com.google.android.gms.internal.ads.C3094fm) r11
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r4 = r7.f9105a
            int r4 = r4 + r2
        L_0x0204:
            if (r2 >= r4) goto L_0x0217
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r2, r7)
            long r5 = r7.f9106b
            int r5 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x0212
            r5 = r13
            goto L_0x0213
        L_0x0212:
            r5 = r1
        L_0x0213:
            r11.mo9429a((boolean) r5)
            goto L_0x0204
        L_0x0217:
            if (r2 != r4) goto L_0x021b
            goto L_0x0125
        L_0x021b:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0220:
            if (r6 != 0) goto L_0x0395
            com.google.android.gms.internal.ads.fm r11 = (com.google.android.gms.internal.ads.C3094fm) r11
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r7)
            long r8 = r7.f9106b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0230
        L_0x022e:
            r6 = r13
            goto L_0x0231
        L_0x0230:
            r6 = r1
        L_0x0231:
            r11.mo9429a((boolean) r6)
            if (r4 >= r5) goto L_0x0395
            int r6 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r8 = r7.f9105a
            if (r2 != r8) goto L_0x0395
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r6, r7)
            long r8 = r7.f9106b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0230
            goto L_0x022e
        L_0x0249:
            if (r6 != r10) goto L_0x0269
            com.google.android.gms.internal.ads.Pm r11 = (com.google.android.gms.internal.ads.C2613Pm) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x0254:
            if (r1 >= r2) goto L_0x0260
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12176a(r3, r1)
            r11.mo8689d(r4)
            int r1 = r1 + 4
            goto L_0x0254
        L_0x0260:
            if (r1 != r2) goto L_0x0264
            goto L_0x0396
        L_0x0264:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0269:
            if (r6 != r9) goto L_0x0395
            com.google.android.gms.internal.ads.Pm r11 = (com.google.android.gms.internal.ads.C2613Pm) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12176a(r18, r19)
            r11.mo8689d(r1)
        L_0x0274:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12176a(r3, r4)
            r11.mo8689d(r1)
            goto L_0x0274
        L_0x0288:
            if (r6 != r10) goto L_0x02a8
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x0293:
            if (r1 >= r2) goto L_0x029f
            long r4 = com.google.android.gms.internal.ads.C3037dm.m12180b(r3, r1)
            r11.mo9555a((long) r4)
            int r1 = r1 + 8
            goto L_0x0293
        L_0x029f:
            if (r1 != r2) goto L_0x02a3
            goto L_0x0396
        L_0x02a3:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x02a8:
            if (r6 != r13) goto L_0x0395
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
            long r8 = com.google.android.gms.internal.ads.C3037dm.m12180b(r18, r19)
            r11.mo9555a((long) r8)
        L_0x02b3:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            long r8 = com.google.android.gms.internal.ads.C3037dm.m12180b(r3, r4)
            r11.mo9555a((long) r8)
            goto L_0x02b3
        L_0x02c7:
            if (r6 != r10) goto L_0x02cf
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12177a((byte[]) r3, (int) r4, (com.google.android.gms.internal.ads.C2728Tm<?>) r11, (com.google.android.gms.internal.ads.C3065em) r7)
            goto L_0x0396
        L_0x02cf:
            if (r6 != 0) goto L_0x0395
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12172a((int) r21, (byte[]) r22, (int) r23, (int) r24, (com.google.android.gms.internal.ads.C2728Tm<?>) r25, (com.google.android.gms.internal.ads.C3065em) r26)
            goto L_0x0396
        L_0x02e1:
            if (r6 != r10) goto L_0x0301
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x02ec:
            if (r1 >= r2) goto L_0x02f8
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r1, r7)
            long r4 = r7.f9106b
            r11.mo9555a((long) r4)
            goto L_0x02ec
        L_0x02f8:
            if (r1 != r2) goto L_0x02fc
            goto L_0x0396
        L_0x02fc:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0301:
            if (r6 != 0) goto L_0x0395
            com.google.android.gms.internal.ads.in r11 = (com.google.android.gms.internal.ads.C3179in) r11
        L_0x0305:
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12179b(r3, r4, r7)
            long r8 = r7.f9106b
            r11.mo9555a((long) r8)
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            goto L_0x0305
        L_0x0319:
            if (r6 != r10) goto L_0x0338
            com.google.android.gms.internal.ads.Mm r11 = (com.google.android.gms.internal.ads.C2520Mm) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x0324:
            if (r1 >= r2) goto L_0x0330
            float r4 = com.google.android.gms.internal.ads.C3037dm.m12183d(r3, r1)
            r11.mo8536a((float) r4)
            int r1 = r1 + 4
            goto L_0x0324
        L_0x0330:
            if (r1 != r2) goto L_0x0333
            goto L_0x0396
        L_0x0333:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0338:
            if (r6 != r9) goto L_0x0395
            com.google.android.gms.internal.ads.Mm r11 = (com.google.android.gms.internal.ads.C2520Mm) r11
            float r1 = com.google.android.gms.internal.ads.C3037dm.m12183d(r18, r19)
            r11.mo8536a((float) r1)
        L_0x0343:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            float r1 = com.google.android.gms.internal.ads.C3037dm.m12183d(r3, r4)
            r11.mo8536a((float) r1)
            goto L_0x0343
        L_0x0357:
            if (r6 != r10) goto L_0x0376
            com.google.android.gms.internal.ads.xm r11 = (com.google.android.gms.internal.ads.C3611xm) r11
            int r1 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r4, r7)
            int r2 = r7.f9105a
            int r2 = r2 + r1
        L_0x0362:
            if (r1 >= r2) goto L_0x036e
            double r4 = com.google.android.gms.internal.ads.C3037dm.m12181c(r3, r1)
            r11.mo10211a((double) r4)
            int r1 = r1 + 8
            goto L_0x0362
        L_0x036e:
            if (r1 != r2) goto L_0x0371
            goto L_0x0396
        L_0x0371:
            com.google.android.gms.internal.ads.Um r1 = com.google.android.gms.internal.ads.C2755Um.m11347a()
            throw r1
        L_0x0376:
            if (r6 != r13) goto L_0x0395
            com.google.android.gms.internal.ads.xm r11 = (com.google.android.gms.internal.ads.C3611xm) r11
            double r8 = com.google.android.gms.internal.ads.C3037dm.m12181c(r18, r19)
            r11.mo10211a((double) r8)
        L_0x0381:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0396
            int r4 = com.google.android.gms.internal.ads.C3037dm.m12178a(r3, r1, r7)
            int r6 = r7.f9105a
            if (r2 != r6) goto L_0x0396
            double r8 = com.google.android.gms.internal.ads.C3037dm.m12181c(r3, r4)
            r11.mo10211a((double) r8)
            goto L_0x0381
        L_0x0395:
            r1 = r4
        L_0x0396:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.m14441a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.em):int");
    }

    /* renamed from: a */
    private final <K, V> int m14442a(T t, byte[] bArr, int i, int i2, int i3, int i4, long j, C3065em emVar) {
        Unsafe unsafe = f10517a;
        Object b = m14459b(i3);
        Object object = unsafe.getObject(t, j);
        if (this.f10535s.mo9831c(object)) {
            Object a = this.f10535s.mo9828a(b);
            this.f10535s.mo9829a(a, object);
            unsafe.putObject(t, j, a);
        }
        this.f10535s.mo9834f(b);
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0307, code lost:
        if (r0 == r15) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0366, code lost:
        if (r0 == r15) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0368, code lost:
        r6 = r31;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r5 = r4;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dd, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012b, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        r6 = r6 | r21;
        r13 = r30;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019a, code lost:
        r10.putObject(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f9, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0269, code lost:
        r6 = r6 | r21;
        r7 = r29;
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x026f, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0270, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0274, code lost:
        r18 = r29;
        r2 = r5;
        r21 = r6;
        r7 = r9;
        r25 = r10;
        r6 = r31;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m14443a(T r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.ads.C3065em r32) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            sun.misc.Unsafe r10 = f10517a
            r16 = 0
            r8 = -1
            r0 = r29
            r7 = r8
            r1 = r16
            r6 = r1
        L_0x0017:
            r17 = 0
            if (r0 >= r13) goto L_0x03a7
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12175a((int) r0, (byte[]) r12, (int) r1, (com.google.android.gms.internal.ads.C3065em) r9)
            int r1 = r9.f9105a
            r4 = r0
            r5 = r1
            goto L_0x002c
        L_0x002a:
            r5 = r0
            r4 = r1
        L_0x002c:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.m14474g(r3)
            if (r1 == r8) goto L_0x036c
            int[] r0 = r15.f10518b
            int r18 = r1 + 1
            r8 = r0[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r5
            r5 = r8 & r18
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x0280
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r21 = r8 << r5
            r0 = r0 & r18
            if (r0 == r7) goto L_0x006b
            r5 = -1
            if (r7 == r5) goto L_0x0064
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0064:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
            goto L_0x006c
        L_0x006b:
            r5 = -1
        L_0x006c:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0251;
                case 1: goto L_0x0239;
                case 2: goto L_0x0215;
                case 3: goto L_0x0215;
                case 4: goto L_0x01fc;
                case 5: goto L_0x01d9;
                case 6: goto L_0x01c1;
                case 7: goto L_0x019f;
                case 8: goto L_0x017b;
                case 9: goto L_0x014f;
                case 10: goto L_0x012e;
                case 11: goto L_0x01fc;
                case 12: goto L_0x00f9;
                case 13: goto L_0x01c1;
                case 14: goto L_0x01d9;
                case 15: goto L_0x00e1;
                case 16: goto L_0x00ba;
                case 17: goto L_0x007d;
                default: goto L_0x0070;
            }
        L_0x0070:
            r12 = r28
            r9 = r29
            r13 = r30
            r11 = r32
        L_0x0078:
            r5 = r4
            r29 = r7
            goto L_0x0274
        L_0x007d:
            r0 = 3
            if (r2 != r0) goto L_0x00b5
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.ads.Ln r0 = r15.m14444a((int) r1)
            r1 = r28
            r2 = r4
            r3 = r30
            r4 = r8
            r9 = r29
            r8 = r5
            r5 = r32
            int r0 = m14437a((com.google.android.gms.internal.ads.C2493Ln) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.C3065em) r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00a0
            r11 = r32
            java.lang.Object r1 = r11.f9107c
            goto L_0x00ac
        L_0x00a0:
            r11 = r32
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.f9107c
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r1, (java.lang.Object) r2)
        L_0x00ac:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r21
            r12 = r28
            goto L_0x012b
        L_0x00b5:
            r9 = r29
            r11 = r32
            goto L_0x00dd
        L_0x00ba:
            r9 = r29
            r11 = r32
            r8 = r5
            if (r2 != 0) goto L_0x00dd
            r2 = r12
            r12 = r28
            int r13 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r4, r11)
            long r0 = r11.f9106b
            long r4 = com.google.android.gms.internal.ads.C3411qm.m13538a((long) r0)
            r0 = r10
            r1 = r27
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r30
            goto L_0x0270
        L_0x00dd:
            r12 = r28
            goto L_0x014b
        L_0x00e1:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r12 = r28
            if (r2 != 0) goto L_0x014b
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r4, r11)
            int r3 = r11.f9105a
            int r3 = com.google.android.gms.internal.ads.C3411qm.m13540e(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x0142
        L_0x00f9:
            r9 = r29
            r11 = r32
            r8 = r5
            r22 = r12
            r12 = r28
            if (r2 != 0) goto L_0x014b
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r4, r11)
            int r2 = r11.f9105a
            com.google.android.gms.internal.ads.Sm r1 = r15.m14465c((int) r1)
            if (r1 == 0) goto L_0x0124
            com.google.android.gms.internal.ads.Rm r1 = r1.mo8338a(r2)
            if (r1 == 0) goto L_0x0117
            goto L_0x0124
        L_0x0117:
            com.google.android.gms.internal.ads.eo r1 = m14471e((java.lang.Object) r27)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.mo9399a((int) r9, (java.lang.Object) r2)
            goto L_0x012b
        L_0x0124:
            r3 = r22
            r10.putInt(r14, r3, r2)
            r6 = r6 | r21
        L_0x012b:
            r13 = r30
            goto L_0x0147
        L_0x012e:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x014b
            int r2 = com.google.android.gms.internal.ads.C3037dm.m12185e(r12, r4, r11)
            java.lang.Object r3 = r11.f9107c
            r10.putObject(r14, r0, r3)
        L_0x0142:
            r6 = r6 | r21
            r13 = r30
            r0 = r2
        L_0x0147:
            r1 = r9
            r9 = r11
            goto L_0x0270
        L_0x014b:
            r13 = r30
            goto L_0x0078
        L_0x014f:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0177
            com.google.android.gms.internal.ads.Ln r0 = r15.m14444a((int) r1)
            r13 = r30
            int r0 = m14438a((com.google.android.gms.internal.ads.C2493Ln) r0, (byte[]) r12, (int) r4, (int) r13, (com.google.android.gms.internal.ads.C3065em) r11)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x016c
            java.lang.Object r1 = r11.f9107c
            goto L_0x019a
        L_0x016c:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.f9107c
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r1, (java.lang.Object) r2)
            goto L_0x019a
        L_0x0177:
            r13 = r30
            goto L_0x01f9
        L_0x017b:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 2
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f9
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x0194
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12182c(r12, r4, r11)
            goto L_0x0198
        L_0x0194:
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12184d(r12, r4, r11)
        L_0x0198:
            java.lang.Object r1 = r11.f9107c
        L_0x019a:
            r10.putObject(r14, r7, r1)
            goto L_0x0269
        L_0x019f:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x01f9
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r4, r11)
            long r1 = r11.f9106b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01ba
            r1 = 1
            goto L_0x01bc
        L_0x01ba:
            r1 = r16
        L_0x01bc:
            com.google.android.gms.internal.ads.C3210jo.m12736a((java.lang.Object) r14, (long) r7, (boolean) r1)
            goto L_0x0269
        L_0x01c1:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f9
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12176a(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
            goto L_0x0269
        L_0x01d9:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f9
            long r17 = com.google.android.gms.internal.ads.C3037dm.m12180b(r12, r4)
            r0 = r10
            r1 = r27
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0269
        L_0x01f9:
            r5 = r4
            goto L_0x0274
        L_0x01fc:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x0274
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r5, r11)
            int r1 = r11.f9105a
            r10.putInt(r14, r7, r1)
            goto L_0x0269
        L_0x0215:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x0274
            int r17 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r5, r11)
            long r4 = r11.f9106b
            r0 = r10
            r1 = r27
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r7 = r29
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x026f
        L_0x0239:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x0274
            float r0 = com.google.android.gms.internal.ads.C3037dm.m12183d(r12, r5)
            com.google.android.gms.internal.ads.C3210jo.m12732a((java.lang.Object) r14, (long) r7, (float) r0)
            int r0 = r5 + 4
            goto L_0x0269
        L_0x0251:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x0274
            double r0 = com.google.android.gms.internal.ads.C3037dm.m12181c(r12, r5)
            com.google.android.gms.internal.ads.C3210jo.m12731a((java.lang.Object) r14, (long) r7, (double) r0)
            int r0 = r5 + 8
        L_0x0269:
            r6 = r6 | r21
            r7 = r29
            r1 = r9
            r9 = r11
        L_0x026f:
            r8 = -1
        L_0x0270:
            r11 = r31
            goto L_0x0017
        L_0x0274:
            r18 = r29
            r2 = r5
            r21 = r6
            r7 = r9
            r25 = r10
            r6 = r31
            goto L_0x037a
        L_0x0280:
            r9 = r29
            r5 = r4
            r18 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            r0 = 27
            if (r11 != r0) goto L_0x02d5
            r0 = 2
            if (r2 != r0) goto L_0x02ce
            java.lang.Object r0 = r10.getObject(r14, r7)
            com.google.android.gms.internal.ads.Tm r0 = (com.google.android.gms.internal.ads.C2728Tm) r0
            boolean r2 = r0.mo8904l()
            if (r2 != 0) goto L_0x02af
            int r2 = r0.size()
            if (r2 != 0) goto L_0x02a6
            r2 = 10
            goto L_0x02a8
        L_0x02a6:
            int r2 = r2 << 1
        L_0x02a8:
            com.google.android.gms.internal.ads.Tm r0 = r0.mo8232a(r2)
            r10.putObject(r14, r7, r0)
        L_0x02af:
            r7 = r0
            com.google.android.gms.internal.ads.Ln r0 = r15.m14444a((int) r1)
            r1 = r9
            r2 = r28
            r3 = r5
            r4 = r30
            r5 = r7
            r21 = r6
            r6 = r32
            int r0 = m14436a((com.google.android.gms.internal.ads.C2493Ln<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.C2728Tm<?>) r5, (com.google.android.gms.internal.ads.C3065em) r6)
            r11 = r31
            r7 = r18
            r6 = r21
            r8 = -1
            r9 = r32
            goto L_0x0017
        L_0x02ce:
            r21 = r6
            r15 = r5
            r19 = r9
            goto L_0x0373
        L_0x02d5:
            r21 = r6
            r0 = 49
            if (r11 > r0) goto L_0x031d
            r6 = r20
            long r12 = (long) r6
            r0 = r26
            r20 = r1
            r1 = r27
            r6 = r2
            r2 = r28
            r22 = r3
            r3 = r5
            r4 = r30
            r15 = r5
            r5 = r9
            r29 = r6
            r6 = r22
            r23 = r7
            r7 = r29
            r8 = r20
            r19 = r9
            r25 = r10
            r9 = r12
            r12 = r31
            r12 = r23
            r14 = r32
            int r0 = r0.m14441a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.C3065em) r14)
            if (r0 != r15) goto L_0x030b
            goto L_0x0368
        L_0x030b:
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            r7 = r18
            r1 = r19
            goto L_0x03a0
        L_0x031d:
            r29 = r2
            r22 = r3
            r15 = r5
            r23 = r7
            r19 = r9
            r25 = r10
            r6 = r20
            r20 = r1
            r0 = 50
            if (r11 != r0) goto L_0x034b
            r7 = r29
            r0 = 2
            if (r7 == r0) goto L_0x0336
            goto L_0x0375
        L_0x0336:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r32
            r0.m14442a(r1, r2, r3, r4, r5, r6, r7, r9)
            throw r17
        L_0x034b:
            r7 = r29
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r19
            r8 = r6
            r6 = r22
            r9 = r11
            r10 = r23
            r12 = r20
            r13 = r32
            int r0 = r0.m14440a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.C3065em) r13)
            if (r0 != r15) goto L_0x030b
        L_0x0368:
            r6 = r31
            r2 = r0
            goto L_0x0378
        L_0x036c:
            r15 = r4
            r19 = r5
            r21 = r6
            r18 = r7
        L_0x0373:
            r25 = r10
        L_0x0375:
            r6 = r31
            r2 = r15
        L_0x0378:
            r7 = r19
        L_0x037a:
            if (r7 != r6) goto L_0x0385
            if (r6 != 0) goto L_0x037f
            goto L_0x0385
        L_0x037f:
            r0 = r18
            r1 = r21
            r3 = -1
            goto L_0x03b5
        L_0x0385:
            r0 = r7
            r1 = r28
            r3 = r30
            r4 = r27
            r5 = r32
            int r0 = m14435a((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C3065em) r5)
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r9 = r32
            r11 = r6
            r1 = r7
            r7 = r18
        L_0x03a0:
            r6 = r21
            r10 = r25
            r8 = -1
            goto L_0x0017
        L_0x03a7:
            r21 = r6
            r18 = r7
            r25 = r10
            r6 = r11
            r2 = r0
            r7 = r1
            r3 = r8
            r0 = r18
            r1 = r21
        L_0x03b5:
            if (r0 == r3) goto L_0x03c0
            long r3 = (long) r0
            r0 = r27
            r5 = r25
            r5.putInt(r0, r3, r1)
            goto L_0x03c2
        L_0x03c0:
            r0 = r27
        L_0x03c2:
            r1 = r26
            int[] r3 = r1.f10529m
            if (r3 == 0) goto L_0x03e2
            int r4 = r3.length
            r5 = r16
            r8 = r17
        L_0x03cd:
            if (r5 >= r4) goto L_0x03db
            r9 = r3[r5]
            com.google.android.gms.internal.ads.do<?, ?> r10 = r1.f10533q
            r1.m14447a((java.lang.Object) r0, (int) r9, r8, r10)
            com.google.android.gms.internal.ads.eo r8 = (com.google.android.gms.internal.ads.C3067eo) r8
            int r5 = r5 + 1
            goto L_0x03cd
        L_0x03db:
            if (r8 == 0) goto L_0x03e2
            com.google.android.gms.internal.ads.do<?, ?> r3 = r1.f10533q
            r3.mo9332b((java.lang.Object) r0, r8)
        L_0x03e2:
            if (r6 != 0) goto L_0x03ee
            r0 = r30
            if (r2 != r0) goto L_0x03e9
            goto L_0x03f4
        L_0x03e9:
            com.google.android.gms.internal.ads.Um r0 = com.google.android.gms.internal.ads.C2755Um.m11353g()
            throw r0
        L_0x03ee:
            r0 = r30
            if (r2 > r0) goto L_0x03f5
            if (r7 != r6) goto L_0x03f5
        L_0x03f4:
            return r2
        L_0x03f5:
            com.google.android.gms.internal.ads.Um r0 = com.google.android.gms.internal.ads.C2755Um.m11353g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.m14443a(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.em):int");
    }

    /* renamed from: a */
    private final C2493Ln m14444a(int i) {
        int i2 = (i / 4) << 1;
        C2493Ln ln = (C2493Ln) this.f10519c[i2];
        if (ln != null) {
            return ln;
        }
        C2493Ln a = C2321Fn.m9790a().mo8084a((Class) this.f10519c[i2 + 1]);
        this.f10519c[i2] = a;
        return a;
    }

    /* renamed from: a */
    static <T> C3612xn<T> m14445a(Class<T> cls, C3441rn rnVar, C2207Bn bn, C3066en enVar, C3039do<?, ?> doVar, C2263Dm<?> dm, C3355on onVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C3441rn rnVar2 = rnVar;
        int[] iArr = null;
        if (rnVar2 instanceof C2379Hn) {
            C2379Hn hn = (C2379Hn) rnVar2;
            boolean z = hn.mo8283a() == C2577Om.C2582e.f8056j;
            if (hn.mo8286d() == 0) {
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                int f = hn.mo8288f();
                int g = hn.mo8289g();
                i3 = hn.mo8293k();
                i2 = f;
                i = g;
            }
            int[] iArr2 = new int[(i3 << 2)];
            Object[] objArr = new Object[(i3 << 1)];
            int[] iArr3 = hn.mo8290h() > 0 ? new int[hn.mo8290h()] : null;
            if (hn.mo8291i() > 0) {
                iArr = new int[hn.mo8291i()];
            }
            int[] iArr4 = iArr;
            C2407In e = hn.mo8287e();
            if (e.mo8347a()) {
                int b = e.mo8348b();
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (b >= hn.mo8294l() || i7 >= ((b - i2) << 2)) {
                        if (e.mo8350d()) {
                            i6 = (int) C3210jo.m12728a(e.mo8351e());
                            i5 = (int) C3210jo.m12728a(e.mo8352f());
                            i4 = 0;
                        } else {
                            i6 = (int) C3210jo.m12728a(e.mo8353g());
                            if (e.mo8354h()) {
                                i5 = (int) C3210jo.m12728a(e.mo8355i());
                                i4 = e.mo8356j();
                            } else {
                                i5 = 0;
                                i4 = 0;
                            }
                        }
                        iArr2[i7] = e.mo8348b();
                        int i10 = i7 + 1;
                        iArr2[i10] = (e.mo8358l() ? 536870912 : 0) | (e.mo8357k() ? 268435456 : 0) | (e.mo8349c() << 20) | i6;
                        iArr2[i7 + 2] = i5 | (i4 << 20);
                        if (e.mo8361o() != null) {
                            int i11 = (i7 / 4) << 1;
                            objArr[i11] = e.mo8361o();
                            if (e.mo8359m() != null) {
                                objArr[i11 + 1] = e.mo8359m();
                            } else if (e.mo8360n() != null) {
                                objArr[i11 + 1] = e.mo8360n();
                            }
                        } else if (e.mo8359m() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo8359m();
                        } else if (e.mo8360n() != null) {
                            objArr[((i7 / 4) << 1) + 1] = e.mo8360n();
                        }
                        int c = e.mo8349c();
                        if (c == C2434Jm.MAP.ordinal()) {
                            iArr3[i8] = i7;
                            i8++;
                        } else if (c >= 18 && c <= 49) {
                            iArr4[i9] = iArr2[i10] & 1048575;
                            i9++;
                        }
                        if (!e.mo8347a()) {
                            break;
                        }
                        b = e.mo8348b();
                    } else {
                        for (int i12 = 0; i12 < 4; i12++) {
                            iArr2[i7 + i12] = -1;
                        }
                    }
                    i7 += 4;
                }
            }
            return new C3612xn(iArr2, objArr, i2, i, hn.mo8294l(), hn.mo8285c(), z, false, hn.mo8292j(), iArr3, iArr4, bn, enVar, doVar, dm, onVar);
        }
        ((C2868Yn) rnVar2).mo8283a();
        throw null;
    }

    /* renamed from: a */
    private final <K, V, UT, UB> UB m14446a(int i, int i2, Map<K, V> map, C2698Sm<?> sm, UB ub, C3039do<UT, UB> doVar) {
        this.f10535s.mo9834f(m14459b(i));
        throw null;
    }

    /* renamed from: a */
    private final <UT, UB> UB m14447a(Object obj, int i, UB ub, C3039do<UT, UB> doVar) {
        C2698Sm<?> c;
        int i2 = this.f10518b[i];
        Object f = C3210jo.m12757f(obj, (long) (m14467d(i) & 1048575));
        if (f == null || (c = m14465c(i)) == null) {
            return ub;
        }
        m14446a(i, i2, this.f10535s.mo9833e(f), c, ub, doVar);
        throw null;
    }

    /* renamed from: a */
    private static <E> List<E> m14448a(Object obj, long j) {
        return (List) C3210jo.m12757f(obj, j);
    }

    /* renamed from: a */
    private static void m14449a(int i, Object obj, C3613xo xoVar) {
        if (obj instanceof String) {
            xoVar.mo10174a(i, (String) obj);
        } else {
            xoVar.mo10171a(i, (C3150hm) obj);
        }
    }

    /* renamed from: a */
    private static <UT, UB> void m14450a(C3039do<UT, UB> doVar, T t, C3613xo xoVar) {
        doVar.mo9325a(doVar.mo9320a((Object) t), xoVar);
    }

    /* renamed from: a */
    private final <K, V> void m14451a(C3613xo xoVar, int i, Object obj, int i2) {
        if (obj != null) {
            this.f10535s.mo9834f(m14459b(i2));
            throw null;
        }
    }

    /* renamed from: a */
    private final void m14452a(Object obj, int i, C2463Kn kn) {
        long j;
        Object p;
        if (m14472f(i)) {
            j = (long) (i & 1048575);
            p = kn.mo8449o();
        } else if (this.f10525i) {
            j = (long) (i & 1048575);
            p = kn.readString();
        } else {
            j = (long) (i & 1048575);
            p = kn.mo8451p();
        }
        C3210jo.m12735a(obj, j, p);
    }

    /* renamed from: a */
    private final void m14453a(T t, T t2, int i) {
        long d = (long) (m14467d(i) & 1048575);
        if (m14454a(t2, i)) {
            Object f = C3210jo.m12757f(t, d);
            Object f2 = C3210jo.m12757f(t2, d);
            if (f != null && f2 != null) {
                C3210jo.m12735a((Object) t, d, C2641Qm.m10988a(f, f2));
                m14460b(t, i);
            } else if (f2 != null) {
                C3210jo.m12735a((Object) t, d, f2);
                m14460b(t, i);
            }
        }
    }

    /* renamed from: a */
    private final boolean m14454a(T t, int i) {
        if (this.f10526j) {
            int d = m14467d(i);
            long j = (long) (d & 1048575);
            switch ((d & 267386880) >>> 20) {
                case 0:
                    return C3210jo.m12754e(t, j) != 0.0d;
                case 1:
                    return C3210jo.m12750d(t, j) != 0.0f;
                case 2:
                    return C3210jo.m12740b(t, j) != 0;
                case 3:
                    return C3210jo.m12740b(t, j) != 0;
                case 4:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 5:
                    return C3210jo.m12740b(t, j) != 0;
                case 6:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 7:
                    return C3210jo.m12749c(t, j);
                case 8:
                    Object f = C3210jo.m12757f(t, j);
                    if (f instanceof String) {
                        return !((String) f).isEmpty();
                    }
                    if (f instanceof C3150hm) {
                        return !C3150hm.f9434a.equals(f);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C3210jo.m12757f(t, j) != null;
                case 10:
                    return !C3150hm.f9434a.equals(C3210jo.m12757f(t, j));
                case 11:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 12:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 13:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 14:
                    return C3210jo.m12740b(t, j) != 0;
                case 15:
                    return C3210jo.m12727a((Object) t, j) != 0;
                case 16:
                    return C3210jo.m12740b(t, j) != 0;
                case 17:
                    return C3210jo.m12757f(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e = m14469e(i);
            return (C3210jo.m12727a((Object) t, (long) (e & 1048575)) & (1 << (e >>> 20))) != 0;
        }
    }

    /* renamed from: a */
    private final boolean m14455a(T t, int i, int i2) {
        return C3210jo.m12727a((Object) t, (long) (m14469e(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private final boolean m14456a(T t, int i, int i2, int i3) {
        return this.f10526j ? m14454a(t, i) : (i2 & i3) != 0;
    }

    /* renamed from: a */
    private static boolean m14457a(Object obj, int i, C2493Ln ln) {
        return ln.mo8501a(C3210jo.m12757f(obj, (long) (i & 1048575)));
    }

    /* renamed from: b */
    private static <T> double m14458b(T t, long j) {
        return ((Double) C3210jo.m12757f(t, j)).doubleValue();
    }

    /* renamed from: b */
    private final Object m14459b(int i) {
        return this.f10519c[(i / 4) << 1];
    }

    /* renamed from: b */
    private final void m14460b(T t, int i) {
        if (!this.f10526j) {
            int e = m14469e(i);
            long j = (long) (e & 1048575);
            C3210jo.m12733a((Object) t, j, C3210jo.m12727a((Object) t, j) | (1 << (e >>> 20)));
        }
    }

    /* renamed from: b */
    private final void m14461b(T t, int i, int i2) {
        C3210jo.m12733a((Object) t, (long) (m14469e(i2) & 1048575), i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0324, code lost:
        r2.mo10173a(r13, r7.getObject(r1, r11), m14444a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0339, code lost:
        r2.mo10181b(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0346, code lost:
        r2.mo10186c(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0353, code lost:
        r2.mo10170a(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0360, code lost:
        r2.mo10180b(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036d, code lost:
        r2.mo10189d(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x037a, code lost:
        r2.mo10169a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0383, code lost:
        r2.mo10171a(r13, (com.google.android.gms.internal.ads.C3150hm) r7.getObject(r1, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0392, code lost:
        r2.mo10182b(r13, r7.getObject(r1, r11), m14444a(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a3, code lost:
        m14449a(r13, r7.getObject(r1, r11), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03b3, code lost:
        r2.mo10178a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03bf, code lost:
        r2.mo10192e(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03cb, code lost:
        r2.mo10187c(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03d7, code lost:
        r2.mo10195f(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03e3, code lost:
        r2.mo10193e(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ef, code lost:
        r2.mo10190d(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03fb, code lost:
        r2.mo10168a(r13, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0407, code lost:
        r2.mo10167a(r13, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0419  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14462b(T r18, com.google.android.gms.internal.ads.C3613xo r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f10524h
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.ads.Dm<?> r3 = r0.f10534r
            com.google.android.gms.internal.ads.Gm r3 = r3.mo7995a((java.lang.Object) r1)
            boolean r5 = r3.mo8222b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo8226e()
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r5 = -1
            int[] r6 = r0.f10518b
            int r6 = r6.length
            sun.misc.Unsafe r7 = f10517a
            r8 = 0
            r9 = r5
            r5 = r8
            r10 = r5
        L_0x002c:
            if (r5 >= r6) goto L_0x0416
            int r11 = r0.m14467d((int) r5)
            int[] r12 = r0.f10518b
            r13 = r12[r5]
            r14 = 267386880(0xff00000, float:2.3665827E-29)
            r14 = r14 & r11
            int r14 = r14 >>> 20
            boolean r15 = r0.f10526j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            if (r15 != 0) goto L_0x005b
            r15 = 17
            if (r14 > r15) goto L_0x005b
            int r15 = r5 + 2
            r12 = r12[r15]
            r15 = r12 & r16
            if (r15 == r9) goto L_0x0055
            long r9 = (long) r15
            int r10 = r7.getInt(r1, r9)
            goto L_0x0056
        L_0x0055:
            r15 = r9
        L_0x0056:
            int r9 = r12 >>> 20
            int r9 = r4 << r9
            goto L_0x005d
        L_0x005b:
            r15 = r9
            r9 = r8
        L_0x005d:
            if (r3 != 0) goto L_0x040f
            r11 = r11 & r16
            long r11 = (long) r11
            switch(r14) {
                case 0: goto L_0x03ff;
                case 1: goto L_0x03f3;
                case 2: goto L_0x03e7;
                case 3: goto L_0x03db;
                case 4: goto L_0x03cf;
                case 5: goto L_0x03c3;
                case 6: goto L_0x03b7;
                case 7: goto L_0x03ab;
                case 8: goto L_0x039f;
                case 9: goto L_0x038e;
                case 10: goto L_0x037f;
                case 11: goto L_0x0372;
                case 12: goto L_0x0365;
                case 13: goto L_0x0358;
                case 14: goto L_0x034b;
                case 15: goto L_0x033e;
                case 16: goto L_0x0331;
                case 17: goto L_0x0320;
                case 18: goto L_0x0311;
                case 19: goto L_0x0302;
                case 20: goto L_0x02f3;
                case 21: goto L_0x02e4;
                case 22: goto L_0x02d5;
                case 23: goto L_0x02c6;
                case 24: goto L_0x02b7;
                case 25: goto L_0x02a8;
                case 26: goto L_0x0299;
                case 27: goto L_0x0286;
                case 28: goto L_0x0277;
                case 29: goto L_0x0268;
                case 30: goto L_0x0259;
                case 31: goto L_0x024a;
                case 32: goto L_0x023b;
                case 33: goto L_0x022c;
                case 34: goto L_0x021d;
                case 35: goto L_0x020e;
                case 36: goto L_0x01ff;
                case 37: goto L_0x01f0;
                case 38: goto L_0x01e1;
                case 39: goto L_0x01d2;
                case 40: goto L_0x01c3;
                case 41: goto L_0x01b4;
                case 42: goto L_0x01a5;
                case 43: goto L_0x0196;
                case 44: goto L_0x0187;
                case 45: goto L_0x0178;
                case 46: goto L_0x0169;
                case 47: goto L_0x015a;
                case 48: goto L_0x014b;
                case 49: goto L_0x0138;
                case 50: goto L_0x012f;
                case 51: goto L_0x0123;
                case 52: goto L_0x0117;
                case 53: goto L_0x010b;
                case 54: goto L_0x00ff;
                case 55: goto L_0x00f3;
                case 56: goto L_0x00e7;
                case 57: goto L_0x00db;
                case 58: goto L_0x00cf;
                case 59: goto L_0x00c7;
                case 60: goto L_0x00bf;
                case 61: goto L_0x00b7;
                case 62: goto L_0x00ab;
                case 63: goto L_0x009f;
                case 64: goto L_0x0093;
                case 65: goto L_0x0087;
                case 66: goto L_0x007b;
                case 67: goto L_0x006f;
                case 68: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x040a
        L_0x0067:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            goto L_0x0324
        L_0x006f:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            long r11 = m14470e(r1, r11)
            goto L_0x0339
        L_0x007b:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x0346
        L_0x0087:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            long r11 = m14470e(r1, r11)
            goto L_0x0353
        L_0x0093:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x0360
        L_0x009f:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x036d
        L_0x00ab:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x037a
        L_0x00b7:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            goto L_0x0383
        L_0x00bf:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            goto L_0x0392
        L_0x00c7:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            goto L_0x03a3
        L_0x00cf:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            boolean r4 = m14473f(r1, r11)
            goto L_0x03b3
        L_0x00db:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x03bf
        L_0x00e7:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            long r11 = m14470e(r1, r11)
            goto L_0x03cb
        L_0x00f3:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            int r4 = m14468d(r1, r11)
            goto L_0x03d7
        L_0x00ff:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            long r11 = m14470e(r1, r11)
            goto L_0x03e3
        L_0x010b:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            long r11 = m14470e(r1, r11)
            goto L_0x03ef
        L_0x0117:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            float r4 = m14464c(r1, r11)
            goto L_0x03fb
        L_0x0123:
            boolean r4 = r0.m14455a(r1, (int) r13, (int) r5)
            if (r4 == 0) goto L_0x040a
            double r11 = m14458b(r1, (long) r11)
            goto L_0x0407
        L_0x012f:
            java.lang.Object r4 = r7.getObject(r1, r11)
            r0.m14451a((com.google.android.gms.internal.ads.C3613xo) r2, (int) r13, (java.lang.Object) r4, (int) r5)
            goto L_0x040a
        L_0x0138:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.Ln r11 = r0.m14444a((int) r5)
            com.google.android.gms.internal.ads.C2551Nn.m10708b((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.C3613xo) r2, (com.google.android.gms.internal.ads.C2493Ln) r11)
            goto L_0x040a
        L_0x014b:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r9, r11, r2, r4)
            goto L_0x040a
        L_0x015a:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r9, r11, r2, r4)
            goto L_0x040a
        L_0x0169:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r9, r11, r2, r4)
            goto L_0x040a
        L_0x0178:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r9, r11, r2, r4)
            goto L_0x040a
        L_0x0187:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r9, r11, r2, r4)
            goto L_0x040a
        L_0x0196:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01a5:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01b4:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01c3:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01d2:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01e1:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01f0:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r9, r11, r2, r4)
            goto L_0x040a
        L_0x01ff:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r9, (java.util.List<java.lang.Float>) r11, (com.google.android.gms.internal.ads.C3613xo) r2, (boolean) r4)
            goto L_0x040a
        L_0x020e:
            int[] r9 = r0.f10518b
            r9 = r9[r5]
            java.lang.Object r11 = r7.getObject(r1, r11)
            java.util.List r11 = (java.util.List) r11
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r9, (java.util.List<java.lang.Double>) r11, (com.google.android.gms.internal.ads.C3613xo) r2, (boolean) r4)
            goto L_0x040a
        L_0x021d:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r4, r9, r2, r8)
            goto L_0x040a
        L_0x022c:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r4, r9, r2, r8)
            goto L_0x040a
        L_0x023b:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r4, r9, r2, r8)
            goto L_0x040a
        L_0x024a:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r4, r9, r2, r8)
            goto L_0x040a
        L_0x0259:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r4, r9, r2, r8)
            goto L_0x040a
        L_0x0268:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r4, r9, r2, r8)
            goto L_0x040a
        L_0x0277:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10707b((int) r4, (java.util.List<com.google.android.gms.internal.ads.C3150hm>) r9, (com.google.android.gms.internal.ads.C3613xo) r2)
            goto L_0x040a
        L_0x0286:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.Ln r11 = r0.m14444a((int) r5)
            com.google.android.gms.internal.ads.C2551Nn.m10694a((int) r4, (java.util.List<?>) r9, (com.google.android.gms.internal.ads.C3613xo) r2, (com.google.android.gms.internal.ads.C2493Ln) r11)
            goto L_0x040a
        L_0x0299:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10693a((int) r4, (java.util.List<java.lang.String>) r9, (com.google.android.gms.internal.ads.C3613xo) r2)
            goto L_0x040a
        L_0x02a8:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r4, r9, r2, r8)
            goto L_0x040a
        L_0x02b7:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r4, r9, r2, r8)
            goto L_0x040a
        L_0x02c6:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r4, r9, r2, r8)
            goto L_0x040a
        L_0x02d5:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r4, r9, r2, r8)
            goto L_0x040a
        L_0x02e4:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r4, r9, r2, r8)
            goto L_0x040a
        L_0x02f3:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r4, r9, r2, r8)
            goto L_0x040a
        L_0x0302:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r4, (java.util.List<java.lang.Float>) r9, (com.google.android.gms.internal.ads.C3613xo) r2, (boolean) r8)
            goto L_0x040a
        L_0x0311:
            int[] r4 = r0.f10518b
            r4 = r4[r5]
            java.lang.Object r9 = r7.getObject(r1, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r4, (java.util.List<java.lang.Double>) r9, (com.google.android.gms.internal.ads.C3613xo) r2, (boolean) r8)
            goto L_0x040a
        L_0x0320:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
        L_0x0324:
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r5)
            r2.mo10173a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x040a
        L_0x0331:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            long r11 = r7.getLong(r1, r11)
        L_0x0339:
            r2.mo10181b((int) r13, (long) r11)
            goto L_0x040a
        L_0x033e:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x0346:
            r2.mo10186c((int) r13, (int) r4)
            goto L_0x040a
        L_0x034b:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            long r11 = r7.getLong(r1, r11)
        L_0x0353:
            r2.mo10170a((int) r13, (long) r11)
            goto L_0x040a
        L_0x0358:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x0360:
            r2.mo10180b((int) r13, (int) r4)
            goto L_0x040a
        L_0x0365:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x036d:
            r2.mo10189d((int) r13, (int) r4)
            goto L_0x040a
        L_0x0372:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x037a:
            r2.mo10169a((int) r13, (int) r4)
            goto L_0x040a
        L_0x037f:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
        L_0x0383:
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.hm r4 = (com.google.android.gms.internal.ads.C3150hm) r4
            r2.mo10171a((int) r13, (com.google.android.gms.internal.ads.C3150hm) r4)
            goto L_0x040a
        L_0x038e:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
        L_0x0392:
            java.lang.Object r4 = r7.getObject(r1, r11)
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r5)
            r2.mo10182b((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x040a
        L_0x039f:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
        L_0x03a3:
            java.lang.Object r4 = r7.getObject(r1, r11)
            m14449a((int) r13, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C3613xo) r2)
            goto L_0x040a
        L_0x03ab:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            boolean r4 = com.google.android.gms.internal.ads.C3210jo.m12749c(r1, r11)
        L_0x03b3:
            r2.mo10178a((int) r13, (boolean) r4)
            goto L_0x040a
        L_0x03b7:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x03bf:
            r2.mo10192e((int) r13, (int) r4)
            goto L_0x040a
        L_0x03c3:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            long r11 = r7.getLong(r1, r11)
        L_0x03cb:
            r2.mo10187c((int) r13, (long) r11)
            goto L_0x040a
        L_0x03cf:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            int r4 = r7.getInt(r1, r11)
        L_0x03d7:
            r2.mo10195f(r13, r4)
            goto L_0x040a
        L_0x03db:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            long r11 = r7.getLong(r1, r11)
        L_0x03e3:
            r2.mo10193e((int) r13, (long) r11)
            goto L_0x040a
        L_0x03e7:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            long r11 = r7.getLong(r1, r11)
        L_0x03ef:
            r2.mo10190d((int) r13, (long) r11)
            goto L_0x040a
        L_0x03f3:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            float r4 = com.google.android.gms.internal.ads.C3210jo.m12750d(r1, r11)
        L_0x03fb:
            r2.mo10168a((int) r13, (float) r4)
            goto L_0x040a
        L_0x03ff:
            r4 = r10 & r9
            if (r4 == 0) goto L_0x040a
            double r11 = com.google.android.gms.internal.ads.C3210jo.m12754e(r1, r11)
        L_0x0407:
            r2.mo10167a((int) r13, (double) r11)
        L_0x040a:
            int r5 = r5 + 4
            r9 = r15
            goto L_0x002c
        L_0x040f:
            com.google.android.gms.internal.ads.Dm<?> r1 = r0.f10534r
            r1.mo7994a((java.util.Map.Entry<?, ?>) r3)
            r4 = 0
            throw r4
        L_0x0416:
            r4 = 0
            if (r3 != 0) goto L_0x041f
            com.google.android.gms.internal.ads.do<?, ?> r3 = r0.f10533q
            m14450a(r3, r1, (com.google.android.gms.internal.ads.C3613xo) r2)
            return
        L_0x041f:
            com.google.android.gms.internal.ads.Dm<?> r1 = r0.f10534r
            r1.mo8000a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.m14462b(java.lang.Object, com.google.android.gms.internal.ads.xo):void");
    }

    /* renamed from: b */
    private final void m14463b(T t, T t2, int i) {
        int d = m14467d(i);
        int i2 = this.f10518b[i];
        long j = (long) (d & 1048575);
        if (m14455a(t2, i2, i)) {
            Object f = C3210jo.m12757f(t, j);
            Object f2 = C3210jo.m12757f(t2, j);
            if (f != null && f2 != null) {
                C3210jo.m12735a((Object) t, j, C2641Qm.m10988a(f, f2));
                m14461b(t, i2, i);
            } else if (f2 != null) {
                C3210jo.m12735a((Object) t, j, f2);
                m14461b(t, i2, i);
            }
        }
    }

    /* renamed from: c */
    private static <T> float m14464c(T t, long j) {
        return ((Float) C3210jo.m12757f(t, j)).floatValue();
    }

    /* renamed from: c */
    private final C2698Sm<?> m14465c(int i) {
        return (C2698Sm) this.f10519c[((i / 4) << 1) + 1];
    }

    /* renamed from: c */
    private final boolean m14466c(T t, T t2, int i) {
        return m14454a(t, i) == m14454a(t2, i);
    }

    /* renamed from: d */
    private final int m14467d(int i) {
        return this.f10518b[i + 1];
    }

    /* renamed from: d */
    private static <T> int m14468d(T t, long j) {
        return ((Integer) C3210jo.m12757f(t, j)).intValue();
    }

    /* renamed from: e */
    private final int m14469e(int i) {
        return this.f10518b[i + 2];
    }

    /* renamed from: e */
    private static <T> long m14470e(T t, long j) {
        return ((Long) C3210jo.m12757f(t, j)).longValue();
    }

    /* renamed from: e */
    private static C3067eo m14471e(Object obj) {
        C2577Om om = (C2577Om) obj;
        C3067eo eoVar = om.zzdtt;
        if (eoVar != C3067eo.m12291c()) {
            return eoVar;
        }
        C3067eo d = C3067eo.m12292d();
        om.zzdtt = d;
        return d;
    }

    /* renamed from: f */
    private static boolean m14472f(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: f */
    private static <T> boolean m14473f(T t, long j) {
        return ((Boolean) C3210jo.m12757f(t, j)).booleanValue();
    }

    /* renamed from: g */
    private final int m14474g(int i) {
        int i2 = this.f10520d;
        if (i >= i2) {
            int i3 = this.f10522f;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f10518b[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f10521e) {
                int i5 = i3 - i2;
                int length = (this.f10518b.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f10518b[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final T mo8496a() {
        return this.f10531o.mo7866a(this.f10523g);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final void mo8497a(T r12, com.google.android.gms.internal.ads.C2463Kn r13, com.google.android.gms.internal.ads.C2206Bm r14) {
        /*
            r11 = this;
            if (r14 == 0) goto L_0x051d
            com.google.android.gms.internal.ads.do<?, ?> r7 = r11.f10533q
            com.google.android.gms.internal.ads.Dm<?> r0 = r11.f10534r
            r8 = 0
            r9 = r8
        L_0x0008:
            r10 = 0
            int r1 = r13.mo8437i()     // Catch:{ all -> 0x0507 }
            int r2 = r11.m14474g(r1)     // Catch:{ all -> 0x0507 }
            if (r2 >= 0) goto L_0x006c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002d
            int[] r13 = r11.f10529m
            if (r13 == 0) goto L_0x0027
            int r14 = r13.length
        L_0x001d:
            if (r10 >= r14) goto L_0x0027
            r0 = r13[r10]
            r11.m14447a((java.lang.Object) r12, (int) r0, r9, r7)
            int r10 = r10 + 1
            goto L_0x001d
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r7.mo9332b((java.lang.Object) r12, r9)
        L_0x002c:
            return
        L_0x002d:
            boolean r2 = r11.f10524h     // Catch:{ all -> 0x0507 }
            if (r2 != 0) goto L_0x0033
            r2 = r8
            goto L_0x003a
        L_0x0033:
            com.google.android.gms.internal.ads.tn r2 = r11.f10523g     // Catch:{ all -> 0x0507 }
            java.lang.Object r1 = r0.mo7996a(r14, r2, r1)     // Catch:{ all -> 0x0507 }
            r2 = r1
        L_0x003a:
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.Gm r4 = r0.mo8002b(r12)     // Catch:{ all -> 0x0507 }
            r1 = r13
            r3 = r14
            r5 = r9
            r6 = r7
            r0.mo7997a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0507 }
            throw r8
        L_0x0048:
            r7.mo9327a((com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ all -> 0x0507 }
            if (r9 != 0) goto L_0x0051
            java.lang.Object r9 = r7.mo9329b(r12)     // Catch:{ all -> 0x0507 }
        L_0x0051:
            boolean r1 = r7.mo9328a(r9, (com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ all -> 0x0507 }
            if (r1 != 0) goto L_0x0008
            int[] r13 = r11.f10529m
            if (r13 == 0) goto L_0x0066
            int r14 = r13.length
        L_0x005c:
            if (r10 >= r14) goto L_0x0066
            r0 = r13[r10]
            r11.m14447a((java.lang.Object) r12, (int) r0, r9, r7)
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0066:
            if (r9 == 0) goto L_0x006b
            r7.mo9332b((java.lang.Object) r12, r9)
        L_0x006b:
            return
        L_0x006c:
            int r3 = r11.m14467d((int) r2)     // Catch:{ all -> 0x0507 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x04bb;
                case 1: goto L_0x04af;
                case 2: goto L_0x04a3;
                case 3: goto L_0x0497;
                case 4: goto L_0x048b;
                case 5: goto L_0x047f;
                case 6: goto L_0x0473;
                case 7: goto L_0x0467;
                case 8: goto L_0x0462;
                case 9: goto L_0x0437;
                case 10: goto L_0x042c;
                case 11: goto L_0x0421;
                case 12: goto L_0x040a;
                case 13: goto L_0x03ff;
                case 14: goto L_0x03f4;
                case 15: goto L_0x03e9;
                case 16: goto L_0x03de;
                case 17: goto L_0x03ad;
                case 18: goto L_0x03a2;
                case 19: goto L_0x0397;
                case 20: goto L_0x038c;
                case 21: goto L_0x0381;
                case 22: goto L_0x0376;
                case 23: goto L_0x036b;
                case 24: goto L_0x0360;
                case 25: goto L_0x0355;
                case 26: goto L_0x0333;
                case 27: goto L_0x0321;
                case 28: goto L_0x0313;
                case 29: goto L_0x0308;
                case 30: goto L_0x02f7;
                case 31: goto L_0x02ec;
                case 32: goto L_0x02e1;
                case 33: goto L_0x02d6;
                case 34: goto L_0x02cb;
                case 35: goto L_0x02bd;
                case 36: goto L_0x02af;
                case 37: goto L_0x02a1;
                case 38: goto L_0x0293;
                case 39: goto L_0x0285;
                case 40: goto L_0x0277;
                case 41: goto L_0x0269;
                case 42: goto L_0x025b;
                case 43: goto L_0x024d;
                case 44: goto L_0x0238;
                case 45: goto L_0x022a;
                case 46: goto L_0x021c;
                case 47: goto L_0x020e;
                case 48: goto L_0x0200;
                case 49: goto L_0x01ee;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a3;
                case 52: goto L_0x0194;
                case 53: goto L_0x0185;
                case 54: goto L_0x0176;
                case 55: goto L_0x0167;
                case 56: goto L_0x0158;
                case 57: goto L_0x0149;
                case 58: goto L_0x013a;
                case 59: goto L_0x0135;
                case 60: goto L_0x0106;
                case 61: goto L_0x00fc;
                case 62: goto L_0x00ee;
                case 63: goto L_0x00cd;
                case 64: goto L_0x00bf;
                case 65: goto L_0x00b1;
                case 66: goto L_0x00a3;
                case 67: goto L_0x0095;
                case 68: goto L_0x0083;
                default: goto L_0x007b;
            }
        L_0x007b:
            if (r9 != 0) goto L_0x04c7
            java.lang.Object r9 = r7.mo9319a()     // Catch:{ Vm -> 0x04e2 }
            goto L_0x04c7
        L_0x0083:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r5 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r5 = r13.mo8417a(r5, r14)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
        L_0x0090:
            r11.m14461b(r12, (int) r1, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0095:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8447n()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00a3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            int r5 = r13.mo8443l()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00b1:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8435h()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00bf:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            int r5 = r13.mo8430f()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00cd:
            int r4 = r13.mo8426d()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Sm r6 = r11.m14465c((int) r2)     // Catch:{ Vm -> 0x04e2 }
            if (r6 == 0) goto L_0x00e4
            com.google.android.gms.internal.ads.Rm r6 = r6.mo8338a(r4)     // Catch:{ Vm -> 0x04e2 }
            if (r6 == 0) goto L_0x00de
            goto L_0x00e4
        L_0x00de:
            java.lang.Object r9 = com.google.android.gms.internal.ads.C2551Nn.m10691a((int) r1, (int) r4, r9, r7)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x00e4:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r5, (java.lang.Object) r3)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00ee:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            int r5 = r13.mo8420b()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x00fc:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.hm r5 = r13.mo8451p()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0106:
            boolean r4 = r11.m14455a(r12, (int) r1, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            if (r4 == 0) goto L_0x0123
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r12, r3)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r6 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r6 = r13.mo8421b(r6, r14)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0123:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r5 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r5 = r13.mo8421b(r5, r14)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            r11.m14460b(r12, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0135:
            r11.m14452a((java.lang.Object) r12, (int) r3, (com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x013a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            boolean r5 = r13.mo8446m()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0149:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            int r5 = r13.mo8439j()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0158:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8432g()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0167:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            int r5 = r13.mo8428e()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0176:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8416a()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0185:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8424c()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x0194:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            float r5 = r13.readFloat()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x01a3:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            double r5 = r13.readDouble()     // Catch:{ Vm -> 0x04e2 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0090
        L_0x01b2:
            java.lang.Object r1 = r11.m14459b((int) r2)     // Catch:{ Vm -> 0x04e2 }
            int r2 = r11.m14467d((int) r2)     // Catch:{ Vm -> 0x04e2 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            if (r4 == 0) goto L_0x01da
            com.google.android.gms.internal.ads.on r5 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            boolean r5 = r5.mo9831c(r4)     // Catch:{ Vm -> 0x04e2 }
            if (r5 == 0) goto L_0x01e3
            com.google.android.gms.internal.ads.on r5 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r5 = r5.mo9828a(r1)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.on r6 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            r6.mo9829a(r5, r4)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r2, (java.lang.Object) r5)     // Catch:{ Vm -> 0x04e2 }
            r4 = r5
            goto L_0x01e3
        L_0x01da:
            com.google.android.gms.internal.ads.on r4 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r4 = r4.mo9828a(r1)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r2, (java.lang.Object) r4)     // Catch:{ Vm -> 0x04e2 }
        L_0x01e3:
            com.google.android.gms.internal.ads.on r2 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            r2.mo9833e(r4)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.on r2 = r11.f10535s     // Catch:{ Vm -> 0x04e2 }
            r2.mo9834f(r1)     // Catch:{ Vm -> 0x04e2 }
            throw r8
        L_0x01ee:
            r1 = r3 & r5
            long r3 = (long) r1
            com.google.android.gms.internal.ads.Ln r1 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.en r2 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            java.util.List r2 = r2.mo9395a(r12, r3)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8423b(r2, r1, r14)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0200:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0209:
            r13.mo8444l(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x020e:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0217:
            r13.mo8440j(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x021c:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0225:
            r13.mo8453q(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x022a:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0233:
            r13.mo8450o(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0238:
            com.google.android.gms.internal.ads.en r4 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            java.util.List r3 = r4.mo9395a(r12, r5)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8429e(r3)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Sm r2 = r11.m14465c((int) r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0247:
            java.lang.Object r9 = com.google.android.gms.internal.ads.C2551Nn.m10692a(r1, r3, r2, r9, r7)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x024d:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0256:
            r13.mo8433g(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x025b:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0264:
            r13.mo8427d(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0269:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0272:
            r13.mo8448n(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0277:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x0280:
            r13.mo8452p(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0285:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x028e:
            r13.mo8438i(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0293:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x029c:
            r13.mo8431f(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x02a1:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x02aa:
            r13.mo8441k(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x02af:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x02b8:
            r13.mo8436h(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x02bd:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x02c6:
            r13.mo8422b(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x02cb:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0209
        L_0x02d6:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0217
        L_0x02e1:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0225
        L_0x02ec:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0233
        L_0x02f7:
            com.google.android.gms.internal.ads.en r4 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ Vm -> 0x04e2 }
            java.util.List r3 = r4.mo9395a(r12, r5)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8429e(r3)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Sm r2 = r11.m14465c((int) r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0247
        L_0x0308:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0256
        L_0x0313:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8418a(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0321:
            com.google.android.gms.internal.ads.Ln r1 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.en r4 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            java.util.List r2 = r4.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8419a(r2, r1, r14)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0333:
            boolean r1 = m14472f(r3)     // Catch:{ Vm -> 0x04e2 }
            if (r1 == 0) goto L_0x0347
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8425c(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0347:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            r13.mo8445m(r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x0355:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0264
        L_0x0360:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0272
        L_0x036b:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0280
        L_0x0376:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x028e
        L_0x0381:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x029c
        L_0x038c:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x02aa
        L_0x0397:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x02b8
        L_0x03a2:
            com.google.android.gms.internal.ads.en r1 = r11.f10532p     // Catch:{ Vm -> 0x04e2 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ Vm -> 0x04e2 }
            java.util.List r1 = r1.mo9395a(r12, r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x02c6
        L_0x03ad:
            boolean r1 = r11.m14454a(r12, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            if (r1 == 0) goto L_0x03cb
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C3210jo.m12757f(r12, r3)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r2 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r2 = r13.mo8417a(r2, r14)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Vm -> 0x04e2 }
        L_0x03c6:
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x03cb:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r1 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = r13.mo8417a(r1, r14)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r1)     // Catch:{ Vm -> 0x04e2 }
        L_0x03d9:
            r11.m14460b(r12, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x0008
        L_0x03de:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8447n()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r12, (long) r3, (long) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x03e9:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            int r1 = r13.mo8443l()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r3, (int) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x03f4:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8435h()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r12, (long) r3, (long) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x03ff:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            int r1 = r13.mo8430f()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r3, (int) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x040a:
            int r4 = r13.mo8426d()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Sm r6 = r11.m14465c((int) r2)     // Catch:{ Vm -> 0x04e2 }
            if (r6 == 0) goto L_0x041a
            com.google.android.gms.internal.ads.Rm r6 = r6.mo8338a(r4)     // Catch:{ Vm -> 0x04e2 }
            if (r6 == 0) goto L_0x00de
        L_0x041a:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r5, (int) r4)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0421:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            int r1 = r13.mo8420b()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r3, (int) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x042c:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.hm r1 = r13.mo8451p()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0437:
            boolean r1 = r11.m14454a(r12, (int) r2)     // Catch:{ Vm -> 0x04e2 }
            if (r1 == 0) goto L_0x0452
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C3210jo.m12757f(r12, r3)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r2 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r2 = r13.mo8421b(r2, r14)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03c6
        L_0x0452:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.Ln r1 = r11.m14444a((int) r2)     // Catch:{ Vm -> 0x04e2 }
            java.lang.Object r1 = r13.mo8421b(r1, r14)     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r12, (long) r3, (java.lang.Object) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0462:
            r11.m14452a((java.lang.Object) r12, (int) r3, (com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0467:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            boolean r1 = r13.mo8446m()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12736a((java.lang.Object) r12, (long) r3, (boolean) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0473:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            int r1 = r13.mo8439j()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r3, (int) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x047f:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8432g()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r12, (long) r3, (long) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x048b:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            int r1 = r13.mo8428e()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r12, (long) r3, (int) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x0497:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8416a()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r12, (long) r3, (long) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x04a3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            long r5 = r13.mo8424c()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r12, (long) r3, (long) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x04af:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            float r1 = r13.readFloat()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12732a((java.lang.Object) r12, (long) r3, (float) r1)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x04bb:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ Vm -> 0x04e2 }
            double r5 = r13.readDouble()     // Catch:{ Vm -> 0x04e2 }
            com.google.android.gms.internal.ads.C3210jo.m12731a((java.lang.Object) r12, (long) r3, (double) r5)     // Catch:{ Vm -> 0x04e2 }
            goto L_0x03d9
        L_0x04c7:
            boolean r1 = r7.mo9328a(r9, (com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ Vm -> 0x04e2 }
            if (r1 != 0) goto L_0x0008
            int[] r13 = r11.f10529m
            if (r13 == 0) goto L_0x04dc
            int r14 = r13.length
        L_0x04d2:
            if (r10 >= r14) goto L_0x04dc
            r0 = r13[r10]
            r11.m14447a((java.lang.Object) r12, (int) r0, r9, r7)
            int r10 = r10 + 1
            goto L_0x04d2
        L_0x04dc:
            if (r9 == 0) goto L_0x04e1
            r7.mo9332b((java.lang.Object) r12, r9)
        L_0x04e1:
            return
        L_0x04e2:
            r7.mo9327a((com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ all -> 0x0507 }
            if (r9 != 0) goto L_0x04ec
            java.lang.Object r1 = r7.mo9329b(r12)     // Catch:{ all -> 0x0507 }
            r9 = r1
        L_0x04ec:
            boolean r1 = r7.mo9328a(r9, (com.google.android.gms.internal.ads.C2463Kn) r13)     // Catch:{ all -> 0x0507 }
            if (r1 != 0) goto L_0x0008
            int[] r13 = r11.f10529m
            if (r13 == 0) goto L_0x0501
            int r14 = r13.length
        L_0x04f7:
            if (r10 >= r14) goto L_0x0501
            r0 = r13[r10]
            r11.m14447a((java.lang.Object) r12, (int) r0, r9, r7)
            int r10 = r10 + 1
            goto L_0x04f7
        L_0x0501:
            if (r9 == 0) goto L_0x0506
            r7.mo9332b((java.lang.Object) r12, r9)
        L_0x0506:
            return
        L_0x0507:
            r13 = move-exception
            int[] r14 = r11.f10529m
            if (r14 == 0) goto L_0x0517
            int r0 = r14.length
        L_0x050d:
            if (r10 >= r0) goto L_0x0517
            r1 = r14[r10]
            r11.m14447a((java.lang.Object) r12, (int) r1, r9, r7)
            int r10 = r10 + 1
            goto L_0x050d
        L_0x0517:
            if (r9 == 0) goto L_0x051c
            r7.mo9332b((java.lang.Object) r12, r9)
        L_0x051c:
            throw r13
        L_0x051d:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8497a(java.lang.Object, com.google.android.gms.internal.ads.Kn, com.google.android.gms.internal.ads.Bm):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0343, code lost:
        r14.mo10181b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0354, code lost:
        r14.mo10186c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0365, code lost:
        r14.mo10170a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0376, code lost:
        r14.mo10180b(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0387, code lost:
        r14.mo10189d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0398, code lost:
        r14.mo10169a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03a3, code lost:
        r14.mo10171a(r9, (com.google.android.gms.internal.ads.C3150hm) com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r7 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b6, code lost:
        r14.mo10182b(r9, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r7 & 1048575)), m14444a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03cb, code lost:
        m14449a(r9, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r7 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03e2, code lost:
        r14.mo10178a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f3, code lost:
        r14.mo10192e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0403, code lost:
        r14.mo10187c(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0413, code lost:
        r14.mo10195f(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0423, code lost:
        r14.mo10193e(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0433, code lost:
        r14.mo10190d(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0443, code lost:
        r14.mo10168a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0453, code lost:
        r14.mo10167a(r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x077f, code lost:
        r14.mo10173a(r10, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r8 & 1048575)), m14444a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x079a, code lost:
        r14.mo10181b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07ab, code lost:
        r14.mo10186c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07bc, code lost:
        r14.mo10170a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x07cd, code lost:
        r14.mo10180b(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07de, code lost:
        r14.mo10189d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07ef, code lost:
        r14.mo10169a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07fa, code lost:
        r14.mo10171a(r10, (com.google.android.gms.internal.ads.C3150hm) com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x080d, code lost:
        r14.mo10182b(r10, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r8 & 1048575)), m14444a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0822, code lost:
        m14449a(r10, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r8 & 1048575)), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0839, code lost:
        r14.mo10178a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x084a, code lost:
        r14.mo10192e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x085a, code lost:
        r14.mo10187c(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x086a, code lost:
        r14.mo10195f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x087a, code lost:
        r14.mo10193e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x088a, code lost:
        r14.mo10190d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x089a, code lost:
        r14.mo10168a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08aa, code lost:
        r14.mo10167a(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0328, code lost:
        r14.mo10173a(r9, com.google.android.gms.internal.ads.C3210jo.m12757f(r13, (long) (r7 & 1048575)), m14444a(r1));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0462 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x08bf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8498a(T r13, com.google.android.gms.internal.ads.C3613xo r14) {
        /*
            r12 = this;
            int r0 = r14.mo10165a()
            int r1 = com.google.android.gms.internal.ads.C2577Om.C2582e.f8059m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0469
            com.google.android.gms.internal.ads.do<?, ?> r0 = r12.f10533q
            m14450a(r0, r13, (com.google.android.gms.internal.ads.C3613xo) r14)
            boolean r0 = r12.f10524h
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.ads.Dm<?> r0 = r12.f10534r
            com.google.android.gms.internal.ads.Gm r0 = r0.mo7995a((java.lang.Object) r13)
            boolean r1 = r0.mo8222b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.mo8220a()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            int[] r1 = r12.f10518b
            int r1 = r1.length
            int r1 = r1 + -4
        L_0x0036:
            if (r1 < 0) goto L_0x0460
            int r7 = r12.m14467d((int) r1)
            int[] r8 = r12.f10518b
            r9 = r8[r1]
            if (r0 != 0) goto L_0x045a
            r10 = r7 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x0447;
                case 1: goto L_0x0437;
                case 2: goto L_0x0427;
                case 3: goto L_0x0417;
                case 4: goto L_0x0407;
                case 5: goto L_0x03f7;
                case 6: goto L_0x03e7;
                case 7: goto L_0x03d6;
                case 8: goto L_0x03c5;
                case 9: goto L_0x03b0;
                case 10: goto L_0x039d;
                case 11: goto L_0x038c;
                case 12: goto L_0x037b;
                case 13: goto L_0x036a;
                case 14: goto L_0x0359;
                case 15: goto L_0x0348;
                case 16: goto L_0x0337;
                case 17: goto L_0x0322;
                case 18: goto L_0x0313;
                case 19: goto L_0x0304;
                case 20: goto L_0x02f5;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02d7;
                case 23: goto L_0x02c8;
                case 24: goto L_0x02b9;
                case 25: goto L_0x02aa;
                case 26: goto L_0x029b;
                case 27: goto L_0x0288;
                case 28: goto L_0x0279;
                case 29: goto L_0x026a;
                case 30: goto L_0x025b;
                case 31: goto L_0x024c;
                case 32: goto L_0x023d;
                case 33: goto L_0x022e;
                case 34: goto L_0x021f;
                case 35: goto L_0x0210;
                case 36: goto L_0x0201;
                case 37: goto L_0x01f2;
                case 38: goto L_0x01e3;
                case 39: goto L_0x01d4;
                case 40: goto L_0x01c5;
                case 41: goto L_0x01b6;
                case 42: goto L_0x01a7;
                case 43: goto L_0x0198;
                case 44: goto L_0x0189;
                case 45: goto L_0x017a;
                case 46: goto L_0x016b;
                case 47: goto L_0x015c;
                case 48: goto L_0x014d;
                case 49: goto L_0x013a;
                case 50: goto L_0x012f;
                case 51: goto L_0x0121;
                case 52: goto L_0x0113;
                case 53: goto L_0x0105;
                case 54: goto L_0x00f7;
                case 55: goto L_0x00e9;
                case 56: goto L_0x00db;
                case 57: goto L_0x00cd;
                case 58: goto L_0x00bf;
                case 59: goto L_0x00b7;
                case 60: goto L_0x00af;
                case 61: goto L_0x00a7;
                case 62: goto L_0x0099;
                case 63: goto L_0x008b;
                case 64: goto L_0x007d;
                case 65: goto L_0x006f;
                case 66: goto L_0x0061;
                case 67: goto L_0x0053;
                case 68: goto L_0x004b;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0456
        L_0x004b:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            goto L_0x0328
        L_0x0053:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m14470e(r13, r7)
            goto L_0x0343
        L_0x0061:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x0354
        L_0x006f:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m14470e(r13, r7)
            goto L_0x0365
        L_0x007d:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x0376
        L_0x008b:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x0387
        L_0x0099:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x0398
        L_0x00a7:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            goto L_0x03a3
        L_0x00af:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            goto L_0x03b6
        L_0x00b7:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            goto L_0x03cb
        L_0x00bf:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = m14473f(r13, r7)
            goto L_0x03e2
        L_0x00cd:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x03f3
        L_0x00db:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m14470e(r13, r7)
            goto L_0x0403
        L_0x00e9:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = m14468d(r13, r7)
            goto L_0x0413
        L_0x00f7:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m14470e(r13, r7)
            goto L_0x0423
        L_0x0105:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = m14470e(r13, r7)
            goto L_0x0433
        L_0x0113:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = m14464c(r13, r7)
            goto L_0x0443
        L_0x0121:
            boolean r8 = r12.m14455a(r13, (int) r9, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = m14458b(r13, (long) r7)
            goto L_0x0453
        L_0x012f:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r7)
            r12.m14451a((com.google.android.gms.internal.ads.C3613xo) r14, (int) r9, (java.lang.Object) r7, (int) r1)
            goto L_0x0456
        L_0x013a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Ln r9 = r12.m14444a((int) r1)
            com.google.android.gms.internal.ads.C2551Nn.m10708b((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x0456
        L_0x014d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r8, r7, r14, r4)
            goto L_0x0456
        L_0x015c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r8, r7, r14, r4)
            goto L_0x0456
        L_0x016b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r8, r7, r14, r4)
            goto L_0x0456
        L_0x017a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r8, r7, r14, r4)
            goto L_0x0456
        L_0x0189:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r8, r7, r14, r4)
            goto L_0x0456
        L_0x0198:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01a7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01b6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01c5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01d4:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01e3:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r8, r7, r14, r4)
            goto L_0x0456
        L_0x01f2:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r8, r7, r14, r4)
            goto L_0x0456
        L_0x0201:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r4)
            goto L_0x0456
        L_0x0210:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r4)
            goto L_0x0456
        L_0x021f:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r8, r7, r14, r5)
            goto L_0x0456
        L_0x022e:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r8, r7, r14, r5)
            goto L_0x0456
        L_0x023d:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r8, r7, r14, r5)
            goto L_0x0456
        L_0x024c:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r8, r7, r14, r5)
            goto L_0x0456
        L_0x025b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r8, r7, r14, r5)
            goto L_0x0456
        L_0x026a:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r8, r7, r14, r5)
            goto L_0x0456
        L_0x0279:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10707b((int) r8, (java.util.List<com.google.android.gms.internal.ads.C3150hm>) r7, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x0456
        L_0x0288:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.Ln r9 = r12.m14444a((int) r1)
            com.google.android.gms.internal.ads.C2551Nn.m10694a((int) r8, (java.util.List<?>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x0456
        L_0x029b:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10693a((int) r8, (java.util.List<java.lang.String>) r7, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x0456
        L_0x02aa:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r8, r7, r14, r5)
            goto L_0x0456
        L_0x02b9:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r8, r7, r14, r5)
            goto L_0x0456
        L_0x02c8:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r8, r7, r14, r5)
            goto L_0x0456
        L_0x02d7:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r8, r7, r14, r5)
            goto L_0x0456
        L_0x02e6:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r8, r7, r14, r5)
            goto L_0x0456
        L_0x02f5:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r8, r7, r14, r5)
            goto L_0x0456
        L_0x0304:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r8, (java.util.List<java.lang.Float>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r5)
            goto L_0x0456
        L_0x0313:
            r8 = r8[r1]
            r7 = r7 & r6
            long r9 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r9)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r8, (java.util.List<java.lang.Double>) r7, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r5)
            goto L_0x0456
        L_0x0322:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
        L_0x0328:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r7)
            com.google.android.gms.internal.ads.Ln r8 = r12.m14444a((int) r1)
            r14.mo10173a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C2493Ln) r8)
            goto L_0x0456
        L_0x0337:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r7)
        L_0x0343:
            r14.mo10181b((int) r9, (long) r7)
            goto L_0x0456
        L_0x0348:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x0354:
            r14.mo10186c((int) r9, (int) r7)
            goto L_0x0456
        L_0x0359:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r7)
        L_0x0365:
            r14.mo10170a((int) r9, (long) r7)
            goto L_0x0456
        L_0x036a:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x0376:
            r14.mo10180b((int) r9, (int) r7)
            goto L_0x0456
        L_0x037b:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x0387:
            r14.mo10189d((int) r9, (int) r7)
            goto L_0x0456
        L_0x038c:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x0398:
            r14.mo10169a((int) r9, (int) r7)
            goto L_0x0456
        L_0x039d:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
        L_0x03a3:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r7)
            com.google.android.gms.internal.ads.hm r7 = (com.google.android.gms.internal.ads.C3150hm) r7
            r14.mo10171a((int) r9, (com.google.android.gms.internal.ads.C3150hm) r7)
            goto L_0x0456
        L_0x03b0:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
        L_0x03b6:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r7)
            com.google.android.gms.internal.ads.Ln r8 = r12.m14444a((int) r1)
            r14.mo10182b((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C2493Ln) r8)
            goto L_0x0456
        L_0x03c5:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
        L_0x03cb:
            r7 = r7 & r6
            long r7 = (long) r7
            java.lang.Object r7 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r7)
            m14449a((int) r9, (java.lang.Object) r7, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x0456
        L_0x03d6:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            boolean r7 = com.google.android.gms.internal.ads.C3210jo.m12749c(r13, r7)
        L_0x03e2:
            r14.mo10178a((int) r9, (boolean) r7)
            goto L_0x0456
        L_0x03e7:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x03f3:
            r14.mo10192e((int) r9, (int) r7)
            goto L_0x0456
        L_0x03f7:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r7)
        L_0x0403:
            r14.mo10187c((int) r9, (long) r7)
            goto L_0x0456
        L_0x0407:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            int r7 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r7)
        L_0x0413:
            r14.mo10195f(r9, r7)
            goto L_0x0456
        L_0x0417:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r7)
        L_0x0423:
            r14.mo10193e((int) r9, (long) r7)
            goto L_0x0456
        L_0x0427:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            long r7 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r7)
        L_0x0433:
            r14.mo10190d((int) r9, (long) r7)
            goto L_0x0456
        L_0x0437:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            float r7 = com.google.android.gms.internal.ads.C3210jo.m12750d(r13, r7)
        L_0x0443:
            r14.mo10168a((int) r9, (float) r7)
            goto L_0x0456
        L_0x0447:
            boolean r8 = r12.m14454a(r13, (int) r1)
            if (r8 == 0) goto L_0x0456
            r7 = r7 & r6
            long r7 = (long) r7
            double r7 = com.google.android.gms.internal.ads.C3210jo.m12754e(r13, r7)
        L_0x0453:
            r14.mo10167a((int) r9, (double) r7)
        L_0x0456:
            int r1 = r1 + -4
            goto L_0x0036
        L_0x045a:
            com.google.android.gms.internal.ads.Dm<?> r13 = r12.f10534r
            r13.mo7994a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x0460:
            if (r0 != 0) goto L_0x0463
            return
        L_0x0463:
            com.google.android.gms.internal.ads.Dm<?> r13 = r12.f10534r
            r13.mo8000a(r14, r0)
            throw r3
        L_0x0469:
            boolean r0 = r12.f10526j
            if (r0 == 0) goto L_0x08c5
            boolean r0 = r12.f10524h
            if (r0 == 0) goto L_0x0488
            com.google.android.gms.internal.ads.Dm<?> r0 = r12.f10534r
            com.google.android.gms.internal.ads.Gm r0 = r0.mo7995a((java.lang.Object) r13)
            boolean r1 = r0.mo8222b()
            if (r1 != 0) goto L_0x0488
            java.util.Iterator r0 = r0.mo8226e()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0489
        L_0x0488:
            r0 = r3
        L_0x0489:
            int[] r1 = r12.f10518b
            int r1 = r1.length
            r7 = r5
        L_0x048d:
            if (r7 >= r1) goto L_0x08b7
            int r8 = r12.m14467d((int) r7)
            int[] r9 = r12.f10518b
            r10 = r9[r7]
            if (r0 != 0) goto L_0x08b1
            r11 = r8 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x089e;
                case 1: goto L_0x088e;
                case 2: goto L_0x087e;
                case 3: goto L_0x086e;
                case 4: goto L_0x085e;
                case 5: goto L_0x084e;
                case 6: goto L_0x083e;
                case 7: goto L_0x082d;
                case 8: goto L_0x081c;
                case 9: goto L_0x0807;
                case 10: goto L_0x07f4;
                case 11: goto L_0x07e3;
                case 12: goto L_0x07d2;
                case 13: goto L_0x07c1;
                case 14: goto L_0x07b0;
                case 15: goto L_0x079f;
                case 16: goto L_0x078e;
                case 17: goto L_0x0779;
                case 18: goto L_0x076a;
                case 19: goto L_0x075b;
                case 20: goto L_0x074c;
                case 21: goto L_0x073d;
                case 22: goto L_0x072e;
                case 23: goto L_0x071f;
                case 24: goto L_0x0710;
                case 25: goto L_0x0701;
                case 26: goto L_0x06f2;
                case 27: goto L_0x06df;
                case 28: goto L_0x06d0;
                case 29: goto L_0x06c1;
                case 30: goto L_0x06b2;
                case 31: goto L_0x06a3;
                case 32: goto L_0x0694;
                case 33: goto L_0x0685;
                case 34: goto L_0x0676;
                case 35: goto L_0x0667;
                case 36: goto L_0x0658;
                case 37: goto L_0x0649;
                case 38: goto L_0x063a;
                case 39: goto L_0x062b;
                case 40: goto L_0x061c;
                case 41: goto L_0x060d;
                case 42: goto L_0x05fe;
                case 43: goto L_0x05ef;
                case 44: goto L_0x05e0;
                case 45: goto L_0x05d1;
                case 46: goto L_0x05c2;
                case 47: goto L_0x05b3;
                case 48: goto L_0x05a4;
                case 49: goto L_0x0591;
                case 50: goto L_0x0586;
                case 51: goto L_0x0578;
                case 52: goto L_0x056a;
                case 53: goto L_0x055c;
                case 54: goto L_0x054e;
                case 55: goto L_0x0540;
                case 56: goto L_0x0532;
                case 57: goto L_0x0524;
                case 58: goto L_0x0516;
                case 59: goto L_0x050e;
                case 60: goto L_0x0506;
                case 61: goto L_0x04fe;
                case 62: goto L_0x04f0;
                case 63: goto L_0x04e2;
                case 64: goto L_0x04d4;
                case 65: goto L_0x04c6;
                case 66: goto L_0x04b8;
                case 67: goto L_0x04aa;
                case 68: goto L_0x04a2;
                default: goto L_0x04a0;
            }
        L_0x04a0:
            goto L_0x08ad
        L_0x04a2:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            goto L_0x077f
        L_0x04aa:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m14470e(r13, r8)
            goto L_0x079a
        L_0x04b8:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x07ab
        L_0x04c6:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m14470e(r13, r8)
            goto L_0x07bc
        L_0x04d4:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x07cd
        L_0x04e2:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x07de
        L_0x04f0:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x07ef
        L_0x04fe:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            goto L_0x07fa
        L_0x0506:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            goto L_0x080d
        L_0x050e:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            goto L_0x0822
        L_0x0516:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = m14473f(r13, r8)
            goto L_0x0839
        L_0x0524:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x084a
        L_0x0532:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m14470e(r13, r8)
            goto L_0x085a
        L_0x0540:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = m14468d(r13, r8)
            goto L_0x086a
        L_0x054e:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m14470e(r13, r8)
            goto L_0x087a
        L_0x055c:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = m14470e(r13, r8)
            goto L_0x088a
        L_0x056a:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = m14464c(r13, r8)
            goto L_0x089a
        L_0x0578:
            boolean r9 = r12.m14455a(r13, (int) r10, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = m14458b(r13, (long) r8)
            goto L_0x08aa
        L_0x0586:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r8)
            r12.m14451a((com.google.android.gms.internal.ads.C3613xo) r14, (int) r10, (java.lang.Object) r8, (int) r7)
            goto L_0x08ad
        L_0x0591:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Ln r10 = r12.m14444a((int) r7)
            com.google.android.gms.internal.ads.C2551Nn.m10708b((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (com.google.android.gms.internal.ads.C2493Ln) r10)
            goto L_0x08ad
        L_0x05a4:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05b3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05c2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05d1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05e0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05ef:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x05fe:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x060d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x061c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x062b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x063a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x0649:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r9, r8, r14, r4)
            goto L_0x08ad
        L_0x0658:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r4)
            goto L_0x08ad
        L_0x0667:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r4)
            goto L_0x08ad
        L_0x0676:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10721e(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x0685:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10736j(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x0694:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10727g(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x06a3:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10738l(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x06b2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10739m(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x06c1:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10733i(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x06d0:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10707b((int) r9, (java.util.List<com.google.android.gms.internal.ads.C3150hm>) r8, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x08ad
        L_0x06df:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.Ln r10 = r12.m14444a((int) r7)
            com.google.android.gms.internal.ads.C2551Nn.m10694a((int) r9, (java.util.List<?>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (com.google.android.gms.internal.ads.C2493Ln) r10)
            goto L_0x08ad
        L_0x06f2:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10693a((int) r9, (java.util.List<java.lang.String>) r8, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x08ad
        L_0x0701:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10740n(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x0710:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10737k(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x071f:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10724f(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x072e:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10730h(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x073d:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10717d(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x074c:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10713c(r9, r8, r14, r5)
            goto L_0x08ad
        L_0x075b:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10709b((int) r9, (java.util.List<java.lang.Float>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r5)
            goto L_0x08ad
        L_0x076a:
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.C2551Nn.m10695a((int) r9, (java.util.List<java.lang.Double>) r8, (com.google.android.gms.internal.ads.C3613xo) r14, (boolean) r5)
            goto L_0x08ad
        L_0x0779:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
        L_0x077f:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r8)
            com.google.android.gms.internal.ads.Ln r9 = r12.m14444a((int) r7)
            r14.mo10173a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x08ad
        L_0x078e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r8)
        L_0x079a:
            r14.mo10181b((int) r10, (long) r8)
            goto L_0x08ad
        L_0x079f:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x07ab:
            r14.mo10186c((int) r10, (int) r8)
            goto L_0x08ad
        L_0x07b0:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r8)
        L_0x07bc:
            r14.mo10170a((int) r10, (long) r8)
            goto L_0x08ad
        L_0x07c1:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x07cd:
            r14.mo10180b((int) r10, (int) r8)
            goto L_0x08ad
        L_0x07d2:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x07de:
            r14.mo10189d((int) r10, (int) r8)
            goto L_0x08ad
        L_0x07e3:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x07ef:
            r14.mo10169a((int) r10, (int) r8)
            goto L_0x08ad
        L_0x07f4:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
        L_0x07fa:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r8)
            com.google.android.gms.internal.ads.hm r8 = (com.google.android.gms.internal.ads.C3150hm) r8
            r14.mo10171a((int) r10, (com.google.android.gms.internal.ads.C3150hm) r8)
            goto L_0x08ad
        L_0x0807:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
        L_0x080d:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r8)
            com.google.android.gms.internal.ads.Ln r9 = r12.m14444a((int) r7)
            r14.mo10182b((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x08ad
        L_0x081c:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
        L_0x0822:
            r8 = r8 & r6
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.ads.C3210jo.m12757f(r13, r8)
            m14449a((int) r10, (java.lang.Object) r8, (com.google.android.gms.internal.ads.C3613xo) r14)
            goto L_0x08ad
        L_0x082d:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            boolean r8 = com.google.android.gms.internal.ads.C3210jo.m12749c(r13, r8)
        L_0x0839:
            r14.mo10178a((int) r10, (boolean) r8)
            goto L_0x08ad
        L_0x083e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x084a:
            r14.mo10192e((int) r10, (int) r8)
            goto L_0x08ad
        L_0x084e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r8)
        L_0x085a:
            r14.mo10187c((int) r10, (long) r8)
            goto L_0x08ad
        L_0x085e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r13, (long) r8)
        L_0x086a:
            r14.mo10195f(r10, r8)
            goto L_0x08ad
        L_0x086e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r8)
        L_0x087a:
            r14.mo10193e((int) r10, (long) r8)
            goto L_0x08ad
        L_0x087e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            long r8 = com.google.android.gms.internal.ads.C3210jo.m12740b(r13, r8)
        L_0x088a:
            r14.mo10190d((int) r10, (long) r8)
            goto L_0x08ad
        L_0x088e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            float r8 = com.google.android.gms.internal.ads.C3210jo.m12750d(r13, r8)
        L_0x089a:
            r14.mo10168a((int) r10, (float) r8)
            goto L_0x08ad
        L_0x089e:
            boolean r9 = r12.m14454a(r13, (int) r7)
            if (r9 == 0) goto L_0x08ad
            r8 = r8 & r6
            long r8 = (long) r8
            double r8 = com.google.android.gms.internal.ads.C3210jo.m12754e(r13, r8)
        L_0x08aa:
            r14.mo10167a((int) r10, (double) r8)
        L_0x08ad:
            int r7 = r7 + 4
            goto L_0x048d
        L_0x08b1:
            com.google.android.gms.internal.ads.Dm<?> r13 = r12.f10534r
            r13.mo7994a((java.util.Map.Entry<?, ?>) r0)
            throw r3
        L_0x08b7:
            if (r0 != 0) goto L_0x08bf
            com.google.android.gms.internal.ads.do<?, ?> r0 = r12.f10533q
            m14450a(r0, r13, (com.google.android.gms.internal.ads.C3613xo) r14)
            return
        L_0x08bf:
            com.google.android.gms.internal.ads.Dm<?> r13 = r12.f10534r
            r13.mo8000a(r14, r0)
            throw r3
        L_0x08c5:
            r12.m14462b(r13, (com.google.android.gms.internal.ads.C3613xo) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8498a(java.lang.Object, com.google.android.gms.internal.ads.xo):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C3210jo.m12757f(r8, r2));
        m14461b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C3210jo.m12757f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r7, r2, com.google.android.gms.internal.ads.C3210jo.m12740b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        m14460b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8499a(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.f10518b
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.m14467d((int) r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f10518b
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.m14455a(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.m14463b(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.m14455a(r8, (int) r4, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.google.android.gms.internal.ads.C3210jo.m12757f(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            r6.m14461b(r7, (int) r4, (int) r0)
            goto L_0x00ee
        L_0x003d:
            com.google.android.gms.internal.ads.on r1 = r6.f10535s
            com.google.android.gms.internal.ads.C2551Nn.m10698a((com.google.android.gms.internal.ads.C3355on) r1, r7, r8, (long) r2)
            goto L_0x00ee
        L_0x0044:
            com.google.android.gms.internal.ads.en r1 = r6.f10532p
            r1.mo9396a(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.m14453a(r7, r8, (int) r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.google.android.gms.internal.ads.C3210jo.m12757f(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12735a((java.lang.Object) r7, (long) r2, (java.lang.Object) r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.google.android.gms.internal.ads.C3210jo.m12749c(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12736a((java.lang.Object) r7, (long) r2, (boolean) r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r8, (long) r2)
            com.google.android.gms.internal.ads.C3210jo.m12733a((java.lang.Object) r7, (long) r2, (int) r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12734a((java.lang.Object) r7, (long) r2, (long) r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.google.android.gms.internal.ads.C3210jo.m12750d(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12732a((java.lang.Object) r7, (long) r2, (float) r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.m14454a(r8, (int) r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.google.android.gms.internal.ads.C3210jo.m12754e(r8, r2)
            com.google.android.gms.internal.ads.C3210jo.m12731a((java.lang.Object) r7, (long) r2, (double) r4)
        L_0x00eb:
            r6.m14460b(r7, (int) r0)
        L_0x00ee:
            int r0 = r0 + 4
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.f10526j
            if (r0 != 0) goto L_0x0104
            com.google.android.gms.internal.ads.do<?, ?> r0 = r6.f10533q
            com.google.android.gms.internal.ads.C2551Nn.m10697a(r0, r7, r8)
            boolean r0 = r6.f10524h
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.Dm<?> r0 = r6.f10534r
            com.google.android.gms.internal.ads.C2551Nn.m10696a(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8499a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.f9107c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r10, r11);
        r1 = r11.f9105a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a0, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8500a(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.C3065em r27) {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f10526j
            if (r0 == 0) goto L_0x01cd
            sun.misc.Unsafe r9 = f10517a
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c4
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12175a((int) r0, (byte[]) r12, (int) r1, (com.google.android.gms.internal.ads.C3065em) r11)
            int r1 = r11.f9105a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.m14474g(r6)
            if (r8 < 0) goto L_0x01a4
            int[] r0 = r15.f10518b
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a4
        L_0x004d:
            if (r7 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r10, r11)
            long r0 = r11.f9106b
            long r4 = com.google.android.gms.internal.ads.C3411qm.m13538a((long) r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r10, r11)
            int r1 = r11.f9105a
            int r1 = com.google.android.gms.internal.ads.C3411qm.m13540e(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a4
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12185e(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.f9107c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a4
            com.google.android.gms.internal.ads.Ln r0 = r15.m14444a((int) r8)
            int r0 = m14438a((com.google.android.gms.internal.ads.C2493Ln) r0, (byte[]) r12, (int) r10, (int) r13, (com.google.android.gms.internal.ads.C3065em) r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.f9107c
            java.lang.Object r1 = com.google.android.gms.internal.ads.C2641Qm.m10988a((java.lang.Object) r1, (java.lang.Object) r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12182c(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12184d(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r10, r11)
            long r4 = r11.f9106b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            com.google.android.gms.internal.ads.C3210jo.m12736a((java.lang.Object) r14, (long) r2, (boolean) r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12176a(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a4
            long r4 = com.google.android.gms.internal.ads.C3037dm.m12180b(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a4
        L_0x00d0:
            int r0 = com.google.android.gms.internal.ads.C3037dm.m12178a(r12, r10, r11)
            int r1 = r11.f9105a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.ads.C3037dm.m12179b(r12, r10, r11)
            long r4 = r11.f9106b
        L_0x00e3:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a4
            float r0 = com.google.android.gms.internal.ads.C3037dm.m12183d(r12, r10)
            com.google.android.gms.internal.ads.C3210jo.m12732a((java.lang.Object) r14, (long) r2, (float) r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a4
            double r0 = com.google.android.gms.internal.ads.C3037dm.m12181c(r12, r10)
            com.google.android.gms.internal.ads.C3210jo.m12731a((java.lang.Object) r14, (long) r2, (double) r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.ads.Tm r0 = (com.google.android.gms.internal.ads.C2728Tm) r0
            boolean r1 = r0.mo8904l()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            com.google.android.gms.internal.ads.Tm r0 = r0.mo8232a(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            com.google.android.gms.internal.ads.Ln r0 = r15.m14444a((int) r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = m14436a((com.google.android.gms.internal.ads.C2493Ln<?>) r0, (int) r1, (byte[]) r2, (int) r3, (int) r4, (com.google.android.gms.internal.ads.C2728Tm<?>) r5, (com.google.android.gms.internal.ads.C3065em) r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0167
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.m14441a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.google.android.gms.internal.ads.C3065em) r14)
            if (r0 != r15) goto L_0x01b6
            goto L_0x01a2
        L_0x0167:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018a
            if (r7 == r1) goto L_0x0177
            goto L_0x01a7
        L_0x0177:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            r0.m14442a(r1, r2, r3, r4, r5, r6, r7, r9)
            r0 = 0
            throw r0
        L_0x018a:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.m14440a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.google.android.gms.internal.ads.C3065em) r13)
            if (r0 != r15) goto L_0x01b6
        L_0x01a2:
            r2 = r0
            goto L_0x01a8
        L_0x01a4:
            r21 = r9
            r15 = r10
        L_0x01a7:
            r2 = r15
        L_0x01a8:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = m14435a((int) r0, (byte[]) r1, (int) r2, (int) r3, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C3065em) r5)
        L_0x01b6:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c4:
            r4 = r13
            if (r0 != r4) goto L_0x01c8
            return
        L_0x01c8:
            com.google.android.gms.internal.ads.Um r0 = com.google.android.gms.internal.ads.C2755Um.m11353g()
            throw r0
        L_0x01cd:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.m14443a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.google.android.gms.internal.ads.C3065em) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8500a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.em):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8501a(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int[] r2 = r0.f10528l
            r3 = 1
            if (r2 == 0) goto L_0x00fe
            int r4 = r2.length
            if (r4 != 0) goto L_0x000e
            goto L_0x00fe
        L_0x000e:
            r4 = -1
            int r5 = r2.length
            r6 = 0
            r7 = r4
            r4 = r6
            r8 = r4
        L_0x0014:
            if (r4 >= r5) goto L_0x00eb
            r9 = r2[r4]
            int r10 = r0.m14474g(r9)
            int r11 = r0.m14467d((int) r10)
            boolean r12 = r0.f10526j
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L_0x0042
            int[] r12 = r0.f10518b
            int r14 = r10 + 2
            r12 = r12[r14]
            r14 = r12 & r13
            int r12 = r12 >>> 20
            int r12 = r3 << r12
            if (r14 == r7) goto L_0x0040
            sun.misc.Unsafe r7 = f10517a
            r15 = r4
            long r3 = (long) r14
            int r3 = r7.getInt(r1, r3)
            r8 = r3
            r7 = r14
            goto L_0x0044
        L_0x0040:
            r15 = r4
            goto L_0x0044
        L_0x0042:
            r15 = r4
            r12 = r6
        L_0x0044:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r11
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = r6
        L_0x004c:
            if (r3 == 0) goto L_0x0055
            boolean r3 = r0.m14456a(r1, (int) r10, (int) r8, (int) r12)
            if (r3 != 0) goto L_0x0055
            return r6
        L_0x0055:
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r11
            int r3 = r3 >>> 20
            r4 = 9
            if (r3 == r4) goto L_0x00d5
            r4 = 17
            if (r3 == r4) goto L_0x00d5
            r4 = 27
            if (r3 == r4) goto L_0x00a8
            r4 = 60
            if (r3 == r4) goto L_0x0097
            r4 = 68
            if (r3 == r4) goto L_0x0097
            r4 = 49
            if (r3 == r4) goto L_0x00a8
            r4 = 50
            if (r3 == r4) goto L_0x0078
            goto L_0x00e6
        L_0x0078:
            com.google.android.gms.internal.ads.on r3 = r0.f10535s
            r4 = r11 & r13
            long r11 = (long) r4
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r11)
            java.util.Map r3 = r3.mo9832d(r4)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x008c
            goto L_0x00e6
        L_0x008c:
            java.lang.Object r1 = r0.m14459b((int) r10)
            com.google.android.gms.internal.ads.on r2 = r0.f10535s
            r2.mo9834f(r1)
            r1 = 0
            throw r1
        L_0x0097:
            boolean r3 = r0.m14455a(r1, (int) r9, (int) r10)
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.internal.ads.Ln r3 = r0.m14444a((int) r10)
            boolean r3 = m14457a((java.lang.Object) r1, (int) r11, (com.google.android.gms.internal.ads.C2493Ln) r3)
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00a8:
            r3 = r11 & r13
            long r3 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r3)
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00d1
            com.google.android.gms.internal.ads.Ln r4 = r0.m14444a((int) r10)
            r9 = r6
        L_0x00bc:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x00d1
            java.lang.Object r10 = r3.get(r9)
            boolean r10 = r4.mo8501a(r10)
            if (r10 != 0) goto L_0x00ce
            r3 = r6
            goto L_0x00d2
        L_0x00ce:
            int r9 = r9 + 1
            goto L_0x00bc
        L_0x00d1:
            r3 = 1
        L_0x00d2:
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00d5:
            boolean r3 = r0.m14456a(r1, (int) r10, (int) r8, (int) r12)
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.internal.ads.Ln r3 = r0.m14444a((int) r10)
            boolean r3 = m14457a((java.lang.Object) r1, (int) r11, (com.google.android.gms.internal.ads.C2493Ln) r3)
            if (r3 != 0) goto L_0x00e6
            return r6
        L_0x00e6:
            int r4 = r15 + 1
            r3 = 1
            goto L_0x0014
        L_0x00eb:
            boolean r2 = r0.f10524h
            if (r2 == 0) goto L_0x00fc
            com.google.android.gms.internal.ads.Dm<?> r2 = r0.f10534r
            com.google.android.gms.internal.ads.Gm r1 = r2.mo7995a((java.lang.Object) r1)
            boolean r1 = r1.mo8225d()
            if (r1 != 0) goto L_0x00fc
            return r6
        L_0x00fc:
            r1 = 1
            return r1
        L_0x00fe:
            r1 = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8501a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.ads.C3525um.m14097e(r3) + com.google.android.gms.internal.ads.C3525um.m14104g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14092c(r3, (com.google.android.gms.internal.ads.C3498tn) com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5), m14444a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14102f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14109h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14110h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14116j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14118k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14105g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14091c(r3, (com.google.android.gms.internal.ads.C3150hm) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.ads.C2551Nn.m10684a(r3, com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5), m14444a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.C3150hm) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14086b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14087b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14113i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14106g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14101f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14098e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14094d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14082b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.ads.C3525um.m14081b(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x0701;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.C3150hm) != false) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047f, code lost:
        if (m14455a(r1, r15, r3) != false) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0517, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0529, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053b, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x054d, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055f, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0571, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0583, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0595, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a6, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b7, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05d9, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ea, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fb, code lost:
        if (r0.f10527k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fd, code lost:
        r2.putInt(r1, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0601, code lost:
        r9 = (com.google.android.gms.internal.ads.C3525um.m14097e(r15) + com.google.android.gms.internal.ads.C3525um.m14104g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06ae, code lost:
        r5 = r5 + r4;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06bc, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06be, code lost:
        r9 = false;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x06c7, code lost:
        if ((r12 & r18) != 0) goto L_0x06c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06c9, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14092c(r15, (com.google.android.gms.internal.ads.C3498tn) r2.getObject(r1, r9), m14444a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x06e0, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14102f(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06ed, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14109h(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x06f4, code lost:
        if ((r12 & r18) != 0) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06f6, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14110h(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06ff, code lost:
        if ((r12 & r18) != 0) goto L_0x0701;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0701, code lost:
        r9 = com.google.android.gms.internal.ads.C3525um.m14116j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0706, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0710, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14118k(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x071d, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14105g(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0724, code lost:
        if ((r12 & r18) != 0) goto L_0x0726;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0726, code lost:
        r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x072a, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14091c(r15, (com.google.android.gms.internal.ads.C3150hm) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0733, code lost:
        if ((r12 & r18) != 0) goto L_0x0735;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0735, code lost:
        r4 = com.google.android.gms.internal.ads.C2551Nn.m10684a(r15, r2.getObject(r1, r9), m14444a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.C3150hm) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x074d, code lost:
        if ((r4 instanceof com.google.android.gms.internal.ads.C3150hm) != false) goto L_0x072a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0750, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14086b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x075a, code lost:
        if ((r12 & r18) != 0) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x075c, code lost:
        r4 = com.google.android.gms.internal.ads.C3525um.m14087b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x07ac, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07ce, code lost:
        r3 = r3 + 4;
        r11 = r4;
        r4 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.f10527k != false) goto L_0x020d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8502b(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f10526j
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03b8
            sun.misc.Unsafe r2 = f10517a
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f10518b
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03b0
            int r14 = r0.m14467d((int) r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f10518b
            r3 = r3[r12]
            r14 = r14 & r8
            long r5 = (long) r14
            com.google.android.gms.internal.ads.Jm r14 = com.google.android.gms.internal.ads.C2434Jm.DOUBLE_LIST_PACKED
            int r14 = r14.mo8377a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.ads.Jm r14 = com.google.android.gms.internal.ads.C2434Jm.SINT64_LIST_PACKED
            int r14 = r14.mo8377a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f10518b
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x039c;
                case 1: goto L_0x0390;
                case 2: goto L_0x0380;
                case 3: goto L_0x0370;
                case 4: goto L_0x0360;
                case 5: goto L_0x0354;
                case 6: goto L_0x0348;
                case 7: goto L_0x033c;
                case 8: goto L_0x0325;
                case 9: goto L_0x0311;
                case 10: goto L_0x0300;
                case 11: goto L_0x02f1;
                case 12: goto L_0x02e2;
                case 13: goto L_0x02d7;
                case 14: goto L_0x02cc;
                case 15: goto L_0x02bd;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0299;
                case 18: goto L_0x028e;
                case 19: goto L_0x0285;
                case 20: goto L_0x027c;
                case 21: goto L_0x0273;
                case 22: goto L_0x026a;
                case 23: goto L_0x028e;
                case 24: goto L_0x0285;
                case 25: goto L_0x0261;
                case 26: goto L_0x0258;
                case 27: goto L_0x024b;
                case 28: goto L_0x0242;
                case 29: goto L_0x0239;
                case 30: goto L_0x0230;
                case 31: goto L_0x0285;
                case 32: goto L_0x028e;
                case 33: goto L_0x0227;
                case 34: goto L_0x021d;
                case 35: goto L_0x01fd;
                case 36: goto L_0x01ec;
                case 37: goto L_0x01db;
                case 38: goto L_0x01ca;
                case 39: goto L_0x01b9;
                case 40: goto L_0x01a8;
                case 41: goto L_0x0197;
                case 42: goto L_0x0185;
                case 43: goto L_0x0173;
                case 44: goto L_0x0161;
                case 45: goto L_0x014f;
                case 46: goto L_0x013d;
                case 47: goto L_0x012b;
                case 48: goto L_0x0119;
                case 49: goto L_0x010b;
                case 50: goto L_0x00fb;
                case 51: goto L_0x00f3;
                case 52: goto L_0x00eb;
                case 53: goto L_0x00df;
                case 54: goto L_0x00d3;
                case 55: goto L_0x00c7;
                case 56: goto L_0x00bf;
                case 57: goto L_0x00b7;
                case 58: goto L_0x00af;
                case 59: goto L_0x009f;
                case 60: goto L_0x0097;
                case 61: goto L_0x008f;
                case 62: goto L_0x0083;
                case 63: goto L_0x0077;
                case 64: goto L_0x006f;
                case 65: goto L_0x0067;
                case 66: goto L_0x005b;
                case 67: goto L_0x004f;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03aa
        L_0x0047:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x029f
        L_0x004f:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m14470e(r1, r5)
            goto L_0x02b8
        L_0x005b:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m14468d(r1, r5)
            goto L_0x02c7
        L_0x0067:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02d2
        L_0x006f:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x02dd
        L_0x0077:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m14468d(r1, r5)
            goto L_0x02ec
        L_0x0083:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m14468d(r1, r5)
            goto L_0x02fb
        L_0x008f:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0306
        L_0x0097:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            goto L_0x0317
        L_0x009f:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.C3150hm
            if (r6 == 0) goto L_0x0334
            goto L_0x0333
        L_0x00af:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0342
        L_0x00b7:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x034e
        L_0x00bf:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x035a
        L_0x00c7:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = m14468d(r1, r5)
            goto L_0x036a
        L_0x00d3:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m14470e(r1, r5)
            goto L_0x037a
        L_0x00df:
            boolean r14 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = m14470e(r1, r5)
            goto L_0x038a
        L_0x00eb:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x0396
        L_0x00f3:
            boolean r5 = r0.m14455a(r1, (int) r3, (int) r12)
            if (r5 == 0) goto L_0x03aa
            goto L_0x03a2
        L_0x00fb:
            com.google.android.gms.internal.ads.on r14 = r0.f10535s
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
            java.lang.Object r6 = r0.m14459b((int) r12)
            int r3 = r14.mo9827a(r3, r5, r6)
            goto L_0x0296
        L_0x010b:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.Ln r6 = r0.m14444a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10703b((int) r3, (java.util.List<com.google.android.gms.internal.ads.C3498tn>) r5, (com.google.android.gms.internal.ads.C2493Ln) r6)
            goto L_0x0296
        L_0x0119:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10711c(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x012b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10726g(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x013d:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x014f:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0161:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10715d(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0173:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10723f(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10735j(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x0197:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01a8:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01b9:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10719e(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ca:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10705b(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01db:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10688a((java.util.List<java.lang.Long>) r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01ec:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
            goto L_0x020d
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r5)
            if (r5 <= 0) goto L_0x03aa
            boolean r6 = r0.f10527k
            if (r6 == 0) goto L_0x0211
        L_0x020d:
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14097e((int) r3)
            int r6 = com.google.android.gms.internal.ads.C3525um.m14104g((int) r5)
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x0296
        L_0x021d:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10710c(r3, r5, r11)
            goto L_0x0296
        L_0x0227:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10725g(r3, r5, r11)
            goto L_0x0296
        L_0x0230:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10714d(r3, r5, r11)
            goto L_0x0296
        L_0x0239:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10722f(r3, r5, r11)
            goto L_0x0296
        L_0x0242:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10702b(r3, r5)
            goto L_0x0296
        L_0x024b:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            com.google.android.gms.internal.ads.Ln r6 = r0.m14444a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10686a((int) r3, (java.util.List<?>) r5, (com.google.android.gms.internal.ads.C2493Ln) r6)
            goto L_0x0296
        L_0x0258:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10685a((int) r3, (java.util.List<?>) r5)
            goto L_0x0296
        L_0x0261:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10734j(r3, r5, r11)
            goto L_0x0296
        L_0x026a:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10718e(r3, r5, r11)
            goto L_0x0296
        L_0x0273:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10704b((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0296
        L_0x027c:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10687a((int) r3, (java.util.List<java.lang.Long>) r5, (boolean) r11)
            goto L_0x0296
        L_0x0285:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10728h(r3, r5, r11)
            goto L_0x0296
        L_0x028e:
            java.util.List r5 = m14448a((java.lang.Object) r1, (long) r5)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10731i(r3, r5, r11)
        L_0x0296:
            int r13 = r13 + r3
            goto L_0x03aa
        L_0x0299:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x029f:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
            com.google.android.gms.internal.ads.tn r5 = (com.google.android.gms.internal.ads.C3498tn) r5
            com.google.android.gms.internal.ads.Ln r6 = r0.m14444a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C3525um.m14092c(r3, r5, r6)
            goto L_0x0296
        L_0x02ae:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.C3210jo.m12740b(r1, r5)
        L_0x02b8:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14102f((int) r3, (long) r5)
            goto L_0x0296
        L_0x02bd:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r1, (long) r5)
        L_0x02c7:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14109h((int) r3, (int) r5)
            goto L_0x0296
        L_0x02cc:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02d2:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14110h((int) r3, (long) r9)
            goto L_0x0296
        L_0x02d7:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x02dd:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14116j(r3, r11)
            goto L_0x0296
        L_0x02e2:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r1, (long) r5)
        L_0x02ec:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14118k(r3, r5)
            goto L_0x0296
        L_0x02f1:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r1, (long) r5)
        L_0x02fb:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14105g((int) r3, (int) r5)
            goto L_0x0296
        L_0x0300:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0306:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
        L_0x030a:
            com.google.android.gms.internal.ads.hm r5 = (com.google.android.gms.internal.ads.C3150hm) r5
            int r3 = com.google.android.gms.internal.ads.C3525um.m14091c((int) r3, (com.google.android.gms.internal.ads.C3150hm) r5)
            goto L_0x0296
        L_0x0311:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
        L_0x0317:
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
            com.google.android.gms.internal.ads.Ln r6 = r0.m14444a((int) r12)
            int r3 = com.google.android.gms.internal.ads.C2551Nn.m10684a((int) r3, (java.lang.Object) r5, (com.google.android.gms.internal.ads.C2493Ln) r6)
            goto L_0x0296
        L_0x0325:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.C3150hm
            if (r6 == 0) goto L_0x0334
        L_0x0333:
            goto L_0x030a
        L_0x0334:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.ads.C3525um.m14086b((int) r3, (java.lang.String) r5)
            goto L_0x0296
        L_0x033c:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0342:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14087b((int) r3, (boolean) r7)
            goto L_0x0296
        L_0x0348:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x034e:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14113i(r3, r11)
            goto L_0x0296
        L_0x0354:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x035a:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14106g((int) r3, (long) r9)
            goto L_0x0296
        L_0x0360:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r1, (long) r5)
        L_0x036a:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14101f((int) r3, (int) r5)
            goto L_0x0296
        L_0x0370:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.C3210jo.m12740b(r1, r5)
        L_0x037a:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14098e((int) r3, (long) r5)
            goto L_0x0296
        L_0x0380:
            boolean r14 = r0.m14454a(r1, (int) r12)
            if (r14 == 0) goto L_0x03aa
            long r5 = com.google.android.gms.internal.ads.C3210jo.m12740b(r1, r5)
        L_0x038a:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14094d((int) r3, (long) r5)
            goto L_0x0296
        L_0x0390:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x0396:
            int r3 = com.google.android.gms.internal.ads.C3525um.m14082b((int) r3, (float) r4)
            goto L_0x0296
        L_0x039c:
            boolean r5 = r0.m14454a(r1, (int) r12)
            if (r5 == 0) goto L_0x03aa
        L_0x03a2:
            r5 = 0
            int r3 = com.google.android.gms.internal.ads.C3525um.m14081b((int) r3, (double) r5)
            goto L_0x0296
        L_0x03aa:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03b0:
            com.google.android.gms.internal.ads.do<?, ?> r2 = r0.f10533q
            int r1 = m14439a(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03b8:
            sun.misc.Unsafe r2 = f10517a
            r3 = -1
            r6 = r3
            r3 = r11
            r5 = r3
            r12 = r5
        L_0x03bf:
            int[] r13 = r0.f10518b
            int r13 = r13.length
            if (r3 >= r13) goto L_0x07d5
            int r13 = r0.m14467d((int) r3)
            int[] r14 = r0.f10518b
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x03eb
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r6) goto L_0x03e8
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            goto L_0x03e9
        L_0x03e8:
            r14 = r6
        L_0x03e9:
            r6 = r14
            goto L_0x040b
        L_0x03eb:
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0408
            com.google.android.gms.internal.ads.Jm r9 = com.google.android.gms.internal.ads.C2434Jm.DOUBLE_LIST_PACKED
            int r9 = r9.mo8377a()
            if (r4 < r9) goto L_0x0408
            com.google.android.gms.internal.ads.Jm r9 = com.google.android.gms.internal.ads.C2434Jm.SINT64_LIST_PACKED
            int r9 = r9.mo8377a()
            if (r4 > r9) goto L_0x0408
            int[] r9 = r0.f10518b
            int r10 = r3 + 2
            r9 = r9[r10]
            r11 = r9 & r8
            goto L_0x0409
        L_0x0408:
            r11 = 0
        L_0x0409:
            r18 = 0
        L_0x040b:
            r9 = r13 & r8
            long r9 = (long) r9
            switch(r4) {
                case 0: goto L_0x07bf;
                case 1: goto L_0x07af;
                case 2: goto L_0x079d;
                case 3: goto L_0x078d;
                case 4: goto L_0x077d;
                case 5: goto L_0x076e;
                case 6: goto L_0x0762;
                case 7: goto L_0x0758;
                case 8: goto L_0x0743;
                case 9: goto L_0x0731;
                case 10: goto L_0x0722;
                case 11: goto L_0x0715;
                case 12: goto L_0x0708;
                case 13: goto L_0x06fd;
                case 14: goto L_0x06f2;
                case 15: goto L_0x06e5;
                case 16: goto L_0x06d8;
                case 17: goto L_0x06c5;
                case 18: goto L_0x06b1;
                case 19: goto L_0x06a3;
                case 20: goto L_0x0697;
                case 21: goto L_0x068b;
                case 22: goto L_0x067f;
                case 23: goto L_0x0673;
                case 24: goto L_0x06a3;
                case 25: goto L_0x0667;
                case 26: goto L_0x065c;
                case 27: goto L_0x064d;
                case 28: goto L_0x0641;
                case 29: goto L_0x0634;
                case 30: goto L_0x0627;
                case 31: goto L_0x06a3;
                case 32: goto L_0x0673;
                case 33: goto L_0x061a;
                case 34: goto L_0x060d;
                case 35: goto L_0x05ed;
                case 36: goto L_0x05dc;
                case 37: goto L_0x05cb;
                case 38: goto L_0x05ba;
                case 39: goto L_0x05a9;
                case 40: goto L_0x0598;
                case 41: goto L_0x0587;
                case 42: goto L_0x0575;
                case 43: goto L_0x0563;
                case 44: goto L_0x0551;
                case 45: goto L_0x053f;
                case 46: goto L_0x052d;
                case 47: goto L_0x051b;
                case 48: goto L_0x0509;
                case 49: goto L_0x04f9;
                case 50: goto L_0x04e9;
                case 51: goto L_0x04db;
                case 52: goto L_0x04ce;
                case 53: goto L_0x04be;
                case 54: goto L_0x04ae;
                case 55: goto L_0x049e;
                case 56: goto L_0x0490;
                case 57: goto L_0x0483;
                case 58: goto L_0x047b;
                case 59: goto L_0x046b;
                case 60: goto L_0x0463;
                case 61: goto L_0x045b;
                case 62: goto L_0x044f;
                case 63: goto L_0x0443;
                case 64: goto L_0x043b;
                case 65: goto L_0x0433;
                case 66: goto L_0x0427;
                case 67: goto L_0x041b;
                case 68: goto L_0x0413;
                default: goto L_0x0411;
            }
        L_0x0411:
            goto L_0x06bd
        L_0x0413:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x06c9
        L_0x041b:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            long r9 = m14470e(r1, r9)
            goto L_0x06e0
        L_0x0427:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            int r4 = m14468d(r1, r9)
            goto L_0x06ed
        L_0x0433:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x06f6
        L_0x043b:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x0701
        L_0x0443:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            int r4 = m14468d(r1, r9)
            goto L_0x0710
        L_0x044f:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            int r4 = m14468d(r1, r9)
            goto L_0x071d
        L_0x045b:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x0726
        L_0x0463:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x0735
        L_0x046b:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.C3150hm
            if (r9 == 0) goto L_0x0750
            goto L_0x074f
        L_0x047b:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            goto L_0x075c
        L_0x0483:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.C3525um.m14113i(r15, r4)
            goto L_0x0706
        L_0x0490:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.C3525um.m14106g((int) r15, (long) r9)
            goto L_0x06bc
        L_0x049e:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            int r4 = m14468d(r1, r9)
            int r4 = com.google.android.gms.internal.ads.C3525um.m14101f((int) r15, (int) r4)
            goto L_0x06bc
        L_0x04ae:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            long r9 = m14470e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.C3525um.m14098e((int) r15, (long) r9)
            goto L_0x06bc
        L_0x04be:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            long r9 = m14470e(r1, r9)
            int r4 = com.google.android.gms.internal.ads.C3525um.m14094d((int) r15, (long) r9)
            goto L_0x06bc
        L_0x04ce:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.C3525um.m14082b((int) r15, (float) r4)
            goto L_0x0706
        L_0x04db:
            boolean r4 = r0.m14455a(r1, (int) r15, (int) r3)
            if (r4 == 0) goto L_0x06bd
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.C3525um.m14081b((int) r15, (double) r9)
            goto L_0x06bc
        L_0x04e9:
            com.google.android.gms.internal.ads.on r4 = r0.f10535s
            java.lang.Object r9 = r2.getObject(r1, r9)
            java.lang.Object r10 = r0.m14459b((int) r3)
            int r4 = r4.mo9827a(r15, r9, r10)
            goto L_0x06bc
        L_0x04f9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r3)
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10703b((int) r15, (java.util.List<com.google.android.gms.internal.ads.C3498tn>) r4, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x06bc
        L_0x0509:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10711c(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x051b:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10726g(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x052d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x053f:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0551:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10715d(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0563:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10723f(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0575:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10735j(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0587:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x0598:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05a9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10719e(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05ba:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10705b(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05cb:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10688a((java.util.List<java.lang.Long>) r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05dc:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10729h(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
            goto L_0x05fd
        L_0x05ed:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10732i(r4)
            if (r4 <= 0) goto L_0x06bd
            boolean r9 = r0.f10527k
            if (r9 == 0) goto L_0x0601
        L_0x05fd:
            long r9 = (long) r11
            r2.putInt(r1, r9, r4)
        L_0x0601:
            int r9 = com.google.android.gms.internal.ads.C3525um.m14097e((int) r15)
            int r10 = com.google.android.gms.internal.ads.C3525um.m14104g((int) r4)
            int r9 = r9 + r10
            int r9 = r9 + r4
            goto L_0x0706
        L_0x060d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10710c(r15, r4, r11)
            goto L_0x06ae
        L_0x061a:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10725g(r15, r4, r11)
            goto L_0x06ae
        L_0x0627:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10714d(r15, r4, r11)
            goto L_0x06ae
        L_0x0634:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10722f(r15, r4, r11)
            goto L_0x06bc
        L_0x0641:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10702b(r15, r4)
            goto L_0x06bc
        L_0x064d:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r3)
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10686a((int) r15, (java.util.List<?>) r4, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x06bc
        L_0x065c:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10685a((int) r15, (java.util.List<?>) r4)
            goto L_0x06bc
        L_0x0667:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r11 = 0
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10734j(r15, r4, r11)
            goto L_0x06ae
        L_0x0673:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10731i(r15, r4, r11)
            goto L_0x06ae
        L_0x067f:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10718e(r15, r4, r11)
            goto L_0x06ae
        L_0x068b:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10704b((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x06ae
        L_0x0697:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10687a((int) r15, (java.util.List<java.lang.Long>) r4, (boolean) r11)
            goto L_0x06ae
        L_0x06a3:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10728h(r15, r4, r11)
        L_0x06ae:
            int r5 = r5 + r4
            r4 = r11
            goto L_0x06be
        L_0x06b1:
            r11 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10731i(r15, r4, r11)
        L_0x06bc:
            int r5 = r5 + r4
        L_0x06bd:
            r4 = 0
        L_0x06be:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07ce
        L_0x06c5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x06c9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.tn r4 = (com.google.android.gms.internal.ads.C3498tn) r4
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r3)
            int r4 = com.google.android.gms.internal.ads.C3525um.m14092c(r15, r4, r9)
            goto L_0x06bc
        L_0x06d8:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            long r9 = r2.getLong(r1, r9)
        L_0x06e0:
            int r4 = com.google.android.gms.internal.ads.C3525um.m14102f((int) r15, (long) r9)
            goto L_0x06bc
        L_0x06e5:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            int r4 = r2.getInt(r1, r9)
        L_0x06ed:
            int r4 = com.google.android.gms.internal.ads.C3525um.m14109h((int) r15, (int) r4)
            goto L_0x06bc
        L_0x06f2:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x06f6:
            r9 = 0
            int r4 = com.google.android.gms.internal.ads.C3525um.m14110h((int) r15, (long) r9)
            goto L_0x06bc
        L_0x06fd:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x0701:
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.C3525um.m14116j(r15, r4)
        L_0x0706:
            int r5 = r5 + r9
            goto L_0x06bd
        L_0x0708:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            int r4 = r2.getInt(r1, r9)
        L_0x0710:
            int r4 = com.google.android.gms.internal.ads.C3525um.m14118k(r15, r4)
            goto L_0x06bc
        L_0x0715:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            int r4 = r2.getInt(r1, r9)
        L_0x071d:
            int r4 = com.google.android.gms.internal.ads.C3525um.m14105g((int) r15, (int) r4)
            goto L_0x06bc
        L_0x0722:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x0726:
            java.lang.Object r4 = r2.getObject(r1, r9)
        L_0x072a:
            com.google.android.gms.internal.ads.hm r4 = (com.google.android.gms.internal.ads.C3150hm) r4
            int r4 = com.google.android.gms.internal.ads.C3525um.m14091c((int) r15, (com.google.android.gms.internal.ads.C3150hm) r4)
            goto L_0x06bc
        L_0x0731:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x0735:
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.ads.Ln r9 = r0.m14444a((int) r3)
            int r4 = com.google.android.gms.internal.ads.C2551Nn.m10684a((int) r15, (java.lang.Object) r4, (com.google.android.gms.internal.ads.C2493Ln) r9)
            goto L_0x06bc
        L_0x0743:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r9 = r4 instanceof com.google.android.gms.internal.ads.C3150hm
            if (r9 == 0) goto L_0x0750
        L_0x074f:
            goto L_0x072a
        L_0x0750:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.ads.C3525um.m14086b((int) r15, (java.lang.String) r4)
            goto L_0x06bc
        L_0x0758:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
        L_0x075c:
            int r4 = com.google.android.gms.internal.ads.C3525um.m14087b((int) r15, (boolean) r7)
            goto L_0x06bc
        L_0x0762:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x06bd
            r4 = 0
            int r9 = com.google.android.gms.internal.ads.C3525um.m14113i(r15, r4)
            int r5 = r5 + r9
            goto L_0x06be
        L_0x076e:
            r4 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x077a
            r13 = 0
            int r9 = com.google.android.gms.internal.ads.C3525um.m14106g((int) r15, (long) r13)
            goto L_0x07ac
        L_0x077a:
            r13 = 0
            goto L_0x07ad
        L_0x077d:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x07ad
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.ads.C3525um.m14101f((int) r15, (int) r9)
            goto L_0x07ac
        L_0x078d:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x07ad
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.C3525um.m14098e((int) r15, (long) r9)
            goto L_0x07ac
        L_0x079d:
            r4 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x07ad
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.ads.C3525um.m14094d((int) r15, (long) r9)
        L_0x07ac:
            int r5 = r5 + r9
        L_0x07ad:
            r9 = 0
            goto L_0x07bc
        L_0x07af:
            r4 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x07ad
            r9 = 0
            int r10 = com.google.android.gms.internal.ads.C3525um.m14082b((int) r15, (float) r9)
            int r5 = r5 + r10
        L_0x07bc:
            r10 = 0
            goto L_0x07ce
        L_0x07bf:
            r4 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x07bc
            r10 = 0
            int r15 = com.google.android.gms.internal.ads.C3525um.m14081b((int) r15, (double) r10)
            int r5 = r5 + r15
        L_0x07ce:
            int r3 = r3 + 4
            r11 = r4
            r4 = r9
            r9 = r13
            goto L_0x03bf
        L_0x07d5:
            com.google.android.gms.internal.ads.do<?, ?> r2 = r0.f10533q
            int r2 = m14439a(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f10524h
            if (r2 == 0) goto L_0x07eb
            com.google.android.gms.internal.ads.Dm<?> r2 = r0.f10534r
            com.google.android.gms.internal.ads.Gm r1 = r2.mo7995a((java.lang.Object) r1)
            int r1 = r1.mo8229h()
            int r5 = r5 + r1
        L_0x07eb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8502b(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.ads.C2551Nn.m10701a(com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6), com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.ads.C2551Nn.m10701a(com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6), com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.ads.C2551Nn.m10701a(com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6), com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.ads.C2551Nn.m10701a(com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6), com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12749c(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12749c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6) == com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.C2551Nn.m10701a(com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6), com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)) != false) goto L_0x01a3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo8503b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f10518b
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.m14467d((int) r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.m14469e((int) r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r4)
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = com.google.android.gms.internal.ads.C3210jo.m12757f(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.C3210jo.m12757f(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.C2551Nn.m10701a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = com.google.android.gms.internal.ads.C3210jo.m12749c(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.C3210jo.m12749c(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r10, (long) r6)
            int r5 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r11, (long) r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.m14466c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = com.google.android.gms.internal.ads.C3210jo.m12740b(r10, r6)
            long r6 = com.google.android.gms.internal.ads.C3210jo.m12740b(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = r1
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            com.google.android.gms.internal.ads.do<?, ?> r0 = r9.f10533q
            java.lang.Object r0 = r0.mo9320a((java.lang.Object) r10)
            com.google.android.gms.internal.ads.do<?, ?> r2 = r9.f10533q
            java.lang.Object r2 = r2.mo9320a((java.lang.Object) r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.f10524h
            if (r0 == 0) goto L_0x01d2
            com.google.android.gms.internal.ads.Dm<?> r0 = r9.f10534r
            com.google.android.gms.internal.ads.Gm r10 = r0.mo7995a((java.lang.Object) r10)
            com.google.android.gms.internal.ads.Dm<?> r0 = r9.f10534r
            com.google.android.gms.internal.ads.Gm r11 = r0.mo7995a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8503b(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final void mo8504c(T t) {
        int[] iArr = this.f10529m;
        if (iArr != null) {
            for (int d : iArr) {
                long d2 = (long) (m14467d(d) & 1048575);
                Object f = C3210jo.m12757f(t, d2);
                if (f != null) {
                    this.f10535s.mo9830b(f);
                    C3210jo.m12735a((Object) t, d2, f);
                }
            }
        }
        int[] iArr2 = this.f10530n;
        if (iArr2 != null) {
            for (int i : iArr2) {
                this.f10532p.mo9397b(t, (long) i);
            }
        }
        this.f10533q.mo9335d(t);
        if (this.f10524h) {
            this.f10534r.mo8003c(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m14468d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m14470e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.ads.C2641Qm.m10985a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.ads.C2641Qm.m10984a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo8505d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f10518b
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.m14467d((int) r1)
            int[] r4 = r8.f10518b
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = m14473f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m14468d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m14470e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = m14464c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.m14455a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = m14458b(r9, (long) r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.C3210jo.m12757f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.C3210jo.m12749c(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.ads.C2641Qm.m10985a((boolean) r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.C3210jo.m12727a((java.lang.Object) r9, (long) r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.C3210jo.m12740b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.C3210jo.m12750d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.C3210jo.m12754e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.ads.C2641Qm.m10984a((long) r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.do<?, ?> r0 = r8.f10533q
            java.lang.Object r0 = r0.mo9320a((java.lang.Object) r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f10524h
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.Dm<?> r0 = r8.f10534r
            com.google.android.gms.internal.ads.Gm r9 = r0.mo7995a((java.lang.Object) r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3612xn.mo8505d(java.lang.Object):int");
    }
}
