package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Xv */
public final class C2848Xv extends C2267Dq implements C2793Vv {
    C2848Xv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    /* renamed from: ea */
    public final List<C2903Zv> mo8973ea() {
        Parcel a = mo8008a(3, mo8007Xa());
        ArrayList b = C2324Fq.m9806b(a);
        a.recycle();
        return b;
    }

    public final String getText() {
        Parcel a = mo8008a(2, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
