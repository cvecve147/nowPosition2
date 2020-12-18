package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.Z */
class C5636Z extends C5593I<T1> {

    /* renamed from: a */
    final /* synthetic */ Class f15597a;

    /* renamed from: b */
    final /* synthetic */ C5639aa f15598b;

    C5636Z(C5639aa aaVar, Class cls) {
        this.f15598b = aaVar;
        this.f15597a = cls;
    }

    /* renamed from: a */
    public T1 mo15096a(C5716b bVar) {
        T1 a = this.f15598b.f15601b.mo15096a(bVar);
        if (a == null || this.f15597a.isInstance(a)) {
            return a;
        }
        throw new C5588D("Expected a " + this.f15597a.getName() + " but was " + a.getClass().getName());
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, T1 t1) {
        this.f15598b.f15601b.mo15097a(dVar, t1);
    }
}
