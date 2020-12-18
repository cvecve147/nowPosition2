package p101d.p129g.p159f.p184i.p186b;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.i.b.f */
public class C5910f {

    /* renamed from: a */
    private final C5775b f16337a;

    /* renamed from: b */
    private final List<C5908d> f16338b = new ArrayList();

    /* renamed from: c */
    private boolean f16339c;

    /* renamed from: d */
    private final int[] f16340d = new int[5];

    /* renamed from: e */
    private final C5920p f16341e;

    /* renamed from: d.g.f.i.b.f$a */
    private static final class C5911a implements Comparator<C5908d>, Serializable {

        /* renamed from: a */
        private final float f16342a;

        private C5911a(float f) {
            this.f16342a = f;
        }

        /* renamed from: a */
        public int compare(C5908d dVar, C5908d dVar2) {
            if (dVar2.mo15681c() != dVar.mo15681c()) {
                return dVar2.mo15681c() - dVar.mo15681c();
            }
            float abs = Math.abs(dVar2.mo15682d() - this.f16342a);
            float abs2 = Math.abs(dVar.mo15682d() - this.f16342a);
            if (abs < abs2) {
                return 1;
            }
            return abs == abs2 ? 0 : -1;
        }
    }

    /* renamed from: d.g.f.i.b.f$b */
    private static final class C5912b implements Comparator<C5908d>, Serializable {

        /* renamed from: a */
        private final float f16343a;

        private C5912b(float f) {
            this.f16343a = f;
        }

        /* renamed from: a */
        public int compare(C5908d dVar, C5908d dVar2) {
            float abs = Math.abs(dVar2.mo15682d() - this.f16343a);
            float abs2 = Math.abs(dVar.mo15682d() - this.f16343a);
            if (abs < abs2) {
                return -1;
            }
            return abs == abs2 ? 0 : 1;
        }
    }

    public C5910f(C5775b bVar, C5920p pVar) {
        this.f16337a = bVar;
        this.f16341e = pVar;
    }

