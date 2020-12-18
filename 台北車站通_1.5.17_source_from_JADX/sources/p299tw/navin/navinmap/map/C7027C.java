package p299tw.navin.navinmap.map;

import p208e.p221b.p227d.C6242d;
import p299tw.navin.navinmap.map.C7030F;

/* renamed from: tw.navin.navinmap.map.C */
class C7027C implements C6242d<Boolean> {

    /* renamed from: a */
    final /* synthetic */ C7030F f19327a;

    C7027C(C7030F f) {
        this.f19327a = f;
    }

    /* renamed from: a */
    public void accept(Boolean bool) {
        if (bool.booleanValue()) {
            this.f19327a.mo21124b(true);
            this.f19327a.f19351f.mo21090e();
            if (!this.f19327a.m26452o()) {
                C7030F f = this.f19327a;
                C7030F.C7048r unused = f.f19365t = new C7030F.C7048r();
                this.f19327a.f19365t.start();
            }
        }
    }
}
