package p101d.p129g.p159f.p180h.p183b;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.h.b.a */
public final class C5879a {

    /* renamed from: a */
    private static final int[] f16266a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f16267b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f16268c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f16269d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: a */
    private static float m22290a(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: a */
    public static C5880b m22291a(C5771c cVar, Map<C5806e, ?> map, boolean z) {
        C5775b a = cVar.mo15362a();
        List<C5919o[]> a2 = m22292a(z, a);
        if (a2.isEmpty()) {
            a = a.clone();
            a.mo15399i();
            a2 = m22292a(z, a);
        }
        return new C5880b(a, a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r4.hasNext() == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r5 = (p101d.p129g.p159f.C5919o[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r5[1] == null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo15703b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r5[3] == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo15703b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 != 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<p101d.p129g.p159f.C5919o[]> m22292a(boolean r8, p101d.p129g.p159f.p167c.C5775b r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            r5 = r4
        L_0x000a:
            int r6 = r9.mo15395f()
            if (r3 >= r6) goto L_0x007b
            d.g.f.o[] r4 = m22295a((p101d.p129g.p159f.p167c.C5775b) r9, (int) r3, (int) r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0054
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0054
            if (r5 != 0) goto L_0x0020
            goto L_0x007b
        L_0x0020:
            java.util.Iterator r4 = r0.iterator()
        L_0x0024:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            d.g.f.o[] r5 = (p101d.p129g.p159f.C5919o[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x0040
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo15703b()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x0040:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0024
            r5 = r5[r6]
            float r5 = r5.mo15703b()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0024
        L_0x0050:
            int r3 = r3 + 5
            r4 = r2
            goto L_0x0009
        L_0x0054:
            r0.add(r4)
            if (r8 != 0) goto L_0x005a
            goto L_0x007b
        L_0x005a:
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0069
            r5 = r4[r3]
            float r5 = r5.mo15702a()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x0073
        L_0x0069:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo15702a()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x0073:
            float r3 = r3.mo15703b()
            int r3 = (int) r3
            r4 = r5
            r5 = r1
            goto L_0x000a
        L_0x007b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p180h.p183b.C5879a.m22292a(boolean, d.g.f.c.b):java.util.List");
    }

    /* renamed from: a */
    private static void m22293a(C5919o[] oVarArr, C5919o[] oVarArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            oVarArr[iArr[i]] = oVarArr2[i];
        }
    }

    /* renamed from: a */
    private static int[] m22294a(C5775b bVar, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int length = iArr.length;
        int i4 = 0;
        while (bVar.mo15389b(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int i6 = i;
        boolean z2 = z;
        int i7 = 0;
        while (true) {
            boolean z3 = true;
            if (i < i3) {
                if (bVar.mo15389b(i, i2) ^ z2) {
                    iArr2[i7] = iArr2[i7] + 1;
                } else {
                    int i8 = length - 1;
                    if (i7 != i8) {
                        i7++;
                    } else if (m22290a(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i6, i};
                    } else {
                        i6 += iArr2[0] + iArr2[1];
                        int i9 = length - 2;
                        System.arraycopy(iArr2, 2, iArr2, 0, i9);
                        iArr2[i9] = 0;
                        iArr2[i8] = 0;
                        i7--;
                    }
                    iArr2[i7] = 1;
                    if (z2) {
                        z3 = false;
                    }
                    z2 = z3;
                }
                i++;
            } else if (i7 != length - 1 || m22290a(iArr2, iArr, 0.8f) >= 0.42f) {
                return null;
            } else {
                return new int[]{i6, i - 1};
            }
        }
    }

    /* renamed from: a */
    private static C5919o[] m22295a(C5775b bVar, int i, int i2) {
        int f = bVar.mo15395f();
        int h = bVar.mo15397h();
        C5919o[] oVarArr = new C5919o[8];
        m22293a(oVarArr, m22296a(bVar, f, h, i, i2, f16268c), f16266a);
        if (oVarArr[4] != null) {
            i2 = (int) oVarArr[4].mo15702a();
            i = (int) oVarArr[4].mo15703b();
        }
        m22293a(oVarArr, m22296a(bVar, f, h, i, i2, f16269d), f16267b);
        return oVarArr;
    }

    /* renamed from: a */
    private static C5919o[] m22296a(C5775b bVar, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z;
        int i6;
        int[] iArr2;
        int i7 = i;
        C5919o[] oVarArr = new C5919o[4];
        int[] iArr3 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i7) {
                z = false;
                break;
            }
            int[] a = m22294a(bVar, i4, i8, i2, false, iArr, iArr3);
            if (a != null) {
                while (true) {
                    iArr2 = a;
                    if (i8 <= 0) {
                        break;
                    }
                    i8--;
                    a = m22294a(bVar, i4, i8, i2, false, iArr, iArr3);
                    if (a == null) {
                        i8++;
                        break;
                    }
                }
                float f = (float) i8;
                oVarArr[0] = new C5919o((float) iArr2[0], f);
                oVarArr[1] = new C5919o((float) iArr2[1], f);
                z = true;
            } else {
                i8 += 5;
            }
        }
        int i9 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) oVarArr[0].mo15702a(), (int) oVarArr[1].mo15702a()};
            int i10 = i9;
            int i11 = 0;
            while (true) {
                if (i10 >= i7) {
                    i6 = i11;
                    break;
                }
                i6 = i11;
                int[] a2 = m22294a(bVar, iArr4[0], i10, i2, false, iArr, iArr3);
                if (a2 != null && Math.abs(iArr4[0] - a2[0]) < 5 && Math.abs(iArr4[1] - a2[1]) < 5) {
                    iArr4 = a2;
                    i11 = 0;
                } else if (i6 > 25) {
                    break;
                } else {
                    i11 = i6 + 1;
                }
                i10++;
            }
            i9 = i10 - (i6 + 1);
            float f2 = (float) i9;
            oVarArr[2] = new C5919o((float) iArr4[0], f2);
            oVarArr[3] = new C5919o((float) iArr4[1], f2);
        }
        if (i9 - i8 < 10) {
            for (i5 = 0; i5 < oVarArr.length; i5++) {
                oVarArr[i5] = null;
            }
        }
        return oVarArr;
    }
}
