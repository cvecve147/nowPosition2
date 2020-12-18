package com.openlife.checkme.activity.account.redemption;

import com.openlife.checkme.net.model.RedeemHistoryResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.redemption.h */
class C4519h implements C6242d<RedeemHistoryResponse> {

    /* renamed from: a */
    final /* synthetic */ int f13233a;

    /* renamed from: b */
    final /* synthetic */ C4520i f13234b;

    C4519h(C4520i iVar, int i) {
        this.f13234b = iVar;
        this.f13233a = i;
    }

    /* renamed from: a */
    public void accept(RedeemHistoryResponse redeemHistoryResponse) {
        if (this.f13234b.mo13153a((C4953c) redeemHistoryResponse)) {
            if (this.f13233a == 3) {
                this.f13234b.f13235d.mo12655b();
            }
            if (!redeemHistoryResponse.getData().isEmpty()) {
                this.f13234b.f13235d.mo12654a(redeemHistoryResponse.getData());
            } else {
                this.f13234b.f13235d.mo12653a();
            }
        }
    }
}
