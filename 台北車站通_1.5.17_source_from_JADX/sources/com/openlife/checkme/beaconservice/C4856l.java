package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconNotificationData;
import java.util.ArrayList;

/* renamed from: com.openlife.checkme.beaconservice.l */
class C4856l extends ArrayList<BeaconNotificationData> {

    /* renamed from: a */
    final /* synthetic */ BeaconNotificationData f13933a;

    /* renamed from: b */
    final /* synthetic */ BeaconService f13934b;

    C4856l(BeaconService beaconService, BeaconNotificationData beaconNotificationData) {
        this.f13934b = beaconService;
        this.f13933a = beaconNotificationData;
        add(this.f13933a);
    }
}
