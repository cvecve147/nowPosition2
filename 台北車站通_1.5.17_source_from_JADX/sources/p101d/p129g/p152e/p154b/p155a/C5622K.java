package p101d.p129g.p152e.p154b.p155a;

import java.net.URI;
import java.net.URISyntaxException;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5738v;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.K */
class C5622K extends C5593I<URI> {
    C5622K() {
    }

    /* renamed from: a */
    public URI m21308a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        try {
            String o = bVar.mo15164o();
            if ("null".equals(o)) {
                return null;
            }
            return new URI(o);
        } catch (URISyntaxException e) {
            throw new C5738v((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, URI uri) {
        dVar.mo15181c(uri == null ? null : uri.toASCIIString());
    }
}
