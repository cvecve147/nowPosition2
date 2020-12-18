package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class RedeemGiftResponse extends C4953c<RedeemGiftData> {
    public RedeemGiftData getData() {
        T t = this.data;
        return t != null ? (RedeemGiftData) t : new RedeemGiftData();
    }
}
