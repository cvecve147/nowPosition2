package com.openlife.checkme.activity.account.overview;

import com.openlife.checkme.net.model.UserInviteCodeResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.overview.f */
class C4491f implements C6242d<UserInviteCodeResponse> {

    /* renamed from: a */
    final /* synthetic */ C4493h f13187a;

    C4491f(C4493h hVar) {
        this.f13187a = hVar;
    }

    /* renamed from: a */
    public void accept(UserInviteCodeResponse userInviteCodeResponse) {
        if (this.f13187a.mo13153a((C4953c) userInviteCodeResponse)) {
            this.f13187a.f13189d.mo12633a(userInviteCodeResponse.getData().getBonusPoint());
        }
    }
}
