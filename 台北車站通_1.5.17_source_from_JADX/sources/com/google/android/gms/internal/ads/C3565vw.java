package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.vw */
public final class C3565vw extends C2267Dq implements C3507tw {
    C3565vw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: Ha */
    public final C5464b mo10056Ha() {
        Parcel a = mo8008a(9, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final C2987bu getVideoController() {
        Parcel a = mo8008a(7, mo8007Xa());
        C2987bu a2 = C3015cu.m12112a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: l */
    public final String mo10061l() {
        Parcel a = mo8008a(4, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: l */
    public final boolean mo10063l(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Parcel a = mo8008a(10, Xa);
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }
}
