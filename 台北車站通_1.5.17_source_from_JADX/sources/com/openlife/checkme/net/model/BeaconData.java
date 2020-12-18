package com.openlife.checkme.net.model;

public class BeaconData {
    private double distance;
    private int major;
    private int minor;
    private int sensorId;
    private String uuid;

    public BeaconData(String str, int i, int i2, double d) {
        this.uuid = str;
        this.major = i;
        this.minor = i2;
        this.distance = d;
    }

    public double getDistance() {
        return this.distance;
    }

    public int getMajor() {
        return this.major;
    }

    public String getMajorStr() {
        return String.valueOf(this.major);
    }

    public int getMinor() {
        return this.minor;
    }

    public String getMinorStr() {
        return String.valueOf(this.minor);
    }

    public int getSensorId() {
        return this.sensorId;
    }

    public String getUuid() {
        String str = this.uuid;
        return str != null ? str : "";
    }

    public void setSensorId(int i) {
        this.sensorId = i;
    }
}
