package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.mediation.C1834g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.lA */
public final class C3255lA extends C2935_z {

    /* renamed from: a */
    private final C1834g f9737a;

    public C3255lA(C1834g gVar) {
        this.f9737a = gVar;
    }

    /* renamed from: C */
    public final boolean mo9092C() {
        return this.f9737a.mo7109d();
    }

    /* renamed from: E */
    public final C5464b mo9093E() {
        View h = this.f9737a.mo7113h();
        if (h == null) {
            return null;
        }
        return C5468d.m20961a(h);
    }

    /* renamed from: H */
    public final boolean mo9094H() {
        return this.f9737a.mo7108c();
    }

    /* renamed from: J */
    public final C5464b mo9095J() {
        View a = this.f9737a.mo7100a();
        if (a == null) {
            return null;
        }
        return C5468d.m20961a(a);
    }

    /* renamed from: a */
    public final List mo9096a() {
        List<C1649c.C1651b> m = this.f9737a.mo7126m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1649c.C1651b next : m) {
            arrayList.add(new C3420qv(next.mo6613a(), next.mo6615c(), next.mo6614b()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo9097a(C5464b bVar) {
        this.f9737a.mo7101a((View) C5468d.m20962z(bVar));
    }

    /* renamed from: a */
    public final void mo9098a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        this.f9737a.mo7102a((View) C5468d.m20962z(bVar), (HashMap) C5468d.m20962z(bVar2), (HashMap) C5468d.m20962z(bVar3));
    }

    /* renamed from: b */
    public final String mo9099b() {
        return this.f9737a.mo7124k();
    }

    /* renamed from: b */
    public final void mo9100b(C5464b bVar) {
        this.f9737a.mo7107c((View) C5468d.m20962z(bVar));
    }

    /* renamed from: c */
    public final C5464b mo9101c() {
        return null;
    }

    /* renamed from: c */
    public final void mo9102c(C5464b bVar) {
        this.f9737a.mo6482b((View) C5468d.m20962z(bVar));
    }

    /* renamed from: d */
    public final String mo9103d() {
        return this.f9737a.mo7123j();
    }

    /* renamed from: e */
    public final void mo9104e() {
        this.f9737a.mo7112g();
    }

    public final Bundle getExtras() {
        return this.f9737a.mo7105b();
    }

    public final C2987bu getVideoController() {
        if (this.f9737a.mo7110e() != null) {
            return this.f9737a.mo7110e().mo7049a();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo9107h() {
        return this.f9737a.mo7122i();
    }

    /* renamed from: j */
    public final C2793Vv mo9108j() {
        return null;
    }

    /* renamed from: s */
    public final String mo9109s() {
        return this.f9737a.mo7127n();
    }

    /* renamed from: t */
    public final C2903Zv mo9110t() {
        C1649c.C1651b l = this.f9737a.mo7125l();
        if (l != null) {
            return new C3420qv(l.mo6613a(), l.mo6615c(), l.mo6614b());
        }
        return null;
    }

    /* renamed from: u */
    public final double mo9111u() {
        return this.f9737a.mo7128o();
    }

    /* renamed from: z */
    public final String mo9112z() {
        return this.f9737a.mo7129p();
    }
}
