package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.GiftAdBody;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftListBody;
import com.openlife.checkme.net.model.GiftListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.gift.list.n */
public class C4605n extends C4673l implements C4601j {
    /* renamed from: a */
    public GiftListBody mo12831a() {
        return new GiftListBody();
    }

    /* renamed from: a */
    public C6433l<GiftAdResponse> mo12832a(GiftAdBody giftAdBody) {
        return this.f13552a.mo13605b().mo13566a(giftAdBody.getSignature(), giftAdBody);
    }

    /* renamed from: a */
    public C6433l<GiftListResponse> mo12833a(GiftListBody giftListBody) {
        return this.f13552a.mo13605b().mo13568a(giftListBody.getSignature(), giftListBody);
    }

    /* renamed from: a */
    public C6433l<BiResponse> mo12834a(C6433l<GiftAdResponse> lVar, C6433l<GiftListResponse> lVar2) {
        return C6433l.m24022a(lVar, lVar2, new C4604m(this));
    }

    /* renamed from: b */
    public GiftAdBody mo12835b() {
        return new GiftAdBody();
    }
}
