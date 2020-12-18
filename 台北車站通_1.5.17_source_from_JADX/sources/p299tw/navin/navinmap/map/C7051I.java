package p299tw.navin.navinmap.map;

import p208e.p221b.p227d.C6242d;
import p299tw.navin.navinmap.map.C7030F;
import p299tw.navin.navinmap.map.C7112l;

/* renamed from: tw.navin.navinmap.map.I */
class C7051I implements C6242d<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C7030F.C7047q f19398a;

    C7051I(C7030F.C7047q qVar) {
        this.f19398a = qVar;
    }

    /* renamed from: a */
    public void accept(Boolean bool) {
        if (bool.booleanValue()) {
            C7030F.this.m26430e(true);
            C7030F.this.mo21016i();
            if (C7030F.this.f19332B || !C7109ja.m26767a().mo21177e()) {
                C7112l.C7120h c = C7109ja.m26767a().mo21175c();
                C7030F.this.f19351f.mo21084a((C7112l.C7123k) null, (C7112l.C7120h) null, false);
                C7030F.this.m26410a(c.f19619a, true, true, false);
            }
            C7030F.this.m26426c(false, false);
            C7030F.this.m26444k();
        }
    }
}
