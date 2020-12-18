package com.openlife.checkme.activity.gift.list;

import com.openlife.checkme.activity.gift.list.C4601j;
import com.openlife.checkme.activity.gift.list.C4603l;
import com.openlife.checkme.activity.gift.list.GiftListFragment;
import com.openlife.checkme.activity.p088a.C4458a;
import com.openlife.checkme.activity.p088a.C4464g;
import com.openlife.checkme.net.model.GiftAdResponse;
import com.openlife.checkme.net.model.GiftData;
import java.util.List;
import p208e.p221b.C6433l;
import p208e.p221b.p222a.p224b.C6216b;
import p208e.p221b.p225b.C6223b;
import p208e.p221b.p227d.C6239a;
import p208e.p221b.p227d.C6242d;
import p208e.p221b.p243h.C6418a;

/* renamed from: com.openlife.checkme.activity.gift.list.x */
public class C4615x<V extends C4603l, M extends C4601j> extends C4602k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4603l f13408d;

    /* renamed from: e */
    private C4601j f13409e;

    C4615x(V v, M m) {
        super(v, m);
        this.f13408d = v;
        this.f13409e = m;
    }

    /* renamed from: b */
    private C6433l<List<GiftData>> m18188b(List<GiftData> list, int i) {
        return C6433l.m24018a(new C4614w(this, i, list));
    }

    /* renamed from: a */
    public void mo12849a(GiftListFragment.C4590a aVar) {
        int a = aVar.mo12824a();
        if (a == 22) {
            aVar.mo12825a(23);
        } else if (a == 23) {
            aVar.mo12825a(22);
        }
        this.f13408d.mo12810a(aVar.mo12824a());
        this.f13408d.mo12814c(aVar.mo12824a());
    }

    /* renamed from: a */
    public void mo12850a(List<GiftData> list, int i) {
        C4464g.m17699a(mo13150a(), m18188b(list, i), new C4610s(this, i), this.f13408d);
    }

    /* renamed from: c */
    public void mo12851c() {
        C4458a a = mo13150a();
        C4601j jVar = this.f13409e;
        C6433l<GiftAdResponse> a2 = jVar.mo12832a(jVar.mo12835b());
        C4601j jVar2 = this.f13409e;
        a.mo12586a(jVar.mo12834a(a2, jVar2.mo12833a(jVar2.mo12831a())).mo16545b(C6418a.m23996b()).mo16533a((C6242d<? super C6223b>) new C4609r(this)).mo16544b((C6239a) new C4608q(this)).mo16540a(C6216b.m23500a()).mo16526a(new C4606o(this), (C6242d<? super Throwable>) new C4607p(this)));
    }
}
