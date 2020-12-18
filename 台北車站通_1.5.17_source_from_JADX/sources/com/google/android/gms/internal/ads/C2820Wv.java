package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Wv */
public abstract class C2820Wv extends C2296Eq implements C2793Vv {
    public C2820Wv() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String text = getText();
            parcel2.writeNoException();
            parcel2.writeString(text);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<C2903Zv> ea = mo8973ea();
            parcel2.writeNoException();
            parcel2.writeList(ea);
            return true;
        }
    }
}
