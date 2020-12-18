package com.openlife.checkme.activity.mission.list;

import com.openlife.checkme.net.model.MissionExecuteData;
import com.openlife.checkme.net.model.MissionExecuteResponse;
import com.openlife.checkme.p097f.C4953c;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.activity.mission.list.k */
class C4734k implements C6242d<MissionExecuteResponse> {

    /* renamed from: a */
    final /* synthetic */ C4735l f13674a;

    C4734k(C4735l lVar) {
        this.f13674a = lVar;
    }

    /* renamed from: a */
    public void accept(MissionExecuteResponse missionExecuteResponse) {
        if (this.f13674a.mo13153a((C4953c) missionExecuteResponse)) {
            for (MissionExecuteData isStatus : missionExecuteResponse.getData()) {
                if (!isStatus.isStatus()) {
                    return;
                }
            }
            this.f13674a.f13675d.mo13104b();
        }
    }
}
