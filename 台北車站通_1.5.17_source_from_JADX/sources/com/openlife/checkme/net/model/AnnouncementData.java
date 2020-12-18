package com.openlife.checkme.net.model;

import java.io.Serializable;

public class AnnouncementData implements Serializable {
    private String content;
    private String date;
    private String title;

    public AnnouncementData(String str, String str2, String str3) {
        this.title = str;
        this.date = str2;
        this.content = str3;
    }

    public String getContent() {
        String str = this.content;
        return str != null ? str : "";
    }

    public String getDate() {
        String str = this.date;
        return str != null ? str : "";
    }

    public String getTitle() {
        String str = this.title;
        return str != null ? str : "";
    }
}
