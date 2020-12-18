package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.internal.measurement.Sb */
final /* synthetic */ class C3787Sb implements Runnable {

    /* renamed from: a */
    private final C3780Qb f11306a;

    /* renamed from: b */
    private final C3801W f11307b;

    /* renamed from: c */
    private final JobParameters f11308c;

    C3787Sb(C3780Qb qb, C3801W w, JobParameters jobParameters) {
        this.f11306a = qb;
        this.f11307b = w;
        this.f11308c = jobParameters;
    }

    public final void run() {
        this.f11306a.mo10526a(this.f11307b, this.f11308c);
    }
}
