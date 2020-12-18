package com.openlife.checkme.p100ui.Viewholder;

import android.view.View;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p100ui.C5034r;

/* renamed from: com.openlife.checkme.ui.Viewholder.b */
class C5016b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C5034r.C5038c.C5039a f14275a;

    /* renamed from: b */
    final /* synthetic */ MissionData f14276b;

    /* renamed from: c */
    final /* synthetic */ NearlyMissionViewHolder f14277c;

    C5016b(NearlyMissionViewHolder nearlyMissionViewHolder, C5034r.C5038c.C5039a aVar, MissionData missionData) {
        this.f14277c = nearlyMissionViewHolder;
        this.f14275a = aVar;
        this.f14276b = missionData;
    }

    public void onClick(View view) {
        C5034r.C5038c.C5039a aVar = this.f14275a;
        if (aVar != null) {
            aVar.mo12945a(this.f14276b.getId());
        }
    }
}
