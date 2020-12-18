package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.onesignal.c */
class C4351c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C4351c f12873a;

    C4351c() {
    }

    /* renamed from: a */
    static void m17320a(Application application) {
        if (f12873a == null) {
            f12873a = new C4351c();
            application.registerActivityLifecycleCallbacks(f12873a);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C4342b.m17291a(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        C4342b.m17296b(activity);
    }

    public void onActivityPaused(Activity activity) {
        C4342b.m17299c(activity);
    }

    public void onActivityResumed(Activity activity) {
        C4342b.m17300d(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C4342b.m17301e(activity);
    }

    public void onActivityStopped(Activity activity) {
        C4342b.m17302f(activity);
    }
}
