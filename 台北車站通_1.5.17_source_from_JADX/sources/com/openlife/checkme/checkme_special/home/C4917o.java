package com.openlife.checkme.checkme_special.home;

import com.openlife.checkme.activity.store.StoreActivity;
import com.openlife.checkme.checkme_special.home.SpMainAdapter;
import com.openlife.checkme.checkme_special.mission.SpMissionListActivity;
import com.openlife.checkme.net.model.AdBannerData;
import com.openlife.checkme.p093c.C4883m;

/* renamed from: com.openlife.checkme.checkme_special.home.o */
class C4917o implements SpMainAdapter.C4897b {

    /* renamed from: a */
    final /* synthetic */ SpMainFragment f14069a;

    C4917o(SpMainFragment spMainFragment) {
        this.f14069a = spMainFragment;
    }

    /* renamed from: a */
    public void mo13429a() {
        SpMissionListActivity.m19388a(this.f14069a.getActivity());
    }

    /* renamed from: a */
    public void mo13430a(AdBannerData adBannerData) {
        C4883m.m19240c(this.f14069a.getActivity(), adBannerData.getUrl());
    }

    /* renamed from: b */
    public void mo13431b() {
        this.f14069a.m19313o();
    }

    /* renamed from: g */
    public void mo13432g() {
        StoreActivity.m18921a(this.f14069a.getActivity());
    }
}
