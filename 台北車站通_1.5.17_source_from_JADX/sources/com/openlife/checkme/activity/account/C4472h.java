package com.openlife.checkme.activity.account;

import com.openlife.checkme.net.model.UserInfoResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.account.h */
class C4472h implements C6242d<UserInfoResponse> {

    /* renamed from: a */
    final /* synthetic */ C4485l f13161a;

    C4472h(C4485l lVar) {
        this.f13161a = lVar;
    }

    /* renamed from: a */
    public void accept(UserInfoResponse userInfoResponse) {
        if (this.f13161a.mo13153a((C4953c) userInfoResponse)) {
            this.f13161a.f13180d.mo12593a(userInfoResponse.getData().getName());
            this.f13161a.f13180d.mo12596g(userInfoResponse.getData().getInviteCode());
            this.f13161a.f13180d.mo12597i(this.f13161a.f13181e.mo12609b());
            this.f13161a.f13181e.mo12608a(userInfoResponse.getData().getName());
            this.f13161a.f13181e.mo12610g(userInfoResponse.getData().getInviteCode());
        }
    }
}
