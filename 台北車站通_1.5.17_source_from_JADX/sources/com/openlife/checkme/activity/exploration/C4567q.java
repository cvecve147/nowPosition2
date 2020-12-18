package com.openlife.checkme.activity.exploration;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.net.model.CompanyMissionResponse;
import com.openlife.checkme.net.model.MissionLocationBody;
import com.openlife.checkme.net.model.MissionLocationResponse;
import com.openlife.checkme.net.model.StoreSurroundingBody;
import com.openlife.checkme.net.model.StoreSurroundingResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.exploration.q */
public interface C4567q extends C4703m {
    /* renamed from: a */
    StoreSurroundingBody mo12772a(double d, double d2);

    /* renamed from: a */
    C6433l<CompanyMissionResponse> mo12773a(MissionLocationBody missionLocationBody, int i);

    /* renamed from: a */
    C6433l<StoreSurroundingResponse> mo12774a(StoreSurroundingBody storeSurroundingBody);

    /* renamed from: b */
    MissionLocationBody mo12775b(double d, double d2);

    /* renamed from: b */
    C6433l<MissionLocationResponse> mo12776b(MissionLocationBody missionLocationBody, int i);
}
