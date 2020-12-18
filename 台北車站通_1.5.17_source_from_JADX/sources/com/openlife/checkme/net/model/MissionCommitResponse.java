package com.openlife.checkme.net.model;

import com.openlife.checkme.p097f.C4953c;

public class MissionCommitResponse extends C4953c<MissionCommitData> {
    public MissionCommitData getData() {
        T t = this.data;
        return t != null ? (MissionCommitData) t : new MissionCommitData();
    }
}
