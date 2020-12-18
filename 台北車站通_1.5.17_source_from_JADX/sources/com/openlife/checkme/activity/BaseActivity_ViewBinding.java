package com.openlife.checkme.activity;

import android.support.p011v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.BaseActivity;

public class BaseActivity_ViewBinding<T extends BaseActivity> implements Unbinder {

    /* renamed from: a */
    protected T f13142a;

    public BaseActivity_ViewBinding(T t, View view) {
        this.f13142a = t;
        t.toolbar = (Toolbar) C1153c.m5852b(view, C4956g.toolbar, "field 'toolbar'", Toolbar.class);
        t.point = (TextView) C1153c.m5852b(view, C4956g.point, "field 'point'", TextView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13142a;
        if (t != null) {
            t.toolbar = null;
            t.point = null;
            this.f13142a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
