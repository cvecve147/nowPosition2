package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.sdk.b.e */
class C4986e implements C6242d<ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ AuthLoginBody f14174a;

    /* renamed from: b */
    final /* synthetic */ C4992k f14175b;

    C4986e(C4992k kVar, AuthLoginBody authLoginBody) {
        this.f14175b = kVar;
        this.f14174a = authLoginBody;
    }

    /* renamed from: a */
    public void accept(ThreeResponse threeResponse) {
        this.f14175b.f14181d.mo13231a(this.f14174a.getNickname(), "", "", this.f14174a.getEmail(), this.f14174a.getVendorUid(), this.f14174a.getFbuid(), this.f14174a.getFbToken(), this.f14174a.getGender());
        if (!this.f14175b.mo13153a(threeResponse.getResponse1()) || !this.f14175b.mo13155b(threeResponse.getResponse3())) {
            this.f14175b.f14182e.mo12756f();
        } else {
            this.f14175b.f14181d.mo13229a(((SystemConfigResponse) threeResponse.getResponse1()).getData());
            this.f14175b.f14181d.mo12980d();
            AccountData data = ((LoginResponse) threeResponse.getResponse3()).getData();
            this.f14175b.f14181d.mo13231a(data.getNickname(), data.getAccount(), data.getInviteCode(), data.getEmail(), this.f14174a.getVendorUid(), data.getFbUid(), data.getFbToken(), data.getGender());
            this.f14175b.f14182e.mo12968i();
        }
        if (threeResponse.getResponse2().getError() == 0) {
            this.f14175b.f14181d.mo13228a(((CheckUpdateResponse) threeResponse.getResponse2()).getData().getNeedUpdate(), ((CheckUpdateResponse) threeResponse.getResponse2()).getData().getUrl(), threeResponse.getResponse2().getMessage());
        }
    }
}
