package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.si */
final class C3464si extends WebViewClient {

    /* renamed from: a */
    private final C3579wi f10202a;

    /* renamed from: b */
    private final C2202Bi f10203b;

    /* renamed from: c */
    private final C3635yi f10204c;

    /* renamed from: d */
    private final C2173Ai f10205d;

    /* renamed from: e */
    private final C2230Ci f10206e = new C2230Ci();

    C3464si(C3579wi wiVar, C2202Bi bi, C3635yi yiVar, C2173Ai ai) {
        this.f10202a = wiVar;
        this.f10203b = bi;
        this.f10204c = yiVar;
        this.f10205d = ai;
    }

    /* renamed from: a */
    private final boolean m13756a(C3492ti tiVar) {
        return this.f10202a.mo9343c(tiVar);
    }

    /* renamed from: b */
    private final WebResourceResponse m13757b(C3492ti tiVar) {
        return this.f10203b.mo7864d(tiVar);
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            C2857Yd.m11615f(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            this.f10204c.mo9415b(new C3492ti(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            this.f10205d.mo7819a(new C3492ti(str));
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f10206e.mo7930a(i, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f10206e.mo7931a(sslError);
    }

    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return m13757b(new C3492ti(webResourceRequest));
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m13757b(new C3492ti(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return m13756a(new C3492ti(webResourceRequest));
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return m13756a(new C3492ti(str));
    }
}
