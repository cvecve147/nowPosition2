package p208e.p209a.p210a.p211a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import p208e.p209a.p210a.p211a.C6193b;

/* renamed from: e.a.a.a.a */
class C6060a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C6193b.C6195b f16971a;

    /* renamed from: b */
    final /* synthetic */ C6193b.C6194a f16972b;

    C6060a(C6193b.C6194a aVar, C6193b.C6195b bVar) {
        this.f16972b = aVar;
        this.f16971a = bVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f16971a.mo14694a(activity, bundle);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f16971a.mo14693a(activity);
    }

    public void onActivityPaused(Activity activity) {
        this.f16971a.mo14695b(activity);
    }

    public void onActivityResumed(Activity activity) {
        this.f16971a.mo14697c(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f16971a.mo14696b(activity, bundle);
    }

    public void onActivityStarted(Activity activity) {
        this.f16971a.mo14698d(activity);
    }

    public void onActivityStopped(Activity activity) {
        this.f16971a.mo14699e(activity);
    }
}
