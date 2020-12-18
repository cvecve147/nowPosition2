package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j */
public abstract class C3856j {

    /* renamed from: a */
    protected volatile int f11510a = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo10403a() {
        return 0;
    }

    /* renamed from: a */
    public abstract C3856j mo10404a(C3820a aVar);

    /* renamed from: a */
    public void mo10405a(C3824b bVar) {
    }

    /* renamed from: b */
    public C3856j clone() {
        return (C3856j) super.clone();
    }

    /* renamed from: c */
    public final int mo10757c() {
        if (this.f11510a < 0) {
            mo10758d();
        }
        return this.f11510a;
    }

    /* renamed from: d */
    public final int mo10758d() {
        int a = mo10403a();
        this.f11510a = a;
        return a;
    }

    public String toString() {
        return C3860k.m15496a(this);
    }
}
