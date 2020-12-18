package com.openlife.checkme.sdk.p098a;

import com.openlife.checkme.activity.C4757r;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.splash.p090a.C4789a;
import com.openlife.checkme.net.model.AuthLoginBody;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.sdk.a.h */
public class C4977h extends C4757r {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4970a f14152d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4971b f14153e;

    public C4977h(C4971b bVar, C4970a aVar) {
        super(bVar, aVar);
        this.f14153e = bVar;
        this.f14152d = aVar;
    }

    /* renamed from: a */
    public void mo13987a(C4789a aVar) {
        this.f14152d.mo13078a(1);
        AuthLoginBody a = this.f14152d.mo13075a(aVar);
        C4458a a2 = mo13150a();
        C4970a aVar2 = this.f14152d;
        a2.mo12586a(C6433l.m24022a(aVar2.mo13077a(aVar2.mo13081b()), this.f14152d.mo13076a(a), new C4976g(this)).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4975f(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4973d(this, a), (C6242d<? super Throwable>) new C4974e(this)));
    }
}
