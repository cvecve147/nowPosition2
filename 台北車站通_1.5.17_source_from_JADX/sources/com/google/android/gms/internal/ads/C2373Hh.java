package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C1690P;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;
import com.google.android.gms.ads.internal.gmsg.C1718E;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.common.util.C2093o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Hh */
final class C2373Hh extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, C3520uh {

    /* renamed from: A */
    private int f7134A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public int f7135B;

    /* renamed from: C */
    private C2875Yu f7136C;

    /* renamed from: D */
    private C2875Yu f7137D;

    /* renamed from: E */
    private C2875Yu f7138E;

    /* renamed from: F */
    private C2902Zu f7139F;

    /* renamed from: G */
    private WeakReference<View.OnClickListener> f7140G;

    /* renamed from: H */
    private C1771c f7141H;

    /* renamed from: I */
    private boolean f7142I;

    /* renamed from: J */
    private C3404qf f7143J;

    /* renamed from: K */
    private int f7144K = -1;

    /* renamed from: L */
    private int f7145L = -1;

    /* renamed from: M */
    private int f7146M = -1;

    /* renamed from: N */
    private int f7147N = -1;

    /* renamed from: O */
    private Map<String, C3088fh> f7148O;

    /* renamed from: P */
    private final WindowManager f7149P;

    /* renamed from: Q */
    private final C3275ls f7150Q;

    /* renamed from: a */
    private final C3118gi f7151a;

    /* renamed from: b */
    private final C2209Bp f7152b;

    /* renamed from: c */
    private final zzang f7153c;

    /* renamed from: d */
    private final C1690P f7154d;

    /* renamed from: e */
    private final C1804ua f7155e;

    /* renamed from: f */
    private final DisplayMetrics f7156f;

    /* renamed from: g */
    private final float f7157g;

    /* renamed from: h */
    private boolean f7158h = false;

    /* renamed from: i */
    private boolean f7159i = false;

    /* renamed from: j */
    private C3550vh f7160j;

    /* renamed from: k */
    private C1771c f7161k;

    /* renamed from: l */
    private C3146hi f7162l;

    /* renamed from: m */
    private String f7163m;

    /* renamed from: n */
    private boolean f7164n;

    /* renamed from: o */
    private boolean f7165o;

    /* renamed from: p */
    private boolean f7166p;

    /* renamed from: q */
    private boolean f7167q;

    /* renamed from: r */
    private Boolean f7168r;

    /* renamed from: s */
    private int f7169s;

    /* renamed from: t */
    private boolean f7170t = true;

    /* renamed from: u */
    private boolean f7171u = false;

    /* renamed from: v */
    private String f7172v = "";

    /* renamed from: w */
    private C2457Kh f7173w;

    /* renamed from: x */
    private boolean f7174x;

    /* renamed from: y */
    private boolean f7175y;

    /* renamed from: z */
    private C2187Av f7176z;

