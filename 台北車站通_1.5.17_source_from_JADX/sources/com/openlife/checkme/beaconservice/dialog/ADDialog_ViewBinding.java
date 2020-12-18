package com.openlife.checkme.beaconservice.dialog;

import android.support.p007v4.view.ViewPager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.beaconservice.dialog.ADDialog;
import com.viewpagerindicator.CirclePageIndicator;

public class ADDialog_ViewBinding<T extends ADDialog> implements Unbinder {

    /* renamed from: a */
    protected T f13911a;

    /* renamed from: b */
    private View f13912b;

    /* renamed from: c */
    private View f13913c;

    /* renamed from: d */
    private View f13914d;

    public ADDialog_ViewBinding(T t, View view) {
        this.f13911a = t;
        View a = C1153c.m5849a(view, C4956g.dont_show, "field 'dontShow' and method 'onDontShowClick'");
        t.dontShow = (CheckBox) C1153c.m5850a(a, C4956g.dont_show, "field 'dontShow'", CheckBox.class);
        this.f13912b = a;
        a.setOnClickListener(new C4846b(this, t));
        View a2 = C1153c.m5849a(view, C4956g.close, "field 'close' and method 'onCloseClick'");
        t.close = (TextView) C1153c.m5850a(a2, C4956g.close, "field 'close'", TextView.class);
        this.f13913c = a2;
        a2.setOnClickListener(new C4847c(this, t));
        View a3 = C1153c.m5849a(view, C4956g.open, "field 'open' and method 'onOpenClick'");
        t.open = (TextView) C1153c.m5850a(a3, C4956g.open, "field 'open'", TextView.class);
        this.f13914d = a3;
        a3.setOnClickListener(new C4848d(this, t));
        t.mImagePager = (ViewPager) C1153c.m5853c(view, C4956g.ad_viewPager, "field 'mImagePager'", ViewPager.class);
        t.indicator = (CirclePageIndicator) C1153c.m5853c(view, C4956g.indicator, "field 'indicator'", CirclePageIndicator.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13911a;
        if (t != null) {
            t.dontShow = null;
            t.close = null;
            t.open = null;
            t.mImagePager = null;
            t.indicator = null;
            this.f13912b.setOnClickListener((View.OnClickListener) null);
            this.f13912b = null;
            this.f13913c.setOnClickListener((View.OnClickListener) null);
            this.f13913c = null;
            this.f13914d.setOnClickListener((View.OnClickListener) null);
            this.f13914d = null;
            this.f13911a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
