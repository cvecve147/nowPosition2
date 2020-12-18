package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class RedeemHistoryDetailResponse extends C4953c<RedeemHistoryDetailData> {
    public RedeemHistoryDetailData getData() {
        T t = this.data;
        return t != null ? (RedeemHistoryDetailData) t : new RedeemHistoryDetailData();
    }
}
