package com.openlife.checkme.activity.account.redemption;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.RedeemHistoryBody;
import com.openlife.checkme.net.model.RedeemHistoryResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.redemption.f */
public class C4517f extends C4673l implements C4499c {
    /* renamed from: a */
    public RedeemHistoryBody mo12661a() {
        return new RedeemHistoryBody();
    }

    /* renamed from: a */
    public C6433l<RedeemHistoryResponse> mo12662a(RedeemHistoryBody redeemHistoryBody) {
        return this.f13552a.mo13605b().mo13581a(redeemHistoryBody.getSignature(), redeemHistoryBody);
    }
}
