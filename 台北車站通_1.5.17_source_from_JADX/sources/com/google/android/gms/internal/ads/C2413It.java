package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.It */
public final class C2413It extends C2267Dq implements C2357Gt {
    C2413It(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* renamed from: B */
    public final void mo6735B() {
        mo8010b(6, mo8007Xa());
    }

    /* renamed from: O */
    public final String mo6796O() {
        Parcel a = mo8008a(35, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: Q */
    public final Bundle mo6797Q() {
        Parcel a = mo8008a(37, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: V */
    public final String mo6741V() {
        Parcel a = mo8008a(31, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: X */
    public final zzjn mo6800X() {
        Parcel a = mo8008a(12, mo8007Xa());
        zzjn zzjn = (zzjn) C2324Fq.m9801a(a, zzjn.CREATOR);
        a.recycle();
        return zzjn;
    }

    /* renamed from: a */
    public final void mo6802a(C2253Dc dc) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) dc);
        mo8010b(24, Xa);
    }

    /* renamed from: a */
    public final void mo6803a(C2499Lt lt) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) lt);
        mo8010b(36, Xa);
    }

    /* renamed from: a */
    public final void mo6804a(C2620Pt pt) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) pt);
        mo8010b(8, Xa);
    }

    /* renamed from: a */
    public final void mo6745a(C3131gv gvVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) gvVar);
        mo8010b(19, Xa);
    }

    /* renamed from: a */
    public final void mo6805a(C3475st stVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) stVar);
        mo8010b(20, Xa);
    }

    /* renamed from: a */
    public final void mo6806a(zzjn zzjn) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzjn);
        mo8010b(13, Xa);
    }

    /* renamed from: a */
    public final void mo6808a(zzmu zzmu) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzmu);
        mo8010b(29, Xa);
    }

    /* renamed from: a */
    public final void mo6809a(boolean z) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9804a(Xa, z);
        mo8010b(34, Xa);
    }

    /* renamed from: b */
    public final void mo6810b(C2791Vt vt) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) vt);
        mo8010b(21, Xa);
    }

    /* renamed from: b */
    public final void mo6811b(C3562vt vtVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) vtVar);
        mo8010b(7, Xa);
    }

    /* renamed from: b */
    public final boolean mo6812b(zzjj zzjj) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzjj);
        Parcel a = mo8008a(4, Xa);
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    public final void destroy() {
        mo8010b(2, mo8007Xa());
    }

    /* renamed from: e */
    public final void mo6817e(boolean z) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9804a(Xa, z);
        mo8010b(22, Xa);
    }

    /* renamed from: ga */
    public final C5464b mo6818ga() {
        Parcel a = mo8008a(1, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2987bu getVideoController() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 26
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C2987bu
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.bu r1 = (com.google.android.gms.internal.ads.C2987bu) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.du r2 = new com.google.android.gms.internal.ads.du
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2413It.getVideoController():com.google.android.gms.internal.ads.bu");
    }

    public final void pause() {
        mo8010b(5, mo8007Xa());
    }

    public final void showInterstitial() {
        mo8010b(9, mo8007Xa());
    }
}
