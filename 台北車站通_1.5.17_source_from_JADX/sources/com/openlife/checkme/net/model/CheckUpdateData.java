package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class CheckUpdateData {
    @C5598c("need_update")
    private Integer needUpdate;
    private String url;

    public CheckUpdateData() {
    }

    public CheckUpdateData(Integer num, String str) {
        this.needUpdate = num;
        this.url = str;
    }

    public int getNeedUpdate() {
        Integer num = this.needUpdate;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public String getUrl() {
        String str = this.url;
        return str != null ? str : "";
    }
}
