package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Tz */
public abstract class C2741Tz extends C2296Eq implements C2712Sz {
    public C2741Tz() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* renamed from: a */
    public static C2712Sz m11321a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof C2712Sz ? (C2712Sz) queryLocalInterface : new C2768Uz(iBinder);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0065;
                case 3: goto L_0x005d;
                case 4: goto L_0x0059;
                case 5: goto L_0x0055;
                case 6: goto L_0x0051;
                case 7: goto L_0x0031;
                case 8: goto L_0x002d;
                case 9: goto L_0x0021;
                case 10: goto L_0x0011;
                case 11: goto L_0x000d;
                case 12: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            java.lang.String r1 = r2.readString()
            r0.mo8891m(r1)
            goto L_0x006c
        L_0x000d:
            r0.mo8883R()
            goto L_0x006c
        L_0x0011:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.tw r1 = com.google.android.gms.internal.ads.C3537uw.m14185a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo8887a((com.google.android.gms.internal.ads.C3507tw) r1, (java.lang.String) r2)
            goto L_0x006c
        L_0x0021:
            java.lang.String r1 = r2.readString()
            java.lang.String r2 = r2.readString()
            r0.mo8888a((java.lang.String) r1, (java.lang.String) r2)
            goto L_0x006c
        L_0x002d:
            r0.mo8884S()
            goto L_0x006c
        L_0x0031:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0039
            r1 = 0
            goto L_0x004d
        L_0x0039:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2797Vz
            if (r4 == 0) goto L_0x0047
            r1 = r2
            com.google.android.gms.internal.ads.Vz r1 = (com.google.android.gms.internal.ads.C2797Vz) r1
            goto L_0x004d
        L_0x0047:
            com.google.android.gms.internal.ads.Xz r2 = new com.google.android.gms.internal.ads.Xz
            r2.<init>(r1)
            r1 = r2
        L_0x004d:
            r0.mo8886a(r1)
            goto L_0x006c
        L_0x0051:
            r0.mo8882P()
            goto L_0x006c
        L_0x0055:
            r0.mo8880M()
            goto L_0x006c
        L_0x0059:
            r0.mo8881N()
            goto L_0x006c
        L_0x005d:
            int r1 = r2.readInt()
            r0.mo8889c(r1)
            goto L_0x006c
        L_0x0065:
            r0.mo8885U()
            goto L_0x006c
        L_0x0069:
            r0.mo8890f()
        L_0x006c:
            r3.writeNoException()
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2741Tz.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
