package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.Sensor;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.beaconservice.i */
class C4853i implements C6242d<BeaconData> {

    /* renamed from: a */
    final /* synthetic */ BeaconService f13929a;

    C4853i(BeaconService beaconService) {
        this.f13929a = beaconService;
    }

    /* renamed from: a */
    public void accept(BeaconData beaconData) {
        Sensor sensor = new Sensor();
        sensor.setMajor("");
        sensor.setMinor(beaconData.getMinorStr());
        sensor.setUuid(beaconData.getUuid());
        sensor.setId(beaconData.getSensorId());
        this.f13929a.f13886e.addBeacon(sensor);
    }
}
