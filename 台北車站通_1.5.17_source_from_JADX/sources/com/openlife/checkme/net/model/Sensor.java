package com.openlife.checkme.net.model;

import java.io.Serializable;
import p101d.p129g.p152e.p153a.C5598c;

public class Sensor implements Serializable {
    @C5598c("customize_key")
    private String customizeKey;
    @C5598c("id")

    /* renamed from: id */
    private int f14138id;
    @C5598c("major")
    private String major;
    @C5598c("minor")
    private String minor;
    @C5598c("uuid")
    private String uuid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Sensor.class != obj.getClass()) {
            return false;
        }
        Sensor sensor = (Sensor) obj;
        if (this.f14138id != sensor.f14138id) {
            return false;
        }
        String str = this.major;
        if (str == null ? sensor.major != null : !str.equals(sensor.major)) {
            return false;
        }
        String str2 = this.minor;
        if (str2 == null ? sensor.minor != null : !str2.equals(sensor.minor)) {
            return false;
        }
        String str3 = this.uuid;
        if (str3 == null ? sensor.uuid != null : !str3.equals(sensor.uuid)) {
            return false;
        }
        String str4 = this.customizeKey;
        return str4 != null ? str4.equals(sensor.customizeKey) : sensor.customizeKey == null;
    }

    public String getCustomizeKey() {
        String str = this.customizeKey;
        return str != null ? str : "";
    }

    public int getId() {
        return this.f14138id;
    }

    public String getMajor() {
        String str = this.major;
        return str != null ? str : "";
    }

    public String getMinor() {
        String str = this.minor;
        return str != null ? str : "";
    }

    public String getUuid() {
        String str = this.uuid;
        return str != null ? str : "";
    }

    public int hashCode() {
        int i = this.f14138id * 31;
        String str = this.major;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.minor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.uuid;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.customizeKey;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public void setCustomizeKey(String str) {
        this.customizeKey = str;
    }

    public void setId(int i) {
        this.f14138id = i;
    }

    public void setMajor(String str) {
        this.major = str;
    }

    public void setMinor(String str) {
        this.minor = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public String toString() {
        return this.f14138id + ":" + this.minor + ":" + this.uuid + ":" + this.customizeKey;
    }
}
