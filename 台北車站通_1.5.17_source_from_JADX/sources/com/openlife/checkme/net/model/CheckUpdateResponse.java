package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class CheckUpdateResponse extends C4953c<CheckUpdateData> {
    public CheckUpdateData getData() {
        T t = this.data;
        return t != null ? (CheckUpdateData) t : new CheckUpdateData();
    }
}
