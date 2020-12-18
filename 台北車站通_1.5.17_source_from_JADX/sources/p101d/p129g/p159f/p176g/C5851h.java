package p101d.p129g.p159f.p176g;

import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.h */
public final class C5851h extends C5854k {

    /* renamed from: a */
    private static final int[] f16185a = {6, 8, 10, 12, 14};

    /* renamed from: b */
    private static final int[] f16186b = {1, 1, 1, 1};

    /* renamed from: c */
    private static final int[] f16187c = {1, 1, 3};

    /* renamed from: d */
    static final int[][] f16188d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: e */
    private int f16189e = -1;

    /* renamed from: a */
    private static int m22106a(int[] iArr) {
        int length = f16188d.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float a = C5854k.m22116a(iArr, f16188d[i2], 0.78f);
            if (a < f) {
                i = i2;
                f = a;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private void m22107a(C5772a aVar, int i) {
        int i2 = this.f16189e * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo15369a(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw C5882i.m22303a();
        }
    }

    /* renamed from: a */
    private static void m22108a(C5772a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C5854k.m22117a(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m22106a(iArr2) + 48));
            sb.append((char) (m22106a(iArr3) + 48));
            for (int i5 : iArr) {
                i += i5;
            }
        }
    }

    /* renamed from: c */
    private static int m22109c(C5772a aVar) {
        int f = aVar.mo15378f();
        int b = aVar.mo15371b(0);
        if (b != f) {
            return b;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: c */
    private static int[] m22110c(C5772a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int f = aVar.mo15378f();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < f) {
            if (aVar.mo15369a(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C5854k.m22116a(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        boolean z;
        int[] b = mo15556b(aVar);
        int[] a = mo15555a(aVar);
        StringBuilder sb = new StringBuilder(20);
        m22108a(aVar, b[1], a[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(C5806e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f16185a;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length2) {
                z = false;
                break;
            }
            int i4 = iArr[i2];
            if (length == i4) {
                z = true;
                break;
            }
            if (i4 > i3) {
                i3 = i4;
            }
            i2++;
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C5917m(sb2, (byte[]) null, new C5919o[]{new C5919o((float) b[1], f), new C5919o((float) a[0], f)}, C5743a.ITF);
        }
        throw C5811f.m21947a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo15555a(C5772a aVar) {
        aVar.mo15379g();
        try {
            int[] c = m22110c(aVar, m22109c(aVar), f16187c);
            m22107a(aVar, c[0]);
            int i = c[0];
            c[0] = aVar.mo15378f() - c[1];
            c[1] = aVar.mo15378f() - i;
            return c;
        } finally {
            aVar.mo15379g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int[] mo15556b(C5772a aVar) {
        int[] c = m22110c(aVar, m22109c(aVar), f16186b);
        this.f16189e = (c[1] - c[0]) / 4;
        m22107a(aVar, c[0]);
        return c;
    }
}
