package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.activity.mission.detail.C4714j;
import com.openlife.checkme.activity.mission.detail.C4716l;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.sdk.p098a.C4977h;

/* renamed from: com.openlife.checkme.activity.mission.detail.p */
public class C4720p<V extends C4716l, M extends C4714j> extends C4715k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4716l f13637d;

    /* renamed from: e */
    private C4714j f13638e;

    /* renamed from: f */
    private C4977h f13639f;

    public C4720p(V v, M m) {
        super(v, m);
        this.f13637d = v;
        this.f13638e = m;
        this.f13639f = new C4977h(v, m);
    }

    /* renamed from: a */
    public void mo13084a(int i, Execution execution) {
        C4458a a = mo13150a();
        C4714j jVar = this.f13638e;
        C4464g.m17699a(a, jVar.mo13073a(jVar.mo13071a(i, execution)), new C4719o(this), this.f13637d);
    }

    /* renamed from: a */
    public void mo13085a(C4789a aVar) {
        this.f13639f.mo13987a(aVar);
    }

    /* renamed from: b */
    public void mo12683b(int i) {
        C4458a a = mo13150a();
        C4714j jVar = this.f13638e;
        C4464g.m17699a(a, jVar.mo13074a(jVar.mo13072a(), i), new C4718n(this), this.f13637d);
    }

    /* renamed from: c */
    public void mo13086c() {
        this.f13637d.mo13051a(this.f13638e.mo12986j() != 2);
    }

    /* renamed from: d */
    public void mo13087d() {
        if (this.f13638e.mo12982e()) {
            this.f13637d.mo13045a();
        } else {
            this.f13637d.mo13053c(this.f13638e.mo12986j());
        }
    }
}
