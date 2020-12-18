package com.openlife.checkme.activity.account.redemption.detail;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.account.redemption.detail.RedemptionDetailFragment;
import com.openlife.checkme.p100ui.BaseWebView;

public class RedemptionDetailFragment_ViewBinding<T extends RedemptionDetailFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13212a;

    /* renamed from: b */
    private View f13213b;

    /* renamed from: c */
    private View f13214c;

    /* renamed from: d */
    private View f13215d;

    public RedemptionDetailFragment_ViewBinding(T t, View view) {
        this.f13212a = t;
        t.cover = (ImageView) C1153c.m5853c(view, C4956g.cover, "field 'cover'", ImageView.class);
        t.title = (TextView) C1153c.m5853c(view, C4956g.title, "field 'title'", TextView.class);
        t.code = (TextView) C1153c.m5853c(view, C4956g.code, "field 'code'", TextView.class);
        t.expiredDate = (TextView) C1153c.m5853c(view, C4956g.expired_date, "field 'expiredDate'", TextView.class);
        View a = C1153c.m5849a(view, C4956g.redeem, "field 'redeem' and method 'onRedeemClick'");
        t.redeem = (ImageButton) C1153c.m5850a(a, C4956g.redeem, "field 'redeem'", ImageButton.class);
        this.f13213b = a;
        a.setOnClickListener(new C4506f(this, t));
        View a2 = C1153c.m5849a(view, C4956g.url, "field 'url' and method 'onUrlClick'");
        t.url = (ImageButton) C1153c.m5850a(a2, C4956g.url, "field 'url'", ImageButton.class);
        this.f13214c = a2;
        a2.setOnClickListener(new C4507g(this, t));
        t.webView = (BaseWebView) C1153c.m5853c(view, C4956g.web_view, "field 'webView'", BaseWebView.class);
        t.view = C1153c.m5849a(view, C4956g.view, "field 'view'");
        View a3 = C1153c.m5849a(view, C4956g.copy, "method 'onCopyClick'");
        this.f13215d = a3;
        a3.setOnClickListener(new C4508h(this, t));
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13212a;
        if (t != null) {
            t.cover = null;
            t.title = null;
            t.code = null;
            t.expiredDate = null;
            t.redeem = null;
            t.url = null;
            t.webView = null;
            t.view = null;
            this.f13213b.setOnClickListener((View.OnClickListener) null);
            this.f13213b = null;
            this.f13214c.setOnClickListener((View.OnClickListener) null);
            this.f13214c = null;
            this.f13215d.setOnClickListener((View.OnClickListener) null);
            this.f13215d = null;
            this.f13212a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
