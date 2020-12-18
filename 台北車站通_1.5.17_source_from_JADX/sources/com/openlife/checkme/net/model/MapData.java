package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class MapData {
    @C5598c("address")
    private String address;
    @C5598c("corp_id")
    private int corpId;
    @C5598c("corp_image")
    private String corpImage;
    @C5598c("corp_name")
    private String corpName;
    @C5598c("distance")
    private float distance;
    @C5598c("location")
    private Location location;
    @C5598c("point")
    private int point;
    @C5598c("site_id")
    private int siteId;
    @C5598c("site_name")
    private String siteName;
    @C5598c("telephone")
    private String telephone;

    public String getAddress() {
        String str = this.address;
        return str != null ? str : "";
    }

    public int getCorpId() {
        return this.corpId;
    }

    public String getCorpImage() {
        String str = this.corpImage;
        return str != null ? str : "";
    }

    public String getCorpName() {
        String str = this.corpName;
        return str != null ? str : "";
    }

    public float getDistance() {
        return this.distance;
    }

    public Location getLocation() {
        Location location2 = this.location;
        return location2 != null ? location2 : new Location(0.0d, 0.0d);
    }

    public int getPoint() {
        return this.point;
    }

    public String getPointStr() {
        return String.valueOf(this.point);
    }

    public int getSiteId() {
        return this.siteId;
    }

    public String getSiteName() {
        String str = this.siteName;
        return str != null ? str : "";
    }

    public String getTelephone() {
        String str = this.telephone;
        return str != null ? str : "";
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCorpId(int i) {
        this.corpId = i;
    }

    public void setCorpName(String str) {
        this.corpName = str;
    }

    public void setLocation(Location location2) {
        this.location = location2;
    }

    public void setSiteId(int i) {
        this.siteId = i;
    }

    public void setSiteName(String str) {
        this.siteName = str;
    }

    public void setTelephone(String str) {
        this.telephone = str;
    }
}
