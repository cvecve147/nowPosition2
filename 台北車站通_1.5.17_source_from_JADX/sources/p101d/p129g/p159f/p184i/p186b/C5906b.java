package p101d.p129g.p159f.p184i.p186b;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5920p;
import p101d.p129g.p159f.p167c.C5775b;

/* renamed from: d.g.f.i.b.b */
final class C5906b {

    /* renamed from: a */
    private final C5775b f16324a;

    /* renamed from: b */
    private final List<C5905a> f16325b = new ArrayList(5);

    /* renamed from: c */
    private final int f16326c;

    /* renamed from: d */
    private final int f16327d;

    /* renamed from: e */
    private final int f16328e;

    /* renamed from: f */
    private final int f16329f;

    /* renamed from: g */
    private final float f16330g;

    /* renamed from: h */
    private final int[] f16331h;

    /* renamed from: i */
    private final C5920p f16332i;

    C5906b(C5775b bVar, int i, int i2, int i3, int i4, float f, C5920p pVar) {
        this.f16324a = bVar;
        this.f16326c = i;
        this.f16327d = i2;
        this.f16328e = i3;
        this.f16329f = i4;
        this.f16330g = f;
        this.f16331h = new int[3];
        this.f16332i = pVar;
    }

    /* renamed from: a */
    private float m22365a(int i, int i2, int i3, int i4) {
        C5775b bVar = this.f16324a;
        int f = bVar.mo15395f();
        int[] iArr = this.f16331h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo15389b(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 < 0 || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && !bVar.mo15389b(i2, i5) && iArr[0] <= i3) {
            iArr[0] = iArr[0] + 1;
            i5--;
        }
        if (iArr[0] > i3) {
            return Float.NaN;
        }
        int i6 = i + 1;
        while (i6 < f && bVar.mo15389b(i2, i6) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i6++;
        }
        if (i6 == f || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i6 < f && !bVar.mo15389b(i2, i6) && iArr[2] <= i3) {
            iArr[2] = iArr[2] + 1;
            i6++;
        }
        if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m22368a(iArr)) {
            return m22366a(iArr, i6);
        }
        return Float.NaN;
    }

    /* renamed from: a */
    private static float m22366a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: a */
    private C5905a m22367a(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m22366a(iArr, i2);
        float a2 = m22365a(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(a2)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C5905a next : this.f16325b) {
            if (next.mo15672a(f, a2, a)) {
                return next.mo15673b(a2, a, f);
            }
        }
        C5905a aVar = new C5905a(a, a2, f);
        this.f16325b.add(aVar);
        C5920p pVar = this.f16332i;
        if (pVar == null) {
            return null;
        }
        pVar.mo11732a(aVar);
        return null;
    }

    /* renamed from: a */
    private boolean m22368a(int[] iArr) {
        float f = this.f16330g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5905a mo15674a() {
        C5905a a;
        C5905a a2;
        int i = this.f16326c;
        int i2 = this.f16329f;
        int i3 = this.f16328e + i;
        int i4 = this.f16327d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f16324a.mo15389b(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f16324a.mo15389b(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m22368a(iArr) && (a2 = m22367a(iArr, i6, i7)) != null) {
                    return a2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m22368a(iArr) && (a = m22367a(iArr, i6, i3)) != null) {
                return a;
            }
        }
        if (!this.f16325b.isEmpty()) {
            return this.f16325b.get(0);
        }
        throw C5882i.m22303a();
    }
}
