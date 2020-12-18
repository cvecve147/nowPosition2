package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.C4306Xa;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.onesignal.tb */
class C4426tb {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Long f13048a = 0L;

    /* renamed from: b */
    private static AtomicBoolean f13049b = new AtomicBoolean();

    /* renamed from: c */
    private static Thread f13050c;

    /* renamed from: com.onesignal.tb$a */
    static class C4427a extends C4429c {

        /* renamed from: a */
        Service f13051a;

        C4427a(Service service) {
            this.f13051a = service;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12541a() {
            C4306Xa.m17135a(C4306Xa.C4316j.DEBUG, "LegacySyncRunnable:Stopped");
            this.f13051a.stopSelf();
        }
    }

    /* renamed from: com.onesignal.tb$b */
    static class C4428b extends C4429c {

        /* renamed from: a */
        private JobService f13052a;

        /* renamed from: b */
        private JobParameters f13053b;

        C4428b(JobService jobService, JobParameters jobParameters) {
            this.f13052a = jobService;
            this.f13053b = jobParameters;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12541a() {
            C4306Xa.m17135a(C4306Xa.C4316j.DEBUG, "LollipopSyncRunnable:JobFinished");
            this.f13052a.jobFinished(this.f13053b, false);
        }
    }

    /* renamed from: com.onesignal.tb$c */
    static abstract class C4429c implements Runnable {
        C4429c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo12541a();

        public final void run() {
            synchronized (C4426tb.f13048a) {
                Long unused = C4426tb.f13048a = 0L;
            }
            if (C4306Xa.m17208v() == null) {
                mo12541a();
                return;
            }
            C4306Xa.f12757c = C4306Xa.m17205s();
            C4421sb.m17526g();
            C4264M.m16922a(C4306Xa.f12759e, false, new C4433ub(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m17579a(android.content.Context r3) {
        /*
            java.lang.Long r0 = f13048a
            monitor-enter(r0)
            r1 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0039 }
            f13048a = r1     // Catch:{ all -> 0x0039 }
            boolean r1 = com.onesignal.C4264M.m16924a((android.content.Context) r3)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0013:
            boolean r1 = m17591e()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = "jobscheduler"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch:{ all -> 0x0039 }
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3     // Catch:{ all -> 0x0039 }
            r1 = 2071862118(0x7b7e1b66, float:1.3193991E36)
            r3.cancel(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0037
        L_0x0028:
            java.lang.String r1 = "alarm"
            java.lang.Object r1 = r3.getSystemService(r1)     // Catch:{ all -> 0x0039 }
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1     // Catch:{ all -> 0x0039 }
            android.app.PendingIntent r3 = m17588d(r3)     // Catch:{ all -> 0x0039 }
            r1.cancel(r3)     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C4426tb.m17579a(android.content.Context):void");
    }

    /* renamed from: a */
    static void m17580a(Context context, long j) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.VERBOSE;
        C4306Xa.m17135a(jVar, "scheduleLocationUpdateTask:delayMs: " + j);
        m17590d(context, j);
    }

    /* renamed from: a */
    static void m17581a(Context context, C4429c cVar) {
        C4306Xa.m17176f(context);
        f13050c = new Thread(cVar, "OS_SYNCSRV_BG_SYNC");
        f13050c.start();
    }

    /* renamed from: b */
    static void m17582b(Context context) {
        C4306Xa.m17135a(C4306Xa.C4316j.VERBOSE, "scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 120000");
        m17590d(context, 120000);
    }

    /* renamed from: b */
    private static void m17583b(Context context, long j) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.VERBOSE;
        C4306Xa.m17135a(jVar, "scheduleServiceSyncTask:atTime: " + j);
        ((AlarmManager) context.getSystemService("alarm")).set(0, System.currentTimeMillis() + j + j, m17588d(context));
    }

    /* renamed from: b */
    static boolean m17584b() {
        Thread thread = f13050c;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        f13050c.interrupt();
        return true;
    }

    /* renamed from: c */
    static void m17585c() {
        if (!f13049b.get()) {
            synchronized (f13049b) {
                f13049b.set(true);
                m17589d();
                f13049b.set(false);
            }
        }
    }

    /* renamed from: c */
    private static void m17586c(Context context, long j) {
        C4306Xa.C4316j jVar = C4306Xa.C4316j.VERBOSE;
        C4306Xa.m17135a(jVar, "scheduleSyncServiceAsJob:atTime: " + j);
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, SyncJobService.class));
        builder.setMinimumLatency(j).setRequiredNetworkType(1);
        if (m17587c(context)) {
            builder.setPersisted(true);
        }
        try {
            int schedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            C4306Xa.C4316j jVar2 = C4306Xa.C4316j.INFO;
            C4306Xa.m17135a(jVar2, "scheduleSyncServiceAsJob:result: " + schedule);
        } catch (NullPointerException e) {
            C4306Xa.m17136a(C4306Xa.C4316j.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", (Throwable) e);
        }
    }

    /* renamed from: c */
    private static boolean m17587c(Context context) {
        return C4373h.m17369a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    /* renamed from: d */
    private static PendingIntent m17588d(Context context) {
        return PendingIntent.getService(context, 2071862118, new Intent(context, SyncService.class), 134217728);
    }

    /* renamed from: d */
    private static void m17589d() {
        long a = C4306Xa.m17122a();
        if (a >= 60) {
            C4306Xa.m17129a(a, true);
        }
    }

    /* renamed from: d */
    private static void m17590d(Context context, long j) {
        synchronized (f13048a) {
            if (f13048a.longValue() == 0 || System.currentTimeMillis() + j <= f13048a.longValue()) {
                if (j < 5000) {
                    j = 5000;
                }
                if (m17591e()) {
                    m17586c(context, j);
                } else {
                    m17583b(context, j);
                }
                f13048a = Long.valueOf(System.currentTimeMillis() + j);
            }
        }
    }

    /* renamed from: e */
    private static boolean m17591e() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
