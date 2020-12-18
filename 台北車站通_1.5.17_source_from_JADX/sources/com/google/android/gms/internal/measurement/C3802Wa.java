package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.Wa */
abstract class C3802Wa extends C3798Va {

    /* renamed from: b */
    private boolean f11342b;

    C3802Wa(C3715Aa aa) {
        super(aa);
        this.f11325a.mo10383a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo10587s() {
        return this.f11342b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo10588t() {
        if (!mo10587s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract boolean mo10457u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo10518v() {
    }

    /* renamed from: w */
    public final void mo10589w() {
        if (!this.f11342b) {
            mo10518v();
            this.f11325a.mo10380H();
            this.f11342b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* renamed from: x */
    public final void mo10590x() {
        if (this.f11342b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo10457u()) {
            this.f11325a.mo10380H();
            this.f11342b = true;
        }
    }
}
