package p101d.p129g.p159f.p184i.p185a;

import java.util.Map;
import p101d.p129g.p159f.C5790d;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p167c.p169b.C5776a;
import p101d.p129g.p159f.p167c.p169b.C5778c;
import p101d.p129g.p159f.p167c.p169b.C5779d;

/* renamed from: d.g.f.i.a.f */
public final class C5897f {

    /* renamed from: a */
    private final C5778c f16287a = new C5778c(C5776a.f15955e);

    /* renamed from: a */
    private C5782e m22337a(C5884a aVar, Map<C5806e, ?> map) {
        C5902k d = aVar.mo15648d();
        C5898g b = aVar.mo15647c().mo15656b();
        C5885b[] a = C5885b.m22315a(aVar.mo15646b(), d, b);
        int i = 0;
        for (C5885b b2 : a) {
            i += b2.mo15651b();
        }
        byte[] bArr = new byte[i];
        int length = a.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            C5885b bVar = a[i2];
            byte[] a2 = bVar.mo15650a();
            int b3 = bVar.mo15651b();
            m22338a(a2, b3);
            int i4 = i3;
            int i5 = 0;
            while (i5 < b3) {
                bArr[i4] = a2[i5];
                i5++;
                i4++;
            }
            i2++;
            i3 = i4;
        }
        return C5896e.m22331a(bArr, d, b, map);
    }

    /* renamed from: a */
    private void m22338a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f16287a.mo15420a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (C5779d unused) {
            throw C5790d.m21877a();
        }
    }

    /* renamed from: a */
    public C5782e mo15654a(C5775b bVar, Map<C5806e, ?> map) {
        C5790d e;
        C5884a aVar = new C5884a(bVar);
        C5811f fVar = null;
        try {
            return m22337a(aVar, map);
        } catch (C5811f e2) {
            C5811f fVar2 = e2;
            e = null;
            fVar = fVar2;
            try {
                aVar.mo15649e();
                aVar.mo15645a(true);
                aVar.mo15648d();
                aVar.mo15647c();
                aVar.mo15644a();
                C5782e a = m22337a(aVar, map);
                a.mo15427a((Object) new C5901j(true));
                return a;
            } catch (C5790d | C5811f e3) {
                if (fVar != null) {
                    throw fVar;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (C5790d e4) {
            e = e4;
            aVar.mo15649e();
            aVar.mo15645a(true);
            aVar.mo15648d();
            aVar.mo15647c();
            aVar.mo15644a();
            C5782e a2 = m22337a(aVar, map);
            a2.mo15427a((Object) new C5901j(true));
            return a2;
        }
    }
}
