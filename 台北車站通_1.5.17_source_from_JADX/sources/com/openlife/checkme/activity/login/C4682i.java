package com.openlife.checkme.activity.login;

import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.login.i */
class C4682i implements C6242d<LoginResponse> {

    /* renamed from: a */
    final /* synthetic */ C4683j f13571a;

    C4682i(C4683j jVar) {
        this.f13571a = jVar;
    }

    /* renamed from: a */
    public void accept(LoginResponse loginResponse) {
        if (loginResponse.getError() == 5107) {
            this.f13571a.f13573e.mo12997a(loginResponse.getData().getAccount());
        }
        if (this.f13571a.mo13153a((C4953c) loginResponse)) {
            this.f13571a.f13573e.mo12980d();
            this.f13571a.f13573e.mo12975a(loginResponse.getData().getNickname(), loginResponse.getData().getAccount(), loginResponse.getData().getInviteCode(), loginResponse.getData().getEmail(), loginResponse.getData().getFbUid(), loginResponse.getData().getGender());
            this.f13571a.f13572d.mo12968i();
        }
    }
}
