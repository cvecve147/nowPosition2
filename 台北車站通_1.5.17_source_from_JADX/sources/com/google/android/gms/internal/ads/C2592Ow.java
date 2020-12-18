package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Ow */
public abstract class C2592Ow extends C2296Eq implements C2560Nw {
    public C2592Ow() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* renamed from: a */
    public static C2560Nw m10852a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof C2560Nw ? (C2560Nw) queryLocalInterface : new C2623Pw(iBinder);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) {
        /*
            r1 = this;
            r5 = 1
            if (r2 != r5) goto L_0x0026
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x000b
            r2 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r0 = r3 instanceof com.google.android.gms.internal.ads.C2709Sw
            if (r0 == 0) goto L_0x0019
            r2 = r3
            com.google.android.gms.internal.ads.Sw r2 = (com.google.android.gms.internal.ads.C2709Sw) r2
            goto L_0x001f
        L_0x0019:
            com.google.android.gms.internal.ads.Uw r3 = new com.google.android.gms.internal.ads.Uw
            r3.<init>(r2)
            r2 = r3
        L_0x001f:
            r1.mo8600a(r2)
            r4.writeNoException()
            return r5
        L_0x0026:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2592Ow.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
