package com.openlife.checkme.activity.account;

import android.support.design.widget.TabLayout;
import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.account.AccountFragment;

public class AccountFragment_ViewBinding<T extends AccountFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13153a;

    /* renamed from: b */
    private View f13154b;

    public AccountFragment_ViewBinding(T t, View view) {
        this.f13153a = t;
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.name = (TextView) C1153c.m5853c(view, C4956g.name, "field 'name'", TextView.class);
        t.code = (TextView) C1153c.m5853c(view, C4956g.code, "field 'code'", TextView.class);
        t.tabLayout = (TabLayout) C1153c.m5853c(view, C4956g.tab_layout, "field 'tabLayout'", TabLayout.class);
        t.viewPager = (ViewPager) C1153c.m5853c(view, C4956g.view_pager, "field 'viewPager'", ViewPager.class);
        View a = C1153c.m5849a(view, C4956g.copy, "method 'onCopy'");
        this.f13154b = a;
        a.setOnClickListener(new C4466b(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13153a;
        if (t != null) {
            t.cover = null;
            t.name = null;
            t.code = null;
            t.tabLayout = null;
            t.viewPager = null;
            this.f13154b.setOnClickListener((View.OnClickListener) null);
            this.f13154b = null;
            this.f13153a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
