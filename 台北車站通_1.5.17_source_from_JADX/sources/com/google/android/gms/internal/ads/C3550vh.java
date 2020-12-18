package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.p007v4.view.C0487v;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1806va;
import com.google.android.gms.ads.internal.gmsg.C1718E;
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
import com.google.android.gms.common.util.C2093o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.vh */
public class C3550vh extends WebViewClient implements C2974bi {

    /* renamed from: a */
    private static final String[] f10343a = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: b */
    private static final String[] f10344b = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: A */
    private boolean f10345A;

    /* renamed from: B */
    private boolean f10346B;

    /* renamed from: C */
    private int f10347C;

    /* renamed from: D */
    private View.OnAttachStateChangeListener f10348D;

    /* renamed from: c */
    private C3520uh f10349c;

    /* renamed from: d */
    private final HashMap<String, List<C1718E<? super C3520uh>>> f10350d;

    /* renamed from: e */
    private final Object f10351e;

    /* renamed from: f */
    private C2845Xs f10352f;

    /* renamed from: g */
    private C1781m f10353g;

    /* renamed from: h */
    private C3003ci f10354h;

    /* renamed from: i */
    private C3031di f10355i;

    /* renamed from: j */
    private C1737k f10356j;

    /* renamed from: k */
    private C1739m f10357k;

    /* renamed from: l */
    private C3061ei f10358l;

    /* renamed from: m */
    private boolean f10359m;

    /* renamed from: n */
    private C1726I f10360n;

    /* renamed from: o */
    private boolean f10361o;

    /* renamed from: p */
    private boolean f10362p;

    /* renamed from: q */
    private ViewTreeObserver.OnGlobalLayoutListener f10363q;

    /* renamed from: r */
    private ViewTreeObserver.OnScrollChangedListener f10364r;

    /* renamed from: s */
    private boolean f10365s;

    /* renamed from: t */
    private C1787s f10366t;

    /* renamed from: u */
    private final C3283m f10367u;

    /* renamed from: v */
    private C1806va f10368v;

    /* renamed from: w */
    private C3021d f10369w;

    /* renamed from: x */
    private C3340o f10370x;

    /* renamed from: y */
    private C3089fi f10371y;

    /* renamed from: z */
    protected C3345od f10372z;

    public C3550vh(C3520uh uhVar, boolean z) {
        this(uhVar, z, new C3283m(uhVar, uhVar.mo8161db(), new C3647yu(uhVar.getContext())), (C3021d) null);
    }

    private C3550vh(C3520uh uhVar, boolean z, C3283m mVar, C3021d dVar) {
        this.f10350d = new HashMap<>();
        this.f10351e = new Object();
        this.f10359m = false;
        this.f10349c = uhVar;
        this.f10361o = z;
        this.f10367u = mVar;
        this.f10369w = null;
    }

