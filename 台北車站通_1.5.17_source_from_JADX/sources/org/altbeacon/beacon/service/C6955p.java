package org.altbeacon.beacon.service;

import android.app.job.JobParameters;
import org.altbeacon.beacon.p293c.C6895d;

/* renamed from: org.altbeacon.beacon.service.p */
class C6955p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobParameters f19202a;

    /* renamed from: b */
    final /* synthetic */ ScanJob f19203b;

    C6955p(ScanJob scanJob, JobParameters jobParameters) {
        this.f19203b = scanJob;
        this.f19202a = jobParameters;
    }

    public void run() {
        String a = ScanJob.f19080a;
        C6895d.m26026c(a, "Scan job runtime expired: " + this.f19203b, new Object[0]);
        this.f19203b.m26164g();
        this.f19203b.f19083d.mo18962l();
        this.f19203b.jobFinished(this.f19202a, false);
        this.f19203b.f19084e.post(new C6954o(this));
    }
}
