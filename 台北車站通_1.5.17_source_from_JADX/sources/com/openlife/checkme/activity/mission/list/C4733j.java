package com.openlife.checkme.activity.mission.list;

import com.openlife.checkme.net.model.MissionListResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.mission.list.j */
class C4733j implements C6242d<MissionListResponse> {

    /* renamed from: a */
    final /* synthetic */ C4735l f13673a;

    C4733j(C4735l lVar) {
        this.f13673a = lVar;
    }

    /* renamed from: a */
    public void accept(MissionListResponse missionListResponse) {
        if (this.f13673a.mo13153a((C4953c) missionListResponse)) {
            this.f13673a.f13675d.mo13098a();
            this.f13673a.f13675d.mo13101a(missionListResponse.getData().getCorpName());
            this.f13673a.f13675d.mo13102a(missionListResponse.getData().getAssignment());
        }
    }
}
