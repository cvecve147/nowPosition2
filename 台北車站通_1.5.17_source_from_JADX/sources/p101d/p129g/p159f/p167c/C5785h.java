package p101d.p129g.p159f.p167c;

import p101d.p129g.p159f.C5751b;
import p101d.p129g.p159f.C5813g;
import p101d.p129g.p159f.C5882i;

/* renamed from: d.g.f.c.h */
public class C5785h extends C5751b {

    /* renamed from: b */
    private static final byte[] f16015b = new byte[0];

    /* renamed from: c */
    private byte[] f16016c = f16015b;

    /* renamed from: d */
    private final int[] f16017d = new int[32];

    public C5785h(C5813g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    private static int m21857a(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (iArr[i4] > i) {
                i = iArr[i4];
                i3 = i4;
            }
            if (iArr[i4] > i2) {
                i2 = iArr[i4];
            }
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 - i3;
            int i9 = iArr[i7] * i8 * i8;
            if (i9 > i6) {
                i5 = i7;
                i6 = i9;
            }
        }
        if (i3 > i5) {
            int i10 = i3;
            i3 = i5;
            i5 = i10;
        }
        if (i5 - i3 > length / 16) {
            int i11 = i5 - 1;
            int i12 = -1;
            int i13 = i11;
            while (i11 > i3) {
                int i14 = i11 - i3;
                int i15 = i14 * i14 * (i5 - i11) * (i2 - iArr[i11]);
                if (i15 > i12) {
                    i13 = i11;
                    i12 = i15;
                }
                i11--;
            }
            return i13 << 3;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private void m21858a(int i) {
        if (this.f16016c.length < i) {
            this.f16016c = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f16017d[i2] = 0;
        }
    }

    /* renamed from: a */
    public C5772a mo15341a(int i, C5772a aVar) {
        C5813g c = mo15344c();
        int c2 = c.mo15480c();
        if (aVar == null || aVar.mo15378f() < c2) {
            aVar = new C5772a(c2);
        } else {
            aVar.mo15374d();
        }
        m21858a(c2);
        byte[] a = c.mo15478a(i, this.f16016c);
        int[] iArr = this.f16017d;
        for (int i2 = 0; i2 < c2; i2++) {
            int i3 = (a[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int a2 = m21857a(iArr);
        byte b = a[1] & 255;
        byte b2 = a[0] & 255;
        int i4 = 1;
        while (i4 < c2 - 1) {
            int i5 = i4 + 1;
            byte b3 = a[i5] & 255;
            if ((((b * 4) - b2) - b3) / 2 < a2) {
                aVar.mo15375d(i4);
            }
            b2 = b;
            i4 = i5;
            b = b3;
        }
        return aVar;
    }

    /* renamed from: a */
    public C5775b mo15342a() {
        C5813g c = mo15344c();
        int c2 = c.mo15480c();
        int a = c.mo15477a();
        C5775b bVar = new C5775b(c2, a);
        m21858a(c2);
        int[] iArr = this.f16017d;
        for (int i = 1; i < 5; i++) {
            byte[] a2 = c.mo15478a((a * i) / 5, this.f16016c);
            int i2 = (c2 * 4) / 5;
            for (int i3 = c2 / 5; i3 < i2; i3++) {
                int i4 = (a2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a3 = m21857a(iArr);
        byte[] b = c.mo15479b();
        for (int i5 = 0; i5 < a; i5++) {
            int i6 = i5 * c2;
            for (int i7 = 0; i7 < c2; i7++) {
                if ((b[i6 + i7] & 255) < a3) {
                    bVar.mo15390c(i7, i5);
                }
            }
        }
        return bVar;
    }
}
