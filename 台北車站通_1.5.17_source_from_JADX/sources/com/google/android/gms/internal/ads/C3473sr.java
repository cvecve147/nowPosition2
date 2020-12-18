package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.sr */
final class C3473sr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10227a;

    C3473sr(C3359or orVar, Activity activity) {
        this.f10227a = activity;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f10227a);
    }
}
