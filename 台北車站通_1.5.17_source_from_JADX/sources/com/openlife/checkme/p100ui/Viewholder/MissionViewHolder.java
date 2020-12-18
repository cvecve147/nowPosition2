package com.openlife.checkme.p100ui.Viewholder;

import android.support.p011v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.marshalchen.ultimaterecyclerview.C4194p;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.openlife.checkme.C4452a;
import com.openlife.checkme.C4959j;
import com.openlife.checkme.net.model.MissionData;
import com.openlife.checkme.p100ui.C5034r;
import com.openlife.checkme.p100ui.MissionListTagView;

/* renamed from: com.openlife.checkme.ui.Viewholder.MissionViewHolder */
public class MissionViewHolder extends C4194p {
    public CardView cardView;
    public ImageView cover;
    public RelativeLayout layout;
    public TextView point;
    public LinearLayout tagLayout;
    public TextView title;

    public MissionViewHolder(View view) {
        super(view);
        ButterKnife.m5843a((Object) this, view);
    }

    /* renamed from: a */
    private void m19826a(LinearLayout linearLayout, MissionData missionData) {
        linearLayout.removeAllViews();
        MissionListTagView[] missionListTagViewArr = new MissionListTagView[2];
        for (int i = 0; i < 2; i++) {
            if (missionData.getTag().size() > i) {
                missionListTagViewArr[i] = new MissionListTagView(linearLayout.getContext(), missionData.getTag().get(i).getTitle(), missionData.getTag().get(i).getColor());
            } else {
                missionListTagViewArr[i] = new MissionListTagView(linearLayout.getContext());
            }
        }
        linearLayout.addView(missionListTagViewArr[1]);
        linearLayout.addView(missionListTagViewArr[0]);
    }

    /* renamed from: a */
    public void mo14081a(MissionData missionData, C5034r.C5036b.C5037a aVar, boolean z, int i) {
        ImageLoader.getInstance().displayImage(missionData.getGridImage(), this.cover, C4452a.m17659a(C4959j.default_activity));
        this.title.setText(missionData.getName());
        this.point.setText(String.valueOf(missionData.getPoint()));
        this.layout.setOnClickListener(new C5015a(this, aVar, missionData));
        m19826a(this.tagLayout, missionData);
    }
}
