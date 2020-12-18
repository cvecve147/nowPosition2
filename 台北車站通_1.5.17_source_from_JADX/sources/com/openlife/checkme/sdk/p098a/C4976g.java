package com.openlife.checkme.sdk.p098a;

import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import p208e.p221b.p227d.C6240b;

/* renamed from: com.openlife.checkme.sdk.a.g */
class C4976g implements C6240b<SystemConfigResponse, LoginResponse, BiResponse> {

    /* renamed from: a */
    final /* synthetic */ C4977h f14151a;

    C4976g(C4977h hVar) {
        this.f14151a = hVar;
    }

    /* renamed from: a */
    public BiResponse apply(SystemConfigResponse systemConfigResponse, LoginResponse loginResponse) {
        return new BiResponse(systemConfigResponse, loginResponse);
    }
}
