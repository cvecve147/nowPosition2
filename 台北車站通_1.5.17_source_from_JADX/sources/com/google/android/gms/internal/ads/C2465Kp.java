package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Kp */
final class C2465Kp implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7469a;

    C2465Kp(C2353Gp gp, Activity activity) {
        this.f7469a = activity;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f7469a);
    }
}
