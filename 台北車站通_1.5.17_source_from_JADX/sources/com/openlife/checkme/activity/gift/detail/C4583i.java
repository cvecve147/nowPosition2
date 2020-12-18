package com.openlife.checkme.activity.gift.detail;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.GiftDetailBody;
import com.openlife.checkme.net.model.GiftDetailResponse;
import com.openlife.checkme.net.model.RedeemGiftBody;
import com.openlife.checkme.net.model.RedeemGiftResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.gift.detail.i */
public class C4583i extends C4673l implements C4580f {
    /* renamed from: a */
    public GiftDetailBody mo12792a() {
        return new GiftDetailBody();
    }

    /* renamed from: a */
    public C6433l<GiftDetailResponse> mo12793a(GiftDetailBody giftDetailBody, int i) {
        return this.f13552a.mo13605b().mo13567a(giftDetailBody.getSignature(), giftDetailBody, i);
    }

    /* renamed from: a */
    public C6433l<RedeemGiftResponse> mo12794a(RedeemGiftBody redeemGiftBody, int i) {
        return this.f13552a.mo13605b().mo13580a(redeemGiftBody.getSignature(), redeemGiftBody, i);
    }

    /* renamed from: b */
    public RedeemGiftBody mo12795b() {
        return new RedeemGiftBody();
    }
}
