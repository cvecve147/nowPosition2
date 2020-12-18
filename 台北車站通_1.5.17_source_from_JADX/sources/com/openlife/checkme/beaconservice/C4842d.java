package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import java.util.List;
import p208e.p221b.p227d.C6246h;

/* renamed from: com.openlife.checkme.beaconservice.d */
class C4842d implements C6246h<BeaconData> {

    /* renamed from: a */
    final /* synthetic */ List f13901a;

    /* renamed from: b */
    final /* synthetic */ BeaconJobService f13902b;

    C4842d(BeaconJobService beaconJobService, List list) {
        this.f13902b = beaconJobService;
        this.f13901a = list;
    }

    /* renamed from: a */
    public boolean test(BeaconData beaconData) {
        List<String> list = this.f13901a;
        if (list == null) {
            return false;
        }
        for (String equals : list) {
            if (equals.equals(beaconData.getUuid())) {
                return true;
            }
        }
        return false;
    }
}
