package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tw */
public abstract class C2738Tw extends C2296Eq implements C2709Sw {
    public C2738Tw() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9802a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00bd;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a2;
                case 6: goto L_0x009d;
                case 7: goto L_0x0098;
                case 8: goto L_0x008d;
                case 9: goto L_0x0088;
                case 10: goto L_0x0083;
                case 11: goto L_0x007e;
                case 12: goto L_0x0079;
                case 13: goto L_0x0072;
                case 14: goto L_0x006d;
                case 15: goto L_0x0061;
                case 16: goto L_0x004d;
                case 17: goto L_0x0041;
                case 18: goto L_0x003c;
                case 19: goto L_0x0036;
                case 20: goto L_0x002a;
                case 21: goto L_0x000a;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.mo8858A()
            goto L_0x0075
        L_0x000a:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2651Qw
            if (r4 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Qw r1 = (com.google.android.gms.internal.ads.C2651Qw) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Rw r2 = new com.google.android.gms.internal.ads.Rw
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.mo8861a((com.google.android.gms.internal.ads.C2651Qw) r1)
            goto L_0x0075
        L_0x002a:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9807b(r3, r1)
            goto L_0x00c7
        L_0x0036:
            d.g.b.a.b.b r1 = r0.mo8863c()
            goto L_0x00a6
        L_0x003c:
            d.g.b.a.b.b r1 = r0.mo8876x()
            goto L_0x00a6
        L_0x0041:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo8866d(r1)
            goto L_0x0075
        L_0x004d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r0.mo8864c(r1)
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9804a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x00c7
        L_0x0061:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r0.mo8860a((android.os.Bundle) r1)
            goto L_0x0075
        L_0x006d:
            com.google.android.gms.internal.ads.Vv r1 = r0.mo8872j()
            goto L_0x00a6
        L_0x0072:
            r0.destroy()
        L_0x0075:
            r3.writeNoException()
            goto L_0x00c7
        L_0x0079:
            java.lang.String r1 = r0.mo8871i()
            goto L_0x00c1
        L_0x007e:
            com.google.android.gms.internal.ads.bu r1 = r0.getVideoController()
            goto L_0x00a6
        L_0x0083:
            java.lang.String r1 = r0.mo8873s()
            goto L_0x00c1
        L_0x0088:
            java.lang.String r1 = r0.mo8878z()
            goto L_0x00c1
        L_0x008d:
            double r1 = r0.mo8875u()
            r3.writeNoException()
            r3.writeDouble(r1)
            goto L_0x00c7
        L_0x0098:
            java.lang.String r1 = r0.mo8877y()
            goto L_0x00c1
        L_0x009d:
            java.lang.String r1 = r0.mo8865d()
            goto L_0x00c1
        L_0x00a2:
            com.google.android.gms.internal.ads.Zv r1 = r0.mo8874t()
        L_0x00a6:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x00c7
        L_0x00ad:
            java.lang.String r1 = r0.mo8870h()
            goto L_0x00c1
        L_0x00b2:
            java.util.List r1 = r0.mo8859a()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00c7
        L_0x00bd:
            java.lang.String r1 = r0.mo8862b()
        L_0x00c1:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00c7:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2738Tw.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
