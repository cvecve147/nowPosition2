package com.openlife.checkme.net.model;

public class AdInterstitial {
    private String image;
    private String name;
    private String url;

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
