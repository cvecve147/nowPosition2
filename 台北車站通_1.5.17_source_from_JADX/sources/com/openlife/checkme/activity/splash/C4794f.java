package com.openlife.checkme.activity.splash;

import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6243e;

/* renamed from: com.openlife.checkme.activity.splash.f */
class C4794f implements C6243e<SystemConfigResponse, CheckUpdateResponse, BeaconListResponse, ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ C4803o f13796a;

    C4794f(C4803o oVar) {
        this.f13796a = oVar;
    }

    /* renamed from: a */
    public ThreeResponse mo13251a(SystemConfigResponse systemConfigResponse, CheckUpdateResponse checkUpdateResponse, BeaconListResponse beaconListResponse) {
        return C4883m.m19219a((C4953c) systemConfigResponse, (C4953c) checkUpdateResponse, (C4953c) beaconListResponse);
    }
}
