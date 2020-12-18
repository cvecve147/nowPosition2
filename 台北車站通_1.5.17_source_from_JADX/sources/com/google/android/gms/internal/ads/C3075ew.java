package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.ew */
public abstract class C3075ew extends C2296Eq implements C3047dw {
    public C3075ew() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo8757a(parcel.readString(), C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 2:
                C5464b h = mo8762h(parcel.readString());
                parcel2.writeNoException();
                C2324Fq.m9802a(parcel2, (IInterface) h);
                return true;
            case 3:
                mo8758d(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                mo8759d(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                mo8761e(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
