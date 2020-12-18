package com.openlife.checkme.activity.mission.detail;

import android.view.View;
import butterknife.p051a.C1152b;

/* renamed from: com.openlife.checkme.activity.mission.detail.d */
class C4708d extends C1152b {

    /* renamed from: c */
    final /* synthetic */ MissionDetailFragment f13628c;

    /* renamed from: d */
    final /* synthetic */ MissionDetailFragment_ViewBinding f13629d;

    C4708d(MissionDetailFragment_ViewBinding missionDetailFragment_ViewBinding, MissionDetailFragment missionDetailFragment) {
        this.f13629d = missionDetailFragment_ViewBinding;
        this.f13628c = missionDetailFragment;
    }

    /* renamed from: a */
    public void mo5377a(View view) {
        this.f13628c.executeMission();
    }
}
