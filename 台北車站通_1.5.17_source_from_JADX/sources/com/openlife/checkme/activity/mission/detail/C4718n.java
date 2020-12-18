package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.net.model.MissionDetailResponse;
import com.openlife.checkme.p097f.C4953c;
import java.util.ArrayList;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.mission.detail.n */
class C4718n implements C6242d<MissionDetailResponse> {

    /* renamed from: a */
    final /* synthetic */ C4720p f13635a;

    C4718n(C4720p pVar) {
        this.f13635a = pVar;
    }

    /* renamed from: a */
    public void accept(MissionDetailResponse missionDetailResponse) {
        if (this.f13635a.mo13153a((C4953c) missionDetailResponse)) {
            this.f13635a.f13637d.mo13049a(missionDetailResponse.getData());
            this.f13635a.f13637d.mo13050a(missionDetailResponse.getData().getProductInfo());
            this.f13635a.f13637d.mo13047a(missionDetailResponse.getData().getStatus(), missionDetailResponse.getData().getPointStr());
            this.f13635a.f13637d.mo13048a(missionDetailResponse.getData().getType(), (List<String>) new ArrayList(missionDetailResponse.getData().getSensor()));
        }
    }
}
