package p101d.p129g.p152e.p154b.p155a;

import java.util.UUID;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.M */
class C5624M extends C5593I<UUID> {
    C5624M() {
    }

    /* renamed from: a */
    public UUID m21316a(C5716b bVar) {
        if (bVar.mo15165p() != C5717c.NULL) {
            return UUID.fromString(bVar.mo15164o());
        }
        bVar.mo15163n();
        return null;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, UUID uuid) {
        dVar.mo15181c(uuid == null ? null : uuid.toString());
    }
}