    /* renamed from: a */
    private static float m22384a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    /* renamed from: a */
    private int m22385a() {
        if (this.f16338b.size() <= 1) {
            return 0;
        }
        C5908d dVar = null;
        for (C5908d next : this.f16338b) {
            if (next.mo15681c() >= 2) {
                if (dVar == null) {
                    dVar = next;
                } else {
                    this.f16339c = true;
                    return ((int) (Math.abs(dVar.mo15702a() - next.mo15702a()) - Math.abs(dVar.mo15703b() - next.mo15703b()))) / 2;
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2 A[LOOP:4: B:41:0x00a2->B:49:0x00b7, LOOP_START, PHI: r10 
      PHI: (r10v2 int) = (r10v1 int), (r10v5 int) binds: [B:40:0x009e, B:49:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ca A[LOOP:5: B:55:0x00ca->B:63:0x00df, LOOP_START, PHI: r10 
      PHI: (r10v3 int) = (r10v2 int), (r10v4 int) binds: [B:54:0x00c7, B:63:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22386a(int r17, int r18, int r19, int r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int[] r4 = r16.m22389b()
            r5 = 0
            r6 = r5
        L_0x000e:
            r7 = 2
            r8 = 1
            if (r1 < r6) goto L_0x0028
            if (r2 < r6) goto L_0x0028
            d.g.f.c.b r9 = r0.f16337a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo15389b((int) r10, (int) r11)
            if (r9 == 0) goto L_0x0028
            r9 = r4[r7]
            int r9 = r9 + r8
            r4[r7] = r9
            int r6 = r6 + 1
            goto L_0x000e
        L_0x0028:
            if (r1 < r6) goto L_0x010b
            if (r2 >= r6) goto L_0x002e
            goto L_0x010b
        L_0x002e:
            if (r1 < r6) goto L_0x004a
            if (r2 < r6) goto L_0x004a
            d.g.f.c.b r9 = r0.f16337a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo15389b((int) r10, (int) r11)
            if (r9 != 0) goto L_0x004a
            r9 = r4[r8]
            if (r9 > r3) goto L_0x004a
            r9 = r4[r8]
            int r9 = r9 + r8
            r4[r8] = r9
            int r6 = r6 + 1
            goto L_0x002e
        L_0x004a:
            if (r1 < r6) goto L_0x010b
            if (r2 < r6) goto L_0x010b
            r9 = r4[r8]
            if (r9 <= r3) goto L_0x0054
            goto L_0x010b
        L_0x0054:
            if (r1 < r6) goto L_0x0070
            if (r2 < r6) goto L_0x0070
            d.g.f.c.b r9 = r0.f16337a
            int r10 = r2 - r6
            int r11 = r1 - r6
            boolean r9 = r9.mo15389b((int) r10, (int) r11)
            if (r9 == 0) goto L_0x0070
            r9 = r4[r5]
            if (r9 > r3) goto L_0x0070
            r9 = r4[r5]
            int r9 = r9 + r8
            r4[r5] = r9
            int r6 = r6 + 1
            goto L_0x0054
        L_0x0070:
            r6 = r4[r5]
            if (r6 <= r3) goto L_0x0075
            return r5
        L_0x0075:
            d.g.f.c.b r6 = r0.f16337a
            int r6 = r6.mo15395f()
            d.g.f.c.b r9 = r0.f16337a
            int r9 = r9.mo15397h()
            r10 = r8
        L_0x0082:
            int r11 = r1 + r10
            if (r11 >= r6) goto L_0x009a
            int r12 = r2 + r10
            if (r12 >= r9) goto L_0x009a
            d.g.f.c.b r13 = r0.f16337a
            boolean r12 = r13.mo15389b((int) r12, (int) r11)
            if (r12 == 0) goto L_0x009a
            r11 = r4[r7]
            int r11 = r11 + r8
            r4[r7] = r11
            int r10 = r10 + 1
            goto L_0x0082
        L_0x009a:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 < r9) goto L_0x00a2
            goto L_0x010b
        L_0x00a2:
            int r11 = r1 + r10
            r12 = 3
            if (r11 >= r6) goto L_0x00bf
            int r13 = r2 + r10
            if (r13 >= r9) goto L_0x00bf
            d.g.f.c.b r14 = r0.f16337a
            boolean r13 = r14.mo15389b((int) r13, (int) r11)
            if (r13 != 0) goto L_0x00bf
            r13 = r4[r12]
            if (r13 >= r3) goto L_0x00bf
            r11 = r4[r12]
            int r11 = r11 + r8
            r4[r12] = r11
            int r10 = r10 + 1
            goto L_0x00a2
        L_0x00bf:
            if (r11 >= r6) goto L_0x010b
            int r11 = r2 + r10
            if (r11 >= r9) goto L_0x010b
            r11 = r4[r12]
            if (r11 < r3) goto L_0x00ca
            goto L_0x010b
        L_0x00ca:
            int r11 = r1 + r10
            r13 = 4
            if (r11 >= r6) goto L_0x00e7
            int r14 = r2 + r10
            if (r14 >= r9) goto L_0x00e7
            d.g.f.c.b r15 = r0.f16337a
            boolean r11 = r15.mo15389b((int) r14, (int) r11)
            if (r11 == 0) goto L_0x00e7
            r11 = r4[r13]
            if (r11 >= r3) goto L_0x00e7
            r11 = r4[r13]
            int r11 = r11 + r8
            r4[r13] = r11
            int r10 = r10 + 1
            goto L_0x00ca
        L_0x00e7:
            r1 = r4[r13]
            if (r1 < r3) goto L_0x00ec
            return r5
        L_0x00ec:
            r1 = r4[r5]
            r2 = r4[r8]
            int r1 = r1 + r2
            r2 = r4[r7]
            int r1 = r1 + r2
            r2 = r4[r12]
            int r1 = r1 + r2
            r2 = r4[r13]
            int r1 = r1 + r2
            int r1 = r1 - r20
            int r1 = java.lang.Math.abs(r1)
            int r2 = r20 * 2
            if (r1 >= r2) goto L_0x010b
            boolean r1 = m22387a((int[]) r4)
            if (r1 == 0) goto L_0x010b
            r5 = r8
        L_0x010b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p184i.p186b.C5910f.m22386a(int, int, int, int):boolean");
    }

    /* renamed from: a */
    protected static boolean m22387a(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = ((float) i) / 7.0f;
        float f2 = f / 2.0f;
        return Math.abs(f - ((float) iArr[0])) < f2 && Math.abs(f - ((float) iArr[1])) < f2 && Math.abs((f * 3.0f) - ((float) iArr[2])) < 3.0f * f2 && Math.abs(f - ((float) iArr[3])) < f2 && Math.abs(f - ((float) iArr[4])) < f2;
    }

    /* renamed from: b */
    private float m22388b(int i, int i2, int i3, int i4) {
        C5775b bVar = this.f16337a;
        int h = bVar.mo15397h();
        int[] b = m22389b();
        int i5 = i;
        while (i5 >= 0 && bVar.mo15389b(i5, i2)) {
            b[2] = b[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo15389b(i5, i2) && b[1] <= i3) {
            b[1] = b[1] + 1;
            i5--;
        }
        if (i5 < 0 || b[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bVar.mo15389b(i5, i2) && b[0] <= i3) {
            b[0] = b[0] + 1;
            i5--;
        }
        if (b[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < h && bVar.mo15389b(i6, i2)) {
            b[2] = b[2] + 1;
            i6++;
        }
        if (i6 == h) {
            return Float.NaN;
        }
        while (i6 < h && !bVar.mo15389b(i6, i2) && b[3] < i3) {
            b[3] = b[3] + 1;
            i6++;
        }
        if (i6 == h || b[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < h && bVar.mo15389b(i6, i2) && b[4] < i3) {
            b[4] = b[4] + 1;
            i6++;
        }
        if (b[4] < i3 && Math.abs(((((b[0] + b[1]) + b[2]) + b[3]) + b[4]) - i4) * 5 < i4 && m22387a(b)) {
            return m22384a(b, i6);
        }
        return Float.NaN;
    }

    /* renamed from: b */
    private int[] m22389b() {
        int[] iArr = this.f16340d;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        return iArr;
    }

    /* renamed from: c */
    private float m22390c(int i, int i2, int i3, int i4) {
        C5775b bVar = this.f16337a;
        int f = bVar.mo15395f();
        int[] b = m22389b();
        int i5 = i;
        while (i5 >= 0 && bVar.mo15389b(i2, i5)) {
            b[2] = b[2] + 1;
            i5--;
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo15389b(i2, i5) && b[1] <= i3) {
            b[1] = b[1] + 1;
            i5--;
        }
        if (i5 < 0 || b[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && bVar.mo15389b(i2, i5) && b[0] <= i3) {
            b[0] = b[0] + 1;
            i5--;
        }
        if (b[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < f && bVar.mo15389b(i2, i6)) {
            b[2] = b[2] + 1;
            i6++;
        }
        if (i6 == f) {
            return Float.NaN;
        }
        while (i6 < f && !bVar.mo15389b(i2, i6) && b[3] < i3) {
            b[3] = b[3] + 1;
            i6++;
        }
        if (i6 == f || b[3] >= i3) {
            return Float.NaN;
        }
        while (i6 < f && bVar.mo15389b(i2, i6) && b[4] < i3) {
            b[4] = b[4] + 1;
            i6++;
        }
        if (b[4] < i3 && Math.abs(((((b[0] + b[1]) + b[2]) + b[3]) + b[4]) - i4) * 5 < i4 * 2 && m22387a(b)) {
            return m22384a(b, i6);
        }
        return Float.NaN;
    }

    /* renamed from: c */
    private boolean m22391c() {
        int size = this.f16338b.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (C5908d next : this.f16338b) {
            if (next.mo15681c() >= 2) {
                i++;
                f2 += next.mo15682d();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (C5908d d : this.f16338b) {
            f += Math.abs(d.mo15682d() - f3);
        }
        return f <= f2 * 0.05f;
    }

    /* renamed from: d */
    private C5908d[] m22392d() {
        int size = this.f16338b.size();
        if (size >= 3) {
            float f = 0.0f;
            if (size > 3) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (C5908d d : this.f16338b) {
                    float d2 = d.mo15682d();
                    f2 += d2;
                    f3 += d2 * d2;
                }
                float f4 = (float) size;
                float f5 = f2 / f4;
                float sqrt = (float) Math.sqrt((double) ((f3 / f4) - (f5 * f5)));
                Collections.sort(this.f16338b, new C5912b(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f16338b.size() && this.f16338b.size() > 3) {
                    if (Math.abs(this.f16338b.get(i).mo15682d() - f5) > max) {
                        this.f16338b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f16338b.size() > 3) {
                for (C5908d d3 : this.f16338b) {
                    f += d3.mo15682d();
                }
                Collections.sort(this.f16338b, new C5911a(f / ((float) this.f16338b.size())));
                List<C5908d> list = this.f16338b;
                list.subList(3, list.size()).clear();
            }
            return new C5908d[]{this.f16338b.get(0), this.f16338b.get(1), this.f16338b.get(2)};
        }
        throw C5882i.m22303a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C5913g mo15683a(Map<C5806e, ?> map) {
        Map<C5806e, ?> map2 = map;
        boolean z = map2 != null && map2.containsKey(C5806e.TRY_HARDER);
        boolean z2 = map2 != null && map2.containsKey(C5806e.PURE_BARCODE);
        int f = this.f16337a.mo15395f();
        int h = this.f16337a.mo15397h();
        int i = (f * 3) / 228;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        int i3 = i;
        boolean z3 = false;
        while (i2 < f && !z3) {
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            iArr[4] = 0;
            boolean z4 = z3;
            int i4 = i3;
            int i5 = 0;
            int i6 = 0;
            while (i5 < h) {
                if (this.f16337a.mo15389b(i5, i2)) {
                    if ((i6 & 1) == 1) {
                        i6++;
                    }
                    iArr[i6] = iArr[i6] + 1;
                } else if ((i6 & 1) != 0) {
                    iArr[i6] = iArr[i6] + 1;
                } else if (i6 == 4) {
                    if (!m22387a(iArr)) {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    } else if (mo15684a(iArr, i2, i5, z2)) {
                        if (this.f16339c) {
                            z4 = m22391c();
                        } else {
                            int a = m22385a();
                            if (a > iArr[2]) {
                                i2 += (a - iArr[2]) - 2;
                                i5 = h - 1;
                            }
                        }
                        iArr[0] = 0;
                        iArr[1] = 0;
                        iArr[2] = 0;
                        iArr[3] = 0;
                        iArr[4] = 0;
                        i6 = 0;
                        i4 = 2;
                    } else {
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[3];
                        iArr[2] = iArr[4];
                        iArr[3] = 1;
                        iArr[4] = 0;
                    }
                    i6 = 3;
                } else {
                    i6++;
                    iArr[i6] = iArr[i6] + 1;
                }
                i5++;
            }
            if (!m22387a(iArr) || !mo15684a(iArr, i2, h, z2)) {
                i3 = i4;
            } else {
                int i7 = iArr[0];
                if (this.f16339c) {
                    i3 = i7;
                    z3 = m22391c();
                    i2 += i3;
                } else {
                    i3 = i7;
                }
            }
            z3 = z4;
            i2 += i3;
        }
        C5908d[] d = m22392d();
        C5919o.m22415a(d);
        return new C5913g(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo15684a(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a = (int) m22384a(iArr, i2);
        float c = m22390c(i, a, iArr[2], i3);
        if (!Float.isNaN(c)) {
            int i4 = (int) c;
            float b = m22388b(a, i4, iArr[2], i3);
            if (!Float.isNaN(b) && (!z || m22386a(i4, (int) b, iArr[2], i3))) {
                float f = ((float) i3) / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f16338b.size()) {
                        break;
                    }
                    C5908d dVar = this.f16338b.get(i5);
                    if (dVar.mo15679a(f, c, b)) {
                        this.f16338b.set(i5, dVar.mo15680b(c, b, f));
                        z2 = true;
                        break;
                    }
                    i5++;
                }
                if (!z2) {
                    C5908d dVar2 = new C5908d(b, c, f);
                    this.f16338b.add(dVar2);
                    C5920p pVar = this.f16341e;
                    if (pVar != null) {
                        pVar.mo11732a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }
}
