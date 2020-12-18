package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Hp */
final class C2381Hp implements C2585Op {

    /* renamed from: a */
    private final /* synthetic */ Activity f7188a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f7189b;

    C2381Hp(C2353Gp gp, Activity activity, Bundle bundle) {
        this.f7188a = activity;
        this.f7189b = bundle;
    }

    /* renamed from: a */
    public final void mo8295a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f7188a, this.f7189b);
    }
}
