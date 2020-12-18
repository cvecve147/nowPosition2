package p101d.p111d.p112a.p116c;

import p101d.p111d.p112a.C5246f;

/* renamed from: d.d.a.c.c */
public class C5241c {
    /* renamed from: a */
    public static float m20238a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (p101d.p111d.p112a.C5246f.m20301b(r5, r8) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
        if (p101d.p111d.p112a.C5246f.m20301b(r5, r8) == false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20239a(p101d.p111d.p112a.C5246f r4, p101d.p111d.p112a.C5246f r5, float r6, float r7, p101d.p111d.p112a.C5246f r8, float r9, float r10, float r11) {
        /*
            r4.mo14550a((p101d.p111d.p112a.C5246f) r5)
            float r0 = r5.mo14560e()
            float r1 = r8.mo14560e()
            boolean r0 = p101d.p111d.p112a.C5246f.m20301b(r0, r1)
            if (r0 != 0) goto L_0x0020
            float r0 = r5.mo14560e()
            float r1 = r8.mo14560e()
            float r0 = m20238a(r0, r1, r11)
            r4.mo14559d(r0, r6, r7)
        L_0x0020:
            float r5 = r5.mo14551b()
            float r8 = r8.mo14551b()
            r0 = 2143289344(0x7fc00000, float:NaN)
            float r1 = r5 - r8
            float r1 = java.lang.Math.abs(r1)
            r2 = 1127481344(0x43340000, float:180.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r2 = 0
            if (r1 > 0) goto L_0x0042
            boolean r1 = p101d.p111d.p112a.C5246f.m20301b(r5, r8)
            if (r1 != 0) goto L_0x0055
        L_0x003d:
            float r0 = m20238a(r5, r8, r11)
            goto L_0x0055
        L_0x0042:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r3 = 1135869952(0x43b40000, float:360.0)
            if (r1 >= 0) goto L_0x0049
            float r5 = r5 + r3
        L_0x0049:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x004e
            float r8 = r8 + r3
        L_0x004e:
            boolean r1 = p101d.p111d.p112a.C5246f.m20301b(r5, r8)
            if (r1 != 0) goto L_0x0055
            goto L_0x003d
        L_0x0055:
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L_0x005e
            r4.mo14552b(r0, r6, r7)
        L_0x005e:
            float r9 = r9 - r6
            float r5 = m20238a(r2, r9, r11)
            float r10 = r10 - r7
            float r6 = m20238a(r2, r10, r11)
            r4.mo14555c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p111d.p112a.p116c.C5241c.m20239a(d.d.a.f, d.d.a.f, float, float, d.d.a.f, float, float, float):void");
    }

    /* renamed from: a */
    public static void m20240a(C5246f fVar, C5246f fVar2, C5246f fVar3, float f) {
        m20239a(fVar, fVar2, fVar2.mo14554c(), fVar2.mo14557d(), fVar3, fVar3.mo14554c(), fVar3.mo14557d(), f);
    }

    /* renamed from: b */
    public static float m20241b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }
}
