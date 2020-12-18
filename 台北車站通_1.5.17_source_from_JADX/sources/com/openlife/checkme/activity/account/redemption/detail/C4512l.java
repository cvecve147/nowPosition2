package com.openlife.checkme.activity.account.redemption.detail;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.RedeemHistoryDetailBody;
import com.openlife.checkme.net.model.RedeemHistoryDetailResponse;
import com.openlife.checkme.net.model.UpdateRedemptionResponse;
import com.openlife.checkme.p097f.C4952b;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.redemption.detail.l */
public class C4512l extends C4673l implements C4509i {
    /* renamed from: a */
    public RedeemHistoryDetailBody mo12676a() {
        return new RedeemHistoryDetailBody();
    }

    /* renamed from: a */
    public C6433l<UpdateRedemptionResponse> mo12677a(C4952b bVar, int i) {
        return this.f13552a.mo13605b().mo13556a(bVar.getSignature(), bVar, i);
    }

    /* renamed from: a */
    public C6433l<RedeemHistoryDetailResponse> mo12678a(RedeemHistoryDetailBody redeemHistoryDetailBody, int i) {
        return this.f13552a.mo13605b().mo13582a(redeemHistoryDetailBody.getSignature(), redeemHistoryDetailBody, i);
    }

    /* renamed from: b */
    public C4952b mo12679b() {
        return new C4952b();
    }
}
