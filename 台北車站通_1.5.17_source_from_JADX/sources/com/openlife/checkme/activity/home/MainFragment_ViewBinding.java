package com.openlife.checkme.activity.home;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.p011v7.widget.RecyclerView;
import android.support.p011v7.widget.Toolbar;
import android.support.percent.PercentRelativeLayout;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.home.MainFragment;
import com.openlife.checkme.p100ui.PointCircleView;

public class MainFragment_ViewBinding<T extends MainFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13491a;

    /* renamed from: b */
    private View f13492b;

    /* renamed from: c */
    private View f13493c;

    /* renamed from: d */
    private View f13494d;

    /* renamed from: e */
    private View f13495e;

    /* renamed from: f */
    private View f13496f;

    /* renamed from: g */
    private View f13497g;

    /* renamed from: h */
    private View f13498h;

    public MainFragment_ViewBinding(T t, View view) {
        this.f13491a = t;
        t.appBarLayout = (AppBarLayout) C1153c.m5853c(view, C4956g.appbar_layout, "field 'appBarLayout'", AppBarLayout.class);
        t.collapsingToolbarLayout = (CollapsingToolbarLayout) C1153c.m5853c(view, C4956g.collapsing_toolbat_layout, "field 'collapsingToolbarLayout'", CollapsingToolbarLayout.class);
        t.toolbar = (Toolbar) C1153c.m5853c(view, C4956g.toolbar, "field 'toolbar'", Toolbar.class);
        View a = C1153c.m5849a(view, C4956g.point_circle, "field 'pointCircle' and method 'account'");
        t.pointCircle = (PointCircleView) C1153c.m5850a(a, C4956g.point_circle, "field 'pointCircle'", PointCircleView.class);
        this.f13492b = a;
        a.setOnClickListener(new C4660r(this, t));
        t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        t.slogan = (TextView) C1153c.m5853c(view, C4956g.slogan, "field 'slogan'", TextView.class);
        t.titlePoint = (TextView) C1153c.m5853c(view, C4956g.title_point, "field 'titlePoint'", TextView.class);
        t.pointStatusLayout = (PercentRelativeLayout) C1153c.m5853c(view, C4956g.point_status_layout, "field 'pointStatusLayout'", PercentRelativeLayout.class);
        t.mRecyclerView = (RecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View a2 = C1153c.m5849a(view, C4956g.playMission, "method 'playMission'");
        this.f13493c = a2;
        a2.setOnClickListener(new C4661s(this, t));
        View a3 = C1153c.m5849a(view, C4956g.title_mission, "method 'playMission'");
        this.f13494d = a3;
        a3.setOnClickListener(new C4662t(this, t));
        View a4 = C1153c.m5849a(view, C4956g.redeem_gift, "method 'redeemGift'");
        this.f13495e = a4;
        a4.setOnClickListener(new C4663u(this, t));
        View a5 = C1153c.m5849a(view, C4956g.title_gift, "method 'redeemGift'");
        this.f13496f = a5;
        a5.setOnClickListener(new C4664v(this, t));
        View a6 = C1153c.m5849a(view, C4956g.location, "method 'location'");
        this.f13497g = a6;
        a6.setOnClickListener(new C4665w(this, t));
        View a7 = C1153c.m5849a(view, C4956g.others, "method 'others'");
        this.f13498h = a7;
        a7.setOnClickListener(new C4666x(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13491a;
        if (t != null) {
            t.appBarLayout = null;
            t.collapsingToolbarLayout = null;
            t.toolbar = null;
            t.pointCircle = null;
            t.point = null;
            t.slogan = null;
            t.titlePoint = null;
            t.pointStatusLayout = null;
            t.mRecyclerView = null;
            this.f13492b.setOnClickListener((View.OnClickListener) null);
            this.f13492b = null;
            this.f13493c.setOnClickListener((View.OnClickListener) null);
            this.f13493c = null;
            this.f13494d.setOnClickListener((View.OnClickListener) null);
            this.f13494d = null;
            this.f13495e.setOnClickListener((View.OnClickListener) null);
            this.f13495e = null;
            this.f13496f.setOnClickListener((View.OnClickListener) null);
            this.f13496f = null;
            this.f13497g.setOnClickListener((View.OnClickListener) null);
            this.f13497g = null;
            this.f13498h.setOnClickListener((View.OnClickListener) null);
            this.f13498h = null;
            this.f13491a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
