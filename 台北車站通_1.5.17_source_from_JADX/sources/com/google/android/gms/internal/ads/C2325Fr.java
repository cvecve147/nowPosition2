package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.util.C2092n;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@TargetApi(14)
@C2478La
/* renamed from: com.google.android.gms.internal.ads.Fr */
public final class C2325Fr extends Thread {

    /* renamed from: a */
    private boolean f7010a = false;

    /* renamed from: b */
    private boolean f7011b = false;

    /* renamed from: c */
    private boolean f7012c = false;

    /* renamed from: d */
    private final Object f7013d;

    /* renamed from: e */
    private final C2183Ar f7014e;

    /* renamed from: f */
    private final C2422Ja f7015f;

    /* renamed from: g */
    private final int f7016g;

    /* renamed from: h */
    private final int f7017h;

    /* renamed from: i */
    private final int f7018i;

    /* renamed from: j */
    private final int f7019j;

    /* renamed from: k */
    private final int f7020k;

    /* renamed from: l */
    private final int f7021l;

    /* renamed from: m */
    private final int f7022m;

    /* renamed from: n */
    private final int f7023n;

    /* renamed from: o */
    private final String f7024o;

    /* renamed from: p */
    private final boolean f7025p;

    public C2325Fr(C2183Ar ar, C2422Ja ja) {
        this.f7014e = ar;
        this.f7015f = ja;
        this.f7013d = new Object();
        this.f7017h = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7924la)).intValue();
        this.f7018i = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7930ma)).intValue();
        this.f7019j = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7936na)).intValue();
        this.f7020k = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7942oa)).intValue();
        this.f7021l = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7960ra)).intValue();
        this.f7022m = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7972ta)).intValue();
        this.f7023n = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7978ua)).intValue();
        this.f7016g = ((Integer) C3390pt.m13458f().mo8515a(C2558Nu.f7948pa)).intValue();
        this.f7024o = (String) C3390pt.m13458f().mo8515a(C2558Nu.f7990wa);
        this.f7025p = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f8002ya)).booleanValue();
        setName("ContentFetchTask");
    }

    /* renamed from: a */
    private final C2439Jr m9808a(View view, C3673zr zrVar) {
        boolean z;
        if (view == null) {
            return new C2439Jr(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C2439Jr(this, 0, 0);
            }
            zrVar.mo10272b(text.toString(), globalVisibleRect, view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
            return new C2439Jr(this, 1, 0);
        } else if ((view instanceof WebView) && !(view instanceof C3520uh)) {
            zrVar.mo10279h();
            WebView webView = (WebView) view;
            if (!C2092n.m9166g()) {
                z = false;
            } else {
                zrVar.mo10279h();
                webView.post(new C2383Hr(this, zrVar, webView, globalVisibleRect));
                z = true;
            }
            return z ? new C2439Jr(this, 0, 1) : new C2439Jr(this, 0, 0);
        } else if (!(view instanceof ViewGroup)) {
            return new C2439Jr(this, 0, 0);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                C2439Jr a = m9808a(viewGroup.getChildAt(i3), zrVar);
                i += a.f7382a;
                i2 += a.f7383b;
            }
            return new C2439Jr(this, i, i2);
        }
    }

    /* renamed from: e */
    private static boolean m9809e() {
        try {
            Context b = C1697X.m7701h().mo7877b();
            if (b == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) b.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) b.getSystemService("keyguard");
            if (activityManager == null) {
                return false;
            }
            if (keyguardManager == null) {
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (Process.myPid() == next.pid) {
                    if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) b.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            C1697X.m7702i().mo8319a(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    /* renamed from: f */
    private final void m9810f() {
        synchronized (this.f7013d) {
            this.f7011b = true;
            boolean z = this.f7011b;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(z);
            C2227Cf.m9532b(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo8094a() {
        synchronized (this.f7013d) {
            this.f7011b = false;
            this.f7013d.notifyAll();
            C2227Cf.m9532b("ContentFetchThread: wakeup");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8095a(View view) {
        try {
            C3673zr zrVar = new C3673zr(this.f7017h, this.f7018i, this.f7019j, this.f7020k, this.f7021l, this.f7022m, this.f7023n);
            Context b = C1697X.m7701h().mo7877b();
            if (b != null && !TextUtils.isEmpty(this.f7024o)) {
                String str = (String) view.getTag(b.getResources().getIdentifier((String) C3390pt.m13458f().mo8515a(C2558Nu.f7984va), "id", b.getPackageName()));
                if (str != null && str.equals(this.f7024o)) {
                    return;
                }
            }
            C2439Jr a = m9808a(view, zrVar);
            zrVar.mo10281i();
            if (a.f7382a != 0 || a.f7383b != 0) {
                if (a.f7383b != 0 || zrVar.mo10282j() != 0) {
                    if (a.f7383b != 0 || !this.f7014e.mo7844a(zrVar)) {
                        this.f7014e.mo7846c(zrVar);
                    }
                }
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Exception in fetchContentOnUIThread", e);
            this.f7015f.mo8063a(e, "ContentFetchTask.fetchContent");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8096a(C3673zr zrVar, WebView webView, String str, boolean z) {
        zrVar.mo10278g();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (this.f7025p || TextUtils.isEmpty(webView.getTitle())) {
                    zrVar.mo10270a(optString, z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zrVar.mo10270a(sb.toString(), z, webView.getX(), webView.getY(), (float) webView.getWidth(), (float) webView.getHeight());
                }
            }
            if (zrVar.mo10273c()) {
                this.f7014e.mo7845b(zrVar);
            }
        } catch (JSONException unused) {
            C2227Cf.m9532b("Json string may be malformed.");
        } catch (Throwable th) {
            C2227Cf.m9530a("Failed to get webview content.", th);
            this.f7015f.mo8063a(th, "ContentFetchTask.processWebViewContent");
        }
    }

    /* renamed from: b */
    public final void mo8097b() {
        synchronized (this.f7013d) {
            if (this.f7010a) {
                C2227Cf.m9532b("Content hash thread already started, quiting...");
                return;
            }
            this.f7010a = true;
            start();
        }
    }

    /* renamed from: c */
    public final C3673zr mo8098c() {
        return this.f7014e.mo7843a();
    }

    /* renamed from: d */
    public final boolean mo8099d() {
        return this.f7011b;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r4 = this;
        L_0x0000:
            boolean r0 = m9809e()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.Br r0 = com.google.android.gms.ads.internal.C1697X.m7701h()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            android.app.Activity r0 = r0.mo7874a()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x0015:
            r4.m9810f()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0019:
            if (r0 == 0) goto L_0x005f
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r2 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r2 = r2.getDecorView()     // Catch:{ Exception -> 0x003d }
            if (r2 == 0) goto L_0x004c
            android.view.Window r0 = r0.getWindow()     // Catch:{ Exception -> 0x003d }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x003d }
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x003d }
            r1 = r0
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            com.google.android.gms.internal.ads.Id r2 = com.google.android.gms.ads.internal.C1697X.m7702i()     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.mo8319a((java.lang.Throwable) r0, (java.lang.String) r3)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
        L_0x004c:
            if (r1 == 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.ads.Gr r0 = new com.google.android.gms.internal.ads.Gr     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r0.<init>(r4, r1)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            r1.post(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x005f
        L_0x0059:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x0015
        L_0x005f:
            int r0 = r4.f7016g     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0076, Exception -> 0x0068 }
            goto L_0x007c
        L_0x0068:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r1, r0)
            com.google.android.gms.internal.ads.Ja r1 = r4.f7015f
            java.lang.String r2 = "ContentFetchTask.run"
            r1.mo8063a(r0, r2)
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.internal.ads.C2227Cf.m9533b(r1, r0)
        L_0x007c:
            java.lang.Object r0 = r4.f7013d
            monitor-enter(r0)
        L_0x007f:
            boolean r1 = r4.f7011b     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.internal.ads.C2227Cf.m9532b(r1)     // Catch:{ InterruptedException -> 0x007f }
            java.lang.Object r1 = r4.f7013d     // Catch:{ InterruptedException -> 0x007f }
            r1.wait()     // Catch:{ InterruptedException -> 0x007f }
            goto L_0x007f
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x0000
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2325Fr.run():void");
    }
}
