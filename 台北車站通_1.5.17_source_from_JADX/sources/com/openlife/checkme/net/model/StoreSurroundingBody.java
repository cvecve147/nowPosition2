package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4952b;

public class StoreSurroundingBody extends C4952b {
    private Location location;

    public StoreSurroundingBody(double d, double d2) {
        this.location = new Location(0.0d, 0.0d);
        this.location.setLatitude(d);
        this.location.setLongitude(d2);
    }

    public StoreSurroundingBody(Location location2) {
        this.location = location2;
    }
}
