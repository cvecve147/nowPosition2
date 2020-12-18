package com.openlife.checkme.net.model;

import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p152e.p153a.C5598c;

public class MissionListData {
    @C5598c("assignment")
    private List<MissionData> assignment;
    @C5598c("corp_name")
    private String corpName;
    @C5598c("next")
    private boolean next;

    public List<MissionData> getAssignment() {
        List<MissionData> list = this.assignment;
        return list != null ? list : new ArrayList();
    }

    public String getCorpName() {
        String str = this.corpName;
        return str != null ? str : "";
    }

    public boolean isNext() {
        return this.next;
    }

    public void setCorpName(String str) {
        this.corpName = str;
    }

    public void setNext(boolean z) {
        this.next = z;
    }
}
