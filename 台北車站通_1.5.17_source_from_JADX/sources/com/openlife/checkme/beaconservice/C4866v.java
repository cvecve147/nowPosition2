package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconListResponse;
import java.util.List;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.beaconservice.v */
class C4866v implements C6242d<BeaconListResponse> {

    /* renamed from: a */
    final /* synthetic */ C4868x f13944a;

    C4866v(C4868x xVar) {
        this.f13944a = xVar;
    }

    /* renamed from: a */
    public void accept(BeaconListResponse beaconListResponse) {
        List data = beaconListResponse.getData();
        this.f13944a.f13947b.mo12891a((List<String>) data);
        this.f13944a.f13946a.mo12926c(data);
    }
}
