package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3889ra;
import com.google.android.gms.internal.measurement.C3901ua;
import p013b.p018b.p028h.p029a.C1024f;

public final class AppMeasurementReceiver extends C1024f implements C3901ua {

    /* renamed from: c */
    private C3889ra f11911c;

    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo10976a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo10977a(Context context, Intent intent) {
        C1024f.m5440b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f11911c == null) {
            this.f11911c = new C3889ra(this);
        }
        this.f11911c.mo10948a(context, intent);
    }
}
