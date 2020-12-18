package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Hr */
final class C2383Hr implements Runnable {

    /* renamed from: a */
    private ValueCallback<String> f7190a = new C2411Ir(this);

    /* renamed from: b */
    final /* synthetic */ C3673zr f7191b;

    /* renamed from: c */
    final /* synthetic */ WebView f7192c;

    /* renamed from: d */
    final /* synthetic */ boolean f7193d;

    /* renamed from: e */
    final /* synthetic */ C2325Fr f7194e;

    C2383Hr(C2325Fr fr, C3673zr zrVar, WebView webView, boolean z) {
        this.f7194e = fr;
        this.f7191b = zrVar;
        this.f7192c = webView;
        this.f7193d = z;
    }

    public final void run() {
        if (this.f7192c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f7192c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f7190a);
            } catch (Throwable unused) {
                this.f7190a.onReceiveValue("");
            }
        }
    }
}
