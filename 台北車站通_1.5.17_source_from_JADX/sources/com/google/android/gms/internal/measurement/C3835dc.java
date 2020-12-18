package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.dc */
abstract class C3835dc extends C3831cc {

    /* renamed from: c */
    private boolean f11414c;

    C3835dc(C3839ec ecVar) {
        super(ecVar);
        this.f11404b.mo10695a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final boolean mo10684u() {
        return this.f11414c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo10685v() {
        if (!mo10684u()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract boolean mo10657w();

    /* renamed from: x */
    public final void mo10686x() {
        if (!this.f11414c) {
            mo10657w();
            this.f11404b.mo10717q();
            this.f11414c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
