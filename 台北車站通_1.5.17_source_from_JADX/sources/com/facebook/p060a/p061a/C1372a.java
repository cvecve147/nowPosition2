package com.facebook.p060a.p061a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.facebook.p060a.C1406q;

/* renamed from: com.facebook.a.a.a */
class C1372a implements Application.ActivityLifecycleCallbacks {
    C1372a() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C1378g.m6643a();
        C1377f.m6633b(activity);
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C1378g.m6643a();
        C1377f.m6637d(activity);
    }

    public void onActivityResumed(Activity activity) {
        C1378g.m6643a();
        C1377f.m6635c(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
        C1406q.m6719f();
    }
}
