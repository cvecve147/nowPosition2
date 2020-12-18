package p101d.p129g.p159f.p170d;

import java.util.List;
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
import p101d.p129g.p159f.p167c.C5784g;
import p101d.p129g.p159f.p170d.p171a.C5797e;
import p101d.p129g.p159f.p170d.p172b.C5803b;

/* renamed from: d.g.f.d.a */
public final class C5791a implements C5915k {

    /* renamed from: a */
    private static final C5919o[] f16032a = new C5919o[0];

    /* renamed from: b */
    private final C5797e f16033b = new C5797e();

    /* renamed from: a */
    private static int m21878a(int[] iArr, C5775b bVar) {
        int h = bVar.mo15397h();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < h && bVar.mo15389b(i, i2)) {
            i++;
        }
        if (i != h) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C5882i.m22303a();
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private static C5775b m21879a(C5775b bVar) {
        int[] g = bVar.mo15396g();
        int[] d = bVar.mo15392d();
        if (g == null || d == null) {
            throw C5882i.m22303a();
        }
        int a = m21878a(g, bVar);
        int i = g[1];
        int i2 = d[1];
        int i3 = g[0];
        int i4 = ((d[0] - i3) + 1) / a;
        int i5 = ((i2 - i) + 1) / a;
        if (i4 <= 0 || i5 <= 0) {
            throw C5882i.m22303a();
        }
        int i6 = a / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C5775b bVar2 = new C5775b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * a) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo15389b((i11 * a) + i8, i10)) {
                    bVar2.mo15390c(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return mo15334a(cVar, (Map<C5806e, ?>) null);
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        C5919o[] oVarArr;
        C5782e eVar;
        if (map == null || !map.containsKey(C5806e.PURE_BARCODE)) {
            C5784g a = new C5803b(cVar.mo15362a()).mo15467a();
            C5782e a2 = this.f16033b.mo15454a(a.mo15438a());
            oVarArr = a.mo15439b();
            eVar = a2;
        } else {
            eVar = this.f16033b.mo15454a(m21879a(cVar.mo15362a()));
            oVarArr = f16032a;
        }
        C5917m mVar = new C5917m(eVar.mo15434g(), eVar.mo15431d(), oVarArr, C5743a.DATA_MATRIX);
        List<byte[]> a3 = eVar.mo15425a();
        if (a3 != null) {
            mVar.mo15694a(C5918n.BYTE_SEGMENTS, a3);
        }
        String b = eVar.mo15428b();
        if (b != null) {
            mVar.mo15694a(C5918n.ERROR_CORRECTION_LEVEL, b);
        }
        return mVar;
    }

    public void reset() {
    }
}
