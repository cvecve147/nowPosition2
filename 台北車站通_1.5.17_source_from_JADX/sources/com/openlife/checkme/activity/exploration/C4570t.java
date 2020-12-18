package com.openlife.checkme.activity.exploration;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.net.model.CompanyMissionResponse;
import com.openlife.checkme.net.model.MissionLocationBody;
import com.openlife.checkme.net.model.MissionLocationResponse;
import com.openlife.checkme.net.model.StoreSurroundingBody;
import com.openlife.checkme.net.model.StoreSurroundingResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.exploration.t */
public class C4570t extends C4673l implements C4567q {
    /* renamed from: a */
    public StoreSurroundingBody mo12772a(double d, double d2) {
        return new StoreSurroundingBody(d, d2);
    }

    /* renamed from: a */
    public C6433l<CompanyMissionResponse> mo12773a(MissionLocationBody missionLocationBody, int i) {
        return this.f13552a.mo13605b().mo13590b(missionLocationBody.getSignature(), missionLocationBody, i);
    }

    /* renamed from: a */
    public C6433l<StoreSurroundingResponse> mo12774a(StoreSurroundingBody storeSurroundingBody) {
        return this.f13552a.mo13605b().mo13583a(storeSurroundingBody.getSignature(), storeSurroundingBody);
    }

    /* renamed from: b */
    public MissionLocationBody mo12775b(double d, double d2) {
        return new MissionLocationBody(d, d2);
    }

    /* renamed from: b */
    public C6433l<MissionLocationResponse> mo12776b(MissionLocationBody missionLocationBody, int i) {
        return this.f13552a.mo13605b().mo13576a(missionLocationBody.getSignature(), missionLocationBody, i);
    }
}
