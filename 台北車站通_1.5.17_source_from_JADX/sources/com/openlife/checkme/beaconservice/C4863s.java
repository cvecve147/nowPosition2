package com.openlife.checkme.beaconservice;

import com.openlife.checkme.beaconservice.BeaconService;
import com.openlife.checkme.net.model.BeaconListBody;
import com.openlife.checkme.net.model.BeaconListResponse;
import java.util.List;
import p208e.p221b.C6433l;

/* renamed from: com.openlife.checkme.beaconservice.s */
public interface C4863s {
    /* renamed from: a */
    C6433l<BeaconListResponse> mo12887a(BeaconListBody beaconListBody, Long l);

    /* renamed from: a */
    void mo12890a(BeaconService.C4838a aVar);

    /* renamed from: a */
    void mo12891a(List<String> list);

    /* renamed from: m */
    BeaconListBody mo12896m();
}
