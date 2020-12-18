package com.openlife.checkme.activity.splash;

import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.net.model.AuthLoginBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigData;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.splash.j */
class C4798j implements C6242d<ThreeResponse> {

    /* renamed from: a */
    final /* synthetic */ AuthLoginBody f13800a;

    /* renamed from: b */
    final /* synthetic */ C4803o f13801b;

    C4798j(C4803o oVar, AuthLoginBody authLoginBody) {
        this.f13801b = oVar;
        this.f13800a = authLoginBody;
    }

    /* renamed from: a */
    public void accept(ThreeResponse threeResponse) {
        this.f13801b.f13808f.mo13231a(this.f13800a.getNickname(), "", "", this.f13800a.getEmail(), this.f13800a.getVendorUid(), this.f13800a.getFbuid(), this.f13800a.getFbToken(), this.f13800a.getGender());
        if (this.f13801b.mo13153a(threeResponse.getResponse1()) && this.f13801b.mo13155b(threeResponse.getResponse2())) {
            SystemConfigData data = ((SystemConfigResponse) threeResponse.getResponse1()).getData();
            this.f13801b.f13808f.mo13230a(this.f13800a.getVendorUid());
            this.f13801b.f13808f.mo13229a(data);
            this.f13801b.f13808f.mo12980d();
            AccountData data2 = ((LoginResponse) threeResponse.getResponse2()).getData();
            this.f13801b.f13808f.mo13231a(data2.getNickname(), data2.getAccount(), data2.getInviteCode(), data2.getEmail(), this.f13800a.getVendorUid(), data2.getFbUid(), data2.getFbToken(), data2.getGender());
            this.f13801b.f13808f.mo12891a((List<String>) ((BeaconListResponse) threeResponse.getResponse3()).getData());
            this.f13801b.f13807e.mo12968i();
        }
    }
}
