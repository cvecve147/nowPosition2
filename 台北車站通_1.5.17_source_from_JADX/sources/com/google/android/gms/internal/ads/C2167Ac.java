package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ac */
public abstract class C2167Ac extends C2296Eq implements C3629yc {
    public C2167Ac() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.Dc] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.wc] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L_0x00c5
            r0 = 2
            if (r3 == r0) goto L_0x00c1
            r0 = 3
            r1 = 0
            if (r3 == r0) goto L_0x00a3
            r0 = 34
            if (r3 == r0) goto L_0x009b
            switch(r3) {
                case 5: goto L_0x0090;
                case 6: goto L_0x008c;
                case 7: goto L_0x0088;
                case 8: goto L_0x0084;
                case 9: goto L_0x0078;
                case 10: goto L_0x006c;
                case 11: goto L_0x0060;
                case 12: goto L_0x0054;
                case 13: goto L_0x004b;
                case 14: goto L_0x003e;
                case 15: goto L_0x0032;
                case 16: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r3 = 0
            return r3
        L_0x0013:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x001a
            goto L_0x002d
        L_0x001a:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.C3573wc
            if (r0 == 0) goto L_0x0028
            r1 = r4
            com.google.android.gms.internal.ads.wc r1 = (com.google.android.gms.internal.ads.C3573wc) r1
            goto L_0x002d
        L_0x0028:
            com.google.android.gms.internal.ads.xc r1 = new com.google.android.gms.internal.ads.xc
            r1.<init>(r3)
        L_0x002d:
            r2.mo9864a((com.google.android.gms.internal.ads.C3573wc) r1)
            goto L_0x00d0
        L_0x0032:
            android.os.Bundle r3 = r2.mo9861Q()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9807b(r5, r3)
            goto L_0x00d3
        L_0x003e:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.internal.ads.Lt r3 = com.google.android.gms.internal.ads.C2527Mt.m10628a(r3)
            r2.mo9863a((com.google.android.gms.internal.ads.C2499Lt) r3)
            goto L_0x00d0
        L_0x004b:
            java.lang.String r3 = r4.readString()
            r2.mo9867c(r3)
            goto L_0x00d0
        L_0x0054:
            java.lang.String r3 = r2.mo9870i()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x00d3
        L_0x0060:
            android.os.IBinder r3 = r4.readStrongBinder()
            d.g.b.a.b.b r3 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r3)
            r2.mo9869f(r3)
            goto L_0x00d0
        L_0x006c:
            android.os.IBinder r3 = r4.readStrongBinder()
            d.g.b.a.b.b r3 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r3)
            r2.mo9871i(r3)
            goto L_0x00d0
        L_0x0078:
            android.os.IBinder r3 = r4.readStrongBinder()
            d.g.b.a.b.b r3 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r3)
            r2.mo9874v(r3)
            goto L_0x00d0
        L_0x0084:
            r2.destroy()
            goto L_0x00d0
        L_0x0088:
            r2.mo9860B()
            goto L_0x00d0
        L_0x008c:
            r2.pause()
            goto L_0x00d0
        L_0x0090:
            boolean r3 = r2.mo9875ya()
            r5.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9804a((android.os.Parcel) r5, (boolean) r3)
            goto L_0x00d3
        L_0x009b:
            boolean r3 = com.google.android.gms.internal.ads.C2324Fq.m9805a(r4)
            r2.mo9866a((boolean) r3)
            goto L_0x00d0
        L_0x00a3:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00aa
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r4 = "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.internal.ads.C2253Dc
            if (r0 == 0) goto L_0x00b8
            r1 = r4
            com.google.android.gms.internal.ads.Dc r1 = (com.google.android.gms.internal.ads.C2253Dc) r1
            goto L_0x00bd
        L_0x00b8:
            com.google.android.gms.internal.ads.Fc r1 = new com.google.android.gms.internal.ads.Fc
            r1.<init>(r3)
        L_0x00bd:
            r2.mo9862a((com.google.android.gms.internal.ads.C2253Dc) r1)
            goto L_0x00d0
        L_0x00c1:
            r2.mo9873v()
            goto L_0x00d0
        L_0x00c5:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzahk> r3 = com.google.android.gms.internal.ads.zzahk.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r4, r3)
            com.google.android.gms.internal.ads.zzahk r3 = (com.google.android.gms.internal.ads.zzahk) r3
            r2.mo9865a((com.google.android.gms.internal.ads.zzahk) r3)
        L_0x00d0:
            r5.writeNoException()
        L_0x00d3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2167Ac.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
