package com.openlife.checkme.activity.store.list;

import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.activity.store.list.C4825c;
import com.openlife.checkme.activity.store.list.C4827e;

/* renamed from: com.openlife.checkme.activity.store.list.i */
public class C4831i<V extends C4827e, M extends C4825c> extends C4826d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4827e f13861d;

    /* renamed from: e */
    private C4825c f13862e;

    public C4831i(V v, M m) {
        super(v, m);
        this.f13861d = v;
        this.f13862e = m;
    }

    /* renamed from: c */
    private void m19011c() {
        C4458a a = mo13150a();
        C4825c cVar = this.f13862e;
        C4464g.m17699a(a, cVar.mo13306a(cVar.mo13308k()), new C4829g(this), this.f13861d);
    }

    /* renamed from: d */
    private void m19012d() {
        C4458a a = mo13150a();
        C4825c cVar = this.f13862e;
        C4464g.m17699a(a, cVar.mo13307a(cVar.mo13309l()), new C4830h(this), this.f13861d);
    }

    /* renamed from: b */
    public void mo12683b(int i) {
        if (i == 0) {
            m19011c();
        } else if (i == 1) {
            m19012d();
        }
    }
}
