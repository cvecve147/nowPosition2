package com.openlife.checkme.activity.splash;

import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6243e;

/* renamed from: com.openlife.checkme.activity.splash.n */
class C4802n implements C6243e<SystemConfigResponse, LoginResponse, BeaconListResponse, ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ C4803o f13805a;

    C4802n(C4803o oVar) {
        this.f13805a = oVar;
    }

    /* renamed from: a */
    public ThreeResponse mo13251a(SystemConfigResponse systemConfigResponse, LoginResponse loginResponse, BeaconListResponse beaconListResponse) {
        return C4883m.m19219a((C4953c) systemConfigResponse, (C4953c) loginResponse, (C4953c) beaconListResponse);
    }
}
