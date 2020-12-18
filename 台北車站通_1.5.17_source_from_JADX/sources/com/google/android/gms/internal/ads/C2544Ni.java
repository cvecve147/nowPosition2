package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Ni */
public final class C2544Ni extends C2267Dq implements C2486Li {
    C2544Ni(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    /* renamed from: a */
    public final C5464b mo8481a(String str, C5464b bVar, String str2, String str3, String str4) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Xa.writeString(str2);
        Xa.writeString(str3);
        Xa.writeString(str4);
        Parcel a = mo8008a(3, Xa);
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: a */
    public final void mo8482a(C5464b bVar, C5464b bVar2) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9802a(Xa, (IInterface) bVar2);
        mo8010b(5, Xa);
    }

    public final String getVersion() {
        Parcel a = mo8008a(6, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: k */
    public final void mo8484k(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(7, Xa);
    }

    /* renamed from: n */
    public final boolean mo8485n(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Parcel a = mo8008a(2, Xa);
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: x */
    public final void mo8486x(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(4, Xa);
    }
}
