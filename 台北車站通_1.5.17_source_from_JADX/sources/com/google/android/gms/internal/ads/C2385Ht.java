package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ht */
public abstract class C2385Ht extends C2296Eq implements C2357Gt {
    public C2385Ht() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.vt] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.google.android.gms.internal.ads.Pt] */
    /* JADX WARNING: type inference failed for: r4v12, types: [com.google.android.gms.internal.ads.st] */
    /* JADX WARNING: type inference failed for: r4v17, types: [com.google.android.gms.internal.ads.Vt] */
    /* JADX WARNING: type inference failed for: r4v22, types: [com.google.android.gms.internal.ads.Lt] */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v36 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e0, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0117, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9807b(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0182, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9804a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018c, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0194, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2324Fq.m9802a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean dispatchTransaction(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            r4 = 0
            switch(r1) {
                case 1: goto L_0x0190;
                case 2: goto L_0x0189;
                case 3: goto L_0x017e;
                case 4: goto L_0x0171;
                case 5: goto L_0x016d;
                case 6: goto L_0x0169;
                case 7: goto L_0x014b;
                case 8: goto L_0x012d;
                case 9: goto L_0x0129;
                case 10: goto L_0x0124;
                case 11: goto L_0x011f;
                case 12: goto L_0x0113;
                case 13: goto L_0x0106;
                case 14: goto L_0x00f9;
                case 15: goto L_0x00e8;
                case 16: goto L_0x0004;
                case 17: goto L_0x0004;
                case 18: goto L_0x00dc;
                case 19: goto L_0x00cf;
                case 20: goto L_0x00b0;
                case 21: goto L_0x0091;
                case 22: goto L_0x0088;
                case 23: goto L_0x0082;
                case 24: goto L_0x0075;
                case 25: goto L_0x006c;
                case 26: goto L_0x0066;
                case 27: goto L_0x0004;
                case 28: goto L_0x0004;
                case 29: goto L_0x0059;
                case 30: goto L_0x004c;
                case 31: goto L_0x0046;
                case 32: goto L_0x0040;
                case 33: goto L_0x003a;
                case 34: goto L_0x0031;
                case 35: goto L_0x002b;
                case 36: goto L_0x000c;
                case 37: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            r1 = 0
            return r1
        L_0x0006:
            android.os.Bundle r1 = r0.mo6797Q()
            goto L_0x0117
        L_0x000c:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0013
            goto L_0x0026
        L_0x0013:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdMetadataListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2499Lt
            if (r4 == 0) goto L_0x0021
            r4 = r2
            com.google.android.gms.internal.ads.Lt r4 = (com.google.android.gms.internal.ads.C2499Lt) r4
            goto L_0x0026
        L_0x0021:
            com.google.android.gms.internal.ads.Nt r4 = new com.google.android.gms.internal.ads.Nt
            r4.<init>(r1)
        L_0x0026:
            r0.mo6803a((com.google.android.gms.internal.ads.C2499Lt) r4)
            goto L_0x018c
        L_0x002b:
            java.lang.String r1 = r0.mo6796O()
            goto L_0x00e0
        L_0x0031:
            boolean r1 = com.google.android.gms.internal.ads.C2324Fq.m9805a(r2)
            r0.mo6809a((boolean) r1)
            goto L_0x018c
        L_0x003a:
            com.google.android.gms.internal.ads.vt r1 = r0.mo6795Na()
            goto L_0x0194
        L_0x0040:
            com.google.android.gms.internal.ads.Pt r1 = r0.mo6794Da()
            goto L_0x0194
        L_0x0046:
            java.lang.String r1 = r0.mo6741V()
            goto L_0x00e0
        L_0x004c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzlu> r1 = com.google.android.gms.internal.ads.zzlu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzlu r1 = (com.google.android.gms.internal.ads.zzlu) r1
            r0.mo6807a((com.google.android.gms.internal.ads.zzlu) r1)
            goto L_0x018c
        L_0x0059:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzmu> r1 = com.google.android.gms.internal.ads.zzmu.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzmu r1 = (com.google.android.gms.internal.ads.zzmu) r1
            r0.mo6808a((com.google.android.gms.internal.ads.zzmu) r1)
            goto L_0x018c
        L_0x0066:
            com.google.android.gms.internal.ads.bu r1 = r0.getVideoController()
            goto L_0x0194
        L_0x006c:
            java.lang.String r1 = r2.readString()
            r0.mo6814c(r1)
            goto L_0x018c
        L_0x0075:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.Dc r1 = com.google.android.gms.internal.ads.C2281Ec.m9688a(r1)
            r0.mo6802a((com.google.android.gms.internal.ads.C2253Dc) r1)
            goto L_0x018c
        L_0x0082:
            boolean r1 = r0.mo6799T()
            goto L_0x0182
        L_0x0088:
            boolean r1 = com.google.android.gms.internal.ads.C2324Fq.m9805a(r2)
            r0.mo6817e(r1)
            goto L_0x018c
        L_0x0091:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0098
            goto L_0x00ab
        L_0x0098:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2791Vt
            if (r4 == 0) goto L_0x00a6
            r4 = r2
            com.google.android.gms.internal.ads.Vt r4 = (com.google.android.gms.internal.ads.C2791Vt) r4
            goto L_0x00ab
        L_0x00a6:
            com.google.android.gms.internal.ads.Xt r4 = new com.google.android.gms.internal.ads.Xt
            r4.<init>(r1)
        L_0x00ab:
            r0.mo6810b((com.google.android.gms.internal.ads.C2791Vt) r4)
            goto L_0x018c
        L_0x00b0:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x00b7
            goto L_0x00ca
        L_0x00b7:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdClickListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3475st
            if (r4 == 0) goto L_0x00c5
            r4 = r2
            com.google.android.gms.internal.ads.st r4 = (com.google.android.gms.internal.ads.C3475st) r4
            goto L_0x00ca
        L_0x00c5:
            com.google.android.gms.internal.ads.ut r4 = new com.google.android.gms.internal.ads.ut
            r4.<init>(r1)
        L_0x00ca:
            r0.mo6805a((com.google.android.gms.internal.ads.C3475st) r4)
            goto L_0x018c
        L_0x00cf:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.gv r1 = com.google.android.gms.internal.ads.C3159hv.m12564a(r1)
            r0.mo6745a((com.google.android.gms.internal.ads.C3131gv) r1)
            goto L_0x018c
        L_0x00dc:
            java.lang.String r1 = r0.mo6820i()
        L_0x00e0:
            r3.writeNoException()
            r3.writeString(r1)
            goto L_0x019a
        L_0x00e8:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.D r1 = com.google.android.gms.internal.ads.C2277E.m9684a(r1)
            java.lang.String r2 = r2.readString()
            r0.mo6801a(r1, r2)
            goto L_0x018c
        L_0x00f9:
            android.os.IBinder r1 = r2.readStrongBinder()
            com.google.android.gms.internal.ads.y r1 = com.google.android.gms.internal.ads.C3653z.m14677a(r1)
            r0.mo6747a((com.google.android.gms.internal.ads.C3625y) r1)
            goto L_0x018c
        L_0x0106:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjn> r1 = com.google.android.gms.internal.ads.zzjn.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzjn r1 = (com.google.android.gms.internal.ads.zzjn) r1
            r0.mo6806a((com.google.android.gms.internal.ads.zzjn) r1)
            goto L_0x018c
        L_0x0113:
            com.google.android.gms.internal.ads.zzjn r1 = r0.mo6800X()
        L_0x0117:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9807b(r3, r1)
            goto L_0x019a
        L_0x011f:
            r0.mo6798Ra()
            goto L_0x018c
        L_0x0124:
            r0.stopLoading()
            goto L_0x018c
        L_0x0129:
            r0.showInterstitial()
            goto L_0x018c
        L_0x012d:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C2620Pt
            if (r4 == 0) goto L_0x0142
            r4 = r2
            com.google.android.gms.internal.ads.Pt r4 = (com.google.android.gms.internal.ads.C2620Pt) r4
            goto L_0x0147
        L_0x0142:
            com.google.android.gms.internal.ads.Rt r4 = new com.google.android.gms.internal.ads.Rt
            r4.<init>(r1)
        L_0x0147:
            r0.mo6804a((com.google.android.gms.internal.ads.C2620Pt) r4)
            goto L_0x018c
        L_0x014b:
            android.os.IBinder r1 = r2.readStrongBinder()
            if (r1 != 0) goto L_0x0152
            goto L_0x0165
        L_0x0152:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r4 = r2 instanceof com.google.android.gms.internal.ads.C3562vt
            if (r4 == 0) goto L_0x0160
            r4 = r2
            com.google.android.gms.internal.ads.vt r4 = (com.google.android.gms.internal.ads.C3562vt) r4
            goto L_0x0165
        L_0x0160:
            com.google.android.gms.internal.ads.xt r4 = new com.google.android.gms.internal.ads.xt
            r4.<init>(r1)
        L_0x0165:
            r0.mo6811b((com.google.android.gms.internal.ads.C3562vt) r4)
            goto L_0x018c
        L_0x0169:
            r0.mo6735B()
            goto L_0x018c
        L_0x016d:
            r0.pause()
            goto L_0x018c
        L_0x0171:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzjj> r1 = com.google.android.gms.internal.ads.zzjj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.ads.C2324Fq.m9801a((android.os.Parcel) r2, r1)
            com.google.android.gms.internal.ads.zzjj r1 = (com.google.android.gms.internal.ads.zzjj) r1
            boolean r1 = r0.mo6812b((com.google.android.gms.internal.ads.zzjj) r1)
            goto L_0x0182
        L_0x017e:
            boolean r1 = r0.mo6822pa()
        L_0x0182:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9804a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x019a
        L_0x0189:
            r0.destroy()
        L_0x018c:
            r3.writeNoException()
            goto L_0x019a
        L_0x0190:
            d.g.b.a.b.b r1 = r0.mo6818ga()
        L_0x0194:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2324Fq.m9802a((android.os.Parcel) r3, (android.os.IInterface) r1)
        L_0x019a:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2385Ht.dispatchTransaction(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
