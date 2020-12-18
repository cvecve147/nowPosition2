package p101d.p129g.p152e.p154b.p155a;

import java.util.concurrent.atomic.AtomicInteger;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.ha */
class C5654ha extends C5593I<AtomicInteger> {
    C5654ha() {
    }

    /* renamed from: a */
    public AtomicInteger m21413a(C5716b bVar) {
        try {
            return new AtomicInteger(bVar.mo15160k());
        } catch (NumberFormatException e) {
            throw new C5588D((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, AtomicInteger atomicInteger) {
        dVar.mo15175a((long) atomicInteger.get());
    }
}
