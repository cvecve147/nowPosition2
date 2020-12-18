package com.openlife.checkme.net.model;

import java.io.Serializable;
import p101d.p129g.p152e.p153a.C5598c;

public class BeaconNotificationData implements Serializable {
    @C5598c("id")

    /* renamed from: id */
    private int f14129id;
    @C5598c("image")
    private String image;
    @C5598c("message")
    private String message;
    @C5598c("url")
    private String url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BeaconNotificationData.class != obj.getClass()) {
            return false;
        }
        BeaconNotificationData beaconNotificationData = (BeaconNotificationData) obj;
        if (this.f14129id != beaconNotificationData.f14129id) {
            return false;
        }
        String str = this.message;
        if (str == null ? beaconNotificationData.message != null : !str.equals(beaconNotificationData.message)) {
            return false;
        }
        String str2 = this.image;
        if (str2 == null ? beaconNotificationData.image != null : !str2.equals(beaconNotificationData.image)) {
            return false;
        }
        String str3 = this.url;
        return str3 != null ? str3.equals(beaconNotificationData.url) : beaconNotificationData.url == null;
    }

    public int getId() {
        return this.f14129id;
    }

    public String getImage() {
        return this.image;
    }

    public String getMessage() {
        return this.message;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i = this.f14129id * 31;
        String str = this.message;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public void setId(int i) {
        this.f14129id = i;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
