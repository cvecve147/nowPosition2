package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.C3780Qb;
import com.google.android.gms.internal.measurement.C3795Ub;
import p013b.p018b.p028h.p029a.C1024f;

public final class AppMeasurementService extends Service implements C3795Ub {

    /* renamed from: a */
    private C3780Qb<AppMeasurementService> f11912a;

    /* renamed from: a */
    private final C3780Qb<AppMeasurementService> m16137a() {
        if (this.f11912a == null) {
            this.f11912a = new C3780Qb<>(this);
        }
        return this.f11912a;
    }

    /* renamed from: a */
    public final void mo10561a(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo10562a(Intent intent) {
        C1024f.m5439a(intent);
    }

    /* renamed from: a */
    public final boolean mo10563a(int i) {
        return stopSelfResult(i);
    }

    public final IBinder onBind(Intent intent) {
        return m16137a().mo10523a(intent);
    }

    public final void onCreate() {
        super.onCreate();
        m16137a().mo10524a();
    }

    public final void onDestroy() {
        m16137a().mo10528b();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        m16137a().mo10529b(intent);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return m16137a().mo10522a(intent, i, i2);
    }

    public final boolean onUnbind(Intent intent) {
        return m16137a().mo10530c(intent);
    }
}
