package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Gp */
final class C2353Gp implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f7090a;

    /* renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f7091b;

    /* renamed from: c */
    private boolean f7092c = false;

    public C2353Gp(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f7091b = new WeakReference<>(activityLifecycleCallbacks);
        this.f7090a = application;
    }

    /* renamed from: a */
    private final void m9996a(C2585Op op) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f7091b.get();
            if (activityLifecycleCallbacks != null) {
                op.mo8295a(activityLifecycleCallbacks);
            } else if (!this.f7092c) {
                this.f7090a.unregisterActivityLifecycleCallbacks(this);
                this.f7092c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m9996a(new C2381Hp(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m9996a(new C2553Np(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m9996a(new C2465Kp(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m9996a(new C2437Jp(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m9996a(new C2523Mp(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m9996a(new C2409Ip(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m9996a(new C2495Lp(this, activity));
    }
}