    /* renamed from: a */
    private final void m14237a(Context context, String str, String str2, String str3) {
        String str4;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7840Xb)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString("err", str);
            bundle.putString("code", str2);
            if (!TextUtils.isEmpty(str3)) {
                Uri parse = Uri.parse(str3);
                if (parse.getHost() != null) {
                    str4 = parse.getHost();
                    bundle.putString("host", str4);
                    C1697X.m7698e().mo9449a(context, this.f10349c.mo8201ub().f10855a, "gmob-apps", bundle, true);
                }
            }
            str4 = "";
            bundle.putString("host", str4);
            C1697X.m7698e().mo9449a(context, this.f10349c.mo8201ub().f10855a, "gmob-apps", bundle, true);
        }
    }

    /* renamed from: a */
    private final void m14238a(Uri uri) {
        String path = uri.getPath();
        List<C1718E> list = this.f10350d.get(path);
        if (list != null) {
            C1697X.m7698e();
            Map<String, String> a = C3114ge.m12404a(uri);
            if (C2227Cf.m9531a(2)) {
                String valueOf = String.valueOf(path);
                C2857Yd.m11615f(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
                for (String next : a.keySet()) {
                    String str = a.get(next);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 4 + String.valueOf(str).length());
                    sb.append("  ");
                    sb.append(next);
                    sb.append(": ");
                    sb.append(str);
                    C2857Yd.m11615f(sb.toString());
                }
            }
            for (C1718E zza : list) {
                zza.zza(this.f10349c, a);
            }
            return;
        }
        String valueOf2 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
        sb2.append("No GMSG handler found for GMSG: ");
        sb2.append(valueOf2);
        C2857Yd.m11615f(sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m14239a(View view, C3345od odVar, int i) {
        if (odVar.mo9378c() && i > 0) {
            odVar.mo9371a(view);
            if (odVar.mo9378c()) {
                C3114ge.f9351a.postDelayed(new C3606xh(this, view, odVar, i), 100);
            }
        }
    }

    /* renamed from: a */
    private final void m14240a(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        C3021d dVar = this.f10369w;
        boolean z = false;
        boolean a = dVar != null ? dVar.mo9304a() : false;
        C1697X.m7696c();
        Context context = this.f10349c.getContext();
        if (!a) {
            z = true;
        }
        C1779k.m8016a(context, adOverlayInfoParcel, z);
        if (this.f10372z != null) {
            String str = adOverlayInfoParcel.f5822l;
            if (str == null && (zzc = adOverlayInfoParcel.f5811a) != null) {
                str = zzc.f5871b;
            }
            this.f10372z.mo9372a(str);
        }
    }

    /* renamed from: b */
    private final WebResourceResponse m14242b(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        int i = 0;
        while (true) {
            i++;
            if (i <= 20) {
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry next : map.entrySet()) {
                    openConnection.addRequestProperty((String) next.getKey(), (String) next.getValue());
                }
                if (openConnection instanceof HttpURLConnection) {
                    httpURLConnection = (HttpURLConnection) openConnection;
                    C1697X.m7698e().mo9450a(this.f10349c.getContext(), this.f10349c.mo8201ub().f10855a, false, httpURLConnection);
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

    /* renamed from: p */
    private final void m14243p() {
        if (this.f10348D != null) {
            this.f10349c.getView().removeOnAttachStateChangeListener(this.f10348D);
        }
    }

    /* renamed from: q */
    private final void m14244q() {
        if (this.f10354h != null && ((this.f10345A && this.f10347C <= 0) || this.f10346B)) {
            this.f10354h.mo7012a(!this.f10346B);
            this.f10354h = null;
        }
        this.f10349c.mo8172ib();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo10129a(String str, Map<String, String> map) {
        zzhi a;
        try {
            String a2 = C3602xd.m14409a(str, this.f10349c.getContext());
            if (!a2.equals(str)) {
                return m14242b(a2, map);
            }
            zzhl a3 = zzhl.m14773a(str);
            if (a3 != null && (a = C1697X.m7704k().mo9123a(a3)) != null && a.mo10306b()) {
                return new WebResourceResponse("", "", a.mo10307c());
            }
            if (C3548vf.m14223a()) {
                if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7778Mb)).booleanValue()) {
                    return m14242b(str, map);
                }
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            C1697X.m7702i().mo8319a(e, "AdWebViewClient.interceptRequest");
            return null;
        }
    }

    /* renamed from: a */
    public final void mo10130a() {
        C3345od odVar = this.f10372z;
        if (odVar != null) {
            odVar.mo9370a();
            this.f10372z = null;
        }
        m14243p();
        synchronized (this.f10351e) {
            this.f10350d.clear();
            this.f10352f = null;
            this.f10353g = null;
            this.f10354h = null;
            this.f10355i = null;
            this.f10356j = null;
            this.f10357k = null;
            this.f10359m = false;
            this.f10361o = false;
            this.f10362p = false;
            this.f10365s = false;
            this.f10366t = null;
            this.f10358l = null;
            if (this.f10369w != null) {
                this.f10369w.mo9303a(true);
                this.f10369w = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo9226a(int i, int i2) {
        C3021d dVar = this.f10369w;
        if (dVar != null) {
            dVar.mo9300a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo9227a(int i, int i2, boolean z) {
        this.f10367u.mo9707a(i, i2);
        C3021d dVar = this.f10369w;
        if (dVar != null) {
            dVar.mo9301a(i, i2, z);
        }
    }

    /* renamed from: a */
    public final void mo9228a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f10351e) {
            this.f10362p = true;
            this.f10349c.mo8184nb();
            this.f10363q = onGlobalLayoutListener;
            this.f10364r = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public final void mo10131a(zzc zzc) {
        boolean fb = this.f10349c.mo8165fb();
        m14240a(new AdOverlayInfoParcel(zzc, (!fb || this.f10349c.mo8192rb().mo9497d()) ? this.f10352f : null, fb ? null : this.f10353g, this.f10366t, this.f10349c.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo9229a(C2845Xs xs, C1737k kVar, C1781m mVar, C1739m mVar2, C1787s sVar, boolean z, C1726I i, C1806va vaVar, C3340o oVar, C3345od odVar) {
        C1737k kVar2 = kVar;
        C1739m mVar3 = mVar2;
        C1726I i2 = i;
        C3340o oVar2 = oVar;
        C3345od odVar2 = odVar;
        C1806va vaVar2 = vaVar == null ? new C1806va(this.f10349c.getContext(), odVar2, (zzael) null) : vaVar;
        this.f10369w = new C3021d(this.f10349c, oVar2);
        this.f10372z = odVar2;
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7883eb)).booleanValue()) {
            mo10132a("/adMetadata", (C1718E<? super C3520uh>) new C1727a(kVar2));
        }
        mo10132a("/appEvent", (C1718E<? super C3520uh>) new C1738l(mVar3));
        mo10132a("/backButton", (C1718E<? super C3520uh>) C1741o.f5725k);
        mo10132a("/refresh", (C1718E<? super C3520uh>) C1741o.f5726l);
        mo10132a("/canOpenURLs", (C1718E<? super C3520uh>) C1741o.f5716b);
        mo10132a("/canOpenIntents", (C1718E<? super C3520uh>) C1741o.f5717c);
        mo10132a("/click", (C1718E<? super C3520uh>) C1741o.f5718d);
        mo10132a("/close", (C1718E<? super C3520uh>) C1741o.f5719e);
        mo10132a("/customClose", (C1718E<? super C3520uh>) C1741o.f5720f);
        mo10132a("/instrument", (C1718E<? super C3520uh>) C1741o.f5729o);
        mo10132a("/delayPageLoaded", (C1718E<? super C3520uh>) C1741o.f5731q);
        mo10132a("/delayPageClosed", (C1718E<? super C3520uh>) C1741o.f5732r);
        mo10132a("/getLocationInfo", (C1718E<? super C3520uh>) C1741o.f5733s);
        mo10132a("/httpTrack", (C1718E<? super C3520uh>) C1741o.f5721g);
        mo10132a("/log", (C1718E<? super C3520uh>) C1741o.f5722h);
        mo10132a("/mraid", (C1718E<? super C3520uh>) new C1730d(vaVar2, this.f10369w, oVar2));
        mo10132a("/mraidLoaded", (C1718E<? super C3520uh>) this.f10367u);
        C1731e eVar = r1;
        C1806va vaVar3 = vaVar2;
        C1731e eVar2 = new C1731e(this.f10349c.getContext(), this.f10349c.mo8201ub(), this.f10349c.mo8171hb(), sVar, xs, kVar, mVar2, mVar, vaVar2, this.f10369w);
        mo10132a("/open", (C1718E<? super C3520uh>) eVar);
        mo10132a("/precache", (C1718E<? super C3520uh>) new C3202jh());
        mo10132a("/touch", (C1718E<? super C3520uh>) C1741o.f5724j);
        mo10132a("/video", (C1718E<? super C3520uh>) C1741o.f5727m);
        mo10132a("/videoMeta", (C1718E<? super C3520uh>) C1741o.f5728n);
        if (C1697X.m7689B().mo10040d(this.f10349c.getContext())) {
            mo10132a("/logScionEvent", (C1718E<? super C3520uh>) new C1729c(this.f10349c.getContext()));
        }
        if (i2 != null) {
            mo10132a("/setInterstitialProperties", (C1718E<? super C3520uh>) new C1721H(i2));
        }
        this.f10352f = xs;
        this.f10353g = mVar;
        this.f10356j = kVar2;
        this.f10357k = mVar3;
        this.f10366t = sVar;
        this.f10368v = vaVar3;
        this.f10370x = oVar;
        this.f10360n = i2;
        this.f10359m = z;
    }

    /* renamed from: a */
    public final void mo9230a(C3003ci ciVar) {
        this.f10354h = ciVar;
    }

    /* renamed from: a */
    public final void mo9231a(C3031di diVar) {
        this.f10355i = diVar;
    }

    /* renamed from: a */
    public final void mo9232a(C3061ei eiVar) {
        this.f10358l = eiVar;
    }

    /* renamed from: a */
    public final void mo9233a(C3089fi fiVar) {
        this.f10371y = fiVar;
    }

    /* renamed from: a */
    public final void mo10132a(String str, C1718E<? super C3520uh> e) {
        synchronized (this.f10351e) {
            List list = this.f10350d.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f10350d.put(str, list);
            }
            list.add(e);
        }
    }

    /* renamed from: a */
    public final void mo10133a(String str, C2093o<C1718E<? super C3520uh>> oVar) {
        synchronized (this.f10351e) {
            List<C1718E> list = this.f10350d.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (C1718E e : list) {
                    if (oVar.apply(e)) {
                        arrayList.add(e);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo10134a(boolean z) {
        this.f10359m = z;
    }

    /* renamed from: a */
    public final void mo10135a(boolean z, int i) {
        C2845Xs xs = (!this.f10349c.mo8165fb() || this.f10349c.mo8192rb().mo9497d()) ? this.f10352f : null;
        C1781m mVar = this.f10353g;
        C1787s sVar = this.f10366t;
        C3520uh uhVar = this.f10349c;
        m14240a(new AdOverlayInfoParcel(xs, mVar, sVar, uhVar, z, i, uhVar.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo10136a(boolean z, int i, String str) {
        boolean fb = this.f10349c.mo8165fb();
        C2845Xs xs = (!fb || this.f10349c.mo8192rb().mo9497d()) ? this.f10352f : null;
        C2172Ah ah = fb ? null : new C2172Ah(this.f10349c, this.f10353g);
        C1737k kVar = this.f10356j;
        C1739m mVar = this.f10357k;
        C1787s sVar = this.f10366t;
        C3520uh uhVar = this.f10349c;
        m14240a(new AdOverlayInfoParcel(xs, ah, kVar, mVar, sVar, uhVar, z, i, str, uhVar.mo8201ub()));
    }

    /* renamed from: a */
    public final void mo10137a(boolean z, int i, String str, String str2) {
        boolean fb = this.f10349c.mo8165fb();
        C2845Xs xs = (!fb || this.f10349c.mo8192rb().mo9497d()) ? this.f10352f : null;
        C2172Ah ah = fb ? null : new C2172Ah(this.f10349c, this.f10353g);
        C1737k kVar = this.f10356j;
        C1739m mVar = this.f10357k;
        C1787s sVar = this.f10366t;
        C3520uh uhVar = this.f10349c;
        m14240a(new AdOverlayInfoParcel(xs, ah, kVar, mVar, sVar, uhVar, z, i, str, str2, uhVar.mo8201ub()));
    }

    /* renamed from: b */
    public final void mo9234b() {
        this.f10346B = true;
        m14244q();
    }

    /* renamed from: b */
    public final void mo10138b(String str, C1718E<? super C3520uh> e) {
        synchronized (this.f10351e) {
            List list = this.f10350d.get(str);
            if (list != null) {
                list.remove(e);
            }
        }
    }

    /* renamed from: c */
    public final void mo9235c() {
        C3345od odVar = this.f10372z;
        if (odVar != null) {
            WebView webView = this.f10349c.getWebView();
            if (C0487v.m2308x(webView)) {
                m14239a((View) webView, odVar, 10);
                return;
            }
            m14243p();
            this.f10348D = new C3663zh(this, odVar);
            this.f10349c.getView().addOnAttachStateChangeListener(this.f10348D);
        }
    }

    /* renamed from: d */
    public final void mo9236d() {
        synchronized (this.f10351e) {
            this.f10359m = false;
            this.f10361o = true;
            C2972bg.f8938a.execute(new C3578wh(this));
        }
    }

    /* renamed from: e */
    public final void mo9237e() {
        this.f10347C--;
        m14244q();
    }

    /* renamed from: f */
    public final void mo9238f() {
        synchronized (this.f10351e) {
            this.f10365s = true;
        }
        this.f10347C++;
        m14244q();
    }

    /* renamed from: g */
    public final boolean mo9239g() {
        boolean z;
        synchronized (this.f10351e) {
            z = this.f10365s;
        }
        return z;
    }

    /* renamed from: h */
    public final C3345od mo9240h() {
        return this.f10372z;
    }

    /* renamed from: i */
    public final C1806va mo9241i() {
        return this.f10368v;
    }

    /* renamed from: j */
    public final boolean mo9242j() {
        boolean z;
        synchronized (this.f10351e) {
            z = this.f10361o;
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo10139k() {
        boolean z;
        synchronized (this.f10351e) {
            z = this.f10362p;
        }
        return z;
    }

    /* renamed from: l */
    public final ViewTreeObserver.OnGlobalLayoutListener mo10140l() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f10351e) {
            onGlobalLayoutListener = this.f10363q;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: m */
    public final ViewTreeObserver.OnScrollChangedListener mo10141m() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f10351e) {
            onScrollChangedListener = this.f10364r;
        }
        return onScrollChangedListener;
    }

    /* renamed from: n */
    public final C3089fi mo10142n() {
        return this.f10371y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo10143o() {
        this.f10349c.mo8184nb();
        C1771c Ya = this.f10349c.mo8137Ya();
        if (Ya != null) {
            Ya.mo6996dc();
        }
        C3061ei eiVar = this.f10358l;
        if (eiVar != null) {
            eiVar.mo6881a();
            this.f10358l = null;
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C2857Yd.m11615f(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m14238a(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.mo9312a();
        r0.f10355i = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        m14244q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f10345A = true;
        r1 = r0.f10355i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f10351e
            monitor-enter(r1)
            com.google.android.gms.internal.ads.uh r2 = r0.f10349c     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.isDestroyed()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.internal.ads.C2857Yd.m11615f(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.uh r2 = r0.f10349c     // Catch:{ all -> 0x0029 }
            r2.mo8139_a()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f10345A = r1
            com.google.android.gms.internal.ads.di r1 = r0.f10355i
            if (r1 == 0) goto L_0x0025
            r1.mo9312a()
            r1 = 0
            r0.f10355i = r1
        L_0x0025:
            r0.m14244q()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3550vh.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String str3;
        if (i < 0) {
            int i2 = (-i) - 1;
            String[] strArr = f10343a;
            if (i2 < strArr.length) {
                str3 = strArr[i2];
                m14237a(this.f10349c.getContext(), "http_err", str3, str2);
                super.onReceivedError(webView, i, str, str2);
            }
        }
        str3 = String.valueOf(i);
        m14237a(this.f10349c.getContext(), "http_err", str3, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError >= 0) {
                String[] strArr = f10344b;
                if (primaryError < strArr.length) {
                    str = strArr[primaryError];
                    m14237a(this.f10349c.getContext(), "ssl_err", str, C1697X.m7700g().mo9717a(sslError));
                }
            }
            str = String.valueOf(primaryError);
            m14237a(this.f10349c.getContext(), "ssl_err", str, C1697X.m7700g().mo9717a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo10129a(str, (Map<String, String>) Collections.emptyMap());
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
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

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        C2857Yd.m11615f(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f10359m && webView == this.f10349c.getWebView()) {
                String scheme = parse.getScheme();
                if (HttpHost.DEFAULT_SCHEME_NAME.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    if (this.f10352f != null) {
                        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7735Fa)).booleanValue()) {
                            this.f10352f.mo6490f();
                            C3345od odVar = this.f10372z;
                            if (odVar != null) {
                                odVar.mo9372a(str);
                            }
                            this.f10352f = null;
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f10349c.getWebView().willNotDraw()) {
                try {
                    C2209Bp hb = this.f10349c.mo8171hb();
                    if (hb != null && hb.mo7871a(parse)) {
                        parse = hb.mo7868a(parse, this.f10349c.getContext(), this.f10349c.getView(), this.f10349c.mo8163eb());
                    }
                } catch (C2238Cp unused) {
                    String valueOf2 = String.valueOf(str);
                    C2227Cf.m9536d(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                C1806va vaVar = this.f10368v;
                if (vaVar == null || vaVar.mo7033b()) {
                    mo10131a(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null));
                } else {
                    this.f10368v.mo7032a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                C2227Cf.m9536d(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            m14238a(parse);
        }
        return true;
    }
}
