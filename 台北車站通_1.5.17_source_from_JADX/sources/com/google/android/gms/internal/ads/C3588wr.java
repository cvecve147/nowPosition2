package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.wr */
final class C3588wr implements C3616xr {

    /* renamed from: a */
    private final /* synthetic */ Activity f10468a;

    C3588wr(C3359or orVar, Activity activity) {
        this.f10468a = activity;
    }

    /* renamed from: a */
    public final void mo9897a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f10468a);
    }
}
