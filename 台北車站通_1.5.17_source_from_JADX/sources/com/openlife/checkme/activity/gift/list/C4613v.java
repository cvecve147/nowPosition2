package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.GiftData;
import java.util.Comparator;

/* renamed from: com.openlife.checkme.activity.gift.list.v */
class C4613v implements Comparator<GiftData> {

    /* renamed from: a */
    final /* synthetic */ C4614w f13404a;

    C4613v(C4614w wVar) {
        this.f13404a = wVar;
    }

    /* renamed from: a */
    public int compare(GiftData giftData, GiftData giftData2) {
        return Integer.valueOf(giftData.getPoint()).compareTo(Integer.valueOf(giftData2.getPoint()));
    }
}
