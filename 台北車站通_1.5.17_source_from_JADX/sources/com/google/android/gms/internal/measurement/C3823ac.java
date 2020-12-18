package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.C2083e;

/* renamed from: com.google.android.gms.internal.measurement.ac */
public final class C3823ac extends C3835dc {

    /* renamed from: d */
    private final AlarmManager f11394d = ((AlarmManager) getContext().getSystemService("alarm"));

    /* renamed from: e */
    private final C3726D f11395e;

    /* renamed from: f */
    private Integer f11396f;

    protected C3823ac(C3839ec ecVar) {
        super(ecVar);
        this.f11395e = new C3827bc(this, ecVar.mo10718r(), ecVar);
    }

    /* renamed from: A */
    private final PendingIntent m15323A() {
        Intent className = new Intent().setClassName(getContext(), "com.google.android.gms.measurement.AppMeasurementReceiver");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        return PendingIntent.getBroadcast(getContext(), 0, className, 0);
    }

    @TargetApi(24)
    /* renamed from: B */
    private final void m15324B() {
        mo10385b().mo10580F().mo10593a("Cancelling job. JobID", Integer.valueOf(m15325z()));
        ((JobScheduler) getContext().getSystemService("jobscheduler")).cancel(m15325z());
    }

    /* renamed from: z */
    private final int m15325z() {
        if (this.f11396f == null) {
            String valueOf = String.valueOf(getContext().getPackageName());
            this.f11396f = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f11396f.intValue();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2083e mo10382a() {
        return super.mo10382a();
    }

    /* renamed from: a */
    public final void mo10660a(long j) {
        mo10685v();
        if (!C3889ra.m15667a(getContext())) {
            mo10385b().mo10579E().mo10592a("Receiver not registered/enabled");
        }
        if (!C3780Qb.m15034a(getContext(), false)) {
            mo10385b().mo10579E().mo10592a("Service not registered/enabled");
        }
        mo10661y();
        long b = mo10382a().mo7726b() + j;
        if (j < Math.max(0, C3758L.f11170D.mo10498a().longValue()) && !this.f11395e.mo10440c()) {
            mo10385b().mo10580F().mo10592a("Scheduling upload with DelayedRunnable");
            this.f11395e.mo10439a(j);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            mo10385b().mo10580F().mo10592a("Scheduling upload with JobScheduler");
            JobInfo.Builder builder = new JobInfo.Builder(m15325z(), new ComponentName(getContext(), "com.google.android.gms.measurement.AppMeasurementJobService"));
            builder.setMinimumLatency(j);
            builder.setOverrideDeadline(j << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            mo10385b().mo10580F().mo10593a("Scheduling job. JobID", Integer.valueOf(m15325z()));
            ((JobScheduler) getContext().getSystemService("jobscheduler")).schedule(build);
            return;
        }
        mo10385b().mo10580F().mo10592a("Scheduling upload with AlarmManager");
        this.f11394d.setInexactRepeating(2, b, Math.max(C3758L.f11218y.mo10498a().longValue(), j), m15323A());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C3801W mo10385b() {
        return super.mo10385b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C3909wa mo10386c() {
        return super.mo10386c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo10451d() {
        super.mo10451d();
    }

    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C3734F mo10452j() {
        return super.mo10452j();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C3793U mo10453n() {
        return super.mo10453n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C3871mc mo10454o() {
        return super.mo10454o();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C3849ha mo10455q() {
        return super.mo10455q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C3908w mo10456r() {
        return super.mo10456r();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C3920z mo10656t() {
        return super.mo10656t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final boolean mo10657w() {
        this.f11394d.cancel(m15323A());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m15324B();
        return false;
    }

    /* renamed from: y */
    public final void mo10661y() {
        mo10685v();
        this.f11394d.cancel(m15323A());
        this.f11395e.mo10438a();
        if (Build.VERSION.SDK_INT >= 24) {
            m15324B();
        }
    }
}
