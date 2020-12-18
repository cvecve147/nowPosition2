package com.openlife.checkme.activity.scanner;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.Execution;
import com.openlife.checkme.net.model.MissionCommitBody;
import com.openlife.checkme.net.model.MissionCommitResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.scanner.q */
public class C4782q extends C4673l implements C4779n {
    /* renamed from: a */
    public MissionCommitBody mo13214a(int i, Execution execution) {
        return new MissionCommitBody(i, execution);
    }

    /* renamed from: a */
    public C6433l<MissionCommitResponse> mo13215a(MissionCommitBody missionCommitBody) {
        return this.f13552a.mo13605b().mo13572a(missionCommitBody.getSignature(), missionCommitBody);
    }
}
