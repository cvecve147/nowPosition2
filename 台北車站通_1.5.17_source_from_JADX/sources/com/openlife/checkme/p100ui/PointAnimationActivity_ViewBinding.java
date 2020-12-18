package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.BaseActivity_ViewBinding;
import com.openlife.checkme.p100ui.PointAnimationActivity;

/* renamed from: com.openlife.checkme.ui.PointAnimationActivity_ViewBinding */
public class PointAnimationActivity_ViewBinding<T extends PointAnimationActivity> extends BaseActivity_ViewBinding<T> {
    public PointAnimationActivity_ViewBinding(T t, View view) {
        super(t, view);
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.pointTv = (TextView) C1153c.m5853c(view, C4956g.point, "field 'pointTv'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        PointAnimationActivity pointAnimationActivity = (PointAnimationActivity) this.f13142a;
        super.mo5375a();
        pointAnimationActivity.cover = null;
        pointAnimationActivity.pointTv = null;
    }
}
