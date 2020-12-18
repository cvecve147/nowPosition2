package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class BeaconNotificationBody extends C4952b {
    @C5598c("beacon")
    private List<Sensor> beacons;

    public BeaconNotificationBody(List<Sensor> list) {
        this.beacons = list;
    }
}
