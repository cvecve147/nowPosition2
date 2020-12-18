package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.support.p007v4.view.C0487v;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.ads.internal.gmsg.C1721H;
import com.google.android.gms.ads.internal.gmsg.C1726I;
import com.google.android.gms.ads.internal.gmsg.C1727a;
import com.google.android.gms.ads.internal.gmsg.C1729c;
import com.google.android.gms.ads.internal.gmsg.C1730d;
import com.google.android.gms.ads.internal.gmsg.C1731e;
import com.google.android.gms.ads.internal.gmsg.C1737k;
import com.google.android.gms.ads.internal.gmsg.C1738l;
import com.google.android.gms.ads.internal.gmsg.C1739m;
import com.google.android.gms.ads.internal.gmsg.C1741o;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C1771c;
import com.google.android.gms.ads.internal.overlay.C1779k;
import com.google.android.gms.ads.internal.overlay.C1781m;
import com.google.android.gms.ads.internal.overlay.C1787s;
import com.google.android.gms.ads.internal.overlay.zzc;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ii */
public final class C3174ii extends C3395py<C3520uh> implements C2974bi, C3579wi, C3635yi, C2173Ai, C2202Bi {

    /* renamed from: A */
    private int f9466A;

    /* renamed from: B */
    private View.OnAttachStateChangeListener f9467B;

    /* renamed from: b */
    private C3520uh f9468b;

    /* renamed from: c */
    private final Object f9469c;

    /* renamed from: d */
    private C2845Xs f9470d;

    /* renamed from: e */
    private C1781m f9471e;

    /* renamed from: f */
    private C3003ci f9472f;

    /* renamed from: g */
    private C3031di f9473g;

    /* renamed from: h */
    private C1737k f9474h;

    /* renamed from: i */
    private C1739m f9475i;

    /* renamed from: j */
    private C3061ei f9476j;

    /* renamed from: k */
    private boolean f9477k;

    /* renamed from: l */
    private C1726I f9478l;

    /* renamed from: m */
    private boolean f9479m;

    /* renamed from: n */
    private boolean f9480n;

    /* renamed from: o */
    private ViewTreeObserver.OnGlobalLayoutListener f9481o;

    /* renamed from: p */
    private ViewTreeObserver.OnScrollChangedListener f9482p;

    /* renamed from: q */
    private boolean f9483q;

    /* renamed from: r */
    private C1787s f9484r;

    /* renamed from: s */
    private final C3283m f9485s;

    /* renamed from: t */
    private C1806va f9486t;

    /* renamed from: u */
    private C3021d f9487u;

    /* renamed from: v */
    private C3340o f9488v;

    /* renamed from: w */
    private C3089fi f9489w;

    /* renamed from: x */
    private C3345od f9490x;

    /* renamed from: y */
    private boolean f9491y;

    /* renamed from: z */
    private boolean f9492z;

    public C3174ii(C3520uh uhVar, boolean z) {
        this(uhVar, z, new C3283m(uhVar, uhVar.mo8161db(), new C3647yu(uhVar.getContext())), (C3021d) null);
    }

