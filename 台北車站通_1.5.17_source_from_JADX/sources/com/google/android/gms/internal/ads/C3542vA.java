package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.mediation.C1840m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.vA */
public final class C3542vA extends C3080fA {

    /* renamed from: a */
    private final C1840m f10329a;

    public C3542vA(C1840m mVar) {
        this.f10329a = mVar;
    }

    /* renamed from: C */
    public final boolean mo9346C() {
        return this.f10329a.mo7173j();
    }

    /* renamed from: E */
    public final C5464b mo9347E() {
        View r = this.f10329a.mo7181r();
        if (r == null) {
            return null;
        }
        return C5468d.m20961a(r);
    }

    /* renamed from: H */
    public final boolean mo9348H() {
        return this.f10329a.mo7172i();
    }

    /* renamed from: J */
    public final C5464b mo9349J() {
        View a = this.f10329a.mo7149a();
        if (a == null) {
            return null;
        }
        return C5468d.m20961a(a);
    }

    /* renamed from: a */
    public final List mo9350a() {
        List<C1649c.C1651b> h = this.f10329a.mo7171h();
        ArrayList arrayList = new ArrayList();
        if (h != null) {
            for (C1649c.C1651b next : h) {
                arrayList.add(new C3420qv(next.mo6613a(), next.mo6615c(), next.mo6614b()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo9351a(C5464b bVar) {
        this.f10329a.mo7150a((View) C5468d.m20962z(bVar));
    }

    /* renamed from: a */
    public final void mo9352a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        this.f10329a.mo6483a((View) C5468d.m20962z(bVar), (HashMap) C5468d.m20962z(bVar2), (HashMap) C5468d.m20962z(bVar3));
    }

    /* renamed from: b */
    public final String mo9353b() {
        return this.f10329a.mo7168f();
    }

    /* renamed from: b */
    public final void mo9354b(C5464b bVar) {
        this.f10329a.mo7159b((View) C5468d.m20962z(bVar));
    }

    /* renamed from: c */
    public final C5464b mo9355c() {
        Object q = this.f10329a.mo7180q();
        if (q == null) {
            return null;
        }
        return C5468d.m20961a(q);
    }

    /* renamed from: d */
    public final String mo9356d() {
        return this.f10329a.mo7164d();
    }

    /* renamed from: e */
    public final void mo9357e() {
        this.f10329a.mo7179p();
    }

    public final Bundle getExtras() {
        return this.f10329a.mo7166e();
    }

    public final C2987bu getVideoController() {
        if (this.f10329a.mo7177n() != null) {
            return this.f10329a.mo7177n().mo7049a();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo9360h() {
        return this.f10329a.mo7162c();
    }

    /* renamed from: j */
    public final C2793Vv mo9361j() {
        return null;
    }

    /* renamed from: s */
    public final String mo9362s() {
        return this.f10329a.mo7174k();
    }

    /* renamed from: t */
    public final C2903Zv mo9363t() {
        C1649c.C1651b g = this.f10329a.mo7170g();
        if (g != null) {
            return new C3420qv(g.mo6613a(), g.mo6615c(), g.mo6614b());
        }
        return null;
    }

    /* renamed from: u */
    public final double mo9364u() {
        if (this.f10329a.mo7175l() != null) {
            return this.f10329a.mo7175l().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: y */
    public final String mo9365y() {
        return this.f10329a.mo7158b();
    }

    /* renamed from: z */
    public final String mo9366z() {
        return this.f10329a.mo7176m();
    }
}
