package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cA */
public abstract class C2994cA extends C2296Eq implements C2965bA {
    public C2994cA() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9804a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9802a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00aa, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 2: goto L_0x00a6;
                case 3: goto L_0x009b;
                case 4: goto L_0x0096;
                case 5: goto L_0x008b;
                case 6: goto L_0x0086;
                case 7: goto L_0x0081;
                case 8: goto L_0x007a;
                case 9: goto L_0x006e;
                case 10: goto L_0x0062;
                case 11: goto L_0x0057;
                case 12: goto L_0x0052;
                case 13: goto L_0x0047;
                case 14: goto L_0x003b;
                case 15: goto L_0x0036;
                case 16: goto L_0x0031;
                case 17: goto L_0x0003;
                case 18: goto L_0x0003;
                case 19: goto L_0x002c;
                case 20: goto L_0x0027;
                case 21: goto L_0x0021;
                case 22: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            android.os.IBinder r1 = r2.readStrongBinder()
            d.g.b.a.b.b r1 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r1)
            android.os.IBinder r4 = r2.readStrongBinder()
            d.g.b.a.b.b r4 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r4)
            android.os.IBinder r2 = r2.readStrongBinder()
            d.g.b.a.b.b r2 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r2)
            r0.mo9213a(r1, r4, r2)
            goto L_0x007d
        L_0x0021:
            d.g.b.a.b.b r1 = r0.mo9216c()
            goto L_0x008f
        L_0x0027:
            d.g.b.a.b.b r1 = r0.mo9207E()
            goto L_0x008f
        L_0x002c:
            com.google.android.gms.internal.ads.Vv r1 = r0.mo9223j()
            goto L_0x008f
        L_0x0031:
            com.google.android.gms.internal.ads.bu r1 = r0.getVideoController()
            goto L_0x008f
        L_0x0036:
            d.g.b.a.b.b r1 = r0.mo9209J()
            goto L_0x008f
        L_0x003b:
            android.os.IBinder r1 = r2.readStrongBinder()
            d.g.b.a.b.b r1 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r1)
            r0.mo9215b(r1)
            goto L_0x007d
        L_0x0047:
            android.os.Bundle r1 = r0.getExtras()
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9807b(r3, r1)
            goto L_0x00b0
        L_0x0052:
            boolean r1 = r0.mo9208H()
            goto L_0x005b
        L_0x0057:
            boolean r1 = r0.mo9206C()
        L_0x005b:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9804a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x00b0
        L_0x0062:
            android.os.IBinder r1 = r2.readStrongBinder()
            d.g.b.a.b.b r1 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r1)
            r0.mo9217c(r1)
            goto L_0x007d
        L_0x006e:
            android.os.IBinder r1 = r2.readStrongBinder()
            d.g.b.a.b.b r1 = p101d.p129g.p131b.p132a.p134b.C5464b.C5465a.asInterface(r1)
            r0.mo9212a(r1)
            goto L_0x007d
        L_0x007a:
            r0.mo9219e()
        L_0x007d:
            r3.writeNoException()
            goto L_0x00b0
        L_0x0081:
            java.lang.String r1 = r0.mo9224y()
            goto L_0x00aa
        L_0x0086:
            java.lang.String r1 = r0.mo9218d()
            goto L_0x00aa
        L_0x008b:
            com.google.android.gms.internal.ads.Zv r1 = r0.mo9210W()
        L_0x008f:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x00b0
        L_0x0096:
            java.lang.String r1 = r0.mo9222h()
            goto L_0x00aa
        L_0x009b:
            java.util.List r1 = r0.mo9211a()
            r3.writeNoException()
            r3.writeList(r1)
            goto L_0x00b0
        L_0x00a6:
            java.lang.String r1 = r0.mo9214b()
        L_0x00aa:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x00b0:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2994cA.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