    private C2373Hh(C3118gi giVar, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        super(giVar);
        this.f7151a = giVar;
        this.f7162l = hiVar;
        this.f7163m = str;
        this.f7166p = z;
        this.f7169s = -1;
        this.f7152b = bp;
        this.f7153c = zzang;
        this.f7154d = p;
        this.f7155e = uaVar;
        this.f7149P = (WindowManager) getContext().getSystemService("window");
        C1697X.m7698e();
        this.f7156f = C3114ge.m12395a(this.f7149P);
        this.f7157g = this.f7156f.density;
        this.f7150Q = lsVar;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            C2227Cf.m9533b("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        C1697X.m7698e().mo9448a((Context) giVar, zzang.f10855a, settings);
        C1697X.m7700g().mo9722a(getContext(), settings);
        setDownloadListener(this);
        m10081f();
        if (C2092n.m9164e()) {
            addJavascriptInterface(C2543Nh.m10645a(this), "googleAdsJsInterface");
        }
        if (C2092n.m9160a()) {
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        }
        this.f7143J = new C3404qf(this.f7151a.mo9471a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        m10085j();
        this.f7139F = new C2902Zu(new C2930_u(true, "make_wv", this.f7163m));
        this.f7139F.mo9126a().mo9176a(_uVar);
        this.f7137D = C2736Tu.m11305a(this.f7139F.mo9126a());
        this.f7139F.mo9127a("native:view_create", this.f7137D);
        this.f7138E = null;
        this.f7136C = null;
        C1697X.m7700g().mo9726b((Context) giVar);
        C1697X.m7702i().mo8330j();
    }

    /* renamed from: a */
    static C2373Hh m10068a(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        Context context2 = context;
        return new C2373Hh(new C3118gi(context), hiVar, str, z, z2, bp, zzang, _uVar, p, uaVar, lsVar);
    }

    /* renamed from: a */
    private final synchronized Boolean m10069a() {
        return this.f7168r;
    }

    /* renamed from: a */
    private final void m10070a(Boolean bool) {
        synchronized (this) {
            this.f7168r = bool;
        }
        C1697X.m7702i().mo8318a(bool);
    }

    @TargetApi(19)
    /* renamed from: a */
    private final synchronized void m10071a(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, (ValueCallback<String>) null);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    private final synchronized void m10072b() {
        if (!this.f7142I) {
            this.f7142I = true;
            C1697X.m7702i().mo8331k();
        }
    }

    /* renamed from: b */
    private final synchronized void m10074b(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: b */
    private final void m10075b(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        mo8149a("onAdVisibilityChanged", (Map<String, ?>) hashMap);
    }

    /* renamed from: c */
    private final synchronized void m10076c(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            C1697X.m7702i().mo8319a(e, "AdWebViewImpl.loadUrlUnsafe");
            C2227Cf.m9535c("Could not call loadUrl. ", e);
        }
    }

    /* renamed from: c */
    private final boolean m10077c() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f7160j.mo9242j() && !this.f7160j.mo10139k()) {
            return false;
        }
        C3390pt.m13453a();
        DisplayMetrics displayMetrics = this.f7156f;
        int b = C3432rf.m13606b(displayMetrics, displayMetrics.widthPixels);
        C3390pt.m13453a();
        DisplayMetrics displayMetrics2 = this.f7156f;
        int b2 = C3432rf.m13606b(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f7151a.mo9471a();
        if (a == null || a.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            C1697X.m7698e();
            int[] a2 = C3114ge.m12421a(a);
            C3390pt.m13453a();
            int b3 = C3432rf.m13606b(this.f7156f, a2[0]);
            C3390pt.m13453a();
            i = C3432rf.m13606b(this.f7156f, a2[1]);
            i2 = b3;
        }
        if (this.f7145L == b && this.f7144K == b2 && this.f7146M == i2 && this.f7147N == i) {
            return false;
        }
        if (!(this.f7145L == b && this.f7144K == b2)) {
            z = true;
        }
        this.f7145L = b;
        this.f7144K = b2;
        this.f7146M = i2;
        this.f7147N = i;
        new C3311n(this).mo9765a(b, b2, i2, i, this.f7156f.density, this.f7149P.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: d */
    private final synchronized void m10078d() {
        this.f7168r = C1697X.m7702i().mo8325e();
        if (this.f7168r == null) {
            try {
                evaluateJavascript("(function(){})()", (ValueCallback<String>) null);
                m10070a((Boolean) true);
            } catch (IllegalStateException unused) {
                m10070a((Boolean) false);
            }
        }
    }

    /* renamed from: d */
    private final void m10079d(String str) {
        if (C2092n.m9166g()) {
            if (m10069a() == null) {
                m10078d();
            }
            if (m10069a().booleanValue()) {
                m10071a(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            m10074b(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        m10074b(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    /* renamed from: e */
    private final void m10080e() {
        C2736Tu.m11306a(this.f7139F.mo9126a(), this.f7137D, "aeh2");
    }

    /* renamed from: f */
    private final synchronized void m10081f() {
        if (!this.f7166p) {
            if (!this.f7162l.mo9497d()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C2227Cf.m9532b("Disabling hardware acceleration on an AdView.");
                    m10082g();
                    return;
                }
                C2227Cf.m9532b("Enabling hardware acceleration on an AdView.");
                m10083h();
                return;
            }
        }
        C2227Cf.m9532b("Enabling hardware acceleration on an overlay.");
        m10083h();
    }

    /* renamed from: g */
    private final synchronized void m10082g() {
        if (!this.f7167q) {
            C1697X.m7700g().mo9730c((View) this);
        }
        this.f7167q = true;
    }

    /* renamed from: h */
    private final synchronized void m10083h() {
        if (this.f7167q) {
            C1697X.m7700g().mo9727b((View) this);
        }
        this.f7167q = false;
    }

    /* renamed from: i */
    private final synchronized void m10084i() {
        this.f7148O = null;
    }

    /* renamed from: j */
    private final void m10085j() {
        C2930_u a;
        C2902Zu zu = this.f7139F;
        if (zu != null && (a = zu.mo9126a()) != null && C1697X.m7702i().mo8324d() != null) {
            C1697X.m7702i().mo8324d().mo8756a(a);
        }
    }

    /* renamed from: Ab */
    public final int mo8133Ab() {
        return getMeasuredWidth();
    }

    /* renamed from: Bb */
    public final int mo8134Bb() {
        return getMeasuredHeight();
    }

    /* renamed from: Cb */
    public final void mo8135Cb() {
        C1771c Ya = mo8137Ya();
        if (Ya != null) {
            Ya.mo7001gc();
        }
    }

    /* renamed from: Db */
    public final synchronized void mo6792Db() {
        this.f7171u = false;
        if (this.f7154d != null) {
            this.f7154d.mo6792Db();
        }
    }

    /* renamed from: Eb */
    public final synchronized void mo6793Eb() {
        this.f7171u = true;
        if (this.f7154d != null) {
            this.f7154d.mo6793Eb();
        }
    }

    /* renamed from: Xa */
    public final void mo8136Xa() {
        C2857Yd.m11615f("Cannot add text view to inner AdWebView");
    }

    /* renamed from: Ya */
    public final synchronized C1771c mo8137Ya() {
        return this.f7161k;
    }

    /* renamed from: Za */
    public final C2902Zu mo8138Za() {
        return this.f7139F;
    }

    /* renamed from: _a */
    public final synchronized void mo8139_a() {
        C2857Yd.m11615f("Destroying WebView!");
        m10072b();
        C3114ge.f9351a.post(new C2429Jh(this));
    }

    /* renamed from: a */
    public final void mo8140a(Context context) {
        this.f7151a.setBaseContext(context);
        this.f7143J.mo9930a(this.f7151a.mo9471a());
    }

    /* renamed from: a */
    public final synchronized void mo8141a(C1771c cVar) {
        this.f7141H = cVar;
    }

    /* renamed from: a */
    public final void mo8142a(zzc zzc) {
        this.f7160j.mo10131a(zzc);
    }

    /* renamed from: a */
    public final synchronized void mo8143a(C2187Av av) {
        this.f7176z = av;
    }

    /* renamed from: a */
    public final synchronized void mo8144a(C2457Kh kh) {
        if (this.f7173w != null) {
            C2227Cf.m9529a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f7173w = kh;
        }
    }

    /* renamed from: a */
    public final synchronized void mo8145a(C3146hi hiVar) {
        this.f7162l = hiVar;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo8146a(C3302mr mrVar) {
        synchronized (this) {
            this.f7174x = mrVar.f9820m;
        }
        m10075b(mrVar.f9820m);
    }

    /* renamed from: a */
    public final void mo7966a(String str) {
        m10079d(str);
    }

    /* renamed from: a */
    public final void mo8147a(String str, C1718E<? super C3520uh> e) {
        C3550vh vhVar = this.f7160j;
        if (vhVar != null) {
            vhVar.mo10138b(str, e);
        }
    }

    /* renamed from: a */
    public final void mo8148a(String str, C2093o<C1718E<? super C3520uh>> oVar) {
        C3550vh vhVar = this.f7160j;
        if (vhVar != null) {
            vhVar.mo10133a(str, oVar);
        }
    }

    /* renamed from: a */
    public final void mo8149a(String str, Map<String, ?> map) {
        try {
            mo8150a(str, C1697X.m7698e().mo9447a(map));
        } catch (JSONException unused) {
            C2227Cf.m9536d("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public final void mo8150a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        m10079d(sb.toString());
    }

    /* renamed from: a */
    public final void mo8151a(boolean z) {
        this.f7160j.mo10134a(z);
    }

    /* renamed from: a */
    public final void mo8152a(boolean z, int i) {
        this.f7160j.mo10135a(z, i);
    }

    /* renamed from: a */
    public final void mo8153a(boolean z, int i, String str) {
        this.f7160j.mo10136a(z, i, str);
    }

    /* renamed from: a */
    public final void mo8154a(boolean z, int i, String str, String str2) {
        this.f7160j.mo10137a(z, i, str, str2);
    }

    /* renamed from: ab */
    public final void mo8155ab() {
        m10080e();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f7153c.f10855a);
        mo8149a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: b */
    public final synchronized void mo8156b(C1771c cVar) {
        this.f7161k = cVar;
    }

    /* renamed from: b */
    public final void mo8157b(String str, C1718E<? super C3520uh> e) {
        C3550vh vhVar = this.f7160j;
        if (vhVar != null) {
            vhVar.mo10132a(str, e);
        }
    }

    /* renamed from: b */
    public final synchronized void mo8158b(String str, String str2, String str3) {
        if (!isDestroyed()) {
            if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7853_a)).booleanValue()) {
                str2 = C2806Wh.m11501a(str2, C2806Wh.m11500a());
            }
            super.loadDataWithBaseURL(str, str2, "text/html", HTTP.UTF_8, str3);
            return;
        }
        C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        m10079d(sb.toString());
    }

    /* renamed from: bb */
    public final void mo8159bb() {
        if (this.f7136C == null) {
            C2736Tu.m11306a(this.f7139F.mo9126a(), this.f7137D, "aes2");
            this.f7136C = C2736Tu.m11305a(this.f7139F.mo9126a());
            this.f7139F.mo9127a("native:view_show", this.f7136C);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f7153c.f10855a);
        mo8149a("onshow", (Map<String, ?>) hashMap);
    }

    /* renamed from: cb */
    public final void mo8160cb() {
        setBackgroundColor(0);
    }

    /* renamed from: db */
    public final Context mo8161db() {
        return this.f7151a.mo9472b();
    }

    public final synchronized void destroy() {
        m10085j();
        this.f7143J.mo9933d();
        if (this.f7161k != null) {
            this.f7161k.mo6994bc();
            this.f7161k.onDestroy();
            this.f7161k = null;
        }
        this.f7160j.mo10130a();
        if (!this.f7165o) {
            C1697X.m7719z();
            C3060eh.m12276a((C2749Ug) this);
            m10084i();
            this.f7165o = true;
            C2857Yd.m11615f("Initiating WebView self destruct sequence in 3...");
            C2857Yd.m11615f("Loading blank page in WebView, 2...");
            m10076c("about:blank");
        }
    }

    /* renamed from: eb */
    public final Activity mo8163eb() {
        return this.f7151a.mo9471a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C2227Cf.m9538e(r2)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0012
            r2 = 0
            r3.onReceiveValue(r2)     // Catch:{ all -> 0x0019 }
        L_0x0012:
            monitor-exit(r1)
            return
        L_0x0014:
            super.evaluateJavascript(r2, r3)     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2373Hh.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public final void mo8164f(int i) {
        if (i == 0) {
            C2736Tu.m11306a(this.f7139F.mo9126a(), this.f7137D, "aebb2");
        }
        m10080e();
        if (this.f7139F.mo9126a() != null) {
            this.f7139F.mo9126a().mo9178a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ClientCookie.VERSION_ATTR, this.f7153c.f10855a);
        mo8149a("onhide", (Map<String, ?>) hashMap);
    }

    /* renamed from: fb */
    public final synchronized boolean mo8165fb() {
        return this.f7166p;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.f7165o) {
                    this.f7160j.mo10130a();
                    C1697X.m7719z();
                    C3060eh.m12276a((C2749Ug) this);
                    m10084i();
                    m10072b();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: gb */
    public final synchronized C2187Av mo8166gb() {
        return this.f7176z;
    }

    public final View.OnClickListener getOnClickListener() {
        return (View.OnClickListener) this.f7140G.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f7169s;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: hb */
    public final C2209Bp mo8171hb() {
        return this.f7152b;
    }

    /* renamed from: ib */
    public final void mo8172ib() {
        if (this.f7138E == null) {
            this.f7138E = C2736Tu.m11305a(this.f7139F.mo9126a());
            this.f7139F.mo9127a("native:view_load", this.f7138E);
        }
    }

    public final synchronized boolean isDestroyed() {
        return this.f7165o;
    }

    /* renamed from: jb */
    public final synchronized C2457Kh mo8174jb() {
        return this.f7173w;
    }

    /* renamed from: kb */
    public final C1804ua mo8175kb() {
        return this.f7155e;
    }

    /* renamed from: l */
    public final synchronized void mo8176l(boolean z) {
        if (this.f7161k != null) {
            this.f7161k.mo6993a(this.f7160j.mo9242j(), z);
        } else {
            this.f7164n = z;
        }
    }

    /* renamed from: lb */
    public final synchronized boolean mo8177lb() {
        return this.f7164n;
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                C1697X.m7702i().mo8319a(e, "AdWebViewImpl.loadUrl");
                C2227Cf.m9535c("Could not call loadUrl. ", e);
            }
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final synchronized void mo8181m(boolean z) {
        this.f7170t = z;
    }

    /* renamed from: mb */
    public final /* synthetic */ C2974bi mo8182mb() {
        return this.f7160j;
    }

    /* renamed from: n */
    public final synchronized void mo8183n(boolean z) {
        this.f7134A += z ? 1 : -1;
        if (this.f7134A <= 0 && this.f7161k != null) {
            this.f7161k.mo7004hc();
        }
    }

    /* renamed from: nb */
    public final void mo8184nb() {
        this.f7143J.mo9932c();
    }

    /* renamed from: o */
    public final synchronized void mo8185o(String str) {
        if (str == null) {
            str = "";
        }
        this.f7172v = str;
    }

    /* renamed from: o */
    public final synchronized void mo8186o(boolean z) {
        boolean z2 = z != this.f7166p;
        this.f7166p = z;
        m10081f();
        if (z2) {
            new C3311n(this).mo9769c(z ? "expanded" : CookieSpecs.DEFAULT);
        }
    }

    /* renamed from: ob */
    public final WebViewClient mo8187ob() {
        return this.f7160j;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.f7143J.mo9929a();
        }
        boolean z = this.f7174x;
        if (this.f7160j != null && this.f7160j.mo10139k()) {
            if (!this.f7175y) {
                ViewTreeObserver.OnGlobalLayoutListener l = this.f7160j.mo10140l();
                if (l != null) {
                    C1697X.m7688A();
                    C3348og.m13242a((View) this, l);
                }
                ViewTreeObserver.OnScrollChangedListener m = this.f7160j.mo10141m();
                if (m != null) {
                    C1697X.m7688A();
                    C3348og.m13243a((View) this, m);
                }
                this.f7175y = true;
            }
            m10077c();
            z = true;
        }
        m10075b(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.f7143J.mo9931b();
            }
            super.onDetachedFromWindow();
            if (this.f7175y && this.f7160j != null && this.f7160j.mo10139k() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener l = this.f7160j.mo10140l();
                if (l != null) {
                    C1697X.m7700g().mo9720a(getViewTreeObserver(), l);
                }
                ViewTreeObserver.OnScrollChangedListener m = this.f7160j.mo10141m();
                if (m != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(m);
                }
                this.f7175y = false;
            }
        }
        m10075b(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            C1697X.m7698e();
            C3114ge.m12407a(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            C2227Cf.m9532b(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                C3550vh vhVar = this.f7160j;
                if (vhVar != null && vhVar.mo10142n() != null) {
                    this.f7160j.mo10142n().mo7037a();
                }
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7839Xa)).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if (motionEvent.getActionMasked() == 8) {
                if (axisValue > 0.0f && !canScrollVertically(-1)) {
                    return false;
                }
                if (axisValue < 0.0f && !canScrollVertically(1)) {
                    return false;
                }
                if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                    return false;
                }
                if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                    return false;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean c = m10077c();
        C1771c Ya = mo8137Ya();
        if (Ya != null && c) {
            Ya.mo7000fc();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01d0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ae A[SYNTHETIC, Splitter:B:100:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:110:0x01d1=Splitter:B:110:0x01d1, B:52:0x00b7=Splitter:B:52:0x00b7} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01d6 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r7.f7166p     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo9498e()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01d1
        L_0x0021:
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo9499f()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.Kh r0 = r7.mo8174jb()     // Catch:{ all -> 0x01d6 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo8409ba()     // Catch:{ all -> 0x01d6 }
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
            float r1 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01d6 }
            float r2 = (float) r8     // Catch:{ all -> 0x01d6 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01d6 }
            if (r9 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            float r9 = (float) r2     // Catch:{ all -> 0x01d6 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01d6 }
            r9 = r2
            goto L_0x005e
        L_0x0056:
            if (r8 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r8 = (float) r1     // Catch:{ all -> 0x01d6 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01d6 }
            r8 = r1
        L_0x005e:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01d6 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x006b:
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo9496a()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x00bc
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7885ed     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x01d6 }
            java.lang.Object r0 = r1.mo8515a(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x00b7
            boolean r0 = com.google.android.gms.common.util.C2092n.m9164e()     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x008c
            goto L_0x00b7
        L_0x008c:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.Ih r1 = new com.google.android.gms.internal.ads.Ih     // Catch:{ all -> 0x01d6 }
            r1.<init>(r7)     // Catch:{ all -> 0x01d6 }
            r7.mo8157b((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.C1718E<? super com.google.android.gms.internal.ads.C3520uh>) r1)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.m10079d(r0)     // Catch:{ all -> 0x01d6 }
            android.util.DisplayMetrics r0 = r7.f7156f     // Catch:{ all -> 0x01d6 }
            float r0 = r0.density     // Catch:{ all -> 0x01d6 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r1 = r7.f7135B     // Catch:{ all -> 0x01d6 }
            r2 = -1
            if (r1 == r2) goto L_0x00ae
            int r9 = r7.f7135B     // Catch:{ all -> 0x01d6 }
            float r9 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01d6 }
            goto L_0x00b2
        L_0x00ae:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
        L_0x00b2:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00b7:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00bc:
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            boolean r0 = r0.mo9497d()     // Catch:{ all -> 0x01d6 }
            if (r0 == 0) goto L_0x00d1
            android.util.DisplayMetrics r8 = r7.f7156f     // Catch:{ all -> 0x01d6 }
            int r8 = r8.widthPixels     // Catch:{ all -> 0x01d6 }
            android.util.DisplayMetrics r9 = r7.f7156f     // Catch:{ all -> 0x01d6 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x00d1:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01d6 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01d6 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01d6 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01d6 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00ef
            if (r0 != r3) goto L_0x00ed
            goto L_0x00ef
        L_0x00ed:
            r0 = r5
            goto L_0x00f0
        L_0x00ef:
            r0 = r8
        L_0x00f0:
            if (r2 == r4) goto L_0x00f4
            if (r2 != r3) goto L_0x00f5
        L_0x00f4:
            r5 = r9
        L_0x00f5:
            com.google.android.gms.internal.ads.hi r2 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r2 = r2.f9425c     // Catch:{ all -> 0x01d6 }
            r3 = 1
            if (r2 > r0) goto L_0x0105
            com.google.android.gms.internal.ads.hi r2 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r2 = r2.f9424b     // Catch:{ all -> 0x01d6 }
            if (r2 <= r5) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r2 = r1
            goto L_0x0106
        L_0x0105:
            r2 = r3
        L_0x0106:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f7709Ae     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x01d6 }
            java.lang.Object r4 = r6.mo8515a(r4)     // Catch:{ all -> 0x01d6 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01d6 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01d6 }
            if (r4 == 0) goto L_0x013e
            com.google.android.gms.internal.ads.hi r4 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r4 = r4.f9425c     // Catch:{ all -> 0x01d6 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d6 }
            float r6 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r6 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x013a
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r0 = r0.f9424b     // Catch:{ all -> 0x01d6 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r4 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x013a
            r0 = r3
            goto L_0x013b
        L_0x013a:
            r0 = r1
        L_0x013b:
            if (r2 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r0 = r2
        L_0x013f:
            r2 = 8
            if (r0 == 0) goto L_0x01ae
            com.google.android.gms.internal.ads.hi r0 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r0 = r0.f9425c     // Catch:{ all -> 0x01d6 }
            float r0 = (float) r0     // Catch:{ all -> 0x01d6 }
            float r4 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r0 = r0 / r4
            int r0 = (int) r0     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.hi r4 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r4 = r4.f9424b     // Catch:{ all -> 0x01d6 }
            float r4 = (float) r4     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r4 = r4 / r5
            int r4 = (int) r4     // Catch:{ all -> 0x01d6 }
            float r8 = (float) r8     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r8 = r8 / r5
            int r8 = (int) r8     // Catch:{ all -> 0x01d6 }
            float r9 = (float) r9     // Catch:{ all -> 0x01d6 }
            float r5 = r7.f7157g     // Catch:{ all -> 0x01d6 }
            float r9 = r9 / r5
            int r9 = (int) r9     // Catch:{ all -> 0x01d6 }
            r5 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d6 }
            r6.<init>(r5)     // Catch:{ all -> 0x01d6 }
            java.lang.String r5 = "Not enough space to show ad. Needs "
            r6.append(r5)     // Catch:{ all -> 0x01d6 }
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = "x"
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            r6.append(r4)     // Catch:{ all -> 0x01d6 }
            java.lang.String r0 = " dp, but only has "
            r6.append(r0)     // Catch:{ all -> 0x01d6 }
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = "x"
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            r6.append(r9)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = " dp."
            r6.append(r8)     // Catch:{ all -> 0x01d6 }
            java.lang.String r8 = r6.toString()     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r8)     // Catch:{ all -> 0x01d6 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01d6 }
            if (r8 == r2) goto L_0x019c
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01d6 }
        L_0x019c:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01d6 }
            boolean r8 = r7.f7158h     // Catch:{ all -> 0x01d6 }
            if (r8 != 0) goto L_0x01cf
            com.google.android.gms.internal.ads.ls r8 = r7.f7150Q     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.ns r9 = com.google.android.gms.internal.ads.C3332ns.BANNER_SIZE_INVALID     // Catch:{ all -> 0x01d6 }
            r8.mo9686a((com.google.android.gms.internal.ads.C3332ns) r9)     // Catch:{ all -> 0x01d6 }
            r7.f7158h = r3     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x01ae:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01d6 }
            if (r8 == r2) goto L_0x01b7
            r7.setVisibility(r1)     // Catch:{ all -> 0x01d6 }
        L_0x01b7:
            boolean r8 = r7.f7159i     // Catch:{ all -> 0x01d6 }
            if (r8 != 0) goto L_0x01c4
            com.google.android.gms.internal.ads.ls r8 = r7.f7150Q     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.ns r9 = com.google.android.gms.internal.ads.C3332ns.BANNER_SIZE_VALID     // Catch:{ all -> 0x01d6 }
            r8.mo9686a((com.google.android.gms.internal.ads.C3332ns) r9)     // Catch:{ all -> 0x01d6 }
            r7.f7159i = r3     // Catch:{ all -> 0x01d6 }
        L_0x01c4:
            com.google.android.gms.internal.ads.hi r8 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r8 = r8.f9425c     // Catch:{ all -> 0x01d6 }
            com.google.android.gms.internal.ads.hi r9 = r7.f7162l     // Catch:{ all -> 0x01d6 }
            int r9 = r9.f9424b     // Catch:{ all -> 0x01d6 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01d6 }
        L_0x01cf:
            monitor-exit(r7)
            return
        L_0x01d1:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01d6 }
            monitor-exit(r7)
            return
        L_0x01d6:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2373Hh.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!isDestroyed()) {
            try {
                if (C2092n.m9160a()) {
                    super.onPause();
                }
            } catch (Exception e) {
                C2227Cf.m9533b("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!isDestroyed()) {
            try {
                if (C2092n.m9160a()) {
                    super.onResume();
                }
            } catch (Exception e) {
                C2227Cf.m9533b("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f7160j.mo10139k()) {
            synchronized (this) {
                if (this.f7176z != null) {
                    this.f7176z.mo7852a(motionEvent);
                }
            }
        } else {
            C2209Bp bp = this.f7152b;
            if (bp != null) {
                bp.mo7870a(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: pb */
    public final synchronized String mo8190pb() {
        return this.f7163m;
    }

    /* renamed from: qb */
    public final synchronized boolean mo8191qb() {
        return this.f7134A > 0;
    }

    /* renamed from: rb */
    public final synchronized C3146hi mo8192rb() {
        return this.f7162l;
    }

    /* renamed from: sb */
    public final synchronized boolean mo8193sb() {
        return this.f7171u;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7140G = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f7169s = i;
        if (this.f7161k != null) {
            this.f7161k.setRequestedOrientation(this.f7169s);
        }
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C3550vh) {
            this.f7160j = (C3550vh) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!isDestroyed()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                C2227Cf.m9533b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: tb */
    public final synchronized C1771c mo8200tb() {
        return this.f7141H;
    }

    /* renamed from: ub */
    public final zzang mo8201ub() {
        return this.f7153c;
    }

    /* renamed from: vb */
    public final synchronized boolean mo8202vb() {
        return this.f7170t;
    }

    /* renamed from: wb */
    public final void mo8203wb() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C1697X.m7691D().mo10232b()));
        hashMap.put("app_volume", String.valueOf(C1697X.m7691D().mo10229a()));
        hashMap.put("device_volume", String.valueOf(C3631ye.m14576a(getContext())));
        mo8149a("volume", (Map<String, ?>) hashMap);
    }

    /* renamed from: xb */
    public final C2875Yu mo8204xb() {
        return this.f7137D;
    }

    /* renamed from: yb */
    public final C2484Lg mo8205yb() {
        return null;
    }

    /* renamed from: zb */
    public final synchronized String mo8206zb() {
        return this.f7172v;
    }
}
