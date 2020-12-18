package com.openlife.checkme.beaconservice;

import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import com.openlife.checkme.p094d.C4946i;
import com.openlife.checkme.p094d.C4947j;
import com.openlife.checkme.p097f.C4955e;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.beaconservice.u */
public class C4865u implements C4863s {

    /* renamed from: a */
    C4955e f13942a;

    /* renamed from: b */
    C4947j f13943b;

    public C4865u(C4955e eVar, C4947j jVar) {
        this.f13942a = eVar;
        this.f13943b = jVar;
    }

    /* renamed from: a */
    public C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l) {
        List<String> h = this.f13943b.mo13555f().mo13519h();
        if (mo13375a(l) || h.isEmpty()) {
            this.f13943b.mo13555f().mo13508a(l);
            return this.f13942a.mo13605b().mo13560a(beaconListBody.getSignature(), beaconListBody);
        }
        BeaconListResponse beaconListResponse = new BeaconListResponse();
        beaconListResponse.setData(h);
        return C6433l.m24028b(beaconListResponse);
    }

    /* renamed from: a */
    public void mo12890a(BeaconService.C4838a aVar) {
        C4946i iVar;
        int i;
        if (BeaconService.C4838a.AUTH_SERVICE == aVar) {
            iVar = this.f13943b.mo13554e();
            i = 1;
        } else {
            iVar = this.f13943b.mo13554e();
            i = 0;
        }
        iVar.mo13528c(i);
    }

    /* renamed from: a */
    public void mo12891a(List<String> list) {
        this.f13943b.mo13555f().mo13514c(list);
    }

    /* renamed from: a */
    public boolean mo13375a(Long l) {
        return Math.abs(this.f13943b.mo13555f().mo13520i().longValue() - l.longValue()) >= 3600000;
    }

    /* renamed from: m */
    public BeaconListBody mo12896m() {
        return new BeaconListBody();
    }
}
