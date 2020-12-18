package com.openlife.checkme.activity.home;

import com.openlife.checkme.activity.C4703m;
import com.openlife.checkme.beaconservice.C4863s;
import com.openlife.checkme.net.model.HomeAdBody;
import com.openlife.checkme.net.model.HomeAdResponse;
import com.openlife.checkme.net.model.HomeInfoBody;
import com.openlife.checkme.net.model.HomeInfoResponse;
import com.openlife.checkme.net.model.Location;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.home.z */
public interface C4669z extends C4703m, C4863s {
    /* renamed from: a */
    HomeInfoBody mo12886a(Location location);

    /* renamed from: a */
    C6433l<HomeAdResponse> mo12888a(HomeAdBody homeAdBody);

    /* renamed from: a */
    C6433l<HomeInfoResponse> mo12889a(HomeInfoBody homeInfoBody);

    /* renamed from: a */
    boolean mo12892a();

    /* renamed from: b */
    int mo12893b();

    /* renamed from: g */
    int mo12894g();

    /* renamed from: k */
    HomeAdBody mo12895k();
}
