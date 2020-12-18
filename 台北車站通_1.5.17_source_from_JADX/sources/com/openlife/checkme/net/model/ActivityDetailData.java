package com.openlife.checkme.net.model;

public class ActivityDetailData {
    private String image;
    private int status;
    private String url;

    public String getImage() {
        String str = this.image;
        return str != null ? str : "";
    }

    public int getStatus() {
        return this.status;
    }

    public String getUrl() {
        String str = this.url;
        return str != null ? str : "";
    }
}
