package p101d.p129g.p159f.p176g;

import java.util.Map;
import p101d.p129g.p159f.C5743a;
import p101d.p129g.p159f.C5771c;
import p101d.p129g.p159f.C5806e;
import p101d.p129g.p159f.C5811f;
import p101d.p129g.p159f.C5917m;
import p101d.p129g.p159f.p167c.C5772a;

/* renamed from: d.g.f.g.l */
public final class C5855l extends C5859p {

    /* renamed from: h */
    private final C5859p f16192h = new C5848e();

    /* renamed from: a */
    private static C5917m m22123a(C5917m mVar) {
        String e = mVar.mo15700e();
        if (e.charAt(0) == '0') {
            return new C5917m(e.substring(1), (byte[]) null, mVar.mo15699d(), C5743a.UPC_A);
        }
        throw C5811f.m21947a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15552a(C5772a aVar, int[] iArr, StringBuilder sb) {
        return this.f16192h.mo15552a(aVar, iArr, sb);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5743a mo15553a() {
        return C5743a.UPC_A;
    }

    /* renamed from: a */
    public C5917m mo15484a(int i, C5772a aVar, Map<C5806e, ?> map) {
        return m22123a(this.f16192h.mo15484a(i, aVar, map));
    }

    /* renamed from: a */
    public C5917m mo15557a(int i, C5772a aVar, int[] iArr, Map<C5806e, ?> map) {
        return m22123a(this.f16192h.mo15557a(i, aVar, iArr, map));
    }

    /* renamed from: a */
    public C5917m mo15333a(C5771c cVar) {
        return m22123a(this.f16192h.mo15333a(cVar));
    }

    /* renamed from: a */
    public C5917m mo15334a(C5771c cVar, Map<C5806e, ?> map) {
        return m22123a(this.f16192h.mo15334a(cVar, map));
    }
}
