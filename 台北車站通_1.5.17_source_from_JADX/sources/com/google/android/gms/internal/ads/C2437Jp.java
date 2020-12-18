package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Jp */
final class C2437Jp implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7381a;

    C2437Jp(C2353Gp gp, Activity activity) {
        this.f7381a = activity;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f7381a);
    }
}
