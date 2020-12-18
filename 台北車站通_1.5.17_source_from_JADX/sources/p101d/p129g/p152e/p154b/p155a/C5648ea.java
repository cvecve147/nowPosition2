package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.ea */
class C5648ea extends C5593I<Number> {
    C5648ea() {
    }

    /* renamed from: a */
    public Number m21378a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        try {
            return Byte.valueOf((byte) bVar.mo15160k());
        } catch (NumberFormatException e) {
            throw new C5588D((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Number number) {
        dVar.mo15177a(number);
    }
}
