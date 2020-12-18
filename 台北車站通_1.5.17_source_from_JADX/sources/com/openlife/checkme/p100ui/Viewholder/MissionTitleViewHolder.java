package com.openlife.checkme.p100ui.Viewholder;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.marshalchen.ultimaterecyclerview.C4194p;

/* renamed from: com.openlife.checkme.ui.Viewholder.MissionTitleViewHolder */
public class MissionTitleViewHolder extends C4194p {
    public TextView mTitleText;

    public MissionTitleViewHolder(View view) {
        super(view);
        ButterKnife.m5843a((Object) this, view);
    }

    /* renamed from: c */
    public void mo14080c(int i) {
        this.mTitleText.setText(i);
    }
}
