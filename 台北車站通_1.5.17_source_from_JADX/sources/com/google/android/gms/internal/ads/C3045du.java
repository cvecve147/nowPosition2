package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.du */
public final class C3045du extends C2267Dq implements C2987bu {
    C3045du(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* renamed from: a */
    public final void mo8405a(C3073eu euVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) euVar);
        mo8010b(8, Xa);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3073eu mo8410ca() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 11
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C3073eu
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.eu r1 = (com.google.android.gms.internal.ads.C3073eu) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.gu r2 = new com.google.android.gms.internal.ads.gu
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3045du.mo8410ca():com.google.android.gms.internal.ads.eu");
    }
}
