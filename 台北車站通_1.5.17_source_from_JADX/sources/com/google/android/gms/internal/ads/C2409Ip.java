package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Ip */
final class C2409Ip implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7296a;

    C2409Ip(C2353Gp gp, Activity activity) {
        this.f7296a = activity;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f7296a);
    }
}
