package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import p208e.p221b.p227d.C6243e;

/* renamed from: com.openlife.checkme.sdk.b.c */
class C4984c implements C6243e<SystemConfigResponse, CheckUpdateResponse, LoginResponse, ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ C4985d f14170a;

    C4984c(C4985d dVar) {
        this.f14170a = dVar;
    }

    /* renamed from: a */
    public ThreeResponse mo13251a(SystemConfigResponse systemConfigResponse, CheckUpdateResponse checkUpdateResponse, LoginResponse loginResponse) {
        return new ThreeResponse(systemConfigResponse, checkUpdateResponse, loginResponse);
    }
}
