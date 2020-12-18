package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C3889ra;
import com.google.android.gms.internal.measurement.C3901ua;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C3901ua {

    /* renamed from: a */
    private C3889ra f11909a;

    /* renamed from: a */
    public final BroadcastReceiver.PendingResult mo10976a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo10977a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f11909a == null) {
            this.f11909a = new C3889ra(this);
        }
        this.f11909a.mo10948a(context, intent);
    }
}
