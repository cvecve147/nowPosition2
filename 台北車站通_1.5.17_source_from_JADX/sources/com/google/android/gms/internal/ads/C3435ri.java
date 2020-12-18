package com.google.android.gms.internal.ads;

import android.graphics.Paint;
import android.os.Build;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C1697X;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ri */
public class C3435ri extends WebView implements C3579wi, C3635yi, C2173Ai, C2202Bi {

    /* renamed from: a */
    private final List<C3579wi> f10119a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private final List<C2202Bi> f10120b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final List<C3635yi> f10121c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private final List<C2173Ai> f10122d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private final C3118gi f10123e;

    /* renamed from: f */
    protected final WebViewClient f10124f;

    public C3435ri(C3118gi giVar) {
        super(giVar);
        this.f10123e = giVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C1697X.m7700g().mo9722a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C2227Cf.m9533b("Unable to enable Javascript.", e);
        }
        setLayerType(1, (Paint) null);
        this.f10124f = new C3464si(this, this, this, this);
        super.setWebViewClient(this.f10124f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3118gi mo9971a() {
        return this.f10123e;
    }

    /* renamed from: a */
    public final void mo9972a(C2173Ai ai) {
        this.f10122d.add(ai);
    }

    /* renamed from: a */
    public final void mo9973a(C2202Bi bi) {
        this.f10120b.add(bi);
    }

    /* renamed from: a */
    public void mo7819a(C3492ti tiVar) {
        for (C2173Ai a : this.f10122d) {
            a.mo7819a(tiVar);
        }
    }

    /* renamed from: a */
    public final void mo9974a(C3579wi wiVar) {
        this.f10119a.add(wiVar);
    }

    /* renamed from: a */
    public final void mo9975a(C3635yi yiVar) {
        this.f10121c.add(yiVar);
    }

    /* renamed from: a */
    public void mo7966a(String str) {
        C3607xi.m14421a(this, str);
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            C2857Yd.m11615f("Ignore addJavascriptInterface due to low Android version.");
        }
    }

    /* renamed from: b */
    public final void mo9415b(C3492ti tiVar) {
        for (C3635yi b : this.f10121c) {
            b.mo9415b(tiVar);
        }
    }

    /* renamed from: c */
    public final boolean mo9343c(C3492ti tiVar) {
        for (C3579wi c : this.f10119a) {
            if (c.mo9343c(tiVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final WebResourceResponse mo7864d(C3492ti tiVar) {
        for (C2202Bi d : this.f10120b) {
            WebResourceResponse d2 = d.mo7864d(tiVar);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
            C1697X.m7702i().mo8319a(e, "CoreWebView.loadUrl");
            C2227Cf.m9537d("#007 Could not call remote method.", e);
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }
}
