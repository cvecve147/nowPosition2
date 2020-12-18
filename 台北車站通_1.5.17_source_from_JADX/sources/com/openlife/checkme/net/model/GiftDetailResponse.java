package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class GiftDetailResponse extends C4953c<GiftDetailData> {
    public GiftDetailData getData() {
        T t = this.data;
        return t != null ? (GiftDetailData) t : new GiftDetailData();
    }
}
