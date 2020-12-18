package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.aw */
public final class C2960aw extends C2267Dq implements C2903Zv {
    C2960aw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final Uri getUri() {
        Parcel a = mo8008a(2, mo8007Xa());
        Uri uri = (Uri) C2324Fq.m9801a(a, Uri.CREATOR);
        a.recycle();
        return uri;
    }

    /* renamed from: na */
    public final C5464b mo9130na() {
        Parcel a = mo8008a(1, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: za */
    public final double mo9131za() {
        Parcel a = mo8008a(3, mo8007Xa());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }
}
