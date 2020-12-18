package com.openlife.checkme.p100ui.Viewholder;

import android.view.View;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p100ui.C5034r;

/* renamed from: com.openlife.checkme.ui.Viewholder.a */
class C5015a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C5034r.C5036b.C5037a f14272a;

    /* renamed from: b */
    final /* synthetic */ MissionData f14273b;

    /* renamed from: c */
    final /* synthetic */ MissionViewHolder f14274c;

    C5015a(MissionViewHolder missionViewHolder, C5034r.C5036b.C5037a aVar, MissionData missionData) {
        this.f14274c = missionViewHolder;
        this.f14272a = aVar;
        this.f14273b = missionData;
    }

    public void onClick(View view) {
        C5034r.C5036b.C5037a aVar = this.f14272a;
        if (aVar != null) {
            aVar.mo12944a(this.f14273b.getId());
        }
    }
}
