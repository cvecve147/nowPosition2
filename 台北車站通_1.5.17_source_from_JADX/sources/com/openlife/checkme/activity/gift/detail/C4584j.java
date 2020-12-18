package com.openlife.checkme.activity.gift.detail;

import com.openlife.checkme.net.model.GiftDetailResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.gift.detail.j */
class C4584j implements C6242d<GiftDetailResponse> {

    /* renamed from: a */
    final /* synthetic */ C4586l f13350a;

    C4584j(C4586l lVar) {
        this.f13350a = lVar;
    }

    /* renamed from: a */
    public void accept(GiftDetailResponse giftDetailResponse) {
        if (this.f13350a.mo13153a((C4953c) giftDetailResponse)) {
            this.f13350a.f13352d.mo12784a(giftDetailResponse.getData());
        }
    }
}
