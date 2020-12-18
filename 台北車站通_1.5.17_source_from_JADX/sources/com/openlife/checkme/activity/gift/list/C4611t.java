package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.GiftData;
import java.util.Comparator;

/* renamed from: com.openlife.checkme.activity.gift.list.t */
class C4611t implements Comparator<GiftData> {

    /* renamed from: a */
    final /* synthetic */ C4614w f13402a;

    C4611t(C4614w wVar) {
        this.f13402a = wVar;
    }

    /* renamed from: a */
    public int compare(GiftData giftData, GiftData giftData2) {
        return giftData.getCategory().compareToIgnoreCase(giftData2.getCategory());
    }
}
