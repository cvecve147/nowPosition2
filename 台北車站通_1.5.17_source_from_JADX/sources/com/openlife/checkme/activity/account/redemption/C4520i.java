package com.openlife.checkme.activity.account.redemption;

import com.openlife.checkme.activity.account.redemption.C4499c;
import com.openlife.checkme.activity.account.redemption.C4516e;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.account.redemption.i */
public class C4520i<View extends C4516e, Model extends C4499c> extends C4500d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4516e f13235d;

    /* renamed from: e */
    private C4499c f13236e;

    public C4520i(View view, Model model) {
        super(view, model);
        this.f13235d = view;
        this.f13236e = model;
    }

    /* renamed from: c */
    private void m17885c(int i) {
        C4458a a = mo13150a();
        C4499c cVar = this.f13236e;
        C4464g.m17700a(a, cVar.mo12662a(cVar.mo12661a()), new C4518g(this, i), new C4519h(this, i), this.f13235d);
    }

    /* renamed from: c */
    public void mo12687c() {
        m17885c(2);
    }

    /* renamed from: d */
    public void mo12688d() {
        m17885c(3);
    }
}
