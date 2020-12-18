package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.ads.internal.C1804ua;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Dy */
public final class C2275Dy {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f6926a;

    /* renamed from: b */
    private final Context f6927b;

    /* renamed from: c */
    private final String f6928c;

    /* renamed from: d */
    private final zzang f6929d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2482Le<C3452ry> f6930e;

    /* renamed from: f */
    private C2482Le<C3452ry> f6931f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2767Uy f6932g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f6933h;

    public C2275Dy(Context context, zzang zzang, String str) {
        this.f6926a = new Object();
        this.f6933h = 1;
        this.f6928c = str;
        this.f6927b = context.getApplicationContext();
        this.f6929d = zzang;
        this.f6930e = new C2625Py();
        this.f6931f = new C2625Py();
    }

    public C2275Dy(Context context, zzang zzang, String str, C2482Le<C3452ry> le, C2482Le<C3452ry> le2) {
        this(context, zzang, str);
        this.f6930e = le;
        this.f6931f = le2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C2767Uy mo8019a(C2209Bp bp) {
        C2767Uy uy = new C2767Uy(this.f6931f);
        C2972bg.f8938a.execute(new C2304Ey(this, bp, uy));
        uy.mo9535a(new C2532My(this, uy), new C2562Ny(this, uy));
        return uy;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo8020a(C2209Bp bp, C2767Uy uy) {
        try {
            Context context = this.f6927b;
            zzang zzang = this.f6929d;
            C3452ry cyVar = ((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7849Za)).booleanValue() ? new C3019cy(context, zzang) : new C3509ty(context, zzang, bp, (C1804ua) null);
            cyVar.mo9291a(new C2332Fy(this, uy, cyVar));
            cyVar.mo9186b("/jsLoaded", new C2418Iy(this, uy, cyVar));
            C3143hf hfVar = new C3143hf();
            C2446Jy jy = new C2446Jy(this, bp, cyVar, hfVar);
            hfVar.mo9494a(jy);
            cyVar.mo9186b("/requestReload", jy);
            if (this.f6928c.endsWith(".js")) {
                cyVar.mo9294d(this.f6928c);
            } else if (this.f6928c.startsWith("<html>")) {
                cyVar.mo9292b(this.f6928c);
            } else {
                cyVar.mo9293c(this.f6928c);
            }
            C3114ge.f9351a.postDelayed(new C2474Ky(this, uy, cyVar), (long) C2594Oy.f8084a);
        } catch (Throwable th) {
            C2227Cf.m9533b("Error creating webview.", th);
            C1697X.m7702i().mo8319a(th, "SdkJavascriptFactory.loadJavascriptEngine");
            uy.mo9735b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo8021a(com.google.android.gms.internal.ads.C2767Uy r4, com.google.android.gms.internal.ads.C3452ry r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6926a
            monitor-enter(r0)
            int r1 = r4.mo9734a()     // Catch:{ all -> 0x002a }
            r2 = -1
            if (r1 == r2) goto L_0x0028
            int r1 = r4.mo9734a()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            r4.mo9735b()     // Catch:{ all -> 0x002a }
            java.util.concurrent.Executor r4 = com.google.android.gms.internal.ads.C2972bg.f8938a     // Catch:{ all -> 0x002a }
            r5.getClass()     // Catch:{ all -> 0x002a }
            java.lang.Runnable r5 = com.google.android.gms.internal.ads.C2390Hy.m10228a(r5)     // Catch:{ all -> 0x002a }
            r4.execute(r5)     // Catch:{ all -> 0x002a }
            java.lang.String r4 = "Could not receive loaded message in a timely manner. Rejecting."
            com.google.android.gms.internal.ads.C2857Yd.m11615f(r4)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2275Dy.mo8021a(com.google.android.gms.internal.ads.Uy, com.google.android.gms.internal.ads.ry):void");
    }

    /* renamed from: b */
    public final C2653Qy mo8022b(C2209Bp bp) {
        synchronized (this.f6926a) {
            if (this.f6932g != null) {
                if (this.f6932g.mo9734a() != -1) {
                    if (this.f6933h == 0) {
                        C2653Qy c = this.f6932g.mo8941c();
                        return c;
                    } else if (this.f6933h == 1) {
                        this.f6933h = 2;
                        mo8019a((C2209Bp) null);
                        C2653Qy c2 = this.f6932g.mo8941c();
                        return c2;
                    } else if (this.f6933h == 2) {
                        C2653Qy c3 = this.f6932g.mo8941c();
                        return c3;
                    } else {
                        C2653Qy c4 = this.f6932g.mo8941c();
                        return c4;
                    }
                }
            }
            this.f6933h = 2;
            this.f6932g = mo8019a((C2209Bp) null);
            C2653Qy c5 = this.f6932g.mo8941c();
            return c5;
        }
    }
}
