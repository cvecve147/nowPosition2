package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.Mc */
final class C3765Mc extends ContentObserver {
    C3765Mc(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        C3761Lc.f11230e.set(true);
    }
}
