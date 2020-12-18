package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.C2061y;

/* renamed from: com.google.android.gms.internal.measurement.D */
abstract class C3726D {

    /* renamed from: a */
    private static volatile Handler f11067a;

    /* renamed from: b */
    private final C3806Xa f11068b;

    /* renamed from: c */
    private final Runnable f11069c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile long f11070d;

    C3726D(C3806Xa xa) {
        C2061y.m9067a(xa);
        this.f11068b = xa;
        this.f11069c = new C3730E(this, xa);
    }

    /* renamed from: d */
    private final Handler m14912d() {
        Handler handler;
        if (f11067a != null) {
            return f11067a;
        }
        synchronized (C3726D.class) {
            if (f11067a == null) {
                f11067a = new Handler(this.f11068b.getContext().getMainLooper());
            }
            handler = f11067a;
        }
        return handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10438a() {
        this.f11070d = 0;
        m14912d().removeCallbacks(this.f11069c);
    }

    /* renamed from: a */
    public final void mo10439a(long j) {
        mo10438a();
        if (j >= 0) {
            this.f11070d = this.f11068b.mo10382a().mo7725a();
            if (!m14912d().postDelayed(this.f11069c, j)) {
                this.f11068b.mo10385b().mo10585y().mo10593a("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public abstract void mo10435b();

    /* renamed from: c */
    public final boolean mo10440c() {
        return this.f11070d != 0;
    }
}
