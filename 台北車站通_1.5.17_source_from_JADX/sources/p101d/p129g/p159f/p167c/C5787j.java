package p101d.p129g.p159f.p167c;

import java.lang.reflect.Array;
import p101d.p129g.p159f.C5813g;

/* renamed from: d.g.f.c.j */
public final class C5787j extends C5785h {

    /* renamed from: e */
    private C5775b f16019e;

    public C5787j(C5813g gVar) {
        super(gVar);
    }

    /* renamed from: a */
    private static int m21865a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static void m21866a(byte[] bArr, int i, int i2, int i3, int i4, C5775b bVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    bVar.mo15390c(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    private static void m21867a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C5775b bVar) {
        int i5 = i;
        int i6 = i2;
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 <= i12) {
                    i12 = i11;
                }
                int a = m21865a(i10, 2, i5 - 3);
                int a2 = m21865a(i7, 2, i6 - 3);
                int i13 = 0;
                for (int i14 = -2; i14 <= 2; i14++) {
                    int[] iArr2 = iArr[a2 + i14];
                    i13 += iArr2[a - 2] + iArr2[a - 1] + iArr2[a] + iArr2[a + 1] + iArr2[a + 2];
                }
                m21866a(bArr, i12, i8, i13 / 25, i3, bVar);
            }
        }
    }

    /* renamed from: a */
    private static int[][] m21868a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{i6, i5});
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = i7 << 3;
            int i9 = i4 - 8;
            if (i8 > i9) {
                i8 = i9;
            }
            for (int i10 = 0; i10 < i5; i10++) {
                int i11 = i10 << 3;
                int i12 = i3 - 8;
                if (i11 > i12) {
                    i11 = i12;
                }
                byte b = 255;
                int i13 = (i8 * i3) + i11;
                int i14 = 0;
                int i15 = 0;
                byte b2 = 0;
                while (i14 < 8) {
                    int i16 = i15;
                    for (int i17 = 0; i17 < 8; i17++) {
                        byte b3 = bArr[i13 + i17] & 255;
                        i16 += b3;
                        if (b3 < b) {
                            b = b3;
                        }
                        if (b3 > b2) {
                            b2 = b3;
                        }
                    }
                    if (b2 - b <= 24) {
                        i15 = i16;
                        i14++;
                        i13 += i3;
                    }
                    while (true) {
                        i14++;
                        i13 += i3;
                        if (i14 >= 8) {
                            break;
                        }
                        for (int i18 = 0; i18 < 8; i18++) {
                            i16 += bArr[i13 + i18] & 255;
                        }
                    }
                    i15 = i16;
                    i14++;
                    i13 += i3;
                }
                int i19 = i15 >> 6;
                if (b2 - b <= 24) {
                    i19 = b / 2;
                    if (i7 > 0 && i10 > 0) {
                        int i20 = i7 - 1;
                        int i21 = i10 - 1;
                        int i22 = ((iArr[i20][i10] + (iArr[i7][i21] * 2)) + iArr[i20][i21]) / 4;
                        if (b < i22) {
                            i19 = i22;
                        }
                    }
                }
                iArr[i7][i10] = i19;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public C5775b mo15342a() {
        C5775b bVar;
        C5775b bVar2 = this.f16019e;
        if (bVar2 != null) {
            return bVar2;
        }
        C5813g c = mo15344c();
        int c2 = c.mo15480c();
        int a = c.mo15477a();
        if (c2 < 40 || a < 40) {
            bVar = super.mo15342a();
        } else {
            byte[] b = c.mo15479b();
            int i = c2 >> 3;
            if ((c2 & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = a >> 3;
            if ((a & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] a2 = m21868a(b, i2, i4, c2, a);
            bVar = new C5775b(c2, a);
            m21867a(b, i2, i4, c2, a, a2, bVar);
        }
        this.f16019e = bVar;
        return this.f16019e;
    }
}
