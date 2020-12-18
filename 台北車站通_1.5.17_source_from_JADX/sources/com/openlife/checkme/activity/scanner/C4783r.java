package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.net.model.MissionCommitResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.scanner.r */
class C4783r implements C6242d<MissionCommitResponse> {

    /* renamed from: a */
    final /* synthetic */ C4787v f13778a;

    C4783r(C4787v vVar) {
        this.f13778a = vVar;
    }

    /* renamed from: a */
    public void accept(MissionCommitResponse missionCommitResponse) {
        if (this.f13778a.mo13153a((C4953c) missionCommitResponse)) {
            this.f13778a.f13783e.mo13166c(missionCommitResponse.getData().getBonusPoint());
        }
    }
}
