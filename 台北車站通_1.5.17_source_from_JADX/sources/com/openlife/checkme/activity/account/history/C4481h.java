package com.openlife.checkme.activity.account.history;

import com.openlife.checkme.activity.account.history.C4475b;
import com.openlife.checkme.activity.account.history.C4477d;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.account.history.h */
public class C4481h<V extends C4477d, M extends C4475b> extends C4476c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4477d f13175d;

    /* renamed from: e */
    private C4475b f13176e;

    public C4481h(V v, M m) {
        super(v, m);
        this.f13175d = v;
        this.f13176e = m;
    }

    /* renamed from: c */
    private void m17769c(int i) {
        C4458a a = mo13150a();
        C4475b bVar = this.f13176e;
        C4464g.m17700a(a, bVar.mo12624a(bVar.mo12623a()), new C4479f(this, i), new C4480g(this, i), this.f13175d);
    }

    /* renamed from: c */
    public void mo12627c() {
        m17769c(2);
    }

    /* renamed from: d */
    public void mo12628d() {
        m17769c(3);
    }
}
