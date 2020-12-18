package p101d.p129g.p152e.p154b.p155a;

import java.util.Iterator;
import java.util.Map;
import p101d.p129g.p152e.C5585A;
import p101d.p129g.p152e.C5593I;
import p101d.p129g.p152e.C5734r;
import p101d.p129g.p152e.C5737u;
import p101d.p129g.p152e.C5739w;
import p101d.p129g.p152e.C5740x;
import p101d.p129g.p152e.p154b.C5702u;
import p101d.p129g.p152e.p158d.C5716b;
import p101d.p129g.p152e.p158d.C5718d;

/* renamed from: d.g.e.b.a.T */
class C5630T extends C5593I<C5737u> {
    C5630T() {
    }

    /* renamed from: a */
    public C5737u m21337a(C5716b bVar) {
        switch (C5641ba.f15605a[bVar.mo15165p().ordinal()]) {
            case 1:
                return new C5585A((Number) new C5702u(bVar.mo15164o()));
            case 2:
                return new C5585A(Boolean.valueOf(bVar.mo15158i()));
            case 3:
                return new C5585A(bVar.mo15164o());
            case 4:
                bVar.mo15163n();
                return C5739w.f15854a;
            case 5:
                C5734r rVar = new C5734r();
                bVar.mo15151a();
                while (bVar.mo15157g()) {
                    rVar.mo15305a(m21337a(bVar));
                }
                bVar.mo15154d();
                return rVar;
            case 6:
                C5740x xVar = new C5740x();
                bVar.mo15152b();
                while (bVar.mo15157g()) {
                    xVar.mo15321a(bVar.mo15162m(), m21337a(bVar));
                }
                bVar.mo15155e();
                return xVar;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public void mo15097a(C5718d dVar, C5737u uVar) {
        if (uVar == null || uVar.mo15314f()) {
            dVar.mo15186h();
        } else if (uVar.mo15316h()) {
            C5585A c = uVar.mo15312c();
            if (c.mo15093t()) {
                dVar.mo15177a(c.mo15091r());
            } else if (c.mo15092s()) {
                dVar.mo15184d(c.mo15086i());
            } else {
                dVar.mo15181c(c.mo15083d());
            }
        } else if (uVar.mo15313e()) {
            dVar.mo15174a();
            Iterator<C5737u> it = uVar.mo15310a().iterator();
            while (it.hasNext()) {
                mo15097a(dVar, it.next());
            }
            dVar.mo15180c();
        } else if (uVar.mo15315g()) {
            dVar.mo15179b();
            for (Map.Entry next : uVar.mo15311b().mo15324i()) {
                dVar.mo15178a((String) next.getKey());
                mo15097a(dVar, (C5737u) next.getValue());
            }
            dVar.mo15183d();
        } else {
            throw new IllegalArgumentException("Couldn't write " + uVar.getClass());
        }
    }
}
