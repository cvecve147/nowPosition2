package p101d.p129g.p152e.p154b.p155a;

import java.math.BigInteger;
import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.F */
class C5617F extends C5593I<BigInteger> {
    C5617F() {
    }

    /* renamed from: a */
    public BigInteger m21288a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        try {
            return new BigInteger(bVar.mo15164o());
        } catch (NumberFormatException e) {
            throw new C5588D((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, BigInteger bigInteger) {
        dVar.mo15177a((Number) bigInteger);
    }
}
