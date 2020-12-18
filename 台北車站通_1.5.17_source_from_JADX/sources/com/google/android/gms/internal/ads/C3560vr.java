package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.vr */
final class C3560vr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10391a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f10392b;

    C3560vr(C3359or orVar, Activity activity, Bundle bundle) {
        this.f10391a = activity;
        this.f10392b = bundle;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f10391a, this.f10392b);
    }
}
