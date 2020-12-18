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
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.pi */
final class C3378pi extends C3521ui implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, C3520uh, C3281ly {

    /* renamed from: A */
    private C2187Av f9998A;

    /* renamed from: B */
    private int f9999B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public int f10000C;

    /* renamed from: D */
    private C2875Yu f10001D;

    /* renamed from: E */
    private C2875Yu f10002E;

    /* renamed from: F */
    private C2875Yu f10003F;

    /* renamed from: G */
    private C2902Zu f10004G;

    /* renamed from: H */
    private WeakReference<View.OnClickListener> f10005H;

    /* renamed from: I */
    private C1771c f10006I;

    /* renamed from: J */
    private C3404qf f10007J;

    /* renamed from: K */
    private int f10008K = -1;

    /* renamed from: L */
    private int f10009L = -1;

    /* renamed from: M */
    private int f10010M = -1;

    /* renamed from: N */
    private int f10011N = -1;

    /* renamed from: O */
    private float f10012O;

    /* renamed from: P */
    private Map<String, C3088fh> f10013P;

    /* renamed from: Q */
    private final WindowManager f10014Q;

    /* renamed from: i */
    private final C2209Bp f10015i;

    /* renamed from: j */
    private final zzang f10016j;

    /* renamed from: k */
    private final C1690P f10017k;

    /* renamed from: l */
    private final C1804ua f10018l;

    /* renamed from: m */
    private C3174ii f10019m;

    /* renamed from: n */
    private C1771c f10020n;

    /* renamed from: o */
    private C3146hi f10021o;

    /* renamed from: p */
    private String f10022p;

    /* renamed from: q */
    private boolean f10023q;

    /* renamed from: r */
    private boolean f10024r;

    /* renamed from: s */
    private boolean f10025s;

    /* renamed from: t */
    private int f10026t;

    /* renamed from: u */
    private boolean f10027u = true;

    /* renamed from: v */
    private boolean f10028v = false;

    /* renamed from: w */
    private String f10029w = "";

    /* renamed from: x */
    private C2457Kh f10030x;

    /* renamed from: y */
    private boolean f10031y;

    /* renamed from: z */
    private boolean f10032z;

