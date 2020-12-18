package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* renamed from: com.onesignal.eb */
abstract class C4361eb extends JobService {
    C4361eb() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo12297a(JobService jobService, JobParameters jobParameters);

    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new C4357db(this, this, jobParameters), "OS_JOBSERVICE_BASE").start();
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
