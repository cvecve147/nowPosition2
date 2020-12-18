package com.facebook.p060a;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C1601x;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.a.d */
class C1390d {

    /* renamed from: a */
    private static final String f4902a = "d";

    /* renamed from: b */
    private static ReentrantReadWriteLock f4903b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f4904c;

    /* renamed from: d */
    private static volatile boolean f4905d = false;

    /* renamed from: b */
    public static String m6671b() {
        if (!f4905d) {
            Log.w(f4902a, "initStore should have been called before calling setUserID");
            m6673d();
        }
        f4903b.readLock().lock();
        try {
            return f4904c;
        } finally {
            f4903b.readLock().unlock();
        }
    }

    /* renamed from: c */
    public static void m6672c() {
        if (!f4905d) {
            C1406q.m6715b().execute(new C1389c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m6673d() {
        if (!f4905d) {
            f4903b.writeLock().lock();
            try {
                if (!f4905d) {
                    f4904c = PreferenceManager.getDefaultSharedPreferences(C1601x.m7386b()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f4905d = true;
                    f4903b.writeLock().unlock();
                }
            } finally {
                f4903b.writeLock().unlock();
            }
        }
    }
}
