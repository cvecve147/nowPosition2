package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.Oc */
final class C3773Oc extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C3769Nc f11263a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3773Oc(C3769Nc nc, Handler handler) {
        super((Handler) null);
        this.f11263a = nc;
    }

    public final void onChange(boolean z) {
        this.f11263a.mo10507b();
        this.f11263a.m14995d();
    }
}
