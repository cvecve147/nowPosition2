package com.openlife.checkme.activity.browser;

import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.openlife.checkme.C4956g;
import com.openlife.checkme.activity.browser.TinyGameFragment;

public class TinyGameFragment_ViewBinding<T extends TinyGameFragment> implements Unbinder {

    /* renamed from: a */
    protected T f13259a;

    public TinyGameFragment_ViewBinding(T t, View view) {
        this.f13259a = t;
        t.webView = (WebView) C1153c.m5853c(view, C4956g.web_view, "field 'webView'", WebView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        T t = this.f13259a;
        if (t != null) {
            t.webView = null;
            this.f13259a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
