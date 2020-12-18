package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C1697X;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Nq */
public final class C2554Nq implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    private final Object f7663a = new Object();

    /* renamed from: b */
    private final WeakReference<C2254Dd> f7664b;

    /* renamed from: c */
    private WeakReference<ViewTreeObserver> f7665c;

    /* renamed from: d */
    private final C3644yr f7666d;

    /* renamed from: e */
    protected final C2496Lq f7667e;

    /* renamed from: f */
    private final Context f7668f;

    /* renamed from: g */
    private final WindowManager f7669g;

    /* renamed from: h */
    private final PowerManager f7670h;

    /* renamed from: i */
    private final KeyguardManager f7671i;

    /* renamed from: j */
    private final DisplayMetrics f7672j;

    /* renamed from: k */
    private C2788Vq f7673k;

    /* renamed from: l */
    private boolean f7674l;

    /* renamed from: m */
    private boolean f7675m = false;

    /* renamed from: n */
    private boolean f7676n = false;

    /* renamed from: o */
    private boolean f7677o;

    /* renamed from: p */
    private boolean f7678p;

    /* renamed from: q */
    private boolean f7679q;

    /* renamed from: r */
    private BroadcastReceiver f7680r;

    /* renamed from: s */
    private final HashSet<C2466Kq> f7681s = new HashSet<>();

    /* renamed from: t */
    private C3115gf f7682t;

    /* renamed from: u */
    private final HashSet<C3183ir> f7683u = new HashSet<>();

    /* renamed from: v */
    private final Rect f7684v = new Rect();

    /* renamed from: w */
    private final C2645Qq f7685w;

    /* renamed from: x */
    private float f7686x;

    public C2554Nq(Context context, zzjn zzjn, C2254Dd dd, zzang zzang, C3644yr yrVar) {
        this.f7664b = new WeakReference<>(dd);
        this.f7666d = yrVar;
        this.f7665c = new WeakReference<>((Object) null);
        this.f7677o = true;
        this.f7679q = false;
        this.f7682t = new C3115gf(200);
        this.f7667e = new C2496Lq(UUID.randomUUID().toString(), zzang, zzjn.f10893a, dd.f6872k, dd.mo7978a(), zzjn.f10900h);
        this.f7669g = (WindowManager) context.getSystemService("window");
        this.f7670h = (PowerManager) context.getApplicationContext().getSystemService("power");
        this.f7671i = (KeyguardManager) context.getSystemService("keyguard");
        this.f7668f = context;
        this.f7685w = new C2645Qq(this, new Handler());
        this.f7668f.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f7685w);
        this.f7672j = context.getResources().getDisplayMetrics();
        Display defaultDisplay = this.f7669g.getDefaultDisplay();
        this.f7684v.right = defaultDisplay.getWidth();
        this.f7684v.bottom = defaultDisplay.getHeight();
        mo8594d();
    }

    /* renamed from: a */
    private static int m10745a(int i, DisplayMetrics displayMetrics) {
        return (int) (((float) i) / displayMetrics.density);
    }

    /* renamed from: a */
    private final JSONObject m10746a(View view, Boolean bool) {
        View view2 = view;
        if (view2 == null) {
            return m10752j().put("isAttachedToWindow", false).put("isScreenOn", m10749g()).put("isVisible", false);
        }
        boolean a = C1697X.m7700g().mo9723a(view2);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        try {
            view2.getLocationOnScreen(iArr);
            view2.getLocationInWindow(iArr2);
        } catch (Exception e) {
            C2227Cf.m9533b("Failure getting view location.", e);
        }
        Rect rect = new Rect();
        rect.left = iArr[0];
        rect.top = iArr[1];
        rect.right = rect.left + view.getWidth();
        rect.bottom = rect.top + view.getHeight();
        Rect rect2 = new Rect();
        boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2, (Point) null);
        Rect rect3 = new Rect();
        boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
        Rect rect4 = new Rect();
        view2.getHitRect(rect4);
        JSONObject j = m10752j();
        String str = "isVisible";
        JSONObject jSONObject = j;
        j.put("windowVisibility", view.getWindowVisibility()).put("isAttachedToWindow", a).put("viewBox", new JSONObject().put("top", m10745a(this.f7684v.top, this.f7672j)).put("bottom", m10745a(this.f7684v.bottom, this.f7672j)).put("left", m10745a(this.f7684v.left, this.f7672j)).put("right", m10745a(this.f7684v.right, this.f7672j))).put("adBox", new JSONObject().put("top", m10745a(rect.top, this.f7672j)).put("bottom", m10745a(rect.bottom, this.f7672j)).put("left", m10745a(rect.left, this.f7672j)).put("right", m10745a(rect.right, this.f7672j))).put("globalVisibleBox", new JSONObject().put("top", m10745a(rect2.top, this.f7672j)).put("bottom", m10745a(rect2.bottom, this.f7672j)).put("left", m10745a(rect2.left, this.f7672j)).put("right", m10745a(rect2.right, this.f7672j))).put("globalVisibleBoxVisible", globalVisibleRect).put("localVisibleBox", new JSONObject().put("top", m10745a(rect3.top, this.f7672j)).put("bottom", m10745a(rect3.bottom, this.f7672j)).put("left", m10745a(rect3.left, this.f7672j)).put("right", m10745a(rect3.right, this.f7672j))).put("localVisibleBoxVisible", localVisibleRect).put("hitBox", new JSONObject().put("top", m10745a(rect4.top, this.f7672j)).put("bottom", m10745a(rect4.bottom, this.f7672j)).put("left", m10745a(rect4.left, this.f7672j)).put("right", m10745a(rect4.right, this.f7672j))).put("screenDensity", (double) this.f7672j.density);
        Boolean valueOf = bool == null ? Boolean.valueOf(C1697X.m7698e().mo9453a(view2, this.f7670h, this.f7671i)) : bool;
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put(str, valueOf.booleanValue());
        return jSONObject2;
    }

    /* renamed from: a */
    private static JSONObject m10747a(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m10748a(JSONObject jSONObject, boolean z) {
        try {
            JSONObject a = m10747a(jSONObject);
            ArrayList arrayList = new ArrayList(this.f7683u);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C3183ir) obj).mo9007a(a, z);
            }
        } catch (Throwable th) {
            C2227Cf.m9533b("Skipping active view message.", th);
        }
    }

    /* renamed from: g */
    private final boolean m10749g() {
        return Build.VERSION.SDK_INT >= 20 ? this.f7670h.isInteractive() : this.f7670h.isScreenOn();
    }

    /* renamed from: h */
    private final void m10750h() {
        C2788Vq vq = this.f7673k;
        if (vq != null) {
            vq.mo8549a(this);
        }
    }

    /* renamed from: i */
    private final void m10751i() {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f7665c.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this);
            viewTreeObserver.removeGlobalOnLayoutListener(this);
        }
    }

    /* renamed from: j */
    private final JSONObject m10752j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("afmaVersion", this.f7667e.mo8507b()).put("activeViewJSON", this.f7667e.mo8508c()).put("timestamp", C1697X.m7705l().mo7726b()).put("adFormat", this.f7667e.mo8506a()).put("hashCode", this.f7667e.mo8509d()).put("isMraid", this.f7667e.mo8510e()).put("isStopped", this.f7676n).put("isPaused", this.f7675m).put("isNative", this.f7667e.mo8511f()).put("isScreenOn", m10749g()).put("appMuted", C1697X.m7691D().mo10232b()).put("appVolume", (double) C1697X.m7691D().mo10229a()).put("deviceVolume", (double) this.f7686x);
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo8583a() {
        synchronized (this.f7663a) {
            this.f7675m = true;
            mo8584a(3);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00cf, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8584a(int r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f7663a
            monitor-enter(r0)
            java.util.HashSet<com.google.android.gms.internal.ads.ir> r1 = r7.f7683u     // Catch:{ all -> 0x00d0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x0009:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d0 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.ads.ir r2 = (com.google.android.gms.internal.ads.C3183ir) r2     // Catch:{ all -> 0x00d0 }
            boolean r2 = r2.mo9008a()     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0009
            r1 = r4
            goto L_0x0020
        L_0x001f:
            r1 = r3
        L_0x0020:
            if (r1 == 0) goto L_0x00ce
            boolean r1 = r7.f7677o     // Catch:{ all -> 0x00d0 }
            if (r1 != 0) goto L_0x0028
            goto L_0x00ce
        L_0x0028:
            com.google.android.gms.internal.ads.yr r1 = r7.f7666d     // Catch:{ all -> 0x00d0 }
            android.view.View r1 = r1.mo8697c()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0040
            com.google.android.gms.internal.ads.ge r2 = com.google.android.gms.ads.internal.C1697X.m7698e()     // Catch:{ all -> 0x00d0 }
            android.os.PowerManager r5 = r7.f7670h     // Catch:{ all -> 0x00d0 }
            android.app.KeyguardManager r6 = r7.f7671i     // Catch:{ all -> 0x00d0 }
            boolean r2 = r2.mo9453a((android.view.View) r1, (android.os.PowerManager) r5, (android.app.KeyguardManager) r6)     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x0040
            r2 = r4
            goto L_0x0041
        L_0x0040:
            r2 = r3
        L_0x0041:
            if (r1 == 0) goto L_0x0053
            if (r2 == 0) goto L_0x0053
            android.graphics.Rect r5 = new android.graphics.Rect     // Catch:{ all -> 0x00d0 }
            r5.<init>()     // Catch:{ all -> 0x00d0 }
            r6 = 0
            boolean r5 = r1.getGlobalVisibleRect(r5, r6)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x0053
            r5 = r4
            goto L_0x0054
        L_0x0053:
            r5 = r3
        L_0x0054:
            com.google.android.gms.internal.ads.yr r6 = r7.f7666d     // Catch:{ all -> 0x00d0 }
            boolean r6 = r6.mo8695a()     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x0061
            r7.mo8595e()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return
        L_0x0061:
            if (r8 != r4) goto L_0x0071
            com.google.android.gms.internal.ads.gf r6 = r7.f7682t     // Catch:{ all -> 0x00d0 }
            boolean r6 = r6.mo9462a()     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x0071
            boolean r6 = r7.f7679q     // Catch:{ all -> 0x00d0 }
            if (r5 != r6) goto L_0x0071
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return
        L_0x0071:
            if (r5 != 0) goto L_0x007b
            boolean r6 = r7.f7679q     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x007b
            if (r8 != r4) goto L_0x007b
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return
        L_0x007b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)     // Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
            org.json.JSONObject r8 = r7.m10746a((android.view.View) r1, (java.lang.Boolean) r8)     // Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
            r7.m10748a((org.json.JSONObject) r8, (boolean) r3)     // Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
            r7.f7679q = r5     // Catch:{ JSONException -> 0x008b, RuntimeException -> 0x0089 }
            goto L_0x0091
        L_0x0089:
            r8 = move-exception
            goto L_0x008c
        L_0x008b:
            r8 = move-exception
        L_0x008c:
            java.lang.String r1 = "Active view update failed."
            com.google.android.gms.internal.ads.C2227Cf.m9530a(r1, r8)     // Catch:{ all -> 0x00d0 }
        L_0x0091:
            com.google.android.gms.internal.ads.yr r8 = r7.f7666d     // Catch:{ all -> 0x00d0 }
            com.google.android.gms.internal.ads.yr r8 = r8.mo8696b()     // Catch:{ all -> 0x00d0 }
            android.view.View r8 = r8.mo8697c()     // Catch:{ all -> 0x00d0 }
            if (r8 == 0) goto L_0x00c9
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r1 = r7.f7665c     // Catch:{ all -> 0x00d0 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00d0 }
            android.view.ViewTreeObserver r1 = (android.view.ViewTreeObserver) r1     // Catch:{ all -> 0x00d0 }
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()     // Catch:{ all -> 0x00d0 }
            if (r8 == r1) goto L_0x00c9
            r7.m10751i()     // Catch:{ all -> 0x00d0 }
            boolean r2 = r7.f7674l     // Catch:{ all -> 0x00d0 }
            if (r2 == 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00c2
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00c2
        L_0x00ba:
            r7.f7674l = r4     // Catch:{ all -> 0x00d0 }
            r8.addOnScrollChangedListener(r7)     // Catch:{ all -> 0x00d0 }
            r8.addOnGlobalLayoutListener(r7)     // Catch:{ all -> 0x00d0 }
        L_0x00c2:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00d0 }
            r1.<init>(r8)     // Catch:{ all -> 0x00d0 }
            r7.f7665c = r1     // Catch:{ all -> 0x00d0 }
        L_0x00c9:
            r7.m10750h()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return
        L_0x00ce:
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            return
        L_0x00d0:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d0 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2554Nq.mo8584a(int):void");
    }

    /* renamed from: a */
    public final void mo8585a(C2788Vq vq) {
        synchronized (this.f7663a) {
            this.f7673k = vq;
        }
    }

    /* renamed from: a */
    public final void mo8586a(C3183ir irVar) {
        if (this.f7683u.isEmpty()) {
            synchronized (this.f7663a) {
                if (this.f7680r == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    this.f7680r = new C2586Oq(this);
                    C1697X.m7692E().mo9787a(this.f7668f, this.f7680r, intentFilter);
                }
            }
            mo8584a(3);
        }
        this.f7683u.add(irVar);
        try {
            irVar.mo9007a(m10747a(m10746a(this.f7666d.mo8697c(), (Boolean) null)), false);
        } catch (JSONException e) {
            C2227Cf.m9533b("Skipping measurement update for new client.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8587a(C3183ir irVar, Map<String, String> map) {
        String valueOf = String.valueOf(this.f7667e.mo8509d());
        C2227Cf.m9532b(valueOf.length() != 0 ? "Received request to untrack: ".concat(valueOf) : new String("Received request to untrack: "));
        mo8590b(irVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo8588a(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(this.f7667e.mo8509d());
    }

    /* renamed from: b */
    public final void mo8589b() {
        synchronized (this.f7663a) {
            this.f7675m = false;
            mo8584a(3);
        }
    }

    /* renamed from: b */
    public final void mo8590b(C3183ir irVar) {
        this.f7683u.remove(irVar);
        irVar.mo9009b();
        if (this.f7683u.isEmpty()) {
            synchronized (this.f7663a) {
                m10751i();
                synchronized (this.f7663a) {
                    if (this.f7680r != null) {
                        try {
                            C1697X.m7692E().mo9786a(this.f7668f, this.f7680r);
                        } catch (IllegalStateException e) {
                            C2227Cf.m9533b("Failed trying to unregister the receiver", e);
                        } catch (Exception e2) {
                            C1697X.m7702i().mo8319a((Throwable) e2, "ActiveViewUnit.stopScreenStatusMonitoring");
                        }
                        this.f7680r = null;
                    }
                }
                this.f7668f.getContentResolver().unregisterContentObserver(this.f7685w);
                int i = 0;
                this.f7677o = false;
                m10750h();
                ArrayList arrayList = new ArrayList(this.f7683u);
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    mo8590b((C3183ir) obj);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8591b(Map<String, String> map) {
        mo8584a(3);
    }

    /* renamed from: c */
    public final void mo8592c() {
        synchronized (this.f7663a) {
            this.f7676n = true;
            mo8584a(3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8593c(Map<String, String> map) {
        if (map.containsKey("isVisible")) {
            boolean z = "1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible"));
            Iterator<C2466Kq> it = this.f7681s.iterator();
            while (it.hasNext()) {
                it.next().mo8459a(this, z);
            }
        }
    }

    /* renamed from: d */
    public final void mo8594d() {
        this.f7686x = C3631ye.m14576a(this.f7668f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8595e() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f7663a
            monitor-enter(r0)
            boolean r1 = r5.f7677o     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0044
            r1 = 1
            r5.f7678p = r1     // Catch:{ all -> 0x0046 }
            org.json.JSONObject r2 = r5.m10752j()     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            java.lang.String r3 = "doneReasonCode"
            java.lang.String r4 = "u"
            r2.put(r3, r4)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            r5.m10748a((org.json.JSONObject) r2, (boolean) r1)     // Catch:{ JSONException -> 0x0020, RuntimeException -> 0x0019 }
            goto L_0x0024
        L_0x0019:
            r1 = move-exception
            java.lang.String r2 = "Failure while processing active view data."
        L_0x001c:
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r2, r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0024
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = "JSON failure while processing active view data."
            goto L_0x001c
        L_0x0024:
            java.lang.String r1 = "Untracking ad unit: "
            com.google.android.gms.internal.ads.Lq r2 = r5.f7667e     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r2.mo8509d()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0046 }
            int r3 = r2.length()     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x003b
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0041
        L_0x003b:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0046 }
            r2.<init>(r1)     // Catch:{ all -> 0x0046 }
            r1 = r2
        L_0x0041:
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ all -> 0x0046 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2554Nq.mo8595e():void");
    }

    /* renamed from: f */
    public final boolean mo8596f() {
        boolean z;
        synchronized (this.f7663a) {
            z = this.f7677o;
        }
        return z;
    }

    public final void onGlobalLayout() {
        mo8584a(2);
    }

    public final void onScrollChanged() {
        mo8584a(1);
    }
}
