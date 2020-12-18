package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.tr */
final class C3502tr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10272a;

    C3502tr(C3359or orVar, Activity activity) {
        this.f10272a = activity;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f10272a);
    }
}
