package com.openlife.checkme.activity.home;

import android.app.Application;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.home.C4628B;
import com.openlife.checkme.activity.home.C4669z;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.beaconservice.C4868x;
import com.openlife.checkme.net.model.Location;

/* renamed from: com.openlife.checkme.activity.home.G */
public class C4633G<V extends C4628B, M extends C4669z> extends C4627A {

    /* renamed from: d */
    boolean f13434d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4628B f13435e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4669z f13436f;

    /* renamed from: g */
    private C4868x f13437g;

    public C4633G(V v, M m) {
        super(v, m);
        this.f13435e = v;
        this.f13436f = m;
        this.f13437g = new C4868x(v, m);
    }

    /* renamed from: a */
    public void mo12900a(Application application) {
    }

    /* renamed from: a */
    public void mo12901a(Location location) {
        C4458a a = mo13150a();
        C4669z zVar = this.f13436f;
        C4464g.m17700a(a, zVar.mo12889a(zVar.mo12886a(location)), new C4630D(this), new C4631E(this), this.f13435e);
    }

    /* renamed from: a */
    public void mo12902a(Long l) {
        this.f13437g.mo13379a(l);
    }

    /* renamed from: b */
    public void mo12903b(Application application) {
    }

    /* renamed from: c */
    public void mo12904c() {
        if (this.f13436f.mo12982e()) {
            this.f13435e.mo12879a(this.f13436f.mo12985i());
        } else {
            this.f13435e.mo12885d(C4961l.home_guest);
        }
    }

    /* renamed from: d */
    public void mo12905d() {
        this.f13435e.mo12884c(Integer.valueOf(this.f13436f.mo12984h()).intValue());
    }

    /* renamed from: e */
    public void mo12906e() {
        C4458a a = mo13150a();
        C4669z zVar = this.f13436f;
        C4464g.m17699a(a, zVar.mo12888a(zVar.mo12895k()), new C4632F(this), this.f13435e);
    }

    /* renamed from: f */
    public void mo12907f() {
        if (this.f13436f.mo12982e()) {
            this.f13435e.mo12876a();
        } else {
            this.f13435e.mo12882b();
        }
    }
}
