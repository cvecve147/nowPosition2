package com.openlife.checkme.activity;

import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.n */
class C4736n implements C6242d<C4953c<AccountData>> {

    /* renamed from: a */
    final /* synthetic */ C4757r f13677a;

    C4736n(C4757r rVar) {
        this.f13677a = rVar;
    }

    /* renamed from: a */
    public void accept(C4953c<AccountData> cVar) {
        if (this.f13677a.mo13155b((C4953c) cVar)) {
            this.f13677a.f13710a.mo12980d();
            this.f13677a.f13710a.mo12975a(cVar.getData().getNickname(), cVar.getData().getAccount(), cVar.getData().getInviteCode(), cVar.getData().getEmail(), cVar.getData().getFbUid(), cVar.getData().getGender());
        }
    }
}
