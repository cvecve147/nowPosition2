package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.SystemConfigResponse;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.sdk.b.k */
public class C4992k extends C4757r {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4982a f14181d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4983b f14182e;

    public C4992k(C4983b bVar, C4982a aVar) {
        super(bVar, aVar);
        this.f14181d = aVar;
        this.f14182e = bVar;
    }

    /* renamed from: a */
    public void mo13151a(int i) {
        C4982a aVar = this.f14181d;
        mo13150a().mo12586a(aVar.mo12973a(aVar.mo12983f()).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4988g(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4991j(this), (C6242d<? super Throwable>) new C4987f(this)));
    }

    /* renamed from: a */
    public void mo14011a(C4789a aVar) {
        this.f14181d.mo13233c(2);
        AuthLoginBody a = this.f14181d.mo13224a(aVar);
        C4458a a2 = mo13150a();
        C4982a aVar2 = this.f14181d;
        C6433l<SystemConfigResponse> a3 = aVar2.mo13227a(aVar2.mo13232b());
        C4982a aVar3 = this.f14181d;
        a2.mo12586a(aVar2.mo14000a(a3, aVar3.mo13226a(aVar3.mo13234g()), this.f14181d.mo13225a(a)).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4990i(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4986e(this, a), (C6242d<? super Throwable>) new C4989h(this)));
    }

    /* renamed from: a */
    public void mo14012a(String str) {
        this.f14181d.mo12977b(str);
    }
}
