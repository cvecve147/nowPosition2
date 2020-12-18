package p101d.p129g.p152e.p154b.p155a;

import java.net.InetAddress;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5717c;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.L */
class C5623L extends C5593I<InetAddress> {
    C5623L() {
    }

    /* renamed from: a */
    public InetAddress m21312a(C5716b bVar) {
        if (bVar.mo15165p() != C5717c.NULL) {
            return InetAddress.getByName(bVar.mo15164o());
        }
        bVar.mo15163n();
        return null;
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, InetAddress inetAddress) {
        dVar.mo15181c(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
