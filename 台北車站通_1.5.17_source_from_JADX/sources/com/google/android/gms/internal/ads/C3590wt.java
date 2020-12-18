package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.wt */
public abstract class C3590wt extends C2296Eq implements C3562vt {
    public C3590wt() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo8802U();
                break;
            case 2:
                mo8803c(parcel.readInt());
                break;
            case 3:
                mo8799N();
                break;
            case 4:
                mo8800P();
                break;
            case 5:
                mo8798M();
                break;
            case 6:
                mo8804f();
                break;
            case 7:
                mo8801S();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
