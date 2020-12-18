package p101d.p129g.p152e;

import java.util.concurrent.atomic.AtomicLong;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.n */
class C5729n extends C5593I<AtomicLong> {

    /* renamed from: a */
    final /* synthetic */ C5593I f15837a;

    C5729n(C5593I i) {
        this.f15837a = i;
    }

    /* renamed from: a */
    public AtomicLong m21652a(C5716b bVar) {
        return new AtomicLong(((Number) this.f15837a.mo15096a(bVar)).longValue());
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, AtomicLong atomicLong) {
        this.f15837a.mo15097a(dVar, Long.valueOf(atomicLong.get()));
    }
}
