package p101d.p119e.p120a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: d.e.a.y */
public class C5296y {

    /* renamed from: a */
    public static String f14976a = "Volley";

    /* renamed from: b */
    public static boolean f14977b = Log.isLoggable(f14976a, 2);

    /* renamed from: d.e.a.y$a */
    static class C5297a {

        /* renamed from: a */
        public static final boolean f14978a = C5296y.f14977b;

        /* renamed from: b */
        private final List<C5298a> f14979b = new ArrayList();

        /* renamed from: c */
        private boolean f14980c = false;

        /* renamed from: d.e.a.y$a$a */
        private static class C5298a {

            /* renamed from: a */
            public final String f14981a;

            /* renamed from: b */
            public final long f14982b;

            /* renamed from: c */
            public final long f14983c;

            public C5298a(String str, long j, long j2) {
                this.f14981a = str;
                this.f14982b = j;
                this.f14983c = j2;
            }
        }

        C5297a() {
        }

        /* renamed from: a */
        private long m20475a() {
            if (this.f14979b.size() == 0) {
                return 0;
            }
            long j = this.f14979b.get(0).f14983c;
            List<C5298a> list = this.f14979b;
            return list.get(list.size() - 1).f14983c - j;
        }

        /* renamed from: a */
        public synchronized void mo14658a(String str) {
            this.f14980c = true;
            long a = m20475a();
            if (a > 0) {
                long j = this.f14979b.get(0).f14983c;
                C5296y.m20469a("(%-4d ms) %s", Long.valueOf(a), str);
                for (C5298a next : this.f14979b) {
                    long j2 = next.f14983c;
                    C5296y.m20469a("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(next.f14982b), next.f14981a);
                    j = j2;
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo14659a(String str, long j) {
            if (!this.f14980c) {
                this.f14979b.add(new C5298a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            if (!this.f14980c) {
                mo14658a("Request on the loose");
                C5296y.m20471b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m20469a(String str, Object... objArr) {
        Log.d(f14976a, m20474e(str, objArr));
    }

    /* renamed from: a */
    public static void m20470a(Throwable th, String str, Object... objArr) {
        Log.e(f14976a, m20474e(str, objArr), th);
    }

    /* renamed from: b */
    public static void m20471b(String str, Object... objArr) {
        Log.e(f14976a, m20474e(str, objArr));
    }

    /* renamed from: c */
    public static void m20472c(String str, Object... objArr) {
        if (f14977b) {
            Log.v(f14976a, m20474e(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m20473d(String str, Object... objArr) {
        Log.wtf(f14976a, m20474e(str, objArr));
    }

    /* renamed from: e */
    private static String m20474e(String str, Object... objArr) {
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
            } else if (!stackTrace[i].getClass().equals(C5296y.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
