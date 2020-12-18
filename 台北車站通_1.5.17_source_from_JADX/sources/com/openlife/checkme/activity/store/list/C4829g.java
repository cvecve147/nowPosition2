package com.openlife.checkme.activity.store.list;

import com.openlife.checkme.net.model.ChainStoreListResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.store.list.g */
class C4829g implements C6242d<ChainStoreListResponse> {

    /* renamed from: a */
    final /* synthetic */ C4831i f13859a;

    C4829g(C4831i iVar) {
        this.f13859a = iVar;
    }

    /* renamed from: a */
    public void accept(ChainStoreListResponse chainStoreListResponse) {
        if (this.f13859a.mo13153a((C4953c) chainStoreListResponse)) {
            this.f13859a.f13861d.mo13301a(chainStoreListResponse.getData());
        }
    }
}
