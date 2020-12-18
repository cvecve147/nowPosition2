package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class HomeInfoResponse extends C4953c<HomeInfoData> {
    public HomeInfoData getData() {
        T t = this.data;
        return t != null ? (HomeInfoData) t : new HomeInfoData();
    }
}
