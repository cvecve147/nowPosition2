package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.C4284Q;

public class GcmIntentJobService extends C4361eb {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12297a(JobService jobService, JobParameters jobParameters) {
        C4277O.m16969a((Context) jobService, (C4388k) new C4399n(jobParameters.getExtras()), (C4284Q.C4285a) null);
    }

    public /* bridge */ /* synthetic */ boolean onStartJob(JobParameters jobParameters) {
        return super.onStartJob(jobParameters);
    }

    public /* bridge */ /* synthetic */ boolean onStopJob(JobParameters jobParameters) {
        return super.onStopJob(jobParameters);
    }
}
