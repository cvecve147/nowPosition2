package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.GiftAdBody;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftListBody;
import com.openlife.checkme.net.model.GiftListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.gift.list.j */
public interface C4601j extends C4703m {
    /* renamed from: a */
    GiftListBody mo12831a();

    /* renamed from: a */
    C6433l<GiftAdResponse> mo12832a(GiftAdBody giftAdBody);

    /* renamed from: a */
    C6433l<GiftListResponse> mo12833a(GiftListBody giftListBody);

    /* renamed from: a */
    C6433l<BiResponse> mo12834a(C6433l<GiftAdResponse> lVar, C6433l<GiftListResponse> lVar2);

    /* renamed from: b */
    GiftAdBody mo12835b();
}
