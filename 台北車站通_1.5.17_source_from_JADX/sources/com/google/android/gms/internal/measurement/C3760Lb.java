package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Lb */
final class C3760Lb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3766N f11224a;

    /* renamed from: b */
    private final /* synthetic */ C3756Kb f11225b;

    C3760Lb(C3756Kb kb, C3766N n) {
        this.f11225b = kb;
        this.f11224a = n;
    }

    public final void run() {
        synchronized (this.f11225b) {
            boolean unused = this.f11225b.f11164a = false;
            if (!this.f11225b.f11166c.mo11040z()) {
                this.f11225b.f11166c.mo10385b().mo10580F().mo10592a("Connected to service");
                this.f11225b.f11166c.mo11029a(this.f11224a);
            }
        }
    }
}
