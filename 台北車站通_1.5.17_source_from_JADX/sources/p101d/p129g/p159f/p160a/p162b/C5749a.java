package p101d.p129g.p159f.p160a.p162b;

import org.apache.http.message.TokenParser;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p160a.C5744a;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5786i;
import p101d.p129g.p159f.p167c.p168a.C5773a;
import p101d.p129g.p159f.p167c.p168a.C5774b;
import p101d.p129g.p159f.p167c.p169b.C5776a;
import p101d.p129g.p159f.p167c.p169b.C5778c;
import p101d.p129g.p159f.p167c.p169b.C5779d;

/* renamed from: d.g.f.a.b.a */
public final class C5749a {

    /* renamed from: a */
    private static final int[] f15891a = {3808, 476, 2107, 1799};

    /* renamed from: b */
    private final C5775b f15892b;

    /* renamed from: c */
    private boolean f15893c;

    /* renamed from: d */
    private int f15894d;

    /* renamed from: e */
    private int f15895e;

    /* renamed from: f */
    private int f15896f;

    /* renamed from: g */
    private int f15897g;

    /* renamed from: d.g.f.a.b.a$a */
    static final class C5750a {

        /* renamed from: a */
        private final int f15898a;

        /* renamed from: b */
        private final int f15899b;

