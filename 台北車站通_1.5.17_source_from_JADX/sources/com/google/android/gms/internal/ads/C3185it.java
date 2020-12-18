package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

@C2478La
/* renamed from: com.google.android.gms.internal.ads.it */
public class C3185it {

    /* renamed from: a */
    private C2706St f9505a;

    /* renamed from: b */
    private final Object f9506b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2957at f9507c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2928_s f9508d;

    /* renamed from: e */
    private final C3362ou f9509e;

    /* renamed from: f */
    private final C2821Ww f9510f;

    /* renamed from: g */
    private final C2368Hc f9511g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3397q f9512h;

    /* renamed from: i */
    private final C2849Xw f9513i;

    /* renamed from: com.google.android.gms.internal.ads.it$a */
    abstract class C3186a<T> {
        C3186a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo9568a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo9569a(C2706St st);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final T mo9570b() {
            C2706St a = C3185it.this.m12650b();
            if (a == null) {
                C2227Cf.m9536d("ClientApi class cannot be loaded.");
                return null;
            }
            try {
                return mo9569a(a);
            } catch (RemoteException e) {
                C2227Cf.m9535c("Cannot invoke local loader using ClientApi class", e);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final T mo9571c() {
            try {
                return mo9568a();
            } catch (RemoteException e) {
                C2227Cf.m9535c("Cannot invoke remote loader", e);
                return null;
            }
        }
    }

    public C3185it(C2957at atVar, C2928_s _sVar, C3362ou ouVar, C2821Ww ww, C2368Hc hc, C3397q qVar, C2849Xw xw) {
        this.f9507c = atVar;
        this.f9508d = _sVar;
        this.f9509e = ouVar;
        this.f9510f = ww;
        this.f9511g = hc;
        this.f9512h = qVar;
        this.f9513i = xw;
    }

    /* renamed from: a */
    private static C2706St m12645a() {
        try {
            Object newInstance = C3185it.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").newInstance();
            if (newInstance instanceof IBinder) {
                return C2735Tt.asInterface((IBinder) newInstance);
            }
            C2227Cf.m9536d("ClientApi class is not an instance of IBinder");
            return null;
        } catch (Exception e) {
            C2227Cf.m9535c("Failed to instantiate ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: a */
    static <T> T m12647a(Context context, boolean z, C3186a<T> aVar) {
        if (!z) {
            C3390pt.m13453a();
            if (!C3432rf.m13611c(context)) {
                C2227Cf.m9532b("Google Play Services is not available");
                z = true;
            }
        }
        C3390pt.m13453a();
        int e = C3432rf.m13613e(context);
        C3390pt.m13453a();
        if (e > C3432rf.m13612d(context)) {
            z = true;
        }
        C2558Nu.m10773a(context);
        if (((Boolean) C3390pt.m13458f().mo8515a(C2558Nu.f7940ne)).booleanValue()) {
            z = false;
        }
        if (z) {
            T b = aVar.mo9570b();
            return b == null ? aVar.mo9571c() : b;
        }
        T c = aVar.mo9571c();
        return c == null ? aVar.mo9570b() : c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m12648a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C3390pt.m13453a().mo9965a(context, (String) null, "gmob-apps", bundle, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C2706St m12650b() {
        C2706St st;
        synchronized (this.f9506b) {
            if (this.f9505a == null) {
                this.f9505a = m12645a();
            }
            st = this.f9505a;
        }
        return st;
    }

    /* renamed from: a */
    public final C2213Bt mo9566a(Context context, String str, C2533Mz mz) {
        return (C2213Bt) m12647a(context, false, new C3304mt(this, context, str, mz));
    }

    /* renamed from: a */
    public final C3425r mo9567a(Activity activity) {
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            C2227Cf.m9529a("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (C3425r) m12647a((Context) activity, z, new C3361ot(this, activity));
    }
}
