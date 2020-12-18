package com.openlife.checkme.p100ui;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.openlife.checkme.ui.b */
class C5018b extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ BaseWebView f14279a;

    C5018b(BaseWebView baseWebView) {
        this.f14279a = baseWebView;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.f14279a.f14210a != null) {
            this.f14279a.f14210a.mo12675b();
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.f14279a.f14210a != null) {
            this.f14279a.f14210a.mo12674a();
        }
    }
}
