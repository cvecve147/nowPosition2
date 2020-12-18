package com.openlife.checkme.activity.mission.list;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.MissionExecuteBody;
import com.openlife.checkme.net.model.MissionExecuteResponse;
import com.openlife.checkme.net.model.MissionListBody;
import com.openlife.checkme.net.model.MissionListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.mission.list.h */
public class C4731h extends C4673l implements C4728e {
    /* renamed from: a */
    public MissionExecuteBody mo13114a(int i) {
        return new MissionExecuteBody(i);
    }

    /* renamed from: a */
    public MissionListBody mo13115a() {
        return new MissionListBody();
    }

    /* renamed from: a */
    public C6433l<MissionExecuteResponse> mo13116a(MissionExecuteBody missionExecuteBody) {
        return this.f13552a.mo13605b().mo13574a(missionExecuteBody.getSignature(), missionExecuteBody);
    }

    /* renamed from: a */
    public C6433l<MissionListResponse> mo13117a(MissionListBody missionListBody, int i) {
        return this.f13552a.mo13605b().mo13575a(missionListBody.getSignature(), missionListBody, i);
    }
}
