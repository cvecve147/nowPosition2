package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.net.model.AccountData;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.sdk.b.j */
class C4991j implements C6242d<C4953c<AccountData>> {

    /* renamed from: a */
    final /* synthetic */ C4992k f14180a;

    C4991j(C4992k kVar) {
        this.f14180a = kVar;
    }

    /* renamed from: a */
    public void accept(C4953c<AccountData> cVar) {
        if (this.f14180a.mo13155b((C4953c) cVar)) {
            this.f14180a.f14181d.mo12980d();
            this.f14180a.f14181d.mo12975a(cVar.getData().getNickname(), cVar.getData().getAccount(), cVar.getData().getInviteCode(), cVar.getData().getEmail(), cVar.getData().getFbUid(), cVar.getData().getGender());
        }
    }
}
