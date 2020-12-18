package com.openlife.checkme.activity.account.redemption.detail;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.RedeemHistoryDetailBody;
import com.openlife.checkme.net.model.RedeemHistoryDetailResponse;
import com.openlife.checkme.net.model.UpdateRedemptionResponse;
import com.openlife.checkme.p097f.C4952b;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.account.redemption.detail.i */
public interface C4509i extends C4703m {
    /* renamed from: a */
    RedeemHistoryDetailBody mo12676a();

    /* renamed from: a */
    C6433l<UpdateRedemptionResponse> mo12677a(C4952b bVar, int i);

    /* renamed from: a */
    C6433l<RedeemHistoryDetailResponse> mo12678a(RedeemHistoryDetailBody redeemHistoryDetailBody, int i);

    /* renamed from: b */
    C4952b mo12679b();
}
