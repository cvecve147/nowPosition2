package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftListResponse;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6240b;

/* renamed from: com.openlife.checkme.activity.gift.list.m */
class C4604m implements C6240b<GiftAdResponse, GiftListResponse, BiResponse> {

    /* renamed from: a */
    final /* synthetic */ C4605n f13395a;

    C4604m(C4605n nVar) {
        this.f13395a = nVar;
    }

    /* renamed from: a */
    public BiResponse apply(GiftAdResponse giftAdResponse, GiftListResponse giftListResponse) {
        return C4883m.m19218a((C4953c) giftAdResponse, (C4953c) giftListResponse);
    }
}
