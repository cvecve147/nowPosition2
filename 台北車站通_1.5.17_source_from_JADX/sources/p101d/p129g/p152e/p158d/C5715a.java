package p101d.p129g.p152e.p158d;

import p101d.p129g.p152e.p154b.C5701t;
import p101d.p129g.p152e.p154b.p155a.C5653h;

/* renamed from: d.g.e.d.a */
class C5715a extends C5701t {
    C5715a() {
    }

    /* renamed from: a */
    public void mo15220a(C5716b bVar) {
        int i;
        if (bVar instanceof C5653h) {
            ((C5653h) bVar).mo15167r();
            return;
        }
        int i2 = bVar.f15799i;
        if (i2 == 0) {
            i2 = bVar.mo15273c();
        }
        if (i2 == 13) {
            i = 9;
        } else if (i2 == 12) {
            i = 8;
        } else if (i2 == 14) {
            i = 10;
        } else {
            throw new IllegalStateException("Expected a name but was " + bVar.mo15165p() + bVar.m21579t());
        }
        bVar.f15799i = i;
    }
}
