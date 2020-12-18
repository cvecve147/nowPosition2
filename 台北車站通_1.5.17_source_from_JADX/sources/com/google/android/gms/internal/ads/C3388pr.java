package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pr */
final class C3388pr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10037a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f10038b;

    C3388pr(C3359or orVar, Activity activity, Bundle bundle) {
        this.f10037a = activity;
        this.f10038b = bundle;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f10037a, this.f10038b);
    }
}
