package p101d.p129g.p152e.p154b.p155a;

import java.net.URL;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.J */
class C5621J extends C5593I<URL> {
    C5621J() {
    }

    /* renamed from: a */
    public URL m21304a(C5716b bVar) {
        if (bVar.mo15165p() == C5717c.NULL) {
            bVar.mo15163n();
            return null;
        }
        String o = bVar.mo15164o();
        if ("null".equals(o)) {
            return null;
        }
        return new URL(o);
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, URL url) {
        dVar.mo15181c(url == null ? null : url.toExternalForm());
    }
}
