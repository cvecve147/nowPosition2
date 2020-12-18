package com.openlife.checkme.beaconservice;

import com.openlife.checkme.net.model.BeaconData;
import com.openlife.checkme.net.model.Sensor;
import p208e.p221b.p227d.C6242d;

/* renamed from: com.openlife.checkme.beaconservice.c */
class C4841c implements C6242d<BeaconData> {

    /* renamed from: a */
    final /* synthetic */ BeaconJobService f13900a;

    C4841c(BeaconJobService beaconJobService) {
        this.f13900a = beaconJobService;
    }

    /* renamed from: a */
    public void accept(BeaconData beaconData) {
        Sensor sensor = new Sensor();
        sensor.setMajor("");
        sensor.setMinor(beaconData.getMinorStr());
        sensor.setUuid(beaconData.getUuid());
        sensor.setId(beaconData.getSensorId());
        this.f13900a.f13870d.addBeacon(sensor);
    }
}
