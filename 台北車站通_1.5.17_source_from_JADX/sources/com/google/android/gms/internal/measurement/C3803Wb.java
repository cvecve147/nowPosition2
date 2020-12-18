package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.measurement.Wb */
final class C3803Wb extends C3726D {

    /* renamed from: e */
    private final /* synthetic */ C3799Vb f11343e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3803Wb(C3799Vb vb, C3806Xa xa) {
        super(xa);
        this.f11343e = vb;
    }

    /* renamed from: b */
    public final void mo10435b() {
        C3799Vb vb = this.f11343e;
        vb.mo10451d();
        vb.mo10385b().mo10580F().mo10593a("Session started, time", Long.valueOf(vb.mo10382a().mo7726b()));
        vb.mo10455q().f11488v.mo10760a(false);
        vb.mo10567h().mo10625c("auto", "_s", new Bundle());
        vb.mo10455q().f11489w.mo10764a(vb.mo10382a().mo7725a());
    }
}
