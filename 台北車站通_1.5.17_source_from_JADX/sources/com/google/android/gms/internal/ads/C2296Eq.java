package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Eq */
public class C2296Eq extends Binder implements IInterface {
    private static C2354Gq zzuh;

    protected C2296Eq(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        throw null;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        return dispatchTransaction(i, parcel, parcel2, i2);
    }
}
