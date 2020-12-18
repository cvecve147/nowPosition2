package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.net.model.GiftData;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p208e.p221b.C6434m;
import p208e.p221b.C6435n;

/* renamed from: com.openlife.checkme.activity.gift.list.w */
class C4614w implements C6435n<List<GiftData>> {

    /* renamed from: a */
    final /* synthetic */ int f13405a;

    /* renamed from: b */
    final /* synthetic */ List f13406b;

    /* renamed from: c */
    final /* synthetic */ C4615x f13407c;

    C4614w(C4615x xVar, int i, List list) {
        this.f13407c = xVar;
        this.f13405a = i;
        this.f13406b = list;
    }

    /* renamed from: a */
    public void mo12848a(C6434m<List<GiftData>> mVar) {
        Comparator comparator;
        List list;
        int i = this.f13405a;
        if (i == 0) {
            list = this.f13406b;
            comparator = new C4611t(this);
        } else if (i != 1) {
            if (i == 2) {
                list = this.f13406b;
                comparator = new C4613v(this);
            }
            mVar.mo16339a(this.f13406b);
            mVar.mo16340c();
        } else {
            list = this.f13406b;
            comparator = new C4612u(this);
        }
        Collections.sort(list, comparator);
        mVar.mo16339a(this.f13406b);
        mVar.mo16340c();
    }
}
