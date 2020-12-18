package com.openlife.checkme.activity.login.smsbinding;

import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.login.smsbinding.C4696e;
import com.openlife.checkme.activity.login.smsbinding.C4698g;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.login.smsbinding.k */
public class C4702k<V extends C4698g, M extends C4696e> extends C4697f {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4698g f13599d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4696e f13600e;

    public C4702k(V v, M m) {
        super(v, m);
        this.f13599d = v;
        this.f13600e = m;
    }

    /* renamed from: a */
    public void mo13038a(String str) {
        C4458a a = mo13150a();
        C4696e eVar = this.f13600e;
        C4464g.m17699a(a, eVar.mo13033a(eVar.mo13032a(str)), new C4701j(this), this.f13599d);
    }

    /* renamed from: a */
    public void mo13039a(String str, String str2) {
        if (str2.isEmpty()) {
            this.f13599d.mo13021a(Integer.valueOf(C4961l.g_e_emptyform));
            return;
        }
        this.f13599d.mo13021a((Integer) null);
        C4458a a = mo13150a();
        C4696e eVar = this.f13600e;
        C4464g.m17699a(a, eVar.mo13034a(eVar.mo13035b(str, str2)), new C4700i(this), this.f13599d);
    }
}
