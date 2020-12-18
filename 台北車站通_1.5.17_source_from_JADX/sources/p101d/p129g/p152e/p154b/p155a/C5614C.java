package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5588D;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.C */
class C5614C extends C5593I<Character> {
    C5614C() {
    }

    /* renamed from: a */
    public Character m21276a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        String o = bVar.mo15164o();
        if (o.length() == 1) {
            return Character.valueOf(o.charAt(0));
        }
        throw new C5588D("Expecting character, got: " + o);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Character ch) {
        dVar.mo15181c(ch == null ? null : String.valueOf(ch));
    }
}
