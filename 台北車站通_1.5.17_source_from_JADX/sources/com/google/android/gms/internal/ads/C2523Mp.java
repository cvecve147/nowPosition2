package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Mp */
final class C2523Mp implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7608a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f7609b;

    C2523Mp(C2353Gp gp, Activity activity, Bundle bundle) {
        this.f7608a = activity;
        this.f7609b = bundle;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f7608a, this.f7609b);
    }
}
