package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Sh */
public final class C2693Sh extends C2721Th {
    public C2693Sh(C3520uh uhVar, boolean z) {
        super(uhVar, z);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo8894a(webView, str, (Map<String, String>) null);
    }
}
