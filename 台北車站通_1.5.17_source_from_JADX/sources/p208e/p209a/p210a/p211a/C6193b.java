package p208e.p209a.p210a.p211a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e.a.a.a.b */
public class C6193b {

    /* renamed from: a */
    private final Application f17277a;

    /* renamed from: b */
    private C6194a f17278b;

    /* renamed from: e.a.a.a.b$a */
    private static class C6194a {

        /* renamed from: a */
        private final Set<Application.ActivityLifecycleCallbacks> f17279a = new HashSet();

        /* renamed from: b */
        private final Application f17280b;

        C6194a(Application application) {
            this.f17280b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public void m23381a() {
            for (Application.ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f17279a) {
                this.f17280b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public boolean m23384a(C6195b bVar) {
            if (this.f17280b == null) {
                return false;
            }
            C6060a aVar = new C6060a(this, bVar);
            this.f17280b.registerActivityLifecycleCallbacks(aVar);
            this.f17279a.add(aVar);
            return true;
        }
    }

    /* renamed from: e.a.a.a.b$b */
    public static abstract class C6195b {
        /* renamed from: a */
        public void mo14693a(Activity activity) {
        }

        /* renamed from: a */
        public void mo14694a(Activity activity, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo14695b(Activity activity) {
        }

        /* renamed from: b */
        public void mo14696b(Activity activity, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo14697c(Activity activity) {
        }

        /* renamed from: d */
        public abstract void mo14698d(Activity activity);

        /* renamed from: e */
        public void mo14699e(Activity activity) {
        }
    }

    public C6193b(Context context) {
        this.f17277a = (Application) context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.f17278b = new C6194a(this.f17277a);
        }
    }

    /* renamed from: a */
    public void mo16258a() {
        C6194a aVar = this.f17278b;
        if (aVar != null) {
            aVar.m23381a();
        }
    }

    /* renamed from: a */
    public boolean mo16259a(C6195b bVar) {
        C6194a aVar = this.f17278b;
        return aVar != null && aVar.m23384a(bVar);
    }
}
