package com.openlife.checkme.activity.gift.detail;

import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.gift.detail.GiftDetailFragment;

public class GiftDetailFragment_ViewBinding<T extends GiftDetailFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13341a;

    /* renamed from: b */
    private View f13342b;

    public GiftDetailFragment_ViewBinding(T t, View view) {
        this.f13341a = t;
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.last = (TextView) C1153c.m5853c(view, C4956g.last, "field 'last'", TextView.class);
        t.point = (TextView) C1153c.m5853c(view, C4956g.point, "field 'point'", TextView.class);
        t.webView = (WebView) C1153c.m5853c(view, C4956g.web_view, "field 'webView'", WebView.class);
        View a = C1153c.m5849a(view, C4956g.redeem, "field 'redeem' and method 'redeemGift'");
        t.redeem = (Button) C1153c.m5850a(a, C4956g.redeem, "field 'redeem'", Button.class);
        this.f13342b = a;
        a.setOnClickListener(new C4579e(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13341a;
        if (t != null) {
            t.cover = null;
            t.title = null;
            t.last = null;
            t.point = null;
            t.webView = null;
            t.redeem = null;
            this.f13342b.setOnClickListener((View.OnClickListener) null);
            this.f13342b = null;
            this.f13341a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
