package com.openlife.checkme.activity.mission.list;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.MissionExecuteBody;
import com.openlife.checkme.net.model.MissionExecuteResponse;
import com.openlife.checkme.net.model.MissionListBody;
import com.openlife.checkme.net.model.MissionListResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.mission.list.e */
public interface C4728e extends C4703m {
    /* renamed from: a */
    MissionExecuteBody mo13114a(int i);

    /* renamed from: a */
    MissionListBody mo13115a();

    /* renamed from: a */
    C6433l<MissionExecuteResponse> mo13116a(MissionExecuteBody missionExecuteBody);

    /* renamed from: a */
    C6433l<MissionListResponse> mo13117a(MissionListBody missionListBody, int i);
}
