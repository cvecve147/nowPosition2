package com.openlife.checkme.sdk.p098a;

import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.BiResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.sdk.a.d */
class C4973d implements C6242d<BiResponse> {

    /* renamed from: a */
    final /* synthetic */ AuthLoginBody f14147a;

    /* renamed from: b */
    final /* synthetic */ C4977h f14148b;

    C4973d(C4977h hVar, AuthLoginBody authLoginBody) {
        this.f14148b = hVar;
        this.f14147a = authLoginBody;
    }

    /* renamed from: a */
    public void accept(BiResponse biResponse) {
        this.f14148b.f14152d.mo13080a(this.f14147a.getNickname(), "", "", this.f14147a.getEmail(), this.f14147a.getVendorUid(), this.f14147a.getFbuid(), this.f14147a.getFbToken(), this.f14147a.getGender());
        if (this.f14148b.mo13153a(biResponse.getResponse1()) && this.f14148b.mo13155b(biResponse.getResponse2())) {
            this.f14148b.f14152d.mo13079a(((SystemConfigResponse) biResponse.getResponse1()).getData());
            this.f14148b.f14152d.mo12980d();
            AccountData data = ((LoginResponse) biResponse.getResponse2()).getData();
            this.f14148b.f14152d.mo13080a(data.getNickname(), data.getAccount(), data.getInviteCode(), data.getEmail(), this.f14147a.getVendorUid(), data.getFbUid(), data.getFbToken(), data.getGender());
            this.f14148b.f14153e.mo12968i();
        }
    }
}
