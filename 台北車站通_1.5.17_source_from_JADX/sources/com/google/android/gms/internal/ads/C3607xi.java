package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.google.android.gms.common.util.C2092n;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.xi */
final class C3607xi {

    /* renamed from: a */
    private static Boolean f10513a;

    private C3607xi() {
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m14421a(WebView webView, String str) {
        if (!C2092n.m9166g() || !m14422a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, (ValueCallback) null);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static boolean m14422a(WebView webView) {
        boolean booleanValue;
        synchronized (C3607xi.class) {
            if (f10513a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    f10513a = true;
                } catch (IllegalStateException unused) {
                    f10513a = false;
                }
            }
            booleanValue = f10513a.booleanValue();
        }
        return booleanValue;
    }
}
