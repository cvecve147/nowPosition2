package com.openlife.checkme.activity.mission.list;

import com.openlife.checkme.activity.mission.list.C4728e;
import com.openlife.checkme.activity.mission.list.C4730g;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.mission.list.l */
public class C4735l<V extends C4730g, M extends C4728e> extends C4729f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4730g f13675d;

    /* renamed from: e */
    private C4728e f13676e;

    public C4735l(V v, M m) {
        super(v, m);
        this.f13675d = v;
        this.f13676e = m;
    }

    /* renamed from: a */
    private void m18678a(int i, int i2) {
        C4458a a = mo13150a();
        C4728e eVar = this.f13676e;
        C4464g.m17700a(a, eVar.mo13117a(eVar.mo13115a(), i2), new C4732i(this, i), new C4733j(this), this.f13675d);
    }

    /* renamed from: b */
    public void mo12683b(int i) {
        m18678a(2, i);
    }

    /* renamed from: c */
    public void mo13121c() {
        this.f13675d.mo13103a(this.f13676e.mo12986j() != 2);
    }

    /* renamed from: c */
    public void mo13122c(int i) {
        m18678a(3, i);
    }

    /* renamed from: d */
    public void mo13123d() {
        if (this.f13676e.mo12986j() == 2) {
            this.f13675d.mo13105g();
        }
    }

    /* renamed from: d */
    public void mo13124d(int i) {
        C4458a a = mo13150a();
        C4728e eVar = this.f13676e;
        C4464g.m17699a(a, eVar.mo13116a(eVar.mo13114a(i)), new C4734k(this), this.f13675d);
    }
}
