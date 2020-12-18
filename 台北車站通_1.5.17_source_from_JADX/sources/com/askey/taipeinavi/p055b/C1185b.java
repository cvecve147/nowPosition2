package com.askey.taipeinavi.p055b;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.askey.taipeinavi.common.C1203g;

/* renamed from: com.askey.taipeinavi.b.b */
public class C1185b extends C1203g {

    /* renamed from: a */
    private C1184a f4359a;

    /* renamed from: a */
    private boolean m5942a(String str) {
        if (!str.startsWith("taipeinavi://")) {
            return false;
        }
        String substring = str.substring(str.lastIndexOf(47) + 1);
        C1184a aVar = this.f4359a;
        if (aVar != null) {
            aVar.mo5476a(substring);
        }
        return true;
    }

    /* renamed from: a */
    public void mo5477a(C1184a aVar) {
        this.f4359a = aVar;
    }

    /* renamed from: a */
    public boolean mo5478a(WebView webView, WebResourceRequest webResourceRequest) {
        return m5942a(webResourceRequest.getUrl().toString());
    }

    /* renamed from: a */
    public boolean mo5479a(WebView webView, String str) {
        return m5942a(str);
    }
}
