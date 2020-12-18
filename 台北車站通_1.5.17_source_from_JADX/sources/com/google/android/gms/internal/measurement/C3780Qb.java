package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.internal.measurement.C3795Ub;

/* renamed from: com.google.android.gms.internal.measurement.Qb */
public final class C3780Qb<T extends Context & C3795Ub> {

    /* renamed from: a */
    private final T f11280a;

    public C3780Qb(T t) {
        C2061y.m9067a(t);
        this.f11280a = t;
    }

    /* renamed from: a */
    private final void m15033a(Runnable runnable) {
        C3715Aa a = C3715Aa.m14845a((Context) this.f11280a);
        a.mo10386c().mo11020a((Runnable) new C3791Tb(this, a, runnable));
    }

    /* renamed from: a */
    public static boolean m15034a(Context context, boolean z) {
        C2061y.m9067a(context);
        return C3871mc.m15514a(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: c */
    private final C3801W m15035c() {
        return C3715Aa.m14845a((Context) this.f11280a).mo10385b();
    }

    /* renamed from: a */
    public final int mo10522a(Intent intent, int i, int i2) {
        C3801W b = C3715Aa.m14845a((Context) this.f11280a).mo10385b();
        if (intent == null) {
            b.mo10576B().mo10592a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        b.mo10580F().mo10594a("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m15033a((Runnable) new C3783Rb(this, i2, b, intent));
        }
        return 2;
    }

    /* renamed from: a */
    public final IBinder mo10523a(Intent intent) {
        if (intent == null) {
            m15035c().mo10585y().mo10592a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C3723Ca(C3715Aa.m14845a((Context) this.f11280a));
        }
        m15035c().mo10576B().mo10593a("onBind received unknown action", action);
        return null;
    }

    /* renamed from: a */
    public final void mo10524a() {
        C3715Aa.m14845a((Context) this.f11280a).mo10385b().mo10580F().mo10592a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10525a(int i, C3801W w, Intent intent) {
        if (((C3795Ub) this.f11280a).mo10563a(i)) {
            w.mo10580F().mo10593a("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m15035c().mo10580F().mo10592a("Completed wakeful intent.");
            ((C3795Ub) this.f11280a).mo10562a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo10526a(C3801W w, JobParameters jobParameters) {
        w.mo10580F().mo10592a("AppMeasurementJobService processed last upload request.");
        ((C3795Ub) this.f11280a).mo10561a(jobParameters, false);
    }

    @TargetApi(24)
    /* renamed from: a */
    public final boolean mo10527a(JobParameters jobParameters) {
        C3801W b = C3715Aa.m14845a((Context) this.f11280a).mo10385b();
        String string = jobParameters.getExtras().getString("action");
        b.mo10580F().mo10593a("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m15033a((Runnable) new C3787Sb(this, b, jobParameters));
        return true;
    }

    /* renamed from: b */
    public final void mo10528b() {
        C3715Aa.m14845a((Context) this.f11280a).mo10385b().mo10580F().mo10592a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: b */
    public final void mo10529b(Intent intent) {
        if (intent == null) {
            m15035c().mo10585y().mo10592a("onRebind called with null intent");
            return;
        }
        m15035c().mo10580F().mo10593a("onRebind called. action", intent.getAction());
    }

    /* renamed from: c */
    public final boolean mo10530c(Intent intent) {
        if (intent == null) {
            m15035c().mo10585y().mo10592a("onUnbind called with null intent");
            return true;
        }
        m15035c().mo10580F().mo10593a("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
