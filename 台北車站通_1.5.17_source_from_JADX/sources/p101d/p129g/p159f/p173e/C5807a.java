package p101d.p129g.p159f.p173e;

import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5915k;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5775b;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p173e.p174a.C5810c;

/* renamed from: d.g.f.e.a */
public final class C5807a implements C5915k {

    /* renamed from: a */
    private static final C5919o[] f16084a = new C5919o[0];

    /* renamed from: b */
    private final C5810c f16085b = new C5810c();

    /* renamed from: a */
    private static C5775b m21932a(C5775b bVar) {
        int[] e = bVar.mo15393e();
        if (e != null) {
            int i = e[0];
            int i2 = e[1];
            int i3 = e[2];
            int i4 = e[3];
            C5775b bVar2 = new C5775b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo15389b(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo15390c(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return mo15334a(cVar, (Map<C5806e, ?>) null);
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        if (map == null || !map.containsKey(C5806e.PURE_BARCODE)) {
            throw C5882i.m22303a();
        }
        C5782e a = this.f16085b.mo15476a(m21932a(cVar.mo15362a()), map);
        C5917m mVar = new C5917m(a.mo15434g(), a.mo15431d(), f16084a, C5743a.MAXICODE);
        String b = a.mo15428b();
        if (b != null) {
            mVar.mo15694a(C5918n.ERROR_CORRECTION_LEVEL, b);
        }
        return mVar;
    }

    public void reset() {
    }
}
