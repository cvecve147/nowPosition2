package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.C1697X;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.ui */
public class C3521ui extends C3435ri {

    /* renamed from: g */
    private boolean f10296g;

    /* renamed from: h */
    private boolean f10297h;

    public C3521ui(C3118gi giVar) {
        super(giVar);
        C1697X.m7702i().mo8330j();
    }

    /* renamed from: c */
    private final synchronized void m14066c() {
        if (!this.f10297h) {
            this.f10297h = true;
            C1697X.m7702i().mo8331k();
        }
    }

    /* renamed from: _a */
    public final synchronized void mo10077_a() {
        C2857Yd.m11615f("Destroying WebView!");
        m14066c();
        C2972bg.f8938a.execute(new C3551vi(this));
    }

    /* renamed from: a */
    public final synchronized void mo7819a(C3492ti tiVar) {
        if (isDestroyed()) {
            C2857Yd.m11615f("Blank page loaded, 1...");
            mo10077_a();
            return;
        }
        super.mo7819a(tiVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo10078b() {
        super.destroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9881b(boolean z) {
    }

    public synchronized void destroy() {
        if (!this.f10296g) {
            this.f10296g = true;
            mo9881b(false);
            C2857Yd.m11615f("Initiating WebView self destruct sequence in 3...");
            C2857Yd.m11615f("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                C1697X.m7702i().mo8319a((Throwable) e, "AdWebViewImpl.loadUrlUnsafe");
                C2227Cf.m9537d("#007 Could not call remote method.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        return;
     */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void evaluateJavascript(java.lang.String r2, android.webkit.ValueCallback<java.lang.String> r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isDestroyed()     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            java.lang.String r2 = "#004 The webview is destroyed. Ignoring action."
            com.google.android.gms.internal.ads.C2227Cf.m9536d(r2)     // Catch:{ all -> 0x0019 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3521ui.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    mo9881b(true);
                }
                m14066c();
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final synchronized boolean isDestroyed() {
        return this.f10296g;
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            C2227Cf.m9536d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!isDestroyed()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!isDestroyed()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!isDestroyed()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    public void stopLoading() {
        if (!isDestroyed()) {
            super.stopLoading();
        }
    }
}
