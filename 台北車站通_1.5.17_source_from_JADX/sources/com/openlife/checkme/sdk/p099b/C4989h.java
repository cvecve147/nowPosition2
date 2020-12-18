package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.C4961l;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.sdk.b.h */
class C4989h implements C6242d<Throwable> {

    /* renamed from: a */
    final /* synthetic */ C4992k f14178a;

    C4989h(C4992k kVar) {
        this.f14178a = kVar;
    }

    /* renamed from: a */
    public void accept(Throwable th) {
        this.f14178a.f14182e.mo14002f(C4961l.g_a_network_error);
        this.f14178a.f14182e.mo14003h(th.getMessage());
        this.f14178a.f14182e.mo14001c();
    }
}