        C5750a(int i, int i2) {
            this.f15898a = i;
            this.f15899b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo15337a() {
            return this.f15898a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15338b() {
            return this.f15899b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C5919o mo15339c() {
            return new C5919o((float) mo15337a(), (float) mo15338b());
        }

        public String toString() {
            return "<" + this.f15898a + TokenParser.f19315SP + this.f15899b + '>';
        }
    }

    public C5749a(C5775b bVar) {
        this.f15892b = bVar;
    }

    /* renamed from: a */
    private static float m21715a(C5750a aVar, C5750a aVar2) {
        return C5773a.m21795a(aVar.mo15337a(), aVar.mo15338b(), aVar2.mo15337a(), aVar2.mo15338b());
    }

    /* renamed from: a */
    private static float m21716a(C5919o oVar, C5919o oVar2) {
        return C5773a.m21794a(oVar.mo15702a(), oVar.mo15703b(), oVar2.mo15702a(), oVar2.mo15703b());
    }

    /* renamed from: a */
    private int m21717a() {
        if (this.f15893c) {
            return (this.f15894d * 4) + 11;
        }
        int i = this.f15894d;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: a */
    private static int m21718a(long j, boolean z) {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new C5778c(C5776a.f15954d).mo15420a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (C5779d unused) {
            throw C5882i.m22303a();
        }
    }

    /* renamed from: a */
    private int m21719a(C5919o oVar, C5919o oVar2, int i) {
        float a = m21716a(oVar, oVar2);
        float f = a / ((float) i);
        float a2 = oVar.mo15702a();
        float b = oVar.mo15703b();
        float a3 = ((oVar2.mo15702a() - oVar.mo15702a()) * f) / a;
        float b2 = (f * (oVar2.mo15703b() - oVar.mo15703b())) / a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f15892b.mo15389b(C5773a.m21796a((f2 * a3) + a2), C5773a.m21796a((f2 * b2) + b))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m21720a(int[] iArr, int i) {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f15891a[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private C5750a m21721a(C5750a aVar, boolean z, int i, int i2) {
        int a = aVar.mo15337a() + i;
        int b = aVar.mo15338b();
        while (true) {
            b += i2;
            if (!m21724a(a, b) || this.f15892b.mo15389b(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (m21724a(i32, i42) && this.f15892b.mo15389b(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (m21724a(i5, i42) && this.f15892b.mo15389b(i5, i42) == z) {
            i42 += i2;
        }
        return new C5750a(i5, i42 - i2);
    }

    /* renamed from: a */
    private C5775b m21722a(C5775b bVar, C5919o oVar, C5919o oVar2, C5919o oVar3, C5919o oVar4) {
        C5786i a = C5786i.m21861a();
        int a2 = m21717a();
        int i = a2;
        int i2 = a2;
        float f = ((float) a2) / 2.0f;
        int i3 = this.f15896f;
        float f2 = f - ((float) i3);
        float f3 = f + ((float) i3);
        return a.mo15436a(bVar, i2, i, f2, f2, f3, f2, f3, f3, f2, f3, oVar.mo15702a(), oVar.mo15703b(), oVar2.mo15702a(), oVar2.mo15703b(), oVar3.mo15702a(), oVar3.mo15703b(), oVar4.mo15702a(), oVar4.mo15703b());
    }

    /* renamed from: a */
    private void m21723a(C5919o[] oVarArr) {
        int i;
        long j;
        long j2;
        if (!m21726a(oVarArr[0]) || !m21726a(oVarArr[1]) || !m21726a(oVarArr[2]) || !m21726a(oVarArr[3])) {
            throw C5882i.m22303a();
        }
        int i2 = this.f15896f * 2;
        int[] iArr = {m21719a(oVarArr[0], oVarArr[1], i2), m21719a(oVarArr[1], oVarArr[2], i2), m21719a(oVarArr[2], oVarArr[3], i2), m21719a(oVarArr[3], oVarArr[0], i2)};
        this.f15897g = m21720a(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f15897g + i3) % 4];
            if (this.f15893c) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int a = m21718a(j3, this.f15893c);
        if (this.f15893c) {
            this.f15894d = (a >> 6) + 1;
            i = a & 63;
        } else {
            this.f15894d = (a >> 11) + 1;
            i = a & 2047;
        }
        this.f15895e = i + 1;
    }

    /* renamed from: a */
    private boolean m21724a(int i, int i2) {
        return i >= 0 && i < this.f15892b.mo15397h() && i2 > 0 && i2 < this.f15892b.mo15395f();
    }

    /* renamed from: a */
    private boolean m21725a(C5750a aVar, C5750a aVar2, C5750a aVar3, C5750a aVar4) {
        C5750a aVar5 = new C5750a(aVar.mo15337a() - 3, aVar.mo15338b() + 3);
        C5750a aVar6 = new C5750a(aVar2.mo15337a() - 3, aVar2.mo15338b() - 3);
        C5750a aVar7 = new C5750a(aVar3.mo15337a() + 3, aVar3.mo15338b() - 3);
        C5750a aVar8 = new C5750a(aVar4.mo15337a() + 3, aVar4.mo15338b() + 3);
        int b = m21729b(aVar8, aVar5);
        return b != 0 && m21729b(aVar5, aVar6) == b && m21729b(aVar6, aVar7) == b && m21729b(aVar7, aVar8) == b;
    }

    /* renamed from: a */
    private boolean m21726a(C5919o oVar) {
        return m21724a(C5773a.m21796a(oVar.mo15702a()), C5773a.m21796a(oVar.mo15703b()));
    }

    /* renamed from: a */
    private C5919o[] m21727a(C5750a aVar) {
        this.f15896f = 1;
        C5750a aVar2 = aVar;
        C5750a aVar3 = aVar2;
        C5750a aVar4 = aVar3;
        boolean z = true;
        while (this.f15896f < 9) {
            C5750a a = m21721a(aVar, z, 1, -1);
            C5750a a2 = m21721a(aVar2, z, 1, 1);
            C5750a a3 = m21721a(aVar3, z, -1, 1);
            C5750a a4 = m21721a(aVar4, z, -1, -1);
            if (this.f15896f > 2) {
                double a5 = (double) ((m21715a(a4, a) * ((float) this.f15896f)) / (m21715a(aVar4, aVar) * ((float) (this.f15896f + 2))));
                if (a5 < 0.75d || a5 > 1.25d || !m21725a(a, a2, a3, a4)) {
                    break;
                }
            }
            z = !z;
            this.f15896f++;
            aVar4 = a4;
            aVar = a;
            aVar2 = a2;
            aVar3 = a3;
        }
        int i = this.f15896f;
        if (i == 5 || i == 7) {
            this.f15893c = this.f15896f == 5;
            C5919o[] oVarArr = {new C5919o(((float) aVar.mo15337a()) + 0.5f, ((float) aVar.mo15338b()) - 0.5f), new C5919o(((float) aVar2.mo15337a()) + 0.5f, ((float) aVar2.mo15338b()) + 0.5f), new C5919o(((float) aVar3.mo15337a()) - 0.5f, ((float) aVar3.mo15338b()) + 0.5f), new C5919o(((float) aVar4.mo15337a()) - 0.5f, ((float) aVar4.mo15338b()) - 0.5f)};
            int i2 = this.f15896f;
            return m21728a(oVarArr, (float) ((i2 * 2) - 3), (float) (i2 * 2));
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private static C5919o[] m21728a(C5919o[] oVarArr, float f, float f2) {
        float f3 = f2 / (f * 2.0f);
        float a = oVarArr[0].mo15702a() - oVarArr[2].mo15702a();
        float b = oVarArr[0].mo15703b() - oVarArr[2].mo15703b();
        float a2 = (oVarArr[0].mo15702a() + oVarArr[2].mo15702a()) / 2.0f;
        float b2 = (oVarArr[0].mo15703b() + oVarArr[2].mo15703b()) / 2.0f;
        float f4 = a * f3;
        float f5 = b * f3;
        C5919o oVar = new C5919o(a2 + f4, b2 + f5);
        C5919o oVar2 = new C5919o(a2 - f4, b2 - f5);
        float a3 = oVarArr[1].mo15702a() - oVarArr[3].mo15702a();
        float b3 = oVarArr[1].mo15703b() - oVarArr[3].mo15703b();
        float a4 = (oVarArr[1].mo15702a() + oVarArr[3].mo15702a()) / 2.0f;
        float b4 = (oVarArr[1].mo15703b() + oVarArr[3].mo15703b()) / 2.0f;
        float f6 = a3 * f3;
        float f7 = f3 * b3;
        return new C5919o[]{oVar, new C5919o(a4 + f6, b4 + f7), oVar2, new C5919o(a4 - f6, b4 - f7)};
    }

    /* renamed from: b */
    private int m21729b(C5750a aVar, C5750a aVar2) {
        float a = m21715a(aVar, aVar2);
        float a2 = ((float) (aVar2.mo15337a() - aVar.mo15337a())) / a;
        float b = ((float) (aVar2.mo15338b() - aVar.mo15338b())) / a;
        boolean b2 = this.f15892b.mo15389b(aVar.mo15337a(), aVar.mo15338b());
        boolean z = false;
        float a3 = (float) aVar.mo15337a();
        float b3 = (float) aVar.mo15338b();
        int i = 0;
        for (int i2 = 0; ((float) i2) < a; i2++) {
            a3 += a2;
            b3 += b;
            if (this.f15892b.mo15389b(C5773a.m21796a(a3), C5773a.m21796a(b3)) != b2) {
                i++;
            }
        }
        float f = ((float) i) / a;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == b2 ? 1 : -1;
    }

    /* renamed from: b */
    private C5750a m21730b() {
        C5919o oVar;
        C5919o oVar2;
        C5919o oVar3;
        C5919o oVar4;
        C5919o oVar5;
        C5919o oVar6;
        C5919o oVar7;
        C5919o oVar8;
        try {
            C5919o[] a = new C5774b(this.f15892b).mo15382a();
            oVar3 = a[0];
            oVar2 = a[1];
            oVar = a[2];
            oVar4 = a[3];
        } catch (C5882i unused) {
            int h = this.f15892b.mo15397h() / 2;
            int f = this.f15892b.mo15395f() / 2;
            int i = h + 7;
            int i2 = f - 7;
            C5919o c = m21721a(new C5750a(i, i2), false, 1, -1).mo15339c();
            int i3 = f + 7;
            C5919o c2 = m21721a(new C5750a(i, i3), false, 1, 1).mo15339c();
            int i4 = h - 7;
            C5919o c3 = m21721a(new C5750a(i4, i3), false, -1, 1).mo15339c();
            oVar4 = m21721a(new C5750a(i4, i2), false, -1, -1).mo15339c();
            C5919o oVar9 = c2;
            oVar = c3;
            oVar3 = c;
            oVar2 = oVar9;
        }
        int a2 = C5773a.m21796a((((oVar3.mo15702a() + oVar4.mo15702a()) + oVar2.mo15702a()) + oVar.mo15702a()) / 4.0f);
        int a3 = C5773a.m21796a((((oVar3.mo15703b() + oVar4.mo15703b()) + oVar2.mo15703b()) + oVar.mo15703b()) / 4.0f);
        try {
            C5919o[] a4 = new C5774b(this.f15892b, 15, a2, a3).mo15382a();
            oVar6 = a4[0];
            oVar5 = a4[1];
            oVar7 = a4[2];
            oVar8 = a4[3];
        } catch (C5882i unused2) {
            int i5 = a2 + 7;
            int i6 = a3 - 7;
            oVar6 = m21721a(new C5750a(i5, i6), false, 1, -1).mo15339c();
            int i7 = a3 + 7;
            oVar5 = m21721a(new C5750a(i5, i7), false, 1, 1).mo15339c();
            int i8 = a2 - 7;
            oVar7 = m21721a(new C5750a(i8, i7), false, -1, 1).mo15339c();
            oVar8 = m21721a(new C5750a(i8, i6), false, -1, -1).mo15339c();
        }
        return new C5750a(C5773a.m21796a((((oVar6.mo15702a() + oVar8.mo15702a()) + oVar5.mo15702a()) + oVar7.mo15702a()) / 4.0f), C5773a.m21796a((((oVar6.mo15703b() + oVar8.mo15703b()) + oVar5.mo15703b()) + oVar7.mo15703b()) / 4.0f));
    }

    /* renamed from: b */
    private C5919o[] m21731b(C5919o[] oVarArr) {
        return m21728a(oVarArr, (float) (this.f15896f * 2), (float) m21717a());
    }

    /* renamed from: a */
    public C5744a mo15336a(boolean z) {
        C5919o[] a = m21727a(m21730b());
        if (z) {
            C5919o oVar = a[0];
            a[0] = a[2];
            a[2] = oVar;
        }
        m21723a(a);
        C5775b bVar = this.f15892b;
        int i = this.f15897g;
        return new C5744a(m21722a(bVar, a[i % 4], a[(i + 1) % 4], a[(i + 2) % 4], a[(i + 3) % 4]), m21731b(a), this.f15893c, this.f15895e, this.f15894d);
    }
}
