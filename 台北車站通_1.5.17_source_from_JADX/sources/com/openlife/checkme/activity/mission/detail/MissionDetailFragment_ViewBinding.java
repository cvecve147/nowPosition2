package com.openlife.checkme.activity.mission.detail;

import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.mission.detail.MissionDetailFragment;
import com.viewpagerindicator.CirclePageIndicator;

public class MissionDetailFragment_ViewBinding<T extends MissionDetailFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13623a;

    /* renamed from: b */
    private View f13624b;

    public MissionDetailFragment_ViewBinding(T t, View view) {
        this.f13623a = t;
        t.viewPager = (ViewPager) C1153c.m5853c(view, C4956g.view_pager, "field 'viewPager'", ViewPager.class);
        t.indicator = (CirclePageIndicator) C1153c.m5853c(view, C4956g.indicator, "field 'indicator'", CirclePageIndicator.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.tagLayout = (LinearLayout) C1153c.m5853c(view, C4956g.tag_layout, "field 'tagLayout'", LinearLayout.class);
        t.desc = (TextView) C1153c.m5853c(view, C4956g.desc, "field 'desc'", TextView.class);
        t.time = (TextView) C1153c.m5853c(view, C4956g.time, "field 'time'", TextView.class);
        t.notice = (TextView) C1153c.m5853c(view, C4956g.notice, "field 'notice'", TextView.class);
        t.webView = (WebView) C1153c.m5853c(view, C4956g.web_view, "field 'webView'", WebView.class);
        View a = C1153c.m5849a(view, C4956g.execute, "field 'execute' and method 'executeMission'");
        t.execute = (Button) C1153c.m5850a(a, C4956g.execute, "field 'execute'", Button.class);
        this.f13624b = a;
        a.setOnClickListener(new C4708d(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13623a;
        if (t != null) {
            t.viewPager = null;
            t.indicator = null;
            t.title = null;
            t.tagLayout = null;
            t.desc = null;
            t.time = null;
            t.notice = null;
            t.webView = null;
            t.execute = null;
            this.f13624b.setOnClickListener((View.OnClickListener) null);
            this.f13624b = null;
            this.f13623a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
