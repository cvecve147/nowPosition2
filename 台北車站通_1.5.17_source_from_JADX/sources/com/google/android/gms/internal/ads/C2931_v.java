package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads._v */
public abstract class C2931_v extends C2296Eq implements C2903Zv {
    public C2931_v() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    /* renamed from: a */
    public static C2903Zv m11894a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return queryLocalInterface instanceof C2903Zv ? (C2903Zv) queryLocalInterface : new C2960aw(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C5464b na = mo9130na();
            parcel2.writeNoException();
            C2324Fq.m9802a(parcel2, (IInterface) na);
        } else if (i == 2) {
            Uri uri = getUri();
            parcel2.writeNoException();
            C2324Fq.m9807b(parcel2, uri);
        } else if (i != 3) {
            return false;
        } else {
            double za = mo9131za();
            parcel2.writeNoException();
            parcel2.writeDouble(za);
        }
        return true;
    }
}
