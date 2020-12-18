package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3780Qb;
import com.google.android.gms.internal.measurement.C3795Ub;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements C3795Ub {

    /* renamed from: a */
    private C3780Qb<AppMeasurementJobService> f11910a;

    /* renamed from: a */
    private final C3780Qb<AppMeasurementJobService> m16131a() {
        if (this.f11910a == null) {
            this.f11910a = new C3780Qb<>(this);
        }
        return this.f11910a;
    }

    @TargetApi(24)
    /* renamed from: a */
    public final void mo10561a(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: a */
    public final void mo10562a(Intent intent) {
    }

    /* renamed from: a */
    public final boolean mo10563a(int i) {
        throw new UnsupportedOperationException();
    }

    public final void onCreate() {
        super.onCreate();
        m16131a().mo10524a();
    }

    public final void onDestroy() {
        m16131a().mo10528b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m16131a().mo10529b(intent);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        return m16131a().mo10527a(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return m16131a().mo10530c(intent);
    }
}
