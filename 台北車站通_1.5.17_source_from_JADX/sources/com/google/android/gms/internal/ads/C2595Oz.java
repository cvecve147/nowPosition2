package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Oz */
public final class C2595Oz extends C2267Dq implements C2533Mz {
    C2595Oz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2626Pz mo8520g(java.lang.String r4) {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo8007Xa()
            r0.writeString(r4)
            r4 = 1
            android.os.Parcel r4 = r3.mo8008a(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.C2626Pz
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.Pz r0 = (com.google.android.gms.internal.ads.C2626Pz) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.Rz r1 = new com.google.android.gms.internal.ads.Rz
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2595Oz.mo8520g(java.lang.String):com.google.android.gms.internal.ads.Pz");
    }

    /* renamed from: i */
    public final boolean mo8521i(String str) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        Parcel a = mo8008a(2, Xa);
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }
}
