package com.openlife.checkme.activity.store;

import com.openlife.checkme.net.model.MissionAdResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.store.n */
class C4833n implements C6242d<MissionAdResponse> {

    /* renamed from: a */
    final /* synthetic */ C4834o f13863a;

    C4833n(C4834o oVar) {
        this.f13863a = oVar;
    }

    /* renamed from: a */
    public void accept(MissionAdResponse missionAdResponse) {
        if (this.f13863a.mo13153a((C4953c) missionAdResponse)) {
            this.f13863a.f13864d.mo13271a(missionAdResponse.getData());
        }
    }
}
