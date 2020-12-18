package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.ads.internal.C1697X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Cr */
final class C2240Cr implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private Activity f6821a;

    /* renamed from: b */
    private Context f6822b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f6823c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f6824d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6825e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<C2297Er> f6826f = new ArrayList();

    /* renamed from: g */
    private final List<C2676Rr> f6827g = new ArrayList();

    /* renamed from: h */
    private Runnable f6828h;

    /* renamed from: i */
    private boolean f6829i = false;

    /* renamed from: j */
    private long f6830j;

    C2240Cr() {
    }

    /* renamed from: a */
    private final void m9560a(Activity activity) {
        synchronized (this.f6823c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f6821a = activity;
            }
        }
    }

    /* renamed from: a */
    public final Activity mo7942a() {
        return this.f6821a;
    }

    /* renamed from: a */
    public final void mo7943a(Application application, Context context) {
        if (!this.f6829i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                m9560a((Activity) context);
            }
            this.f6822b = application;
            this.f6830j = ((Long) C3390pt.m13458f().mo8515a(C2558Nu.f7895gb)).longValue();
            this.f6829i = true;
        }
    }

    /* renamed from: a */
    public final void mo7944a(C2297Er er) {
        synchronized (this.f6823c) {
            this.f6826f.add(er);
        }
    }

    /* renamed from: b */
    public final Context mo7945b() {
        return this.f6822b;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f6823c) {
            if (this.f6821a != null) {
                if (this.f6821a.equals(activity)) {
                    this.f6821a = null;
                }
                Iterator<C2676Rr> it = this.f6827g.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().mo8794a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        C1697X.m7702i().mo8319a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C2227Cf.m9533b("", e);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        m9560a(activity);
        synchronized (this.f6823c) {
            for (C2676Rr onActivityPaused : this.f6827g) {
                try {
                    onActivityPaused.onActivityPaused(activity);
                } catch (Exception e) {
                    C1697X.m7702i().mo8319a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C2227Cf.m9533b("", e);
                }
            }
        }
        this.f6825e = true;
        Runnable runnable = this.f6828h;
        if (runnable != null) {
            C3114ge.f9351a.removeCallbacks(runnable);
        }
        Handler handler = C3114ge.f9351a;
        C2268Dr dr = new C2268Dr(this);
        this.f6828h = dr;
        handler.postDelayed(dr, this.f6830j);
    }

    public final void onActivityResumed(Activity activity) {
        m9560a(activity);
        this.f6825e = false;
        boolean z = !this.f6824d;
        this.f6824d = true;
        Runnable runnable = this.f6828h;
        if (runnable != null) {
            C3114ge.f9351a.removeCallbacks(runnable);
        }
        synchronized (this.f6823c) {
            for (C2676Rr onActivityResumed : this.f6827g) {
                try {
                    onActivityResumed.onActivityResumed(activity);
                } catch (Exception e) {
                    C1697X.m7702i().mo8319a((Throwable) e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C2227Cf.m9533b("", e);
                }
            }
            if (z) {
                for (C2297Er a : this.f6826f) {
                    try {
                        a.mo8053a(true);
                    } catch (Exception e2) {
                        C2227Cf.m9533b("", e2);
                    }
                }
            } else {
                C2227Cf.m9532b("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        m9560a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
