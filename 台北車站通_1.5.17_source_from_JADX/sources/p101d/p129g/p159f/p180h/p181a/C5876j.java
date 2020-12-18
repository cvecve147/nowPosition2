package p101d.p129g.p159f.p180h.p181a;

import java.lang.reflect.Array;
import p101d.p129g.p159f.p180h.C5862a;

/* renamed from: d.g.f.h.a.j */
final class C5876j {

    /* renamed from: a */
    private static final float[][] f16264a = ((float[][]) Array.newInstance(float.class, new int[]{C5862a.f16214b.length, 8}));

    static {
        int i;
        int i2 = 0;
        while (true) {
            int[] iArr = C5862a.f16214b;
            if (i2 < iArr.length) {
                int i3 = iArr[i2];
                int i4 = i3 & 1;
                int i5 = i3;
                int i6 = 0;
                while (i6 < 8) {
                    float f = 0.0f;
                    while (true) {
                        i = i5 & 1;
                        if (i != i4) {
                            break;
                        }
                        f += 1.0f;
                        i5 >>= 1;
                    }
                    f16264a[i2][(8 - i6) - 1] = f / 17.0f;
                    i6++;
                    i4 = i;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static int m22255a(int[] iArr) {
        int d = m22258d(m22259e(iArr));
        return d != -1 ? d : m22257c(iArr);
    }

    /* renamed from: b */
    private static int m22256b(int[] iArr) {
        long j = 0;
        int i = 0;
        while (i < iArr.length) {
            long j2 = j;
            for (int i2 = 0; i2 < iArr[i]; i2++) {
                int i3 = 1;
                long j3 = j2 << 1;
                if (i % 2 != 0) {
                    i3 = 0;
                }
                j2 = j3 | ((long) i3);
            }
            i++;
            j = j2;
        }
        return (int) j;
    }

    /* renamed from: c */
    private static int m22257c(int[] iArr) {
        int a = C5862a.m22163a(iArr);
        float[] fArr = new float[8];
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = ((float) iArr[i]) / ((float) a);
        }
        int i2 = -1;
        float f = Float.MAX_VALUE;
        int i3 = 0;
        while (true) {
            float[][] fArr2 = f16264a;
            if (i3 >= fArr2.length) {
                return i2;
            }
            float[] fArr3 = fArr2[i3];
            float f2 = 0.0f;
            for (int i4 = 0; i4 < 8; i4++) {
                float f3 = fArr3[i4] - fArr[i4];
                f2 += f3 * f3;
                if (f2 >= f) {
                    break;
                }
            }
            if (f2 < f) {
                i2 = C5862a.f16214b[i3];
                f = f2;
            }
            i3++;
        }
    }

    /* renamed from: d */
    private static int m22258d(int[] iArr) {
        int b = m22256b(iArr);
        if (C5862a.m22162a(b) == -1) {
            return -1;
        }
        return b;
    }

    /* renamed from: e */
    private static int[] m22259e(int[] iArr) {
        float a = (float) C5862a.m22163a(iArr);
        int[] iArr2 = new int[8];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 17; i3++) {
            if (((float) (iArr[i2] + i)) <= (a / 34.0f) + ((((float) i3) * a) / 17.0f)) {
                i += iArr[i2];
                i2++;
            }
            iArr2[i2] = iArr2[i2] + 1;
        }
        return iArr2;
    }
}
