package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Lp */
final class C2495Lp implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7527a;

    C2495Lp(C2353Gp gp, Activity activity) {
        this.f7527a = activity;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f7527a);
    }
}
