package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C2092n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C1918b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final C1918b f6205a = new C1918b();

    /* renamed from: b */
    private final AtomicBoolean f6206b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f6207c = new AtomicBoolean();

    /* renamed from: d */
    private final ArrayList<C1919a> f6208d = new ArrayList<>();

    /* renamed from: e */
    private boolean f6209e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C1919a {
        /* renamed from: a */
        void mo7388a(boolean z);
    }

    private C1918b() {
    }

    /* renamed from: a */
    public static C1918b m8489a() {
        return f6205a;
    }

    /* renamed from: a */
    public static void m8490a(Application application) {
        synchronized (f6205a) {
            if (!f6205a.f6209e) {
                application.registerActivityLifecycleCallbacks(f6205a);
                application.registerComponentCallbacks(f6205a);
                f6205a.f6209e = true;
            }
        }
    }

    /* renamed from: b */
    private final void m8491b(boolean z) {
        synchronized (f6205a) {
            ArrayList<C1919a> arrayList = this.f6208d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                C1919a aVar = arrayList.get(i);
                i++;
                aVar.mo7388a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo7394a(C1919a aVar) {
        synchronized (f6205a) {
            this.f6208d.add(aVar);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo7395a(boolean z) {
        if (!this.f6207c.get()) {
            if (!C2092n.m9163d()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f6207c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f6206b.set(true);
            }
        }
        return mo7396b();
    }

    /* renamed from: b */
    public final boolean mo7396b() {
        return this.f6206b.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6206b.compareAndSet(true, false);
        this.f6207c.set(true);
        if (compareAndSet) {
            m8491b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f6206b.compareAndSet(true, false);
        this.f6207c.set(true);
        if (compareAndSet) {
            m8491b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f6206b.compareAndSet(false, true)) {
            this.f6207c.set(true);
            m8491b(true);
        }
    }
}
