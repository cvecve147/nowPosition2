package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.zb */
public class C3656zb {

    /* renamed from: a */
    private static String f10639a = "Volley";

    /* renamed from: b */
    public static boolean f10640b = Log.isLoggable("Volley", 2);

    /* renamed from: com.google.android.gms.internal.ads.zb$a */
    static class C3657a {

        /* renamed from: a */
        public static final boolean f10641a = C3656zb.f10640b;

        /* renamed from: b */
        private final List<C2883Zb> f10642b = new ArrayList();

        /* renamed from: c */
        private boolean f10643c = false;

        C3657a() {
        }

        /* renamed from: a */
        public final synchronized void mo10261a(String str) {
            long j;
            this.f10643c = true;
            if (this.f10642b.size() == 0) {
                j = 0;
            } else {
                j = this.f10642b.get(this.f10642b.size() - 1).f8679c - this.f10642b.get(0).f8679c;
            }
            if (j > 0) {
                long j2 = this.f10642b.get(0).f8679c;
                C3656zb.m14679a("(%-4d ms) %s", Long.valueOf(j), str);
                for (C2883Zb next : this.f10642b) {
                    long j3 = next.f8679c;
                    C3656zb.m14679a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f8678b), next.f8677a);
                    j2 = j3;
                }
            }
        }

        /* renamed from: a */
        public final synchronized void mo10262a(String str, long j) {
            if (!this.f10643c) {
                this.f10642b.add(new C2883Zb(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f10643c) {
                mo10261a("Request on the loose");
                C3656zb.m14681b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m14679a(String str, Object... objArr) {
        Log.d(f10639a, m14683d(str, objArr));
    }

    /* renamed from: a */
    public static void m14680a(Throwable th, String str, Object... objArr) {
        Log.e(f10639a, m14683d(str, objArr), th);
    }

    /* renamed from: b */
    public static void m14681b(String str, Object... objArr) {
        Log.e(f10639a, m14683d(str, objArr));
    }

    /* renamed from: c */
    public static void m14682c(String str, Object... objArr) {
        if (f10640b) {
            Log.v(f10639a, m14683d(str, objArr));
        }
    }

    /* renamed from: d */
    private static String m14683d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClass().equals(C3656zb.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
