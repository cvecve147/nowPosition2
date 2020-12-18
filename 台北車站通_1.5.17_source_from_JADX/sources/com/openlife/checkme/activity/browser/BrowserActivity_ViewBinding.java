package com.openlife.checkme.activity.browser;

import android.view.View;
import android.webkit.WebView;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.BaseActivity_ViewBinding;
import com.openlife.checkme.activity.browser.BrowserActivity;

public class BrowserActivity_ViewBinding<T extends BrowserActivity> extends BaseActivity_ViewBinding<T> {
    public BrowserActivity_ViewBinding(T t, View view) {
        super(t, view);
        t.webView = (WebView) C1153c.m5853c(view, C4956g.web_view, "field 'webView'", WebView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        super.mo5375a();
        ((BrowserActivity) this.f13142a).webView = null;
    }
}
