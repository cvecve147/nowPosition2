package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class MissionDetailResponse extends C4953c<MissionDetailData> {
    public MissionDetailData getData() {
        T t = this.data;
        return t != null ? (MissionDetailData) t : new MissionDetailData();
    }
}
