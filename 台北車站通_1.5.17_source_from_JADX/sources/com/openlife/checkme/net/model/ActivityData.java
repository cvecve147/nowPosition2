package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;

public class ActivityData {
    private List<ActivityDetailData> data;
    private String title;
    private String type;

    public List<ActivityDetailData> getData() {
        List<ActivityDetailData> list = this.data;
        return list != null ? list : new ArrayList();
    }

    public String getTitle() {
        String str = this.title;
        return str != null ? str : "";
    }

    public String getType() {
        String str = this.type;
        return str != null ? str : "";
    }
}
