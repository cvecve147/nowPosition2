package com.openlife.checkme.activity.browser;

import android.graphics.Bitmap;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.openlife.checkme.activity.browser.b */
class C4532b extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ TinyGameFragment f13261a;

    C4532b(TinyGameFragment tinyGameFragment) {
        this.f13261a = tinyGameFragment;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f13261a.mo12756f();
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f13261a.mo12963e();
    }

    @JavascriptInterface
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
