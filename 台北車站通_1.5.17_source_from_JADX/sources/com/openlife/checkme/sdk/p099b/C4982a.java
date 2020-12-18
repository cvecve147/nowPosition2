package com.openlife.checkme.sdk.p099b;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.activity.mission.list.C4728e;
import com.openlife.checkme.activity.splash.C4788a;
import com.openlife.checkme.activity.store.list.C4825c;
import com.openlife.checkme.beaconservice.C4863s;
import com.openlife.checkme.net.model.CheckUpdateResponse;
import com.openlife.checkme.net.model.LoginResponse;
import com.openlife.checkme.net.model.SystemConfigResponse;
import com.openlife.checkme.net.model.ThreeResponse;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.sdk.b.a */
public interface C4982a extends C4703m, C4728e, C4788a, C4825c, C4863s {
    /* renamed from: a */
    C6433l<ThreeResponse> mo14000a(C6433l<SystemConfigResponse> lVar, C6433l<CheckUpdateResponse> lVar2, C6433l<LoginResponse> lVar3);
}
