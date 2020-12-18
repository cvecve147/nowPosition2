package com.openlife.checkme.p093c;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.Sensor;
import p208e.p221b.p227d.C6246h;

/* renamed from: com.openlife.checkme.c.g */
class C4876g implements C6246h<BeaconData> {

    /* renamed from: a */
    final /* synthetic */ C4878i f13957a;

    C4876g(C4878i iVar) {
        this.f13957a = iVar;
    }

    /* renamed from: a */
    public boolean test(BeaconData beaconData) {
        for (String equals : this.f13957a.f13961b) {
            if (equals.equals(beaconData.getUuid())) {
                Sensor sensor = new Sensor();
                sensor.setMajor("");
                sensor.setMinor(beaconData.getMinorStr());
                sensor.setUuid(beaconData.getUuid());
                sensor.setId(beaconData.getSensorId());
                this.f13957a.f13962c.addBeacon(sensor);
                this.f13957a.f13962c.setSensorId(beaconData.getSensorId());
                return true;
            }
        }
        return false;
    }
}
