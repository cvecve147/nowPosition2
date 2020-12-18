package com.openlife.checkme.activity.mission.detail;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.openlife.checkme.activity.mission.detail.b */
class C4706b extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ MissionDetailFragment f13626a;

    C4706b(MissionDetailFragment missionDetailFragment) {
        this.f13626a = missionDetailFragment;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f13626a.mo12756f();
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f13626a.mo12963e();
    }
}
