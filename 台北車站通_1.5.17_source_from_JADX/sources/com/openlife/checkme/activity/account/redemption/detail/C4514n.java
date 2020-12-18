package com.openlife.checkme.activity.account.redemption.detail;

import com.openlife.checkme.net.model.RedeemHistoryDetailResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.redemption.detail.n */
class C4514n implements C6242d<RedeemHistoryDetailResponse> {

    /* renamed from: a */
    final /* synthetic */ C4515o f13228a;

    C4514n(C4515o oVar) {
        this.f13228a = oVar;
    }

    /* renamed from: a */
    public void accept(RedeemHistoryDetailResponse redeemHistoryDetailResponse) {
        if (this.f13228a.mo13153a((C4953c) redeemHistoryDetailResponse)) {
            this.f13228a.f13229d.mo12664a(redeemHistoryDetailResponse.getData());
        }
    }
}
