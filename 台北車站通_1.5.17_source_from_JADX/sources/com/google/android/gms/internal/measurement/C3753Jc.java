package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.measurement.Jc */
public abstract class C3753Jc extends C3741Gc implements C3749Ic {
    /* renamed from: a */
    public static C3749Ic m14951a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof C3749Ic ? (C3749Ic) queryLocalInterface : new C3757Kc(iBinder);
    }
}
