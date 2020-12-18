package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* renamed from: com.onesignal.db */
class C4357db implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JobService f12880a;

    /* renamed from: b */
    final /* synthetic */ JobParameters f12881b;

    /* renamed from: c */
    final /* synthetic */ C4361eb f12882c;

    C4357db(C4361eb ebVar, JobService jobService, JobParameters jobParameters) {
        this.f12882c = ebVar;
        this.f12880a = jobService;
        this.f12881b = jobParameters;
    }

    public void run() {
        this.f12882c.mo12297a(this.f12880a, this.f12881b);
        this.f12882c.jobFinished(this.f12881b, false);
    }
}
