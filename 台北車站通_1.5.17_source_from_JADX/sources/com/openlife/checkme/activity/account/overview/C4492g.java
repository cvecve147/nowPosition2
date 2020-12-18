package com.openlife.checkme.activity.account.overview;

import com.openlife.checkme.net.model.PointResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.overview.g */
class C4492g implements C6242d<PointResponse> {

    /* renamed from: a */
    final /* synthetic */ C4493h f13188a;

    C4492g(C4493h hVar) {
        this.f13188a = hVar;
    }

    /* renamed from: a */
    public void accept(PointResponse pointResponse) {
        if (this.f13188a.mo13153a((C4953c) pointResponse)) {
            this.f13188a.f13189d.mo12635a(pointResponse.getData().getCurrentPointStr());
            this.f13188a.f13189d.mo12636b(pointResponse.getData().getExpiredDate(), pointResponse.getData().getExpiredPointStr());
            this.f13188a.f13190e.mo12981d(pointResponse.getData().getCurrentPointStr());
        }
    }
}
