package p101d.p129g.p159f.p176g;

import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.f */
public final class C5849f extends C5859p {

    /* renamed from: h */
    private final int[] f16182h = new int[4];

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15552a(C5772a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f16182h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int f = aVar.mo15378f();
        int i = iArr[1];
        int i2 = 0;
        while (i2 < 4 && i < f) {
            sb.append((char) (C5859p.m22140a(aVar, iArr2, i, C5859p.f16203c) + 48));
            int i3 = i;
            for (int i4 : iArr2) {
                i3 += i4;
            }
            i2++;
            i = i3;
        }
        int i5 = C5859p.m22143a(aVar, i, true, C5859p.f16202b)[1];
        int i6 = 0;
        while (i6 < 4 && i5 < f) {
            sb.append((char) (C5859p.m22140a(aVar, iArr2, i5, C5859p.f16203c) + 48));
            int i7 = i5;
            for (int i8 : iArr2) {
                i7 += i8;
            }
            i6++;
            i5 = i7;
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5743a mo15553a() {
        return C5743a.EAN_8;
    }
}
