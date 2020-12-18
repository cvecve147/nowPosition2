package p101d.p129g.p159f.p167c;

import p101d.p129g.p159f.C5882i;

/* renamed from: d.g.f.c.f */
public final class C5783f extends C5786i {
    /* renamed from: a */
    public C5775b mo15436a(C5775b bVar, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        C5775b bVar2 = bVar;
        int i3 = i;
        int i4 = i2;
        return mo15437a(bVar, i, i2, C5788k.m21871a(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16));
    }

    /* renamed from: a */
    public C5775b mo15437a(C5775b bVar, int i, int i2, C5788k kVar) {
        if (i <= 0 || i2 <= 0) {
            throw C5882i.m22303a();
        }
        C5775b bVar2 = new C5775b(i, i2);
        float[] fArr = new float[(i * 2)];
        for (int i3 = 0; i3 < i2; i3++) {
            int length = fArr.length;
            float f = ((float) i3) + 0.5f;
            for (int i4 = 0; i4 < length; i4 += 2) {
                fArr[i4] = ((float) (i4 / 2)) + 0.5f;
                fArr[i4 + 1] = f;
            }
            kVar.mo15442a(fArr);
            C5786i.m21862a(bVar, fArr);
            int i5 = 0;
            while (i5 < length) {
                try {
                    if (bVar.mo15389b((int) fArr[i5], (int) fArr[i5 + 1])) {
                        bVar2.mo15390c(i5 / 2, i3);
                    }
                    i5 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw C5882i.m22303a();
                }
            }
        }
        return bVar2;
    }
}
