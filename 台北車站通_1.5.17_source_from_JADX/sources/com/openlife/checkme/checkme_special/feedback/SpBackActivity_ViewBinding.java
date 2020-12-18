package com.openlife.checkme.checkme_special.feedback;

import android.support.p011v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.BaseActivity_ViewBinding;
import com.openlife.checkme.checkme_special.feedback.SpBackActivity;

public class SpBackActivity_ViewBinding<T extends SpBackActivity> extends BaseActivity_ViewBinding<T> {
    public SpBackActivity_ViewBinding(T t, View view) {
        super(t, view);
        t.toolbar = (Toolbar) C1153c.m5852b(view, C4956g.toolbar, "field 'toolbar'", Toolbar.class);
        t.point = (TextView) C1153c.m5852b(view, C4956g.point, "field 'point'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        SpBackActivity spBackActivity = (SpBackActivity) this.f13142a;
        super.mo5375a();
        spBackActivity.toolbar = null;
        spBackActivity.point = null;
    }
}
