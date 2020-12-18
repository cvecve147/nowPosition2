package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.internal.measurement.Ob */
final class C3772Ob implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C3756Kb f11262a;

    C3772Ob(C3756Kb kb) {
        this.f11262a = kb;
    }

    public final void run() {
        C3910wb wbVar = this.f11262a.f11166c;
        wbVar.m15826a(new ComponentName(wbVar.getContext(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
