package com.openlife.checkme.p100ui;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* renamed from: com.openlife.checkme.ui.BaseWebView */
public class BaseWebView extends WebView {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5010a f14210a;

    /* renamed from: com.openlife.checkme.ui.BaseWebView$a */
    public interface C5010a {
        /* renamed from: a */
        void mo12674a();

        /* renamed from: b */
        void mo12675b();
    }

    public BaseWebView(Context context) {
        super(context);
        mo14042a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo14042a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo14042a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo14042a();
    }

    /* renamed from: a */
    public void mo14042a() {
        WebSettings settings = getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(true);
        setWebChromeClient(new WebChromeClient());
        setWebViewClient(new C5018b(this));
    }

    public void setOnEventListener(C5010a aVar) {
        this.f14210a = aVar;
    }
}
