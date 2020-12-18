package com.openlife.checkme.activity.mission.detail;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.net.model.MissionCommitBody;
import com.openlife.checkme.net.model.MissionCommitResponse;
import com.openlife.checkme.net.model.MissionDetailBody;
import com.openlife.checkme.net.model.MissionDetailResponse;
import com.openlife.checkme.sdk.p098a.C4970a;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.mission.detail.j */
public interface C4714j extends C4703m, C4970a {
    /* renamed from: a */
    MissionCommitBody mo13071a(int i, Execution execution);

    /* renamed from: a */
    MissionDetailBody mo13072a();

    /* renamed from: a */
    C6433l<MissionCommitResponse> mo13073a(MissionCommitBody missionCommitBody);

    /* renamed from: a */
    C6433l<MissionDetailResponse> mo13074a(MissionDetailBody missionDetailBody, int i);
}
