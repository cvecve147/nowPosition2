package p101d.p129g.p159f.p184i;

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
import p101d.p129g.p159f.p184i.p185a.C5897f;
import p101d.p129g.p159f.p184i.p185a.C5901j;
import p101d.p129g.p159f.p184i.p186b.C5907c;

/* renamed from: d.g.f.i.a */
public class C5883a implements C5915k {

    /* renamed from: a */
    private static final C5919o[] f16277a = new C5919o[0];

    /* renamed from: b */
    private final C5897f f16278b = new C5897f();

    /* renamed from: a */
    private static float m22304a(int[] iArr, C5775b bVar) {
        int f = bVar.mo15395f();
        int h = bVar.mo15397h();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < h && i2 < f) {
            if (z != bVar.mo15389b(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != h && i2 != f) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw C5882i.m22303a();
    }

    /* renamed from: a */
    private static C5775b m22305a(C5775b bVar) {
        int[] g = bVar.mo15396g();
        int[] d = bVar.mo15392d();
        if (g == null || d == null) {
            throw C5882i.m22303a();
        }
        float a = m22304a(g, bVar);
        int i = g[1];
        int i2 = d[1];
        int i3 = g[0];
        int i4 = d[0];
        if (i3 >= i4 || i >= i2) {
            throw C5882i.m22303a();
        }
        int i5 = i2 - i;
        if (i5 != i4 - i3) {
            i4 = i3 + i5;
        }
        int round = Math.round(((float) ((i4 - i3) + 1)) / a);
        int round2 = Math.round(((float) (i5 + 1)) / a);
        if (round <= 0 || round2 <= 0) {
            throw C5882i.m22303a();
        } else if (round2 == round) {
            int i6 = (int) (a / 2.0f);
            int i7 = i + i6;
            int i8 = i3 + i6;
            int i9 = (((int) (((float) (round - 1)) * a)) + i8) - i4;
            if (i9 > 0) {
                if (i9 <= i6) {
                    i8 -= i9;
                } else {
                    throw C5882i.m22303a();
                }
            }
            int i10 = (((int) (((float) (round2 - 1)) * a)) + i7) - i2;
            if (i10 > 0) {
                if (i10 <= i6) {
                    i7 -= i10;
                } else {
                    throw C5882i.m22303a();
                }
            }
            C5775b bVar2 = new C5775b(round, round2);
            for (int i11 = 0; i11 < round2; i11++) {
                int i12 = ((int) (((float) i11) * a)) + i7;
                for (int i13 = 0; i13 < round; i13++) {
                    if (bVar.mo15389b(((int) (((float) i13) * a)) + i8, i12)) {
                        bVar2.mo15390c(i13, i11);
                    }
                }
            }
            return bVar2;
        } else {
            throw C5882i.m22303a();
        }
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return mo15334a(cVar, (Map<C5806e, ?>) null);
    }

    /* renamed from: a */
    public final C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        C5919o[] oVarArr;
        C5782e eVar;
        if (map == null || !map.containsKey(C5806e.PURE_BARCODE)) {
            C5784g a = new C5907c(cVar.mo15362a()).mo15677a(map);
            C5782e a2 = this.f16278b.mo15654a(a.mo15438a(), map);
            oVarArr = a.mo15439b();
            eVar = a2;
        } else {
            eVar = this.f16278b.mo15654a(m22305a(cVar.mo15362a()), map);
            oVarArr = f16277a;
        }
        if (eVar.mo15430c() instanceof C5901j) {
            ((C5901j) eVar.mo15430c()).mo15660a(oVarArr);
        }
        C5917m mVar = new C5917m(eVar.mo15434g(), eVar.mo15431d(), oVarArr, C5743a.QR_CODE);
        List<byte[]> a3 = eVar.mo15425a();
        if (a3 != null) {
            mVar.mo15694a(C5918n.BYTE_SEGMENTS, a3);
        }
        String b = eVar.mo15428b();
        if (b != null) {
            mVar.mo15694a(C5918n.ERROR_CORRECTION_LEVEL, b);
        }
        if (eVar.mo15435h()) {
            mVar.mo15694a(C5918n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.mo15433f()));
            mVar.mo15694a(C5918n.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.mo15432e()));
        }
        return mVar;
    }

    public void reset() {
    }
}
