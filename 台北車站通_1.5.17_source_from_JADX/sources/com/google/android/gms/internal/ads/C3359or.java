package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.or */
final class C3359or implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f9965a;

    /* renamed from: b */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f9966b;

    /* renamed from: c */
    private boolean f9967c = false;

    public C3359or(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f9966b = new WeakReference<>(activityLifecycleCallbacks);
        this.f9965a = application;
    }

    /* renamed from: a */
    private final void m13270a(C3616xr xrVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f9966b.get();
            if (activityLifecycleCallbacks != null) {
                xrVar.mo9897a(activityLifecycleCallbacks);
            } else if (!this.f9967c) {
                this.f9965a.unregisterActivityLifecycleCallbacks(this);
                this.f9967c = true;
            }
        } catch (Exception e) {
            C2227Cf.m9533b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m13270a(new C3388pr(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m13270a(new C3588wr(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m13270a(new C3473sr(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m13270a(new C3445rr(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m13270a(new C3560vr(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m13270a(new C3416qr(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m13270a(new C3502tr(this, activity));
    }
}
