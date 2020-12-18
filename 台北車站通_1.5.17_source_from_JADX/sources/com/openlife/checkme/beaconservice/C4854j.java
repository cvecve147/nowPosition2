package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import java.util.List;
import p208e.p221b.p227d.C6246h;

/* renamed from: com.openlife.checkme.beaconservice.j */
class C4854j implements C6246h<BeaconData> {

    /* renamed from: a */
    final /* synthetic */ List f13930a;

    /* renamed from: b */
    final /* synthetic */ BeaconService f13931b;

    C4854j(BeaconService beaconService, List list) {
        this.f13931b = beaconService;
        this.f13930a = list;
    }

    /* renamed from: a */
    public boolean test(BeaconData beaconData) {
        List<String> list = this.f13930a;
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
