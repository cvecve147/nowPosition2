package com.openlife.checkme.net.model;

import p101d.p129g.p152e.p153a.C5598c;

public class MissionExecuteData {
    @C5598c("end_date")
    private String endDate;
    @C5598c("id")

    /* renamed from: id */
    private int f14135id;
    @C5598c("status")
    private boolean status;

    public MissionExecuteData(int i, boolean z, String str) {
        this.f14135id = i;
        this.status = z;
        this.endDate = str;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public int getId() {
        return this.f14135id;
    }

    public boolean isStatus() {
        return this.status;
    }
}
