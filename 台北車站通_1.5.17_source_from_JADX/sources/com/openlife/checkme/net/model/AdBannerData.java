package com.openlife.checkme.net.model;

public class AdBannerData {
    private String image;
    private String name;
    private String url;

    public AdBannerData(String str, String str2, String str3) {
        this.name = str;
        this.image = str2;
        this.url = str3;
    }

    public String getImage() {
        String str = this.image;
        return str != null ? str : "";
    }

    public String getName() {
        String str = this.name;
        return str != null ? str : "";
    }

    public String getUrl() {
        String str = this.url;
        return str != null ? str : "";
    }
}
