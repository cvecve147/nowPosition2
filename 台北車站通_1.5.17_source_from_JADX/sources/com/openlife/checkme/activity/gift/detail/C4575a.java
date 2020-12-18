package com.openlife.checkme.activity.gift.detail;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.openlife.checkme.activity.gift.detail.a */
class C4575a extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ GiftDetailFragment f13343a;

    C4575a(GiftDetailFragment giftDetailFragment) {
        this.f13343a = giftDetailFragment;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f13343a.mo12756f();
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f13343a.mo12963e();
    }
}
