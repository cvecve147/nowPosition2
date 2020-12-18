package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p154b.C5702u;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.B */
class C5613B extends C5593I<Number> {
    C5613B() {
    }

    /* renamed from: a */
    public Number m21272a(C5716b bVar) {
        C5717c p = bVar.mo15165p();
        int i = C5641ba.f15605a[p.ordinal()];
        if (i == 1) {
            return new C5702u(bVar.mo15164o());
        }
        if (i == 4) {
            bVar.mo15163n();
            return null;
        }
        throw new C5588D("Expecting number, got: " + p);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Number number) {
        dVar.mo15177a(number);
    }
}
