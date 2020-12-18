package com.openlife.checkme.checkme_special.home;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.activity.home.C4629C;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.HomeAdBody;
import com.openlife.checkme.net.model.HomeAdResponse;
import com.openlife.checkme.net.model.HomeInfoBody;
import com.openlife.checkme.net.model.HomeInfoResponse;
import com.openlife.checkme.net.model.Location;
import com.openlife.checkme.p094d.C4947j;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.checkme_special.home.u */
public class C4923u extends C4673l implements C4920r {

    /* renamed from: c */
    C4629C f14072c = new C4629C();

    /* renamed from: a */
    public HomeInfoBody mo12886a(Location location) {
        return this.f14072c.mo12886a(location);
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f14072c.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public C6433l<HomeAdResponse> mo12888a(HomeAdBody homeAdBody) {
        return this.f14072c.mo12888a(homeAdBody);
    }

    /* renamed from: a */
    public C6433l<HomeInfoResponse> mo12889a(HomeInfoBody homeInfoBody) {
        return this.f14072c.mo12889a(homeInfoBody);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f14072c.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f14072c.mo12891a(list);
    }

    /* renamed from: a */
    public boolean mo12892a() {
        return this.f14072c.mo12892a();
    }

    /* renamed from: b */
    public int mo12893b() {
        return this.f14072c.mo12893b();
    }

    /* renamed from: g */
    public int mo12894g() {
        return this.f14072c.mo12894g();
    }

    /* renamed from: k */
    public HomeAdBody mo12895k() {
        return this.f14072c.mo12895k();
    }

    /* renamed from: l */
    public String mo13455l() {
        return C4947j.m19536a().mo13554e().mo13530d();
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f14072c.mo12896m();
    }
}
