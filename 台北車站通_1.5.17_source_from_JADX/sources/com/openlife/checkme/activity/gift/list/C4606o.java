package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftListResponse;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.gift.list.o */
class C4606o implements C6242d<BiResponse> {

    /* renamed from: a */
    final /* synthetic */ C4615x f13396a;

    C4606o(C4615x xVar) {
        this.f13396a = xVar;
    }

    /* renamed from: a */
    public void accept(BiResponse biResponse) {
        if (this.f13396a.mo13153a(biResponse.getResponse1()) && this.f13396a.mo13153a(biResponse.getResponse2())) {
            this.f13396a.f13408d.mo12811a(((GiftAdResponse) biResponse.getResponse1()).getData());
            this.f13396a.f13408d.mo12813b(((GiftListResponse) biResponse.getResponse2()).getData());
        }
    }
}
