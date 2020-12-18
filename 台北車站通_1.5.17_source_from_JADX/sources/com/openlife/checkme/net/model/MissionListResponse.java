package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class MissionListResponse extends C4953c<MissionListData> {
    public MissionListData getData() {
        T t = this.data;
        return t != null ? (MissionListData) t : new MissionListData();
    }
}
