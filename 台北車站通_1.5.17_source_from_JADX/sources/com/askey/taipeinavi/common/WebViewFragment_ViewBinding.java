package com.askey.taipeinavi.common;

import android.view.View;
import android.webkit.WebView;
import butterknife.Unbinder;
import butterknife.p051a.C1153c;
import com.askey.taipeinavi.R;
import com.wang.avi.AVLoadingIndicatorView;

public class WebViewFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private WebViewFragment f4379a;

    public WebViewFragment_ViewBinding(WebViewFragment webViewFragment, View view) {
        this.f4379a = webViewFragment;
        webViewFragment.mPgbLoading = (AVLoadingIndicatorView) C1153c.m5853c(view, R.id.pgbLoading, "field 'mPgbLoading'", AVLoadingIndicatorView.class);
        webViewFragment.mWebview = (WebView) C1153c.m5853c(view, R.id.webView, "field 'mWebview'", WebView.class);
    }

    /* renamed from: a */
    public void mo5375a() {
        WebViewFragment webViewFragment = this.f4379a;
        if (webViewFragment != null) {
            this.f4379a = null;
            webViewFragment.mPgbLoading = null;
            webViewFragment.mWebview = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
