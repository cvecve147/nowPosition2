package com.openlife.checkme.activity.account.redemption.detail;

import com.openlife.checkme.net.model.UpdateRedemptionResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.redemption.detail.m */
class C4513m implements C6242d<UpdateRedemptionResponse> {

    /* renamed from: a */
    final /* synthetic */ C4515o f13227a;

    C4513m(C4515o oVar) {
        this.f13227a = oVar;
    }

    /* renamed from: a */
    public void accept(UpdateRedemptionResponse updateRedemptionResponse) {
        if (this.f13227a.mo13153a((C4953c) updateRedemptionResponse)) {
            this.f13227a.f13229d.mo12665a(true);
        }
    }
}
