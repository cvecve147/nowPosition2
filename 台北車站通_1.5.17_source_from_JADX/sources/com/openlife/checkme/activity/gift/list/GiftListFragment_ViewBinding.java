package com.openlife.checkme.activity.gift.list;

import android.support.p011v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.gift.list.GiftListFragment;
import com.openlife.checkme.p100ui.CarouselViewpager;
import com.viewpagerindicator.CirclePageIndicator;

public class GiftListFragment_ViewBinding<T extends GiftListFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13379a;

    /* renamed from: b */
    private View f13380b;

    /* renamed from: c */
    private View f13381c;

    public GiftListFragment_ViewBinding(T t, View view) {
        this.f13379a = t;
        t.viewPager = (CarouselViewpager) C1153c.m5853c(view, C4956g.view_pager, "field 'viewPager'", CarouselViewpager.class);
        t.indicator = (CirclePageIndicator) C1153c.m5853c(view, C4956g.indicator, "field 'indicator'", CirclePageIndicator.class);
        View a = C1153c.m5849a(view, C4956g.sort, "field 'sort' and method 'onSortClick'");
        t.sort = (Button) C1153c.m5850a(a, C4956g.sort, "field 'sort'", Button.class);
        this.f13380b = a;
        a.setOnClickListener(new C4596f(this, t));
        t.mRecyclerView = (RecyclerView) C1153c.m5853c(view, C4956g.recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        View a2 = C1153c.m5849a(view, C4956g.mode, "field 'mode' and method 'onModeClick'");
        t.mode = (ImageButton) C1153c.m5850a(a2, C4956g.mode, "field 'mode'", ImageButton.class);
        this.f13381c = a2;
        a2.setOnClickListener(new C4597g(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13379a;
        if (t != null) {
            t.viewPager = null;
            t.indicator = null;
            t.sort = null;
            t.mRecyclerView = null;
            t.mode = null;
            this.f13380b.setOnClickListener((View.OnClickListener) null);
            this.f13380b = null;
            this.f13381c.setOnClickListener((View.OnClickListener) null);
            this.f13381c = null;
            this.f13379a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
