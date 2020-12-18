package p101d.p129g.p159f.p180h;

import java.util.ArrayList;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5915k;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.C5918n;
import p101d.p129g.p159f.C5919o;
import p101d.p129g.p159f.p167c.C5782e;
import p101d.p129g.p159f.p175f.C5812a;
import p101d.p129g.p159f.p180h.p181a.C5877k;
import p101d.p129g.p159f.p180h.p183b.C5879a;
import p101d.p129g.p159f.p180h.p183b.C5880b;

/* renamed from: d.g.f.h.b */
public final class C5878b implements C5915k, C5812a {
    /* renamed from: a */
    private static int m22283a(C5919o oVar, C5919o oVar2) {
        if (oVar == null || oVar2 == null) {
            return 0;
        }
        return (int) Math.abs(oVar.mo15702a() - oVar2.mo15702a());
    }

    /* renamed from: a */
    private static int m22284a(C5919o[] oVarArr) {
        return Math.max(Math.max(m22283a(oVarArr[0], oVarArr[4]), (m22283a(oVarArr[6], oVarArr[2]) * 17) / 18), Math.max(m22283a(oVarArr[1], oVarArr[5]), (m22283a(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    private static C5917m[] m22285a(C5771c cVar, Map<C5806e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C5880b a = C5879a.m22291a(cVar, map, z);
        for (C5919o[] next : a.mo15639b()) {
            C5782e a2 = C5877k.m22265a(a.mo15638a(), next[4], next[5], next[6], next[7], m22287b(next), m22284a(next));
            C5917m mVar = new C5917m(a2.mo15434g(), a2.mo15431d(), next, C5743a.PDF_417);
            mVar.mo15694a(C5918n.ERROR_CORRECTION_LEVEL, a2.mo15428b());
            C5881c cVar2 = (C5881c) a2.mo15430c();
            if (cVar2 != null) {
                mVar.mo15694a(C5918n.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(mVar);
        }
        return (C5917m[]) arrayList.toArray(new C5917m[arrayList.size()]);
    }

    /* renamed from: b */
    private static int m22286b(C5919o oVar, C5919o oVar2) {
        if (oVar == null || oVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(oVar.mo15702a() - oVar2.mo15702a());
    }

    /* renamed from: b */
    private static int m22287b(C5919o[] oVarArr) {
        return Math.min(Math.min(m22286b(oVarArr[0], oVarArr[4]), (m22286b(oVarArr[6], oVarArr[2]) * 17) / 18), Math.min(m22286b(oVarArr[1], oVarArr[5]), (m22286b(oVarArr[7], oVarArr[3]) * 17) / 18));
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return mo15334a(cVar, (Map<C5806e, ?>) null);
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        C5917m[] a = m22285a(cVar, map, false);
        if (a != null && a.length != 0 && a[0] != null) {
            return a[0];
        }
        throw C5882i.m22303a();
    }

    public void reset() {
    }
}
