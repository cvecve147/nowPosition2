package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Np */
final class C2553Np implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7662a;

    C2553Np(C2353Gp gp, Activity activity) {
        this.f7662a = activity;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f7662a);
    }
}
