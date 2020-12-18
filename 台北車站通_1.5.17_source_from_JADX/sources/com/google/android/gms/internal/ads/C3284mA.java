package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C1649c;
import com.google.android.gms.ads.mediation.C1835h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p134b.C5468d;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.mA */
public final class C3284mA extends C2994cA {

    /* renamed from: a */
    private final C1835h f9782a;

    public C3284mA(C1835h hVar) {
        this.f9782a = hVar;
    }

    /* renamed from: C */
    public final boolean mo9206C() {
        return this.f9782a.mo7109d();
    }

    /* renamed from: E */
    public final C5464b mo9207E() {
        View h = this.f9782a.mo7113h();
        if (h == null) {
            return null;
        }
        return C5468d.m20961a(h);
    }

    /* renamed from: H */
    public final boolean mo9208H() {
        return this.f9782a.mo7108c();
    }

    /* renamed from: J */
    public final C5464b mo9209J() {
        View a = this.f9782a.mo7100a();
        if (a == null) {
            return null;
        }
        return C5468d.m20961a(a);
    }

    /* renamed from: W */
    public final C2903Zv mo9210W() {
        C1649c.C1651b n = this.f9782a.mo7141n();
        if (n != null) {
            return new C3420qv(n.mo6613a(), n.mo6615c(), n.mo6614b());
        }
        return null;
    }

    /* renamed from: a */
    public final List mo9211a() {
        List<C1649c.C1651b> m = this.f9782a.mo7140m();
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
    public final void mo9212a(C5464b bVar) {
        this.f9782a.mo7101a((View) C5468d.m20962z(bVar));
    }

    /* renamed from: a */
    public final void mo9213a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        this.f9782a.mo7102a((View) C5468d.m20962z(bVar), (HashMap) C5468d.m20962z(bVar2), (HashMap) C5468d.m20962z(bVar3));
    }

    /* renamed from: b */
    public final String mo9214b() {
        return this.f9782a.mo7139l();
    }

    /* renamed from: b */
    public final void mo9215b(C5464b bVar) {
        this.f9782a.mo7107c((View) C5468d.m20962z(bVar));
    }

    /* renamed from: c */
    public final C5464b mo9216c() {
        return null;
    }

    /* renamed from: c */
    public final void mo9217c(C5464b bVar) {
        this.f9782a.mo6482b((View) C5468d.m20962z(bVar));
    }

    /* renamed from: d */
    public final String mo9218d() {
        return this.f9782a.mo7138k();
    }

    /* renamed from: e */
    public final void mo9219e() {
        this.f9782a.mo7112g();
    }

    public final Bundle getExtras() {
        return this.f9782a.mo7105b();
    }

    public final C2987bu getVideoController() {
        if (this.f9782a.mo7110e() != null) {
            return this.f9782a.mo7110e().mo7049a();
        }
        return null;
    }

    /* renamed from: h */
    public final String mo9222h() {
        return this.f9782a.mo7137j();
    }

    /* renamed from: j */
    public final C2793Vv mo9223j() {
        return null;
    }

    /* renamed from: y */
    public final String mo9224y() {
        return this.f9782a.mo7136i();
    }
}
