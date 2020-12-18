package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.qr */
final class C3416qr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10092a;

    C3416qr(C3359or orVar, Activity activity) {
        this.f10092a = activity;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f10092a);
    }
}
