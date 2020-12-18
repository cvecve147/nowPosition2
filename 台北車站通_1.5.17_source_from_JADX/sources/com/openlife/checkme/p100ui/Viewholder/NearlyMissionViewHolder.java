package com.openlife.checkme.p100ui.Viewholder;

import android.content.Context;
import android.support.p011v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p100ui.C5034r;
import p013b.p018b.p028h.p029a.C1006a;

/* renamed from: com.openlife.checkme.ui.Viewholder.NearlyMissionViewHolder */
public class NearlyMissionViewHolder extends C4194p {

    /* renamed from: a */
    private Context f14270a = mo11857y();
    public CardView cardView;
    public ImageView cover;
    public TextView distance;
    public RelativeLayout layout;
    public TextView point;
    public TextView title;

    public NearlyMissionViewHolder(View view) {
        super(view);
        ButterKnife.m5843a((Object) this, view);
    }

    /* renamed from: a */
    public void mo14082a(MissionData missionData, C5034r.C5038c.C5039a aVar, boolean z, int i) {
        ImageLoader.getInstance().displayImage(missionData.getGridImage(), this.cover, C4452a.m17659a(C4959j.default_activity));
        this.title.setText(missionData.getName());
        this.point.setText(String.valueOf(missionData.getPoint()));
        this.distance.setText(C4883m.m19220a(this.f14270a, missionData.getDistance()));
        if (z) {
            this.distance.setTextColor(C1006a.m5386a(this.f14270a, i));
        }
        this.layout.setOnClickListener(new C5016b(this, aVar, missionData));
    }
}
