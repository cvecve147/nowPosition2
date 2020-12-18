package com.openlife.checkme.activity.store;

import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.activity.store.C4817j;
import com.openlife.checkme.activity.store.C4819l;
import com.openlife.checkme.activity.store.StoreFragment;

/* renamed from: com.openlife.checkme.activity.store.o */
public class C4834o<V extends C4819l, M extends C4817j> extends C4818k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4819l f13864d;

    /* renamed from: e */
    private C4817j f13865e;

    public C4834o(V v, M m) {
        super(v, m);
        this.f13864d = v;
        this.f13865e = m;
    }

    /* renamed from: a */
    public void mo13313a(StoreFragment.C4805a aVar) {
        int i;
        switch (aVar.mo13284a()) {
            case 111:
                i = 113;
                break;
            case 112:
                i = 111;
                break;
            case 113:
                i = 112;
                break;
            default:
                this.f13864d.mo13273c(aVar.mo13284a());
                this.f13864d.mo13270a(aVar.mo13284a());
        }
        aVar.mo13285a(i);
        this.f13864d.mo13273c(aVar.mo13284a());
        this.f13864d.mo13270a(aVar.mo13284a());
    }

    /* renamed from: c */
    public void mo13314c() {
        C4458a a = mo13150a();
        C4817j jVar = this.f13865e;
        C4464g.m17699a(a, jVar.mo13292a(jVar.mo13291a()), new C4833n(this), this.f13864d);
    }
}
