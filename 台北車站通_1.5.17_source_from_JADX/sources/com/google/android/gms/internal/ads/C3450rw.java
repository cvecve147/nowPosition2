package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.rw */
public final class C3450rw extends C2267Dq implements C3393pw {
    C3450rw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2903Zv mo9900W() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 6
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2903Zv
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.Zv r1 = (com.google.android.gms.internal.ads.C2903Zv) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.aw r2 = new com.google.android.gms.internal.ads.aw
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3450rw.mo9900W():com.google.android.gms.internal.ads.Zv");
    }

    /* renamed from: a */
    public final List mo9901a() {
        Parcel a = mo8008a(4, mo8007Xa());
        ArrayList b = C2324Fq.m9806b(a);
        a.recycle();
        return b;
    }

    /* renamed from: b */
    public final String mo9903b() {
        Parcel a = mo8008a(3, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final String mo9906d() {
        Parcel a = mo8008a(7, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final C2987bu getVideoController() {
        Parcel a = mo8008a(11, mo8007Xa());
        C2987bu a2 = C3015cu.m12112a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo9911h() {
        Parcel a = mo8008a(5, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2793Vv mo9913j() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 15
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2793Vv
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Vv r1 = (com.google.android.gms.internal.ads.C2793Vv) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Xv r2 = new com.google.android.gms.internal.ads.Xv
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3450rw.mo9913j():com.google.android.gms.internal.ads.Vv");
    }

    /* renamed from: x */
    public final C5464b mo9914x() {
        Parcel a = mo8008a(2, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: y */
    public final String mo9915y() {
        Parcel a = mo8008a(8, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
