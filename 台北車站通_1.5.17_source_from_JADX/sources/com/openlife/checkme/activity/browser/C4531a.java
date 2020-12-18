package com.openlife.checkme.activity.browser;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.openlife.checkme.C4961l;
import com.openlife.checkme.p093c.C4883m;
import com.openlife.checkme.p094d.C4946i;

/* renamed from: com.openlife.checkme.activity.browser.a */
class C4531a extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ BrowserActivity f13260a;

    C4531a(BrowserActivity browserActivity) {
        this.f13260a = browserActivity;
    }

    /* renamed from: a */
    private int m17941a(String str) {
        if (str.startsWith("mailto:" + C4946i.m19502b((Context) this.f13260a))) {
            return 1;
        }
        return str.startsWith("mailto:") ? 2 : 3;
    }

    /* renamed from: a */
    private boolean m17942a(int i, String str) {
        if (i == 1) {
            C4883m.m19236b((Context) this.f13260a, (String) null);
            return true;
        } else if (i != 2) {
            if (i != 3) {
            }
            return false;
        } else {
            try {
                this.f13260a.startActivity(Intent.createChooser(new Intent("android.intent.action.SENDTO", Uri.parse(str)), this.f13260a.getString(C4961l.utility_email_chooser)));
            } catch (ActivityNotFoundException unused) {
            }
            return true;
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f13260a.f13247a.dismiss();
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f13260a.f13247a.show();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        return m17942a(m17941a(uri), uri);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return m17942a(m17941a(str), str);
    }
}
