package com.facebook.p060a.p061a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.facebook.C1601x;
import com.facebook.internal.C1430A;
import com.facebook.internal.C1480ba;
import com.facebook.internal.C1525y;
import com.facebook.p060a.p061a.C1385n;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.a.a.f */
public class C1377f {

    /* renamed from: a */
    private static final String f4879a = "com.facebook.a.a.f";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ScheduledExecutorService f4880b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile ScheduledFuture f4881c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static AtomicInteger f4882d = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile C1382k f4883e;

    /* renamed from: f */
    private static AtomicBoolean f4884f = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static String f4885g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static long f4886h;

    /* renamed from: a */
    public static void m6631a(Application application, String str) {
        if (f4884f.compareAndSet(false, true)) {
            f4885g = str;
            application.registerActivityLifecycleCallbacks(new C1372a());
        }
    }

    /* renamed from: b */
    public static void m6633b(Activity activity) {
        f4880b.execute(new C1373b(activity.getApplicationContext(), C1480ba.m6953b((Context) activity), System.currentTimeMillis(), C1385n.C1386a.m6667a(activity)));
    }

    /* renamed from: c */
    public static void m6635c(Activity activity) {
        f4882d.incrementAndGet();
        m6641h();
        long currentTimeMillis = System.currentTimeMillis();
        f4886h = currentTimeMillis;
        f4880b.execute(new C1374c(currentTimeMillis, activity.getApplicationContext(), C1480ba.m6953b((Context) activity)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m6637d(Activity activity) {
        if (f4882d.decrementAndGet() < 0) {
            f4882d.set(0);
            Log.w(f4879a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m6641h();
        f4880b.execute(new C1376e(System.currentTimeMillis(), activity.getApplicationContext(), C1480ba.m6953b((Context) activity)));
    }

    /* renamed from: g */
    public static UUID m6640g() {
        if (f4883e != null) {
            return f4883e.mo6037d();
        }
        return null;
    }

    /* renamed from: h */
    private static void m6641h() {
        if (f4881c != null) {
            f4881c.cancel(false);
        }
        f4881c = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static int m6642i() {
        C1525y b = C1430A.m6778b(C1601x.m7389c());
        return b == null ? C1380i.m6647a() : b.mo6249d();
    }
}
