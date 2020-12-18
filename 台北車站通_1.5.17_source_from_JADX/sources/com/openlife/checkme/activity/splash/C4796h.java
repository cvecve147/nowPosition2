package com.openlife.checkme.activity.splash;

import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.splash.h */
class C4796h implements C6242d<ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ C4803o f13798a;

    C4796h(C4803o oVar) {
        this.f13798a = oVar;
    }

    /* renamed from: a */
    public void accept(ThreeResponse threeResponse) {
        if (this.f13798a.mo13153a(threeResponse.getResponse1())) {
            this.f13798a.f13808f.mo13229a(((SystemConfigResponse) threeResponse.getResponse1()).getData());
            this.f13798a.f13808f.mo12891a((List<String>) ((BeaconListResponse) threeResponse.getResponse3()).getData());
            this.f13798a.f13807e.mo12968i();
        }
        if (threeResponse.getResponse2().getError() == 0) {
            this.f13798a.f13808f.mo13228a(((CheckUpdateResponse) threeResponse.getResponse2()).getData().getNeedUpdate(), ((CheckUpdateResponse) threeResponse.getResponse2()).getData().getUrl(), threeResponse.getResponse2().getMessage());
        }
    }
}
