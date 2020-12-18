package com.openlife.checkme.activity.activity;

import com.openlife.checkme.net.model.UserSignInResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.activity.g */
class C4527g implements C6242d<UserSignInResponse> {

    /* renamed from: a */
    final /* synthetic */ C4528h f13243a;

    C4527g(C4528h hVar) {
        this.f13243a = hVar;
    }

    /* renamed from: a */
    public void accept(UserSignInResponse userSignInResponse) {
        if (this.f13243a.mo13153a((C4953c) userSignInResponse)) {
            this.f13243a.f13244d.mo12690a(userSignInResponse.getData().getBonusPoint());
            this.f13243a.mo12705c();
            this.f13243a.f13245e.mo12981d(userSignInResponse.getData().getCurrentPointStr());
        }
    }
}
