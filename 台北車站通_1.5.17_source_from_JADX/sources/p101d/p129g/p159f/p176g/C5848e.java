package p101d.p129g.p159f.p176g;

import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.e */
public final class C5848e extends C5859p {

    /* renamed from: h */
    static final int[] f16180h = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f16181i = new int[4];

    /* renamed from: a */
    private static void m22098a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f16180h[i2]) {
                sb.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw C5882i.m22303a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15552a(C5772a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f16181i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int f = aVar.mo15378f();
        int i = iArr[1];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 6 && i < f) {
            int a = C5859p.m22140a(aVar, iArr2, i, C5859p.f16204d);
            sb.append((char) ((a % 10) + 48));
            int i4 = i;
            for (int i5 : iArr2) {
                i4 += i5;
            }
            if (a >= 10) {
                i3 = (1 << (5 - i2)) | i3;
            }
            i2++;
            i = i4;
        }
        m22098a(sb, i3);
        int i6 = C5859p.m22143a(aVar, i, true, C5859p.f16202b)[1];
        int i7 = 0;
        while (i7 < 6 && i6 < f) {
            sb.append((char) (C5859p.m22140a(aVar, iArr2, i6, C5859p.f16203c) + 48));
            int i8 = i6;
            for (int i9 : iArr2) {
                i8 += i9;
            }
            i7++;
            i6 = i8;
        }
        return i6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5743a mo15553a() {
        return C5743a.EAN_13;
    }
}
