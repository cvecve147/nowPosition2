package com.openlife.checkme.activity.mission.list;

import android.support.p011v7.widget.GridLayoutManager;

/* renamed from: com.openlife.checkme.activity.mission.list.c */
class C4726c extends GridLayoutManager.C0718c {

    /* renamed from: c */
    final /* synthetic */ MissionListFragment f13669c;

    C4726c(MissionListFragment missionListFragment) {
        this.f13669c = missionListFragment;
    }

    /* renamed from: b */
    public int mo3394b(int i) {
        switch (this.f13669c.f13657a.mo13092d()) {
            case 111:
            case 112:
                return 2;
            case 113:
                return 1;
            default:
                return -1;
        }
    }
}
