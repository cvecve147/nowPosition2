package p101d.p129g.p159f.p176g;

import java.util.Collection;
import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5882i;
import p101d.p129g.p159f.C5916l;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.j */
public final class C5853j extends C5854k {

    /* renamed from: a */
    private final C5859p[] f16191a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5853j(java.util.Map<p101d.p129g.p159f.C5806e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L_0x0007
            r3 = 0
            goto L_0x000f
        L_0x0007:
            d.g.f.e r0 = p101d.p129g.p159f.C5806e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L_0x0055
            d.g.f.a r1 = p101d.p129g.p159f.C5743a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0027
            d.g.f.g.e r1 = new d.g.f.g.e
            r1.<init>()
        L_0x0023:
            r0.add(r1)
            goto L_0x0035
        L_0x0027:
            d.g.f.a r1 = p101d.p129g.p159f.C5743a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0035
            d.g.f.g.l r1 = new d.g.f.g.l
            r1.<init>()
            goto L_0x0023
        L_0x0035:
            d.g.f.a r1 = p101d.p129g.p159f.C5743a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0045
            d.g.f.g.f r1 = new d.g.f.g.f
            r1.<init>()
            r0.add(r1)
        L_0x0045:
            d.g.f.a r1 = p101d.p129g.p159f.C5743a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L_0x0055
            d.g.f.g.q r3 = new d.g.f.g.q
            r3.<init>()
            r0.add(r3)
        L_0x0055:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0073
            d.g.f.g.e r3 = new d.g.f.g.e
            r3.<init>()
            r0.add(r3)
            d.g.f.g.f r3 = new d.g.f.g.f
            r3.<init>()
            r0.add(r3)
            d.g.f.g.q r3 = new d.g.f.g.q
            r3.<init>()
            r0.add(r3)
        L_0x0073:
            int r3 = r0.size()
            d.g.f.g.p[] r3 = new p101d.p129g.p159f.p176g.C5859p[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            d.g.f.g.p[] r3 = (p101d.p129g.p159f.p176g.C5859p[]) r3
            r2.f16191a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p101d.p129g.p159f.p176g.C5853j.<init>(java.util.Map):void");
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        int[] a = C5859p.m22142a(aVar);
        C5859p[] pVarArr = this.f16191a;
        boolean z = false;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C5917m a2 = pVarArr[i2].mo15557a(i, aVar, a, map);
                boolean z2 = a2.mo15693a() == C5743a.EAN_13 && a2.mo15700e().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(C5806e.POSSIBLE_FORMATS);
                if (collection == null || collection.contains(C5743a.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return a2;
                }
                C5917m mVar = new C5917m(a2.mo15700e().substring(1), a2.mo15697b(), a2.mo15699d(), C5743a.UPC_A);
                mVar.mo15695a(a2.mo15698c());
                return mVar;
            } catch (C5916l unused) {
                i2++;
            }
        }
        throw C5882i.m22303a();
    }

    public void reset() {
        for (C5859p reset : this.f16191a) {
            reset.reset();
        }
    }
}
