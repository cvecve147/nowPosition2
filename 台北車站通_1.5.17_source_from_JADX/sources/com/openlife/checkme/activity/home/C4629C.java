package com.openlife.checkme.activity.home;

import com.openlife.checkme.activity.C4673l;
import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.beaconservice.C4865u;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.net.model.HomeAdBody;
import com.openlife.checkme.net.model.HomeAdResponse;
import com.openlife.checkme.net.model.HomeInfoBody;
import com.openlife.checkme.net.model.HomeInfoResponse;
import com.openlife.checkme.net.model.Location;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.activity.home.C */
public class C4629C extends C4673l implements C4669z {

    /* renamed from: c */
    C4865u f13430c = new C4865u(this.f13552a, this.f13553b);

    /* renamed from: a */
    public HomeInfoBody mo12886a(Location location) {
        return new HomeInfoBody(location);
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        return this.f13430c.mo12887a(beaconListBody, l);
    }

    /* renamed from: a */
    public C6433l<HomeAdResponse> mo12888a(HomeAdBody homeAdBody) {
        return this.f13552a.mo13605b().mo13569a(homeAdBody.getSignature(), homeAdBody);
    }

    /* renamed from: a */
    public C6433l<HomeInfoResponse> mo12889a(HomeInfoBody homeInfoBody) {
        return this.f13552a.mo13605b().mo13570a(homeInfoBody.getSignature(), homeInfoBody);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        this.f13430c.mo12890a(aVar);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f13430c.mo12891a(list);
    }

    /* renamed from: a */
    public boolean mo12892a() {
        return this.f13553b.mo13553d().mo13499n();
    }

    /* renamed from: b */
    public int mo12893b() {
        return this.f13553b.mo13554e().mo13524b();
    }

    /* renamed from: g */
    public int mo12894g() {
        return this.f13553b.mo13554e().mo13521a();
    }

    /* renamed from: k */
    public HomeAdBody mo12895k() {
        return new HomeAdBody();
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return this.f13430c.mo12896m();
    }
}
