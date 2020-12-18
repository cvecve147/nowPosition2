package com.openlife.checkme.activity.store;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.MissionAdBody;
import com.openlife.checkme.net.model.MissionAdResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.store.m */
public class C4832m extends C4673l implements C4817j {
    /* renamed from: a */
    public MissionAdBody mo13291a() {
        return new MissionAdBody();
    }

    /* renamed from: a */
    public C6433l<MissionAdResponse> mo13292a(MissionAdBody missionAdBody) {
        return this.f13552a.mo13605b().mo13571a(missionAdBody.getSignature(), missionAdBody);
    }
}
