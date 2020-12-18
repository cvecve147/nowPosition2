package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.ev */
public abstract class C3074ev extends C2296Eq implements C3046dv {
    public C3074ev() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = mo9196Ca();
        } else if (i != 2) {
            if (i == 3) {
                mo9200q(C5464b.C5465a.asInterface(parcel.readStrongBinder()));
            } else if (i == 4) {
                mo9199ka();
            } else if (i != 5) {
                return false;
            } else {
                mo9197e();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = getContent();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
