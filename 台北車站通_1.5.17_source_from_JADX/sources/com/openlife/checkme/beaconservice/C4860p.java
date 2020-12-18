package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconNotificationResponse;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.beaconservice.p */
class C4860p implements C6242d<BeaconNotificationResponse> {

    /* renamed from: a */
    final /* synthetic */ C4862r f13937a;

    C4860p(C4862r rVar) {
        this.f13937a = rVar;
    }

    /* renamed from: a */
    public void accept(BeaconNotificationResponse beaconNotificationResponse) {
        if (beaconNotificationResponse.getError() == 0) {
            this.f13937a.f13939a.mo13320b(beaconNotificationResponse.getData());
        }
    }
}
