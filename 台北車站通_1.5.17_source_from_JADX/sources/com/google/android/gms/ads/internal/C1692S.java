package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C2227Cf;
import com.google.android.gms.internal.ads.C2558Nu;
import com.google.android.gms.internal.ads.C3390pt;

/* renamed from: com.google.android.gms.ads.internal.S */
final class C1692S extends WebViewClient {

    /* renamed from: a */
    private final /* synthetic */ C1691Q f5553a;

    C1692S(C1691Q q) {
        this.f5553a = q;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f5553a.f5550g != null) {
            try {
                this.f5553a.f5550g.mo8803c(0);
            } catch (RemoteException e) {
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f5553a.mo6815cc())) {
            return false;
        }
        if (str.startsWith((String) C3390pt.m13458f().mo8515a(C2558Nu.f7975td))) {
            if (this.f5553a.f5550g != null) {
                try {
                    this.f5553a.f5550g.mo8803c(3);
                } catch (RemoteException e) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e);
                }
            }
            this.f5553a.mo6821i(0);
            return true;
        }
        if (str.startsWith((String) C3390pt.m13458f().mo8515a(C2558Nu.f7981ud))) {
            if (this.f5553a.f5550g != null) {
                try {
                    this.f5553a.f5550g.mo8803c(0);
                } catch (RemoteException e2) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e2);
                }
            }
            this.f5553a.mo6821i(0);
            return true;
        }
        if (str.startsWith((String) C3390pt.m13458f().mo8515a(C2558Nu.f7987vd))) {
            if (this.f5553a.f5550g != null) {
                try {
                    this.f5553a.f5550g.mo8800P();
                } catch (RemoteException e3) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e3);
                }
            }
            this.f5553a.mo6821i(this.f5553a.mo6823q(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f5553a.f5550g != null) {
                try {
                    this.f5553a.f5550g.mo8799N();
                } catch (RemoteException e4) {
                    C2227Cf.m9537d("#007 Could not call remote method.", e4);
                }
            }
            this.f5553a.m7649s(this.f5553a.m7648r(str));
            return true;
        }
    }
}
