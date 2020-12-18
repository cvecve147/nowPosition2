package p287me.tatarka.support.internal.receivers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p013b.p018b.p028h.p029a.C1024f;
import p245f.p246a.p247a.p248a.p249a.C6448b;
import p287me.tatarka.support.internal.job.C6797d;
import p287me.tatarka.support.internal.job.JobServiceCompat;
import p287me.tatarka.support.internal.receivers.C6801b;

/* renamed from: me.tatarka.support.internal.receivers.TimeReceiver */
public class TimeReceiver extends C1024f {
    /* renamed from: a */
    private static long m25818a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return j < elapsedRealtime ? elapsedRealtime : j;
    }

    /* renamed from: a */
    private static long m25819a(Context context, long j) {
        long a = m25818a(j);
        Intent intent = new Intent(context, TimeReceiver.class);
        intent.setAction("me.tatarka.support.jobscheduler.JOB_DEADLINE_EXPIRED");
        m25824a(context, PendingIntent.getBroadcast(context, 0, intent, 0), a);
        return a;
    }

    /* renamed from: a */
    private static long m25820a(Context context, List<C6803c> list) {
        long j;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<C6803c> it = list.iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                j = Long.MAX_VALUE;
                break;
            }
            C6803c next = it.next();
            if (next.mo17408j()) {
                j = next.mo17403e();
                if (j > elapsedRealtime) {
                    break;
                }
                next.f18890f.set(true);
                it.remove();
                z = true;
            }
        }
        if (z) {
            C1024f.m5440b(context, JobServiceCompat.m25770c(context));
        }
        return m25819a(context, j);
    }

    /* renamed from: a */
    private static List<C6803c> m25821a(Context context) {
        ArrayList arrayList = new ArrayList();
        C6797d a = C6797d.m25778a(context);
        synchronized (a) {
            C6448b<C6803c> b = a.mo17377b();
            for (int i = 0; i < b.size(); i++) {
                C6803c e = b.mo16567e(i);
                if (e.mo17410l() || e.mo17408j()) {
                    arrayList.add(e);
                }
            }
        }
        Collections.sort(arrayList, new C6805e());
        return arrayList;
    }

    /* renamed from: a */
    public static void m25822a(Context context, int i) {
        C6803c cVar;
        List<C6803c> a = m25821a(context);
        Iterator<C6803c> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (cVar.mo17399a(i)) {
                break;
            }
        }
        if (cVar != null) {
            m25826a(context, cVar, a);
        }
    }

    /* renamed from: a */
    private static void m25823a(Context context, long j, long j2) {
        C6801b a = C6801b.m25830a(context);
        long c = a.mo17389c();
        long d = a.mo17390d();
        if (j < c) {
            c = m25828b(context, j);
        }
        if (j2 < d) {
            d = m25819a(context, j2);
        }
        C6801b.C6802a b = a.mo17388b();
        b.mo17393a(c);
        b.mo17396b(d);
        b.mo17395a();
    }

    /* renamed from: a */
    private static void m25824a(Context context, PendingIntent pendingIntent, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (j == Long.MAX_VALUE) {
            alarmManager.cancel(pendingIntent);
        } else {
            alarmManager.set(3, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m25825a(Context context, C6803c cVar) {
        if (cVar.mo17410l() || cVar.mo17408j()) {
            m25826a(context, cVar, m25821a(context));
            long j = Long.MAX_VALUE;
            long a = cVar.mo17410l() ? cVar.mo17398a() : Long.MAX_VALUE;
            if (cVar.mo17408j()) {
                j = cVar.mo17403e();
            }
            m25823a(context, a, j);
        }
    }

    /* renamed from: a */
    private static void m25826a(Context context, C6803c cVar, List<C6803c> list) {
        if (list.contains(cVar)) {
            long b = m25829b(context, list);
            long a = m25820a(context, list);
            C6801b.C6802a b2 = C6801b.m25830a(context).mo17388b();
            b2.mo17393a(b);
            b2.mo17396b(a);
            b2.mo17395a();
        }
    }

    /* renamed from: a */
    private static boolean m25827a(C6803c cVar) {
        return (!cVar.mo17410l() || cVar.f18889e.get()) && (!cVar.mo17408j() || cVar.f18890f.get());
    }

    /* renamed from: b */
    private static long m25828b(Context context, long j) {
        long a = m25818a(j);
        Intent intent = new Intent(context, TimeReceiver.class);
        intent.setAction("me.tatarka.support.jobscheduler.JOB_DELAY_EXPIRED");
        m25824a(context, PendingIntent.getBroadcast(context, 0, intent, 0), a);
        return a;
    }

    /* renamed from: b */
    private static long m25829b(Context context, List<C6803c> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<C6803c> it = list.iterator();
        long j = Long.MAX_VALUE;
        boolean z = false;
        while (it.hasNext()) {
            C6803c next = it.next();
            if (next.mo17410l()) {
                long a = next.mo17398a();
                if (a <= elapsedRealtime) {
                    next.f18889e.set(true);
                    if (m25827a(next)) {
                        it.remove();
                    }
                    if (next.mo17414p()) {
                        z = true;
                    }
                } else if (j > a) {
                    j = a;
                }
            }
        }
        if (z) {
            C1024f.m5440b(context, JobServiceCompat.m25770c(context));
        }
        return m25828b(context, j);
    }

    public void onReceive(Context context, Intent intent) {
        List<C6803c> a = m25821a(context);
        if ("me.tatarka.support.jobscheduler.JOB_DEADLINE_EXPIRED".equals(intent.getAction())) {
            m25820a(context, a);
        } else if ("me.tatarka.support.jobscheduler.JOB_DELAY_EXPIRED".equals(intent.getAction())) {
            m25829b(context, a);
        }
    }
}
