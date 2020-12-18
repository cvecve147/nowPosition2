package com.openlife.checkme.activity.account.overview;

import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.account.overview.C4487b;
import com.openlife.checkme.activity.account.overview.C4489d;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.account.overview.h */
public class C4493h<V extends C4489d, M extends C4487b> extends C4488c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4489d f13189d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4487b f13190e;

    public C4493h(V v, M m) {
        super(v, m);
        this.f13189d = v;
        this.f13190e = m;
    }

    /* renamed from: a */
    public void mo12647a(String str) {
        if (str.isEmpty()) {
            this.f13189d.mo12634a(Integer.valueOf(C4961l.g_e_emptyform));
            return;
        }
        this.f13189d.mo12634a((Integer) null);
        C4458a a = mo13150a();
        C4487b bVar = this.f13190e;
        C4464g.m17699a(a, bVar.mo12644a(bVar.mo12642a(str)), new C4491f(this), this.f13189d);
    }

    /* renamed from: c */
    public void mo12648c() {
        C4458a a = mo13150a();
        C4487b bVar = this.f13190e;
        C4464g.m17699a(a, bVar.mo12643a(bVar.mo12641a()), new C4492g(this), this.f13189d);
    }
}