    private C3378pi(C3118gi giVar, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        super(giVar);
        this.f10021o = hiVar;
        this.f10022p = str;
        this.f10024r = z;
        this.f10026t = -1;
        this.f10015i = bp;
        this.f10016j = zzang;
        this.f10017k = p;
        this.f10018l = uaVar;
        this.f10014Q = (WindowManager) getContext().getSystemService("window");
        this.f10007J = new C3404qf(mo9971a().mo9471a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        C1697X.m7698e().mo9448a((Context) giVar, zzang.f10855a, getSettings());
        setDownloadListener(this);
        this.f10012O = mo9971a().getResources().getDisplayMetrics().density;
        m13345e();
        if (C2092n.m9164e()) {
            addJavascriptInterface(C2543Nh.m10645a(this), "googleAdsJsInterface");
        }
        m13349i();
        this.f10004G = new C2902Zu(new C2930_u(true, "make_wv", this.f10022p));
        this.f10004G.mo9126a().mo9176a(_uVar);
        this.f10002E = C2736Tu.m11305a(this.f10004G.mo9126a());
        this.f10004G.mo9127a("native:view_create", this.f10002E);
        this.f10003F = null;
        this.f10001D = null;
        C1697X.m7700g().mo9726b((Context) giVar);
    }

    /* renamed from: a */
    static C3378pi m13341a(Context context, C3146hi hiVar, String str, boolean z, boolean z2, C2209Bp bp, zzang zzang, C2930_u _uVar, C1690P p, C1804ua uaVar, C3275ls lsVar) {
        Context context2 = context;
        return new C3378pi(new C3118gi(context), hiVar, str, z, z2, bp, zzang, _uVar, p, uaVar, lsVar);
    }

    /* renamed from: c */
    private final void m13342c(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        C3309my.m13110a((C3281ly) this, "onAdVisibilityChanged", (Map) hashMap);
    }

    /* renamed from: c */
    private final boolean m13343c() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f10019m.mo9242j() && !this.f10019m.mo9544m()) {
            return false;
        }
        C1697X.m7698e();
        DisplayMetrics a = C3114ge.m12395a(this.f10014Q);
        C3390pt.m13453a();
        int b = C3432rf.m13606b(a, a.widthPixels);
        C3390pt.m13453a();
        int b2 = C3432rf.m13606b(a, a.heightPixels);
        Activity a2 = mo9971a().mo9471a();
        if (a2 == null || a2.getWindow() == null) {
            i2 = b;
            i = b2;
        } else {
            C1697X.m7698e();
            int[] a3 = C3114ge.m12421a(a2);
            C3390pt.m13453a();
            i2 = C3432rf.m13606b(a, a3[0]);
            C3390pt.m13453a();
            i = C3432rf.m13606b(a, a3[1]);
        }
        if (this.f10009L == b && this.f10008K == b2 && this.f10010M == i2 && this.f10011N == i) {
            return false;
        }
        if (!(this.f10009L == b && this.f10008K == b2)) {
            z = true;
        }
        this.f10009L = b;
        this.f10008K = b2;
        this.f10010M = i2;
        this.f10011N = i;
        new C3311n(this).mo9765a(b, b2, i2, i, a.density, this.f10014Q.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: d */
    private final void m13344d() {
        C2736Tu.m11306a(this.f10004G.mo9126a(), this.f10002E, "aeh2");
    }

    /* renamed from: e */
    private final synchronized void m13345e() {
        if (!this.f10024r) {
            if (!this.f10021o.mo9497d()) {
                if (Build.VERSION.SDK_INT < 18) {
                    C2227Cf.m9532b("Disabling hardware acceleration on an AdView.");
                    m13346f();
                    return;
                }
                C2227Cf.m9532b("Enabling hardware acceleration on an AdView.");
                m13347g();
                return;
            }
        }
        C2227Cf.m9532b("Enabling hardware acceleration on an overlay.");
        m13347g();
    }

    /* renamed from: f */
    private final synchronized void m13346f() {
        if (!this.f10025s) {
            C1697X.m7700g().mo9730c((View) this);
        }
        this.f10025s = true;
    }

    /* renamed from: g */
    private final synchronized void m13347g() {
        if (this.f10025s) {
            C1697X.m7700g().mo9727b((View) this);
        }
        this.f10025s = false;
    }

    /* renamed from: h */
    private final synchronized void m13348h() {
        this.f10013P = null;
    }

    /* renamed from: i */
    private final void m13349i() {
        C2930_u a;
        C2902Zu zu = this.f10004G;
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
        this.f10028v = false;
        if (this.f10017k != null) {
            this.f10017k.mo6792Db();
        }
    }

    /* renamed from: Eb */
    public final synchronized void mo6793Eb() {
        this.f10028v = true;
        if (this.f10017k != null) {
            this.f10017k.mo6793Eb();
        }
    }

    /* renamed from: Xa */
    public final void mo8136Xa() {
        C2857Yd.m11615f("Cannot add text view to inner AdWebView");
    }

    /* renamed from: Ya */
    public final synchronized C1771c mo8137Ya() {
        return this.f10020n;
    }

    /* renamed from: Za */
    public final C2902Zu mo8138Za() {
        return this.f10004G;
    }

    /* renamed from: a */
    public final void mo8140a(Context context) {
        mo9971a().setBaseContext(context);
        this.f10007J.mo9930a(mo9971a().mo9471a());
    }

    /* renamed from: a */
    public final synchronized void mo8141a(C1771c cVar) {
        this.f10006I = cVar;
    }

    /* renamed from: a */
    public final void mo8142a(zzc zzc) {
        this.f10019m.mo9538a(zzc);
    }

    /* renamed from: a */
    public final synchronized void mo8143a(C2187Av av) {
        this.f9998A = av;
    }

    /* renamed from: a */
    public final synchronized void mo8144a(C2457Kh kh) {
        if (this.f10030x != null) {
            C2227Cf.m9529a("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f10030x = kh;
        }
    }

    /* renamed from: a */
    public final synchronized void mo8145a(C3146hi hiVar) {
        this.f10021o = hiVar;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo9880a(C3174ii iiVar) {
        this.f10019m = iiVar;
    }

    /* renamed from: a */
    public final void mo8146a(C3302mr mrVar) {
        synchronized (this) {
            this.f10031y = mrVar.f9820m;
        }
        m13342c(mrVar.f9820m);
    }

    /* renamed from: a */
    public final synchronized void mo7966a(String str) {
        if (!isDestroyed()) {
            super.mo7966a(str);
        } else {
            C2227Cf.m9536d("The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: a */
    public final void mo8147a(String str, C1718E<? super C3520uh> e) {
        C3174ii iiVar = this.f10019m;
        if (iiVar != null) {
            iiVar.mo9917a(str, e);
        }
    }

    /* renamed from: a */
    public final void mo8148a(String str, C2093o<C1718E<? super C3520uh>> oVar) {
        C3174ii iiVar = this.f10019m;
        if (iiVar != null) {
            iiVar.mo9918a(str, oVar);
        }
    }

    /* renamed from: a */
    public final void mo9270a(String str, String str2) {
        C3309my.m13109a((C3281ly) this, str, str2);
    }

    /* renamed from: a */
    public final void mo8149a(String str, Map map) {
        C3309my.m13110a((C3281ly) this, str, map);
    }

    /* renamed from: a */
    public final void mo8150a(String str, JSONObject jSONObject) {
        C3309my.m13112b(this, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo8151a(boolean z) {
        this.f10019m.mo9539a(z);
    }

    /* renamed from: a */
    public final void mo8152a(boolean z, int i) {
        this.f10019m.mo9540a(z, i);
    }

    /* renamed from: a */
    public final void mo8153a(boolean z, int i, String str) {
        this.f10019m.mo9541a(z, i, str);
    }

    /* renamed from: a */
    public final void mo8154a(boolean z, int i, String str, String str2) {
        this.f10019m.mo9542a(z, i, str, str2);
    }

    /* renamed from: ab */
    public final void mo8155ab() {
        m13344d();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f10016j.f10855a);
        C3309my.m13110a((C3281ly) this, "onhide", (Map) hashMap);
    }

    /* renamed from: b */
    public final synchronized void mo8156b(C1771c cVar) {
        this.f10020n = cVar;
    }

    /* renamed from: b */
    public final void mo8157b(String str, C1718E<? super C3520uh> e) {
        C3174ii iiVar = this.f10019m;
        if (iiVar != null) {
            iiVar.mo9920b(str, e);
        }
    }

    /* renamed from: b */
    public final synchronized void mo8158b(String str, String str2, String str3) {
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7853_a)).booleanValue()) {
            str2 = C2806Wh.m11501a(str2, C2806Wh.m11500a());
        }
        super.loadDataWithBaseURL(str, str2, "text/html", HTTP.UTF_8, str3);
    }

    /* renamed from: b */
    public final void mo7967b(String str, JSONObject jSONObject) {
        C3309my.m13111a((C3281ly) this, str, jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo9881b(boolean z) {
        if (!z) {
            m13349i();
            this.f10007J.mo9933d();
            if (this.f10020n != null) {
                this.f10020n.mo6994bc();
                this.f10020n.onDestroy();
                this.f10020n = null;
            }
        }
        this.f10019m.mo9543l();
        C1697X.m7719z();
        C3060eh.m12276a((C2749Ug) this);
        m13348h();
    }

    /* renamed from: bb */
    public final void mo8159bb() {
        if (this.f10001D == null) {
            C2736Tu.m11306a(this.f10004G.mo9126a(), this.f10002E, "aes2");
            this.f10001D = C2736Tu.m11305a(this.f10004G.mo9126a());
            this.f10004G.mo9127a("native:view_show", this.f10001D);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f10016j.f10855a);
        C3309my.m13110a((C3281ly) this, "onshow", (Map) hashMap);
    }

    /* renamed from: cb */
    public final void mo8160cb() {
        setBackgroundColor(0);
    }

    /* renamed from: db */
    public final Context mo8161db() {
        return mo9971a().mo9472b();
    }

    /* renamed from: eb */
    public final Activity mo8163eb() {
        return mo9971a().mo9471a();
    }

    /* renamed from: f */
    public final void mo8164f(int i) {
        if (i == 0) {
            C2736Tu.m11306a(this.f10004G.mo9126a(), this.f10002E, "aebb2");
        }
        m13344d();
        if (this.f10004G.mo9126a() != null) {
            this.f10004G.mo9126a().mo9178a("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ClientCookie.VERSION_ATTR, this.f10016j.f10855a);
        C3309my.m13110a((C3281ly) this, "onhide", (Map) hashMap);
    }

    /* renamed from: fb */
    public final synchronized boolean mo8165fb() {
        return this.f10024r;
    }

    /* renamed from: gb */
    public final synchronized C2187Av mo8166gb() {
        return this.f9998A;
    }

    public final View.OnClickListener getOnClickListener() {
        return (View.OnClickListener) this.f10005H.get();
    }

    public final synchronized int getRequestedOrientation() {
        return this.f10026t;
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this;
    }

    /* renamed from: hb */
    public final C2209Bp mo8171hb() {
        return this.f10015i;
    }

    /* renamed from: ib */
    public final void mo8172ib() {
        if (this.f10003F == null) {
            this.f10003F = C2736Tu.m11305a(this.f10004G.mo9126a());
            this.f10004G.mo9127a("native:view_load", this.f10003F);
        }
    }

    /* renamed from: jb */
    public final synchronized C2457Kh mo8174jb() {
        return this.f10030x;
    }

    /* renamed from: kb */
    public final C1804ua mo8175kb() {
        return this.f10018l;
    }

    /* renamed from: l */
    public final synchronized void mo8176l(boolean z) {
        if (this.f10020n != null) {
            this.f10020n.mo6993a(this.f10019m.mo9242j(), z);
        } else {
            this.f10023q = z;
        }
    }

    /* renamed from: lb */
    public final synchronized boolean mo8177lb() {
        return this.f10023q;
    }

    /* renamed from: m */
    public final synchronized void mo8181m(boolean z) {
        this.f10027u = z;
    }

    /* renamed from: mb */
    public final /* synthetic */ C2974bi mo8182mb() {
        return this.f10019m;
    }

    /* renamed from: n */
    public final synchronized void mo8183n(boolean z) {
        this.f9999B += z ? 1 : -1;
        if (this.f9999B <= 0 && this.f10020n != null) {
            this.f10020n.mo7004hc();
        }
    }

    /* renamed from: nb */
    public final void mo8184nb() {
        this.f10007J.mo9932c();
    }

    /* renamed from: o */
    public final synchronized void mo8185o(String str) {
        if (str == null) {
            str = "";
        }
        this.f10029w = str;
    }

    /* renamed from: o */
    public final synchronized void mo8186o(boolean z) {
        boolean z2 = z != this.f10024r;
        this.f10024r = z;
        m13345e();
        if (z2) {
            new C3311n(this).mo9769c(z ? "expanded" : CookieSpecs.DEFAULT);
        }
    }

    /* renamed from: ob */
    public final WebViewClient mo8187ob() {
        return this.f10124f;
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.f10007J.mo9929a();
        }
        boolean z = this.f10031y;
        if (this.f10019m != null && this.f10019m.mo9544m()) {
            if (!this.f10032z) {
                ViewTreeObserver.OnGlobalLayoutListener n = this.f10019m.mo9545n();
                if (n != null) {
                    C1697X.m7688A();
                    C3348og.m13242a((View) this, n);
                }
                ViewTreeObserver.OnScrollChangedListener o = this.f10019m.mo9546o();
                if (o != null) {
                    C1697X.m7688A();
                    C3348og.m13243a((View) this, o);
                }
                this.f10032z = true;
            }
            m13343c();
            z = true;
        }
        m13342c(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.f10007J.mo9931b();
            }
            super.onDetachedFromWindow();
            if (this.f10032z && this.f10019m != null && this.f10019m.mo9544m() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                ViewTreeObserver.OnGlobalLayoutListener n = this.f10019m.mo9545n();
                if (n != null) {
                    C1697X.m7700g().mo9720a(getViewTreeObserver(), n);
                }
                ViewTreeObserver.OnScrollChangedListener o = this.f10019m.mo9546o();
                if (o != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(o);
                }
                this.f10032z = false;
            }
        }
        m13342c(false);
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
        if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
            super.onDraw(canvas);
            C3174ii iiVar = this.f10019m;
            if (iiVar != null && iiVar.mo9547p() != null) {
                this.f10019m.mo9547p().mo7037a();
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
        boolean c = m13343c();
        C1771c Ya = mo8137Ya();
        if (Ya != null && c) {
            Ya.mo7000fc();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01a7 A[SYNTHETIC, Splitter:B:97:0x01a7] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:52:0x00b5=Splitter:B:52:0x00b5, B:104:0x01bd=Splitter:B:104:0x01bd} */
    @android.annotation.SuppressLint({"DrawAllocation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.isDestroyed()     // Catch:{ all -> 0x01c2 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r0 = r7.isInEditMode()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x01bd
            boolean r0 = r7.f10024r     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x01bd
            com.google.android.gms.internal.ads.hi r0 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo9498e()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01bd
        L_0x0021:
            com.google.android.gms.internal.ads.hi r0 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo9499f()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x006b
            com.google.android.gms.internal.ads.Kh r0 = r7.mo8174jb()     // Catch:{ all -> 0x01c2 }
            r1 = 0
            if (r0 == 0) goto L_0x0035
            float r0 = r0.mo8409ba()     // Catch:{ all -> 0x01c2 }
            goto L_0x0036
        L_0x0035:
            r0 = r1
        L_0x0036:
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x003f
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x003f:
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
            float r1 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r1 = r1 * r0
            int r1 = (int) r1     // Catch:{ all -> 0x01c2 }
            float r2 = (float) r8     // Catch:{ all -> 0x01c2 }
            float r2 = r2 / r0
            int r2 = (int) r2     // Catch:{ all -> 0x01c2 }
            if (r9 != 0) goto L_0x0056
            if (r2 == 0) goto L_0x0056
            float r9 = (float) r2     // Catch:{ all -> 0x01c2 }
            float r9 = r9 * r0
            int r1 = (int) r9     // Catch:{ all -> 0x01c2 }
            r9 = r2
            goto L_0x005e
        L_0x0056:
            if (r8 != 0) goto L_0x005e
            if (r1 == 0) goto L_0x005e
            float r8 = (float) r1     // Catch:{ all -> 0x01c2 }
            float r8 = r8 / r0
            int r2 = (int) r8     // Catch:{ all -> 0x01c2 }
            r8 = r1
        L_0x005e:
            int r8 = java.lang.Math.min(r1, r8)     // Catch:{ all -> 0x01c2 }
            int r9 = java.lang.Math.min(r2, r9)     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x006b:
            com.google.android.gms.internal.ads.hi r0 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo9496a()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x00ba
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7885ed     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r1.mo8515a(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x00b5
            boolean r0 = com.google.android.gms.common.util.C2092n.m9164e()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x008c
            goto L_0x00b5
        L_0x008c:
            java.lang.String r0 = "/contentHeight"
            com.google.android.gms.internal.ads.qi r1 = new com.google.android.gms.internal.ads.qi     // Catch:{ all -> 0x01c2 }
            r1.<init>(r7)     // Catch:{ all -> 0x01c2 }
            r7.mo8157b((java.lang.String) r0, (com.google.android.gms.ads.internal.gmsg.C1718E<? super com.google.android.gms.internal.ads.C3520uh>) r1)     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r7.mo7966a((java.lang.String) r0)     // Catch:{ all -> 0x01c2 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r0 = r7.f10000C     // Catch:{ all -> 0x01c2 }
            r1 = -1
            if (r0 == r1) goto L_0x00ac
            int r9 = r7.f10000C     // Catch:{ all -> 0x01c2 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r0 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r9 = r9 * r0
            int r9 = (int) r9     // Catch:{ all -> 0x01c2 }
            goto L_0x00b0
        L_0x00ac:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
        L_0x00b0:
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00b5:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00ba:
            com.google.android.gms.internal.ads.hi r0 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            boolean r0 = r0.mo9497d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x00d9
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics     // Catch:{ all -> 0x01c2 }
            r8.<init>()     // Catch:{ all -> 0x01c2 }
            android.view.WindowManager r9 = r7.f10014Q     // Catch:{ all -> 0x01c2 }
            android.view.Display r9 = r9.getDefaultDisplay()     // Catch:{ all -> 0x01c2 }
            r9.getMetrics(r8)     // Catch:{ all -> 0x01c2 }
            int r9 = r8.widthPixels     // Catch:{ all -> 0x01c2 }
            int r8 = r8.heightPixels     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r9, r8)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x00d9:
            int r0 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x01c2 }
            int r8 = android.view.View.MeasureSpec.getSize(r8)     // Catch:{ all -> 0x01c2 }
            int r2 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01c2 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01c2 }
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r4) goto L_0x00f7
            if (r0 != r3) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r0 = r5
            goto L_0x00f8
        L_0x00f7:
            r0 = r8
        L_0x00f8:
            if (r2 == r4) goto L_0x00fc
            if (r2 != r3) goto L_0x00fd
        L_0x00fc:
            r5 = r9
        L_0x00fd:
            com.google.android.gms.internal.ads.hi r2 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f9425c     // Catch:{ all -> 0x01c2 }
            r3 = 1
            if (r2 > r0) goto L_0x010d
            com.google.android.gms.internal.ads.hi r2 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f9424b     // Catch:{ all -> 0x01c2 }
            if (r2 <= r5) goto L_0x010b
            goto L_0x010d
        L_0x010b:
            r2 = r1
            goto L_0x010e
        L_0x010d:
            r2 = r3
        L_0x010e:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C2558Nu.f7709Ae     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.Lu r6 = com.google.android.gms.internal.ads.C3390pt.m13458f()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r4 = r6.mo8515a(r4)     // Catch:{ all -> 0x01c2 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01c2 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01c2 }
            if (r4 == 0) goto L_0x0145
            com.google.android.gms.internal.ads.hi r4 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r4 = r4.f9425c     // Catch:{ all -> 0x01c2 }
            float r4 = (float) r4     // Catch:{ all -> 0x01c2 }
            float r6 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r4 = r4 / r6
            float r0 = (float) r0     // Catch:{ all -> 0x01c2 }
            float r6 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r0 = r0 / r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0141
            com.google.android.gms.internal.ads.hi r0 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r0 = r0.f9424b     // Catch:{ all -> 0x01c2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r0 = r0 / r4
            float r4 = (float) r5     // Catch:{ all -> 0x01c2 }
            float r5 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r4 = r4 / r5
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0141
            goto L_0x0142
        L_0x0141:
            r3 = r1
        L_0x0142:
            if (r2 == 0) goto L_0x0145
            r2 = r3
        L_0x0145:
            r0 = 8
            if (r2 == 0) goto L_0x01a7
            com.google.android.gms.internal.ads.hi r2 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r2 = r2.f9425c     // Catch:{ all -> 0x01c2 }
            float r2 = (float) r2     // Catch:{ all -> 0x01c2 }
            float r3 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r2 = r2 / r3
            int r2 = (int) r2     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.hi r3 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r3 = r3.f9424b     // Catch:{ all -> 0x01c2 }
            float r3 = (float) r3     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01c2 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r8 = r8 / r4
            int r8 = (int) r8     // Catch:{ all -> 0x01c2 }
            float r9 = (float) r9     // Catch:{ all -> 0x01c2 }
            float r4 = r7.f10012O     // Catch:{ all -> 0x01c2 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01c2 }
            r4 = 103(0x67, float:1.44E-43)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r5.<init>(r4)     // Catch:{ all -> 0x01c2 }
            java.lang.String r4 = "Not enough space to show ad. Needs "
            r5.append(r4)     // Catch:{ all -> 0x01c2 }
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = "x"
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            r5.append(r3)     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = " dp, but only has "
            r5.append(r2)     // Catch:{ all -> 0x01c2 }
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = "x"
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            r5.append(r9)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = " dp."
            r5.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r8)     // Catch:{ all -> 0x01c2 }
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c2 }
            if (r8 == r0) goto L_0x01a2
            r8 = 4
            r7.setVisibility(r8)     // Catch:{ all -> 0x01c2 }
        L_0x01a2:
            r7.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01a7:
            int r8 = r7.getVisibility()     // Catch:{ all -> 0x01c2 }
            if (r8 == r0) goto L_0x01b0
            r7.setVisibility(r1)     // Catch:{ all -> 0x01c2 }
        L_0x01b0:
            com.google.android.gms.internal.ads.hi r8 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r8 = r8.f9425c     // Catch:{ all -> 0x01c2 }
            com.google.android.gms.internal.ads.hi r9 = r7.f10021o     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f9424b     // Catch:{ all -> 0x01c2 }
            r7.setMeasuredDimension(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01bd:
            super.onMeasure(r8, r9)     // Catch:{ all -> 0x01c2 }
            monitor-exit(r7)
            return
        L_0x01c2:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3378pi.onMeasure(int, int):void");
    }

    public final void onPause() {
        try {
            if (C2092n.m9160a()) {
                super.onPause();
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Could not pause webview.", e);
        }
    }

    public final void onResume() {
        try {
            if (C2092n.m9160a()) {
                super.onResume();
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Could not resume webview.", e);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f10019m.mo9544m()) {
            synchronized (this) {
                if (this.f9998A != null) {
                    this.f9998A.mo7852a(motionEvent);
                }
            }
        } else {
            C2209Bp bp = this.f10015i;
            if (bp != null) {
                bp.mo7870a(motionEvent);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: pb */
    public final synchronized String mo8190pb() {
        return this.f10022p;
    }

    /* renamed from: qb */
    public final synchronized boolean mo8191qb() {
        return this.f9999B > 0;
    }

    /* renamed from: rb */
    public final synchronized C3146hi mo8192rb() {
        return this.f10021o;
    }

    /* renamed from: sb */
    public final synchronized boolean mo8193sb() {
        return this.f10028v;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f10005H = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public final synchronized void setRequestedOrientation(int i) {
        this.f10026t = i;
        if (this.f10020n != null) {
            this.f10020n.setRequestedOrientation(this.f10026t);
        }
    }

    public final void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception e) {
            C2227Cf.m9533b("Could not stop loading webview.", e);
        }
    }

    /* renamed from: tb */
    public final synchronized C1771c mo8200tb() {
        return this.f10006I;
    }

    /* renamed from: ub */
    public final zzang mo8201ub() {
        return this.f10016j;
    }

    /* renamed from: vb */
    public final synchronized boolean mo8202vb() {
        return this.f10027u;
    }

    /* renamed from: wb */
    public final void mo8203wb() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(C1697X.m7691D().mo10232b()));
        hashMap.put("app_volume", String.valueOf(C1697X.m7691D().mo10229a()));
        hashMap.put("device_volume", String.valueOf(C3631ye.m14576a(getContext())));
        C3309my.m13110a((C3281ly) this, "volume", (Map) hashMap);
    }

    /* renamed from: xb */
    public final C2875Yu mo8204xb() {
        return this.f10002E;
    }

    /* renamed from: yb */
    public final C2484Lg mo8205yb() {
        return null;
    }

    /* renamed from: zb */
    public final synchronized String mo8206zb() {
        return this.f10029w;
    }
}
