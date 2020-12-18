package com.openlife.checkme.p100ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.openlife.checkme.C4957h;

/* renamed from: com.openlife.checkme.ui.MissionListTagView */
public class MissionListTagView extends RelativeLayout {

    /* renamed from: a */
    private String f14254a;

    /* renamed from: b */
    private String f14255b;
    ImageView tag;
    TextView title;

    public MissionListTagView(Context context) {
        super(context);
        m19810a();
        setVisibility(4);
    }

    public MissionListTagView(Context context, String str, String str2) {
        this(context);
        this.f14254a = str;
        this.f14255b = str2;
        m19811b();
    }

    /* renamed from: a */
    private void m19810a() {
        RelativeLayout.inflate(getContext(), C4957h.view_mission_list_tag_cm, this);
        ButterKnife.m5842a((View) this);
    }

    /* renamed from: b */
    private void m19811b() {
        setVisibility(0);
        this.title.setText(this.f14254a);
        this.tag.setColorFilter(Color.parseColor(this.f14255b), PorterDuff.Mode.SRC_ATOP);
    }
}
