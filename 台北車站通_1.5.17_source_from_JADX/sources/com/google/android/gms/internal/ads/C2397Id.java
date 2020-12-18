package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C1697X;
import com.google.android.gms.common.p072c.C1989c;
import com.google.android.gms.common.util.C2092n;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.Id */
public final class C2397Id implements C3027de {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f7233a = new Object();

    /* renamed from: b */
    private C2524Mq f7234b;

    /* renamed from: c */
    private final C2600Pd f7235c = new C2600Pd();

    /* renamed from: d */
    private final C2911_d f7236d = new C2911_d();

    /* renamed from: e */
    private boolean f7237e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Context f7238f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzang f7239g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2649Qu f7240h = null;

    /* renamed from: i */
    private C2325Fr f7241i = null;

    /* renamed from: j */
    private C2183Ar f7242j = null;

    /* renamed from: k */
    private Boolean f7243k = null;

    /* renamed from: l */
    private String f7244l;

    /* renamed from: m */
    private final AtomicInteger f7245m = new AtomicInteger(0);

    /* renamed from: n */
    private final C2481Ld f7246n = new C2481Ld((C2453Kd) null);

    /* renamed from: o */
    private final Object f7247o = new Object();

    /* renamed from: p */
    private C2804Wf<ArrayList<String>> f7248p;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C2325Fr m10243a(android.content.Context r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7918ka
            com.google.android.gms.internal.ads.Lu r1 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r1.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            boolean r0 = com.google.android.gms.common.util.C2092n.m9161b()
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7966sa
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r2.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            com.google.android.gms.internal.ads.Du<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C2558Nu.f7954qa
            com.google.android.gms.internal.ads.Lu r2 = com.google.android.gms.internal.ads.C3390pt.m13458f()
            java.lang.Object r0 = r2.mo8515a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0040
            return r1
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Object r5 = r3.f7233a
            monitor-enter(r5)
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x007f }
            if (r6 == 0) goto L_0x007d
            if (r4 != 0) goto L_0x0051
            goto L_0x007d
        L_0x0051:
            com.google.android.gms.internal.ads.Ar r6 = r3.f7242j     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x005c
            com.google.android.gms.internal.ads.Ar r6 = new com.google.android.gms.internal.ads.Ar     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            r3.f7242j = r6     // Catch:{ all -> 0x007f }
        L_0x005c:
            com.google.android.gms.internal.ads.Fr r6 = r3.f7241i     // Catch:{ all -> 0x007f }
            if (r6 != 0) goto L_0x006f
            com.google.android.gms.internal.ads.Fr r6 = new com.google.android.gms.internal.ads.Fr     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.Ar r0 = r3.f7242j     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.zzang r1 = r3.f7239g     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.Ja r4 = com.google.android.gms.internal.ads.C2308Fa.m9762a((android.content.Context) r4, (com.google.android.gms.internal.ads.zzang) r1)     // Catch:{ all -> 0x007f }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x007f }
            r3.f7241i = r6     // Catch:{ all -> 0x007f }
        L_0x006f:
            com.google.android.gms.internal.ads.Fr r4 = r3.f7241i     // Catch:{ all -> 0x007f }
            r4.mo8097b()     // Catch:{ all -> 0x007f }
            java.lang.String r4 = "start fetching content..."
            com.google.android.gms.internal.ads.C2227Cf.m9534c(r4)     // Catch:{ all -> 0x007f }
            com.google.android.gms.internal.ads.Fr r4 = r3.f7241i     // Catch:{ all -> 0x007f }
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r4
        L_0x007d:
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            return r1
        L_0x007f:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2397Id.m10243a(android.content.Context, boolean, boolean):com.google.android.gms.internal.ads.Fr");
    }

    @TargetApi(16)
    /* renamed from: b */
    private static ArrayList<String> m10245b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C1989c.m8748b(context).mo7521b(context.getApplicationInfo().packageName, SVGParser.ENTITY_WATCH_BUFFER_SIZE);
            if (b.requestedPermissions != null && b.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = b.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Context mo8314a() {
        return this.f7238f;
    }

    /* renamed from: a */
    public final C2325Fr mo8315a(Context context) {
        return m10243a(context, this.f7236d.mo9146b(), this.f7236d.mo9152d());
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void mo8316a(Context context, zzang zzang) {
        C2649Qu qu;
        synchronized (this.f7233a) {
            if (!this.f7237e) {
                this.f7238f = context.getApplicationContext();
                this.f7239g = zzang;
                C1697X.m7701h().mo7876a((C2297Er) C1697X.m7703j());
                this.f7236d.mo9136a(this.f7238f);
                this.f7236d.mo9137a((C3027de) this);
                C2308Fa.m9762a(this.f7238f, this.f7239g);
                this.f7244l = C1697X.m7698e().mo9454b(context, zzang.f10855a);
                this.f7234b = new C2524Mq(context.getApplicationContext(), this.f7239g);
                C1697X.m7707n();
                if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7900ha)).booleanValue()) {
                    C2857Yd.m11615f("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    qu = null;
                } else {
                    qu = new C2649Qu();
                }
                this.f7240h = qu;
                C2427Jf.m10346a((C2804Wf) new C2453Kd(this).mo8107a(), "AppState.registerCsiReporter");
                this.f7237e = true;
                mo8334n();
            }
        }
    }

    /* renamed from: a */
    public final void mo8317a(Bundle bundle) {
        if (bundle.containsKey("content_url_opted_out") && bundle.containsKey("content_vertical_opted_out")) {
            m10243a(this.f7238f, bundle.getBoolean("content_url_opted_out"), bundle.getBoolean("content_vertical_opted_out"));
        }
    }

    /* renamed from: a */
    public final void mo8318a(Boolean bool) {
        synchronized (this.f7233a) {
            this.f7243k = bool;
        }
    }

    /* renamed from: a */
    public final void mo8319a(Throwable th, String str) {
        C2308Fa.m9762a(this.f7238f, this.f7239g).mo8063a(th, str);
    }

    /* renamed from: a */
    public final void mo8320a(boolean z) {
        this.f7246n.mo8471a(z);
    }

    /* renamed from: b */
    public final Resources mo8321b() {
        if (this.f7239g.f10858d) {
            return this.f7238f.getResources();
        }
        try {
            DynamiteModule a = DynamiteModule.m9187a(this.f7238f, DynamiteModule.f6574g, ModuleDescriptor.MODULE_ID);
            if (a != null) {
                return a.mo7729a().getResources();
            }
            return null;
        } catch (DynamiteModule.C2101a e) {
            C2227Cf.m9535c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: b */
    public final void mo8322b(Throwable th, String str) {
        C2308Fa.m9762a(this.f7238f, this.f7239g).mo8064a(th, str, ((Float) C3390pt.m13458f().mo8515a(C2558Nu.f7923l)).floatValue());
    }

    /* renamed from: c */
    public final C2600Pd mo8323c() {
        return this.f7235c;
    }

    /* renamed from: d */
    public final C2649Qu mo8324d() {
        C2649Qu qu;
        synchronized (this.f7233a) {
            qu = this.f7240h;
        }
        return qu;
    }

    /* renamed from: e */
    public final Boolean mo8325e() {
        Boolean bool;
        synchronized (this.f7233a) {
            bool = this.f7243k;
        }
        return bool;
    }

    /* renamed from: f */
    public final boolean mo8326f() {
        return this.f7246n.mo8472a();
    }

    /* renamed from: g */
    public final boolean mo8327g() {
        return this.f7246n.mo8473b();
    }

    /* renamed from: h */
    public final void mo8328h() {
        this.f7246n.mo8474c();
    }

    /* renamed from: i */
    public final C2524Mq mo8329i() {
        return this.f7234b;
    }

    /* renamed from: j */
    public final void mo8330j() {
        this.f7245m.incrementAndGet();
    }

    /* renamed from: k */
    public final void mo8331k() {
        this.f7245m.decrementAndGet();
    }

    /* renamed from: l */
    public final int mo8332l() {
        return this.f7245m.get();
    }

    /* renamed from: m */
    public final C2911_d mo8333m() {
        C2911_d _dVar;
        synchronized (this.f7233a) {
            _dVar = this.f7236d;
        }
        return _dVar;
    }

    /* renamed from: n */
    public final C2804Wf<ArrayList<String>> mo8334n() {
        if (this.f7238f != null && C2092n.m9163d()) {
            if (!((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7968sc)).booleanValue()) {
                synchronized (this.f7247o) {
                    if (this.f7248p != null) {
                        C2804Wf<ArrayList<String>> wf = this.f7248p;
                        return wf;
                    }
                    C2804Wf<ArrayList<String>> a = C3057ee.m12270a(new C2425Jd(this));
                    this.f7248p = a;
                    return a;
                }
            }
        }
        return C2483Lf.m10495a(new ArrayList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ ArrayList mo8335o() {
        return m10245b(this.f7238f);
    }
}
