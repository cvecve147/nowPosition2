package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.GiftData;
import java.util.Comparator;

/* renamed from: com.openlife.checkme.activity.gift.list.u */
class C4612u implements Comparator<GiftData> {

    /* renamed from: a */
    final /* synthetic */ C4614w f13403a;

    C4612u(C4614w wVar) {
        this.f13403a = wVar;
    }

    /* renamed from: a */
    public int compare(GiftData giftData, GiftData giftData2) {
        return Integer.valueOf(giftData2.getPoint()).compareTo(Integer.valueOf(giftData.getPoint()));
    }
}
