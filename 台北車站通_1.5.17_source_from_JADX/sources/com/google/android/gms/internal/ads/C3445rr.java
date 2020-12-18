package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.rr */
final class C3445rr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10148a;

    C3445rr(C3359or orVar, Activity activity) {
        this.f10148a = activity;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f10148a);
    }
}
