package com.openlife.checkme.activity.home;

import com.openlife.checkme.net.model.HomeInfoResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.home.E */
class C4631E implements C6242d<HomeInfoResponse> {

    /* renamed from: a */
    final /* synthetic */ C4633G f13432a;

    C4631E(C4633G g) {
        this.f13432a = g;
    }

    /* renamed from: a */
    public void accept(HomeInfoResponse homeInfoResponse) {
        if (this.f13432a.mo13153a((C4953c) homeInfoResponse)) {
            this.f13432a.f13435e.mo12877a(homeInfoResponse.getData().getPoint());
            this.f13432a.f13435e.mo12884c(homeInfoResponse.getData().getPoint());
            this.f13432a.f13435e.mo12880a(homeInfoResponse.getData().getGift());
            this.f13432a.f13435e.mo12881a(homeInfoResponse.getData().getAssignment(), homeInfoResponse.getData().getSurrounding());
            this.f13432a.f13436f.mo12981d(homeInfoResponse.getData().getPointStr());
            if (this.f13432a.f13436f.mo12982e() && this.f13432a.f13436f.mo12892a()) {
                this.f13432a.f13435e.mo12878a(this.f13432a.f13436f.mo12893b(), this.f13432a.f13436f.mo12894g());
            }
        }
    }
}
