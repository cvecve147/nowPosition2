package com.openlife.checkme.p100ui;

import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.p100ui.ActivityItem;

/* renamed from: com.openlife.checkme.ui.ActivityItem_ViewBinding */
public class ActivityItem_ViewBinding<T extends ActivityItem> implements Unbinder {

    /* renamed from: a */
    protected T f14209a;

    public ActivityItem_ViewBinding(T t, View view) {
        this.f14209a = t;
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.viewPager = (ViewPager) C1153c.m5853c(view, C4956g.view_pager, "field 'viewPager'", ViewPager.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f14209a;
        if (t != null) {
            t.title = null;
            t.viewPager = null;
            this.f14209a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
