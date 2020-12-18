package com.openlife.checkme.activity.gift.detail;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.GiftDetailBody;
import com.openlife.checkme.net.model.GiftDetailResponse;
import com.openlife.checkme.net.model.RedeemGiftBody;
import com.openlife.checkme.net.model.RedeemGiftResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.gift.detail.f */
public interface C4580f extends C4703m {
    /* renamed from: a */
    GiftDetailBody mo12792a();

    /* renamed from: a */
    C6433l<GiftDetailResponse> mo12793a(GiftDetailBody giftDetailBody, int i);

    /* renamed from: a */
    C6433l<RedeemGiftResponse> mo12794a(RedeemGiftBody redeemGiftBody, int i);

    /* renamed from: b */
    RedeemGiftBody mo12795b();
}
