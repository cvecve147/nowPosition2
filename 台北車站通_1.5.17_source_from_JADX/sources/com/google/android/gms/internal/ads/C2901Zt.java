package com.google.android.gms.internal.ads;

import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Zt */
public abstract class C2901Zt extends C2296Eq implements C2874Yt {
    public C2901Zt() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo7038G();
                break;
            case 2:
                mo7039a(parcel.readFloat());
                break;
            case 3:
                mo7043e(parcel.readString());
                break;
            case 4:
                mo7044f(C2324Fq.m9805a(parcel));
                break;
            case 5:
                mo7040a(C5464b.C5465a.asInterface(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                mo7042b(parcel.readString(), C5464b.C5465a.asInterface(parcel.readStrongBinder()));
                break;
            case 7:
                float ma = mo7045ma();
                parcel2.writeNoException();
                parcel2.writeFloat(ma);
                return true;
            case 8:
                boolean ta = mo7046ta();
                parcel2.writeNoException();
                C2324Fq.m9804a(parcel2, ta);
                return true;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
