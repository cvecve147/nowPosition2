package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Nb */
final class C3768Nb implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3766N f11248a;

    /* renamed from: b */
    private final /* synthetic */ C3756Kb f11249b;

    C3768Nb(C3756Kb kb, C3766N n) {
        this.f11249b = kb;
        this.f11248a = n;
    }

    public final void run() {
        synchronized (this.f11249b) {
            boolean unused = this.f11249b.f11164a = false;
            if (!this.f11249b.f11166c.mo11040z()) {
                this.f11249b.f11166c.mo10385b().mo10579E().mo10592a("Connected to remote service");
                this.f11249b.f11166c.mo11029a(this.f11248a);
            }
        }
    }
}