    private C3174ii(C3520uh uhVar, boolean z, C3283m mVar, C3021d dVar) {
        this.f9469c = new Object();
        this.f9477k = false;
        this.f9468b = uhVar;
        this.f9479m = z;
        this.f9485s = mVar;
        this.f9487u = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m12587a(View view, C3345od odVar, int i) {
        if (odVar.mo9378c() && i > 0) {
            odVar.mo9371a(view);
            if (odVar.mo9378c()) {
                C3114ge.f9351a.postDelayed(new C3236ki(this, view, odVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m12588a(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        C3021d dVar = this.f9487u;
        boolean z = false;
        boolean a = dVar != null ? dVar.mo9304a() : false;
        C1697X.m7696c();
        Context context = this.f9468b.getContext();
        if (!a) {
            z = true;
        }
        C1779k.m8016a(context, adOverlayInfoParcel, z);
        if (this.f9490x != null) {
            String str = adOverlayInfoParcel.f5822l;
            if (str == null && (zzc = adOverlayInfoParcel.f5811a) != null) {
                str = zzc.f5871b;
            }
            this.f9490x.mo9372a(str);
        }
    }

    /* renamed from: e */
    private final WebResourceResponse m12590e(C3492ti tiVar) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(tiVar.f10257a);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : tiVar.f10260d.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C1697X.m7698e().mo9450a(this.f9468b.getContext(), this.f9468b.mo8201ub().f10855a, false, httpURLConnection);
                    C3548vf vfVar = new C3548vf();
                    vfVar.mo10125a(httpURLConnection, (byte[]) null);
                    int responseCode = httpURLConnection.getResponseCode();
                    vfVar.mo10124a(httpURLConnection, responseCode);
                    if (responseCode < 300 || responseCode >= 400) {
                        C1697X.m7698e();
                    } else {
                        String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                C2227Cf.m9536d("Protocol is null");
                                return null;
                            } else if (protocol.equals(HttpHost.DEFAULT_SCHEME_NAME) || protocol.equals("https")) {
                                String valueOf = String.valueOf(headerField);
                                C2227Cf.m9532b(valueOf.length() != 0 ? "Redirecting to ".concat(valueOf) : new String("Redirecting to "));
                                httpURLConnection.disconnect();
                                url = url2;
                            } else {
                                String valueOf2 = String.valueOf(protocol);
                                C2227Cf.m9536d(valueOf2.length() != 0 ? "Unsupported scheme: ".concat(valueOf2) : new String("Unsupported scheme: "));
                                return null;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    }
                } else {
                    throw new IOException("Invalid protocol.");
                }
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Too many redirects (20)");
                throw new IOException(sb.toString());
            }
        }
        C1697X.m7698e();
        return C3114ge.m12396a(httpURLConnection);
    }

    /* renamed from: r */
    private final void m12591r() {
        if (this.f9467B != null) {
            this.f9468b.getView().removeOnAttachStateChangeListener(this.f9467B);
        }
    }

    /* renamed from: s */
    private final void m12592s() {
        if (this.f9472f != null && ((this.f9491y && this.f9466A <= 0) || this.f9492z)) {
            this.f9472f.mo7012a(!this.f9492z);
            this.f9472f = null;
        }
        this.f9468b.mo8172ib();
    }

    /* renamed from: a */
    public final void mo9226a(int i, int i2) {
        C3021d dVar = this.f9487u;
        if (dVar != null) {
            dVar.mo9300a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo9227a(int i, int i2, boolean z) {
        this.f9485s.mo9707a(i, i2);
        C3021d dVar = this.f9487u;
        if (dVar != null) {
            dVar.mo9301a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo9228a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f9469c) {
            this.f9480n = true;
            this.f9468b.mo8184nb();
            this.f9481o = onGlobalLayoutListener;
            this.f9482p = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo9538a(zzc zzc) {
        boolean fb = this.f9468b.mo8165fb();
        m12588a(new AdOverlayInfoParcel(zzc, (!fb || this.f9468b.mo8192rb().mo9497d()) ? this.f9470d : null, fb ? null : this.f9471e, this.f9484r, this.f9468b.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo9229a(C2845Xs xs, C1737k kVar, C1781m mVar, C1739m mVar2, C1787s sVar, boolean z, C1726I i, C1806va vaVar, C3340o oVar, C3345od odVar) {
        C1737k kVar2 = kVar;
        C1739m mVar3 = mVar2;
        C1726I i2 = i;
        C3340o oVar2 = oVar;
        C3345od odVar2 = odVar;
        C1806va vaVar2 = vaVar == null ? new C1806va(this.f9468b.getContext(), odVar2, (zzael) null) : vaVar;
        this.f9487u = new C3021d(this.f9468b, oVar2);
        this.f9490x = odVar2;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7883eb)).booleanValue()) {
            mo9920b("/adMetadata", new C1727a(kVar2));
        }
        mo9920b("/appEvent", new C1738l(mVar3));
        mo9920b("/backButton", C1741o.f5725k);
        mo9920b("/refresh", C1741o.f5726l);
        mo9920b("/canOpenURLs", C1741o.f5716b);
        mo9920b("/canOpenIntents", C1741o.f5717c);
        mo9920b("/click", C1741o.f5718d);
        mo9920b("/close", C1741o.f5719e);
        mo9920b("/customClose", C1741o.f5720f);
        mo9920b("/instrument", C1741o.f5729o);
        mo9920b("/delayPageLoaded", C1741o.f5731q);
        mo9920b("/delayPageClosed", C1741o.f5732r);
        mo9920b("/getLocationInfo", C1741o.f5733s);
        mo9920b("/httpTrack", C1741o.f5721g);
        mo9920b("/log", C1741o.f5722h);
        mo9920b("/mraid", new C1730d(vaVar2, this.f9487u, oVar2));
        mo9920b("/mraidLoaded", this.f9485s);
        C1731e eVar = r1;
        C1806va vaVar3 = vaVar2;
        C1731e eVar2 = new C1731e(this.f9468b.getContext(), this.f9468b.mo8201ub(), this.f9468b.mo8171hb(), sVar, xs, kVar, mVar2, mVar, vaVar2, this.f9487u);
        mo9920b("/open", eVar);
        mo9920b("/precache", new C3202jh());
        mo9920b("/touch", C1741o.f5724j);
        mo9920b("/video", C1741o.f5727m);
        mo9920b("/videoMeta", C1741o.f5728n);
        if (C1697X.m7689B().mo10040d(this.f9468b.getContext())) {
            mo9920b("/logScionEvent", new C1729c(this.f9468b.getContext()));
        }
        if (i2 != null) {
            mo9920b("/setInterstitialProperties", new C1721H(i2));
        }
        this.f9470d = xs;
        this.f9471e = mVar;
        this.f9474h = kVar2;
        this.f9475i = mVar3;
        this.f9484r = sVar;
        this.f9486t = vaVar3;
        this.f9488v = oVar;
        this.f9478l = i2;
        this.f9477k = z;
    }

    /* renamed from: a */
    public final void mo9230a(C3003ci ciVar) {
        this.f9472f = ciVar;
    }

    /* renamed from: a */
    public final void mo9231a(C3031di diVar) {
        this.f9473g = diVar;
    }

    /* renamed from: a */
    public final void mo9232a(C3061ei eiVar) {
        this.f9476j = eiVar;
    }

    /* renamed from: a */
    public final void mo9233a(C3089fi fiVar) {
        this.f9489w = fiVar;
    }

    /* renamed from: a */
    public final void mo7819a(C3492ti tiVar) {
        this.f9491y = true;
        C3031di diVar = this.f9473g;
        if (diVar != null) {
            diVar.mo9312a();
            this.f9473g = null;
        }
        m12592s();
    }

    /* renamed from: a */
    public final void mo9539a(boolean z) {
        this.f9477k = z;
    }

    /* renamed from: a */
    public final void mo9540a(boolean z, int i) {
        C2845Xs xs = (!this.f9468b.mo8165fb() || this.f9468b.mo8192rb().mo9497d()) ? this.f9470d : null;
        C1781m mVar = this.f9471e;
        C1787s sVar = this.f9484r;
        C3520uh uhVar = this.f9468b;
        m12588a(new AdOverlayInfoParcel(xs, mVar, sVar, uhVar, z, i, uhVar.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo9541a(boolean z, int i, String str) {
        boolean fb = this.f9468b.mo8165fb();
        C2845Xs xs = (!fb || this.f9468b.mo8192rb().mo9497d()) ? this.f9470d : null;
        C3293mi miVar = fb ? null : new C3293mi(this.f9468b, this.f9471e);
        C1737k kVar = this.f9474h;
        C1739m mVar = this.f9475i;
        C1787s sVar = this.f9484r;
        C3520uh uhVar = this.f9468b;
        m12588a(new AdOverlayInfoParcel(xs, miVar, kVar, mVar, sVar, uhVar, z, i, str, uhVar.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo9542a(boolean z, int i, String str, String str2) {
        boolean fb = this.f9468b.mo8165fb();
        C2845Xs xs = (!fb || this.f9468b.mo8192rb().mo9497d()) ? this.f9470d : null;
        C3293mi miVar = fb ? null : new C3293mi(this.f9468b, this.f9471e);
        C1737k kVar = this.f9474h;
        C1739m mVar = this.f9475i;
        C1787s sVar = this.f9484r;
        C3520uh uhVar = this.f9468b;
        m12588a(new AdOverlayInfoParcel(xs, miVar, kVar, mVar, sVar, uhVar, z, i, str, str2, uhVar.mo8201ub()));
    }

    /* renamed from: b */
    public final void mo9234b() {
        this.f9492z = true;
        m12592s();
    }

    /* renamed from: b */
    public final void mo9415b(C3492ti tiVar) {
        mo9919a(tiVar.f10258b);
    }

    /* renamed from: c */
    public final void mo9235c() {
        C3345od odVar = this.f9490x;
        if (odVar != null) {
            WebView webView = this.f9468b.getWebView();
            if (C0487v.m2308x(webView)) {
                m12587a((View) webView, odVar, 10);
                return;
            }
            m12591r();
            this.f9467B = new C3264li(this, odVar);
            this.f9468b.getView().addOnAttachStateChangeListener(this.f9467B);
        }
    }

    /* renamed from: c */
    public final boolean mo9343c(C3492ti tiVar) {
        String valueOf = String.valueOf(tiVar.f10257a);
        C2857Yd.m11615f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = tiVar.f10258b;
        if (mo9919a(uri)) {
            return true;
        }
        if (this.f9477k) {
            String scheme = uri.getScheme();
            if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (this.f9470d != null) {
                    if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7735Fa)).booleanValue()) {
                        this.f9470d.mo6490f();
                        C3345od odVar = this.f9490x;
                        if (odVar != null) {
                            odVar.mo9372a(tiVar.f10257a);
                        }
                        this.f9470d = null;
                    }
                }
                return false;
            }
        }
        if (!this.f9468b.getWebView().willNotDraw()) {
            try {
                C2209Bp hb = this.f9468b.mo8171hb();
                if (hb != null && hb.mo7871a(uri)) {
                    uri = hb.mo7868a(uri, this.f9468b.getContext(), this.f9468b.getView(), this.f9468b.mo8163eb());
                }
            } catch (C2238Cp unused) {
                String valueOf2 = String.valueOf(tiVar.f10257a);
                C2227Cf.m9536d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            C1806va vaVar = this.f9486t;
            if (vaVar == null || vaVar.mo7033b()) {
                mo9538a(new zzc("android.intent.action.VIEW", uri.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
            } else {
                this.f9486t.mo7032a(tiVar.f10257a);
            }
        } else {
            String valueOf3 = String.valueOf(tiVar.f10257a);
            C2227Cf.m9536d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    /* renamed from: d */
    public final WebResourceResponse mo7864d(C3492ti tiVar) {
        WebResourceResponse webResourceResponse;
        zzhi a;
        C3345od odVar = this.f9490x;
        if (odVar != null) {
            odVar.mo9373a(tiVar.f10257a, tiVar.f10260d, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(tiVar.f10257a).getName())) {
            webResourceResponse = null;
        } else {
            mo9236d();
            String str = (String) C3390pt.m13458f().mo8515a(this.f9468b.mo8192rb().mo9497d() ? C2558Nu.f7882ea : this.f9468b.mo8165fb() ? C2558Nu.f7876da : C2558Nu.f7870ca);
            C1697X.m7698e();
            webResourceResponse = C3114ge.m12428c(this.f9468b.getContext(), this.f9468b.mo8201ub().f10855a, str);
        }
        if (webResourceResponse != null) {
            return webResourceResponse;
        }
        try {
            if (!C3602xd.m14409a(tiVar.f10257a, this.f9468b.getContext()).equals(tiVar.f10257a)) {
                return m12590e(tiVar);
            }
            zzhl a2 = zzhl.m14773a(tiVar.f10257a);
            if (a2 != null && (a = C1697X.m7704k().mo9123a(a2)) != null && a.mo10306b()) {
                return new WebResourceResponse("", "", a.mo10307c());
            }
            if (C3548vf.m14223a()) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7778Mb)).booleanValue()) {
                    return m12590e(tiVar);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C1697X.m7702i().mo8319a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: d */
    public final void mo9236d() {
        synchronized (this.f9469c) {
            this.f9477k = false;
            this.f9479m = true;
            C2972bg.f8938a.execute(new C3203ji(this));
        }
    }

    /* renamed from: e */
    public final void mo9237e() {
        this.f9466A--;
        m12592s();
    }

    /* renamed from: f */
    public final void mo9238f() {
        synchronized (this.f9469c) {
            this.f9483q = true;
        }
        this.f9466A++;
        m12592s();
    }

    /* renamed from: g */
    public final boolean mo9239g() {
        boolean z;
        synchronized (this.f9469c) {
            z = this.f9483q;
        }
        return z;
    }

    /* renamed from: h */
    public final C3345od mo9240h() {
        return this.f9490x;
    }

    /* renamed from: i */
    public final C1806va mo9241i() {
        return this.f9486t;
    }

    /* renamed from: j */
    public final boolean mo9242j() {
        boolean z;
        synchronized (this.f9469c) {
            z = this.f9479m;
        }
        return z;
    }

    /* renamed from: k */
    public final /* synthetic */ Object mo9299k() {
        return this.f9468b;
    }

    /* renamed from: l */
    public final void mo9543l() {
        C3345od odVar = this.f9490x;
        if (odVar != null) {
            odVar.mo9370a();
            this.f9490x = null;
        }
        m12591r();
        super.mo9543l();
        synchronized (this.f9469c) {
            this.f9470d = null;
            this.f9471e = null;
            this.f9472f = null;
            this.f9473g = null;
            this.f9474h = null;
            this.f9475i = null;
            this.f9477k = false;
            this.f9479m = false;
            this.f9480n = false;
            this.f9483q = false;
            this.f9484r = null;
            this.f9476j = null;
            if (this.f9487u != null) {
                this.f9487u.mo9303a(true);
                this.f9487u = null;
            }
        }
    }

    /* renamed from: m */
    public final boolean mo9544m() {
        boolean z;
        synchronized (this.f9469c) {
            z = this.f9480n;
        }
        return z;
    }

    /* renamed from: n */
    public final ViewTreeObserver.OnGlobalLayoutListener mo9545n() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f9469c) {
            onGlobalLayoutListener = this.f9481o;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: o */
    public final ViewTreeObserver.OnScrollChangedListener mo9546o() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f9469c) {
            onScrollChangedListener = this.f9482p;
        }
        return onScrollChangedListener;
    }

    /* renamed from: p */
    public final C3089fi mo9547p() {
        return this.f9489w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo9548q() {
        this.f9468b.mo8184nb();
        C1771c Ya = this.f9468b.mo8137Ya();
        if (Ya != null) {
            Ya.mo6996dc();
        }
        C3061ei eiVar = this.f9476j;
        if (eiVar != null) {
            eiVar.mo6881a();
            this.f9476j = null;
        }
    }
}
