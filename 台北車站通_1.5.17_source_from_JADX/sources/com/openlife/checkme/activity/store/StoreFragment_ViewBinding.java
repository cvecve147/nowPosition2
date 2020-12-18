package com.openlife.checkme.activity.store;

import android.support.design.widget.TabLayout;
import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.store.StoreFragment;
import com.openlife.checkme.p100ui.CarouselViewpager;
import com.viewpagerindicator.CirclePageIndicator;

public class StoreFragment_ViewBinding<T extends StoreFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13823a;

    /* renamed from: b */
    private View f13824b;

    public StoreFragment_ViewBinding(T t, View view) {
        this.f13823a = t;
        t.viewPager = (CarouselViewpager) C1153c.m5853c(view, C4956g.view_pager, "field 'viewPager'", CarouselViewpager.class);
        t.indicator = (CirclePageIndicator) C1153c.m5853c(view, C4956g.indicator, "field 'indicator'", CirclePageIndicator.class);
        t.tabLayout = (TabLayout) C1153c.m5853c(view, C4956g.tab_layout, "field 'tabLayout'", TabLayout.class);
        t.contentViewPager = (ViewPager) C1153c.m5853c(view, C4956g.content_view_pager, "field 'contentViewPager'", ViewPager.class);
        View a = C1153c.m5849a(view, C4956g.mode, "field 'mode' and method 'onModeClick'");
        t.mode = (ImageButton) C1153c.m5850a(a, C4956g.mode, "field 'mode'", ImageButton.class);
        this.f13824b = a;
        a.setOnClickListener(new C4809d(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13823a;
        if (t != null) {
            t.viewPager = null;
            t.indicator = null;
            t.tabLayout = null;
            t.contentViewPager = null;
            t.mode = null;
            this.f13824b.setOnClickListener((View.OnClickListener) null);
            this.f13824b = null;
            this.f13823a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
