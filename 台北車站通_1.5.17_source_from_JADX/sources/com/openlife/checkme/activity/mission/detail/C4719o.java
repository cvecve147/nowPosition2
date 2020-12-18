package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.net.model.MissionCommitResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.mission.detail.o */
class C4719o implements C6242d<MissionCommitResponse> {

    /* renamed from: a */
    final /* synthetic */ C4720p f13636a;

    C4719o(C4720p pVar) {
        this.f13636a = pVar;
    }

    /* renamed from: a */
    public void accept(MissionCommitResponse missionCommitResponse) {
        if (this.f13636a.mo13153a((C4953c) missionCommitResponse)) {
            this.f13636a.f13637d.mo13046a(missionCommitResponse.getData().getBonusPoint());
        }
    }
}
