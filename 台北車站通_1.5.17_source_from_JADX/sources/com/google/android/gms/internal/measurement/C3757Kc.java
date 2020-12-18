package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.Kc */
public final class C3757Kc extends C3737Fc implements C3749Ic {
    C3757Kc(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    /* renamed from: i */
    public final Bundle mo10484i(Bundle bundle) {
        Parcel Xa = mo10462Xa();
        C3745Hc.m14947a(Xa, (Parcelable) bundle);
        Parcel a = mo10463a(1, Xa);
        Bundle bundle2 = (Bundle) C3745Hc.m14946a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
