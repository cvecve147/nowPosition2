package com.openlife.checkme.p100ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.MissionListTagView;

/* renamed from: com.openlife.checkme.ui.MissionListTagView_ViewBinding */
public class MissionListTagView_ViewBinding<T extends MissionListTagView> implements Unbinder {

    /* renamed from: a */
    protected T f14256a;

    public MissionListTagView_ViewBinding(T t, View view) {
        this.f14256a = t;
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.tag = (ImageView) C1153c.m5853c(view, C4956g.tag, "field 'tag'", ImageView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14256a;
        if (t != null) {
            t.title = null;
            t.tag = null;
            this.f14256a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
