package com.openlife.checkme.activity.store.list;

import com.openlife.checkme.net.model.StreetStoreListResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.store.list.h */
class C4830h implements C6242d<StreetStoreListResponse> {

    /* renamed from: a */
    final /* synthetic */ C4831i f13860a;

    C4830h(C4831i iVar) {
        this.f13860a = iVar;
    }

    /* renamed from: a */
    public void accept(StreetStoreListResponse streetStoreListResponse) {
        if (this.f13860a.mo13153a((C4953c) streetStoreListResponse)) {
            this.f13860a.f13861d.mo13301a(streetStoreListResponse.getData());
        }
    }
}
