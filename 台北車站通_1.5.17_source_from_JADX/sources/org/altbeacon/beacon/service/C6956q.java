package org.altbeacon.beacon.service;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.bluetooth.le.ScanResult;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.C6904f;
import org.altbeacon.beacon.C6906h;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.q */
public class C6956q {

    /* renamed from: a */
    private static final String f19204a = "q";

    /* renamed from: b */
    private static final Object f19205b = new Object();

    /* renamed from: c */
    private static volatile C6956q f19206c = null;

    /* renamed from: d */
    private Long f19207d = 0L;

    /* renamed from: e */
    private List<ScanResult> f19208e = new ArrayList();

    /* renamed from: f */
    private C6904f f19209f;

    private C6956q() {
    }

    /* renamed from: a */
    private void m26320a(Context context, C6906h hVar, C6957r rVar) {
        rVar.mo18951a(hVar);
        String str = f19204a;
        C6895d.m26021a(str, "Applying scan job settings with background mode " + rVar.mo18952b(), new Object[0]);
        m26321a(context, rVar, false);
    }

    /* renamed from: a */
    private void m26321a(Context context, C6957r rVar, boolean z) {
        long j;
        m26323c(context);
        long j2 = (long) (rVar.mo18960j() - rVar.mo18961k());
        if (z) {
            C6895d.m26021a(f19204a, "We just woke up in the background based on a new scan result.  Start scan job immediately.", new Object[0]);
            j = 0;
        } else {
            j = j2 > 0 ? SystemClock.elapsedRealtime() % ((long) rVar.mo18960j()) : 0;
            if (j < 50) {
                j = 50;
            }
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!z && rVar.mo18952b().booleanValue()) {
            C6895d.m26021a(f19204a, "Not scheduling an immediate scan because we are in background mode.   Cancelling existing immediate scan.", new Object[0]);
            jobScheduler.cancel(ScanJob.m26151a(context));
        } else if (j < ((long) (rVar.mo18960j() - 50))) {
            C6895d.m26021a(f19204a, "Scheduling immediate ScanJob to run in " + j + " millis", new Object[0]);
            int schedule = jobScheduler.schedule(new JobInfo.Builder(ScanJob.m26151a(context), new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle()).setMinimumLatency(j).setOverrideDeadline(j).build());
            if (schedule < 0) {
                C6895d.m26024b(f19204a, "Failed to schedule scan job.  Beacons will not be detected. Error: " + schedule, new Object[0]);
            }
        } else {
            C6895d.m26021a(f19204a, "Not scheduling immediate scan, assuming periodic is about to run", new Object[0]);
        }
        JobInfo.Builder extras = new JobInfo.Builder(ScanJob.m26155b(context), new ComponentName(context, ScanJob.class)).setPersisted(true).setExtras(new PersistableBundle());
        (Build.VERSION.SDK_INT >= 24 ? extras.setPeriodic((long) rVar.mo18960j(), 0) : extras.setPeriodic((long) rVar.mo18960j())).build();
        JobInfo build = extras.build();
        C6895d.m26021a(f19204a, "Scheduling ScanJob " + build + " to run every " + rVar.mo18960j() + " millis", new Object[0]);
        int schedule2 = jobScheduler.schedule(build);
        if (schedule2 < 0) {
            C6895d.m26024b(f19204a, "Failed to schedule scan job.  Beacons will not be detected. Error: " + schedule2, new Object[0]);
        }
    }

    /* renamed from: b */
    public static C6956q m26322b() {
        C6956q qVar = f19206c;
        if (qVar == null) {
            synchronized (f19205b) {
                qVar = f19206c;
                if (qVar == null) {
                    qVar = new C6956q();
                    f19206c = qVar;
                }
            }
        }
        return qVar;
    }

    /* renamed from: c */
    private void m26323c(Context context) {
        if (this.f19209f == null) {
            this.f19209f = new C6904f(context);
        }
        this.f19209f.mo18753a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ScanResult> mo18944a() {
        List<ScanResult> list = this.f19208e;
        this.f19208e = new ArrayList();
        return list;
    }

    /* renamed from: a */
    public void mo18945a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.cancel(ScanJob.m26151a(context));
        jobScheduler.cancel(ScanJob.m26155b(context));
        C6904f fVar = this.f19209f;
        if (fVar != null) {
            fVar.mo18754b();
        }
    }

    /* renamed from: a */
    public void mo18946a(Context context, List<ScanResult> list) {
        if (list != null) {
            this.f19208e.addAll(list);
        }
        synchronized (this) {
            if (System.currentTimeMillis() - this.f19207d.longValue() > 10000) {
                String str = f19204a;
                C6895d.m26021a(str, "scheduling an immediate scan job because last did " + (System.currentTimeMillis() - this.f19207d.longValue()) + "seconds ago.", new Object[0]);
                this.f19207d = Long.valueOf(System.currentTimeMillis());
                m26321a(context, C6957r.m26329a(context), true);
                return;
            }
            C6895d.m26021a(f19204a, "Not scheduling an immediate scan job because we just did recently.", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo18947a(Context context, C6906h hVar) {
        C6895d.m26021a(f19204a, "Applying settings to ScanJob", new Object[0]);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        m26320a(context, hVar, C6957r.m26329a(context));
    }

    /* renamed from: b */
    public void mo18948b(Context context) {
        m26321a(context, C6957r.m26329a(context), false);
    }
}
