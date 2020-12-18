package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import com.onesignal.C4426tb;

public class SyncJobService extends JobService {
    public boolean onStartJob(JobParameters jobParameters) {
        C4426tb.m17581a((Context) this, (C4426tb.C4429c) new C4426tb.C4428b(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return C4426tb.m17584b();
    }
}
