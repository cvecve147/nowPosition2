package com.askey.taipeinavi.common;

import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.askey.taipeinavi.R;
import com.askey.taipeinavi.common.p057a.C1196b;
import com.askey.taipeinavi.p058d.C1212f;
import com.wang.avi.AVLoadingIndicatorView;
import p267i.p274b.p282c.C6740b;

public class WebViewFragment extends C1194a {

    /* renamed from: a */
    private C1191a f4372a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C1203g f4373b;

    /* renamed from: c */
    private String f4374c;

    /* renamed from: d */
    private String f4375d = "";
    AVLoadingIndicatorView mPgbLoading;
    WebView mWebview;

    /* renamed from: com.askey.taipeinavi.common.WebViewFragment$a */
    private class C1191a implements C6740b.C6741a {
        private C1191a() {
        }

        /* synthetic */ C1191a(WebViewFragment webViewFragment, C1204h hVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo5488a() {
            if (!WebViewFragment.this.mWebview.canGoBack()) {
                return false;
            }
            WebViewFragment.this.mWebview.goBack();
            return true;
        }
    }

    /* renamed from: com.askey.taipeinavi.common.WebViewFragment$b */
    private class C1192b extends WebViewClient {
        private C1192b() {
        }

        /* synthetic */ C1192b(WebViewFragment webViewFragment, C1204h hVar) {
            this();
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewFragment.this.mo5484a(webView, str);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewFragment.this.m5960a(sslErrorHandler, sslError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return WebViewFragment.this.f4373b != null ? WebViewFragment.this.f4373b.mo5479a(webView, str) : super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.askey.taipeinavi.common.WebViewFragment$c */
    private class C1193c extends WebViewClient {
        private C1193c() {
        }

        /* synthetic */ C1193c(WebViewFragment webViewFragment, C1204h hVar) {
            this();
        }

        public void onPageFinished(WebView webView, String str) {
            WebViewFragment.this.mo5484a(webView, str);
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewFragment.this.m5960a(sslErrorHandler, sslError);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return WebViewFragment.this.f4373b != null ? WebViewFragment.this.f4373b.mo5478a(webView, webResourceRequest) : super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5960a(SslErrorHandler sslErrorHandler, SslError sslError) {
        if (C1196b.m5987a().mo5499a(sslError)) {
            sslErrorHandler.proceed();
        } else {
            C1212f.m6043e(mo1396i(), new C1206j(this, sslErrorHandler));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: fa */
    public void m5964fa() {
        AVLoadingIndicatorView aVLoadingIndicatorView = this.mPgbLoading;
        if (aVLoadingIndicatorView != null) {
            aVLoadingIndicatorView.setVisibility(4);
        }
    }

    /* renamed from: ga */
    private void m5965ga() {
        WebViewClient webViewClient;
        WebView webView;
        this.mPgbLoading.setVisibility(0);
        this.mWebview.getSettings().setJavaScriptEnabled(true);
        this.mWebview.getSettings().setCacheMode(2);
        this.mWebview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.mWebview.getSettings().setAppCacheEnabled(false);
        this.mWebview.getSettings().setDisplayZoomControls(false);
        this.mWebview.getSettings().setBuiltInZoomControls(true);
        this.mWebview.getSettings().setDomStorageEnabled(true);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mWebview.getSettings().setMixedContentMode(0);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            webView = this.mWebview;
            webViewClient = new C1193c(this, (C1204h) null);
        } else {
            webView = this.mWebview;
            webViewClient = new C1192b(this, (C1204h) null);
        }
        webView.setWebViewClient(webViewClient);
        this.mWebview.setWebChromeClient(new WebChromeClient());
        this.mWebview.loadUrl(this.f4374c);
    }

    /* renamed from: M */
    public void mo1293M() {
        WebView webView = this.mWebview;
        if (webView != null) {
            webView.stopLoading();
        }
        super.mo1293M();
    }

    /* renamed from: O */
    public void mo1326O() {
        super.mo1326O();
        this.f4380a.mo17229a((View.OnClickListener) null);
        this.f4380a.mo17234b((View.OnClickListener) null);
        this.f4381b.mo17226a((C6740b.C6741a) null);
        this.f4380a.mo5531d(false);
    }

    /* renamed from: P */
    public void mo1327P() {
        this.f4380a.mo5542v();
        this.f4380a.mo17232a(this.f4375d);
        this.f4380a.mo5527b(true, (int) R.string.txt_back);
        this.f4380a.mo17229a((View.OnClickListener) new C1204h(this));
        this.f4380a.mo5528c("");
        this.f4380a.mo5532f((int) R.mipmap.icon_cancel);
        this.f4380a.mo5531d(true);
        this.f4380a.mo17234b((View.OnClickListener) new C1205i(this));
        super.mo1327P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5484a(WebView webView, String str) {
        m5964fa();
    }

    /* renamed from: a */
    public void mo5485a(C1203g gVar) {
        this.f4373b = gVar;
    }

    /* renamed from: b */
    public void mo1300b(Bundle bundle) {
        super.mo1300b(bundle);
        m5965ga();
    }

    /* renamed from: b */
    public void mo5486b(String str) {
        if (str == null) {
            str = "";
        }
        this.f4375d = str;
    }

    /* renamed from: c */
    public void mo1301c(Bundle bundle) {
        super.mo1301c(bundle);
        this.f4372a = new C1191a(this, (C1204h) null);
    }

    /* renamed from: c */
    public void mo5487c(String str) {
        this.f4374c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ea */
    public int mo1304ea() {
        return R.layout.fragment_webview;
    }
}
