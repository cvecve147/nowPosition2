package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Rz */
public final class C2684Rz extends C2267Dq implements C2626Pz {
    C2684Rz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* renamed from: B */
    public final void mo8705B() {
        mo8010b(9, mo8007Xa());
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2880Yz mo8706Ba() {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2880Yz
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Yz r1 = (com.google.android.gms.internal.ads.C2880Yz) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.aA r2 = new com.google.android.gms.internal.ads.aA
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684Rz.mo8706Ba():com.google.android.gms.internal.ads.Yz");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Ja */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2965bA mo8707Ja() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 16
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2965bA
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bA r1 = (com.google.android.gms.internal.ads.C2965bA) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.dA r2 = new com.google.android.gms.internal.ads.dA
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684Rz.mo8707Ja():com.google.android.gms.internal.ads.bA");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Ta */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3052eA mo8708Ta() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 27
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C3052eA
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.eA r1 = (com.google.android.gms.internal.ads.C3052eA) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.gA r2 = new com.google.android.gms.internal.ads.gA
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2684Rz.mo8708Ta():com.google.android.gms.internal.ads.eA");
    }

    /* renamed from: Z */
    public final boolean mo8709Z() {
        Parcel a = mo8008a(22, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo8710a(zzjj zzjj, String str) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        mo8010b(11, Xa);
    }

    /* renamed from: a */
    public final void mo8711a(zzjj zzjj, String str, String str2) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        Xa.writeString(str2);
        mo8010b(20, Xa);
    }

    /* renamed from: a */
    public final void mo8712a(C5464b bVar, C2910_c _cVar, List<String> list) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9802a(Xa, (IInterface) _cVar);
        Xa.writeStringList(list);
        mo8010b(23, Xa);
    }

    /* renamed from: a */
    public final void mo8713a(C5464b bVar, zzjj zzjj, String str, C2712Sz sz) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) sz);
        mo8010b(3, Xa);
    }

    /* renamed from: a */
    public final void mo8714a(C5464b bVar, zzjj zzjj, String str, C2910_c _cVar, String str2) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) _cVar);
        Xa.writeString(str2);
        mo8010b(10, Xa);
    }

    /* renamed from: a */
    public final void mo8715a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        Xa.writeString(str2);
        C2324Fq.m9802a(Xa, (IInterface) sz);
        mo8010b(7, Xa);
    }

    /* renamed from: a */
    public final void mo8716a(C5464b bVar, zzjj zzjj, String str, String str2, C2712Sz sz, zzpl zzpl, List<String> list) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        Xa.writeString(str2);
        C2324Fq.m9802a(Xa, (IInterface) sz);
        C2324Fq.m9803a(Xa, (Parcelable) zzpl);
        Xa.writeStringList(list);
        mo8010b(14, Xa);
    }

    /* renamed from: a */
    public final void mo8717a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, C2712Sz sz) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjn);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) sz);
        mo8010b(1, Xa);
    }

    /* renamed from: a */
    public final void mo8718a(C5464b bVar, zzjn zzjn, zzjj zzjj, String str, String str2, C2712Sz sz) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9803a(Xa, (Parcelable) zzjn);
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Xa.writeString(str);
        Xa.writeString(str2);
        C2324Fq.m9802a(Xa, (IInterface) sz);
        mo8010b(6, Xa);
    }

    /* renamed from: a */
    public final void mo8719a(boolean z) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9804a(Xa, z);
        mo8010b(25, Xa);
    }

    public final void destroy() {
        mo8010b(5, mo8007Xa());
    }

    public final Bundle getInterstitialAdapterInfo() {
        Parcel a = mo8008a(18, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C5464b getView() {
        Parcel a = mo8008a(2, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    public final boolean isInitialized() {
        Parcel a = mo8008a(13, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: ja */
    public final C3507tw mo8725ja() {
        Parcel a = mo8008a(24, mo8007Xa());
        C3507tw a2 = C3537uw.m14185a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void pause() {
        mo8010b(8, mo8007Xa());
    }

    public final void showInterstitial() {
        mo8010b(4, mo8007Xa());
    }

    public final void showVideo() {
        mo8010b(12, mo8007Xa());
    }

    /* renamed from: u */
    public final void mo8729u(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(21, Xa);
    }

    /* renamed from: ua */
    public final Bundle mo8730ua() {
        Parcel a = mo8008a(19, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final Bundle zzmq() {
        Parcel a = mo8008a(17, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
