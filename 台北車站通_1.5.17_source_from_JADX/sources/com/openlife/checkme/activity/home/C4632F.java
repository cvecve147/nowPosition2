package com.openlife.checkme.activity.home;

import com.openlife.checkme.net.model.HomeAdResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.home.F */
class C4632F implements C6242d<HomeAdResponse> {

    /* renamed from: a */
    final /* synthetic */ C4633G f13433a;

    C4632F(C4633G g) {
        this.f13433a = g;
    }

    /* renamed from: a */
    public void accept(HomeAdResponse homeAdResponse) {
        if (this.f13433a.mo13153a((C4953c) homeAdResponse)) {
            this.f13433a.f13435e.mo12883b(homeAdResponse.getData().getBanner());
        }
    }
}
