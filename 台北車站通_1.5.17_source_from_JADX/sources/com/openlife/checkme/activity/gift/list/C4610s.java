package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.GiftData;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.gift.list.s */
class C4610s implements C6242d<List<GiftData>> {

    /* renamed from: a */
    final /* synthetic */ int f13400a;

    /* renamed from: b */
    final /* synthetic */ C4615x f13401b;

    C4610s(C4615x xVar, int i) {
        this.f13401b = xVar;
        this.f13400a = i;
    }

    /* renamed from: a */
    public void accept(List<GiftData> list) {
        this.f13401b.f13408d.mo12815d(this.f13400a);
        this.f13401b.f13408d.mo12812a(list);
    }
}
