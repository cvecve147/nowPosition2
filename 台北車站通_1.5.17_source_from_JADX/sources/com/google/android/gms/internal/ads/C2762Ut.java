package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Ut */
public final class C2762Ut extends C2267Dq implements C2706St {
    C2762Ut(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2213Bt createAdLoaderBuilder(p101d.p129g.p131b.p132a.p134b.C5464b r2, java.lang.String r3, com.google.android.gms.internal.ads.C2533Mz r4, int r5) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo8007Xa()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r4)
            r0.writeInt(r5)
            r2 = 3
            android.os.Parcel r2 = r1.mo8008a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C2213Bt
            if (r5 == 0) goto L_0x002b
            r3 = r4
            com.google.android.gms.internal.ads.Bt r3 = (com.google.android.gms.internal.ads.C2213Bt) r3
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.Dt r4 = new com.google.android.gms.internal.ads.Dt
            r4.<init>(r3)
            r3 = r4
        L_0x0031:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2762Ut.createAdLoaderBuilder(d.g.b.a.b.b, java.lang.String, com.google.android.gms.internal.ads.Mz, int):com.google.android.gms.internal.ads.Bt");
    }

    public final C3425r createAdOverlay(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Parcel a = mo8008a(8, Xa);
        C3425r a2 = C3454s.m13730a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2357Gt createBannerAdManager(p101d.p129g.p131b.p132a.p134b.C5464b r2, com.google.android.gms.internal.ads.zzjn r3, java.lang.String r4, com.google.android.gms.internal.ads.C2533Mz r5, int r6) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo8007Xa()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2324Fq.m9803a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 1
            android.os.Parcel r2 = r1.mo8008a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C2357Gt
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.Gt r3 = (com.google.android.gms.internal.ads.C2357Gt) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.It r4 = new com.google.android.gms.internal.ads.It
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2762Ut.createBannerAdManager(d.g.b.a.b.b, com.google.android.gms.internal.ads.zzjn, java.lang.String, com.google.android.gms.internal.ads.Mz, int):com.google.android.gms.internal.ads.Gt");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2357Gt createInterstitialAdManager(p101d.p129g.p131b.p132a.p134b.C5464b r2, com.google.android.gms.internal.ads.zzjn r3, java.lang.String r4, com.google.android.gms.internal.ads.C2533Mz r5, int r6) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo8007Xa()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2324Fq.m9803a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 2
            android.os.Parcel r2 = r1.mo8008a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C2357Gt
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.Gt r3 = (com.google.android.gms.internal.ads.C2357Gt) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.It r4 = new com.google.android.gms.internal.ads.It
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2762Ut.createInterstitialAdManager(d.g.b.a.b.b, com.google.android.gms.internal.ads.zzjn, java.lang.String, com.google.android.gms.internal.ads.Mz, int):com.google.android.gms.internal.ads.Gt");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2357Gt createSearchAdManager(p101d.p129g.p131b.p132a.p134b.C5464b r2, com.google.android.gms.internal.ads.zzjn r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.mo8007Xa()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2324Fq.m9803a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            r0.writeInt(r5)
            r2 = 10
            android.os.Parcel r2 = r1.mo8008a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001e
            r3 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C2357Gt
            if (r5 == 0) goto L_0x002c
            r3 = r4
            com.google.android.gms.internal.ads.Gt r3 = (com.google.android.gms.internal.ads.C2357Gt) r3
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.ads.It r4 = new com.google.android.gms.internal.ads.It
            r4.<init>(r3)
            r3 = r4
        L_0x0032:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2762Ut.createSearchAdManager(d.g.b.a.b.b, com.google.android.gms.internal.ads.zzjn, java.lang.String, int):com.google.android.gms.internal.ads.Gt");
    }
}
