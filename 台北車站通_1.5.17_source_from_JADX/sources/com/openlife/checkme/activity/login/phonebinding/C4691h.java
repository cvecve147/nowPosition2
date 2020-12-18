package com.openlife.checkme.activity.login.phonebinding;

import com.openlife.checkme.C4961l;
import com.openlife.checkme.activity.login.phonebinding.C4686c;
import com.openlife.checkme.activity.login.phonebinding.C4688e;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;

/* renamed from: com.openlife.checkme.activity.login.phonebinding.h */
public class C4691h<V extends C4688e, M extends C4686c> extends C4687d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4688e f13583d;

    /* renamed from: e */
    private C4686c f13584e;

    public C4691h(V v, M m) {
        super(v, m);
        this.f13583d = v;
        this.f13584e = m;
    }

    /* renamed from: a */
    public void mo13018a(String str) {
        if (str.isEmpty()) {
            this.f13583d.mo13003a(Integer.valueOf(C4961l.g_e_emptyform));
            return;
        }
        this.f13583d.mo13003a((Integer) null);
        C4458a a = mo13150a();
        C4686c cVar = this.f13584e;
        C4464g.m17699a(a, cVar.mo13016a(cVar.mo13015a(str)), new C4690g(this, str), this.f13583d);
    }
}
