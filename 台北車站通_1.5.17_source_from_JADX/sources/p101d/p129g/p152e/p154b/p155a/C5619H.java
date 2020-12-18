package p101d.p129g.p152e.p154b.p155a;

import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.H */
class C5619H extends C5593I<Class> {
    C5619H() {
    }

    /* renamed from: a */
    public Class m21296a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, Class cls) {
        if (cls == null) {
            dVar.mo15186h();
            return;
        }
        throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
    }
}
