package com.openlife.checkme.activity.gift.detail;

import com.openlife.checkme.net.model.RedeemGiftResponse;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.gift.detail.k */
class C4585k implements C6242d<RedeemGiftResponse> {

    /* renamed from: a */
    final /* synthetic */ C4586l f13351a;

    C4585k(C4586l lVar) {
        this.f13351a = lVar;
    }

    /* renamed from: a */
    public void accept(RedeemGiftResponse redeemGiftResponse) {
        if (this.f13351a.mo13156c(redeemGiftResponse)) {
            this.f13351a.f13353e.mo12981d(redeemGiftResponse.getData().getCurrentPointStr());
            if (redeemGiftResponse.isShowMessage()) {
                this.f13351a.f13352d.mo12783a(redeemGiftResponse.getData().getRedeemId(), redeemGiftResponse.getMessage());
            }
        }
    }
}
