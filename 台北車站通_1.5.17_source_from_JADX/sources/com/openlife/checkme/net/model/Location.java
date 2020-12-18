package com.openlife.checkme.net.model;

public class Location {
    private String latitude;
    private String longitude;

    public Location(double d, double d2) {
        this.longitude = d != 0.0d ? String.valueOf(d) : String.valueOf(0);
        this.latitude = d2 != 0.0d ? String.valueOf(d2) : String.valueOf(0);
    }

    public double getLat() {
        if (this.longitude != null && !this.latitude.isEmpty()) {
            return Double.valueOf(this.latitude).doubleValue();
        }
        return 0.0d;
    }

    public double getLon() {
        if (this.longitude != null && !this.latitude.isEmpty()) {
            return Double.valueOf(this.longitude).doubleValue();
        }
        return 0.0d;
    }

    public void setLatitude(double d) {
        this.latitude = d != 0.0d ? String.valueOf(d) : String.valueOf(0);
    }

    public void setLatitude(String str) {
        this.latitude = str;
    }

    public void setLongitude(double d) {
        this.longitude = d != 0.0d ? String.valueOf(d) : String.valueOf(0);
    }

    public void setLongitude(String str) {
        this.longitude = str;
    }
}
