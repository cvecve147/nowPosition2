package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;

public class RestoreKickoffJobService extends C4361eb {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12297a(JobService jobService, JobParameters jobParameters) {
        Thread.currentThread().setPriority(10);
        C4306Xa.m17176f((Context) this);
        C4305X.m17094b(getApplicationContext());
    }

    public /* bridge */ /* synthetic */ boolean onStartJob(JobParameters jobParameters) {
        return super.onStartJob(jobParameters);
    }

    public /* bridge */ /* synthetic */ boolean onStopJob(JobParameters jobParameters) {
        return super.onStopJob(jobParameters);
    }
}
