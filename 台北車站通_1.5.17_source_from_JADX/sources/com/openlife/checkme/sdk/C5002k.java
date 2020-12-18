package com.openlife.checkme.sdk;

import android.content.Context;
import com.openlife.checkme.p093c.C4883m;
import p101d.p108c.p109a.C5188c;
import p101d.p108c.p109a.C5197l;

/* renamed from: com.openlife.checkme.sdk.k */
class C5002k implements C5197l.C5207j {

    /* renamed from: a */
    final /* synthetic */ String f14196a;

    /* renamed from: b */
    final /* synthetic */ C5004m f14197b;

    C5002k(C5004m mVar, String str) {
        this.f14197b = mVar;
        this.f14196a = str;
    }

    /* renamed from: a */
    public void mo12584a(C5197l lVar, C5188c cVar) {
        C4883m.m19236b((Context) this.f14197b.getActivity(), this.f14196a);
        this.f14197b.mo14003h("LOGIN_FAILED_REFUSE_MIGRATE_PERMISSION");
        this.f14197b.mo14001c();
        this.f14197b.mo12961d();
    }
}
