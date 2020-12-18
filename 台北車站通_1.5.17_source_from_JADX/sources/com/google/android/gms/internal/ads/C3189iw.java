package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.iw */
public abstract class C3189iw extends C2296Eq implements C3160hw {
    public C3189iw() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo8852d(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
        } else if (i == 2) {
            mo8851Pa();
        } else if (i != 3) {
            return false;
        } else {
            mo8853e(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
