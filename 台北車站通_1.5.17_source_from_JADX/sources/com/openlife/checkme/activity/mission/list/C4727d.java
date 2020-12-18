package com.openlife.checkme.activity.mission.list;

import android.support.p007v4.widget.SwipeRefreshLayout;

/* renamed from: com.openlife.checkme.activity.mission.list.d */
class C4727d implements SwipeRefreshLayout.C0531b {

    /* renamed from: a */
    final /* synthetic */ MissionListFragment f13670a;

    C4727d(MissionListFragment missionListFragment) {
        this.f13670a = missionListFragment;
    }

    /* renamed from: a */
    public void mo2263a() {
        this.f13670a.mSwipeRefreshLayout.setRefreshing(true);
        this.f13670a.f13661e.mo13122c(this.f13670a.f13659c);
    }
}
