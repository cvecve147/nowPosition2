package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.zt */
public abstract class C3675zt extends C2296Eq implements C3646yt {
    public C3675zt() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = mo6954i();
            } else if (i == 3) {
                boolean T = mo6951T();
                parcel2.writeNoException();
                C2324Fq.m9804a(parcel2, T);
                return true;
            } else if (i == 4) {
                str = mo6950O();
            } else if (i != 5) {
                return false;
            } else {
                mo6953a((zzjj) C2324Fq.m9801a(parcel, zzjj.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        mo6952a((zzjj) C2324Fq.m9801a(parcel, zzjj.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
