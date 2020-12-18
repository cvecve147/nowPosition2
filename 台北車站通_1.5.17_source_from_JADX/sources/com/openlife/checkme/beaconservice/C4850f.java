package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconNotificationData;
import java.util.ArrayList;

/* renamed from: com.openlife.checkme.beaconservice.f */
class C4850f extends ArrayList<BeaconNotificationData> {

    /* renamed from: a */
    final /* synthetic */ BeaconNotificationData f13925a;

    /* renamed from: b */
    final /* synthetic */ BeaconJobService f13926b;

    C4850f(BeaconJobService beaconJobService, BeaconNotificationData beaconNotificationData) {
        this.f13926b = beaconJobService;
        this.f13925a = beaconNotificationData;
        add(this.f13925a);
    }
}
