package com.askey.taipeinavi.home;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.askey.taipeinavi.common.C1203g;

/* renamed from: com.askey.taipeinavi.home.J */
public class C1230J extends C1203g {

    /* renamed from: a */
    C1221H f4444a;

    /* renamed from: a */
    private void m6166a(Uri uri) {
        if (this.f4444a != null && uri.toString().contains("token")) {
            this.f4444a.mo5524a(uri.getQueryParameter("token"));
        }
    }

    /* renamed from: a */
    public void mo5557a(C1221H h) {
        this.f4444a = h;
    }

    /* renamed from: a */
    public boolean mo5478a(WebView webView, WebResourceRequest webResourceRequest) {
        m6166a(webResourceRequest.getUrl());
        return false;
    }

    /* renamed from: a */
    public boolean mo5479a(WebView webView, String str) {
        m6166a(Uri.parse(str));
        return false;
    }
}
