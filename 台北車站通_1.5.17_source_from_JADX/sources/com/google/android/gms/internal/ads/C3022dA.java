package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.dA */
public final class C3022dA extends C2267Dq implements C2965bA {
    C3022dA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* renamed from: C */
    public final boolean mo9206C() {
        Parcel a = mo8008a(11, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: E */
    public final C5464b mo9207E() {
        Parcel a = mo8008a(20, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: H */
    public final boolean mo9208H() {
        Parcel a = mo8008a(12, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: J */
    public final C5464b mo9209J() {
        Parcel a = mo8008a(15, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: W */
    public final C2903Zv mo9210W() {
        Parcel a = mo8008a(5, mo8007Xa());
        C2903Zv a2 = C2931_v.m11894a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final List mo9211a() {
        Parcel a = mo8008a(3, mo8007Xa());
        ArrayList b = C2324Fq.m9806b(a);
        a.recycle();
        return b;
    }

    /* renamed from: a */
    public final void mo9212a(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(9, Xa);
    }

    /* renamed from: a */
    public final void mo9213a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9802a(Xa, (IInterface) bVar2);
        C2324Fq.m9802a(Xa, (IInterface) bVar3);
        mo8010b(22, Xa);
    }

    /* renamed from: b */
    public final String mo9214b() {
        Parcel a = mo8008a(2, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo9215b(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(14, Xa);
    }

    /* renamed from: c */
    public final C5464b mo9216c() {
        Parcel a = mo8008a(21, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: c */
    public final void mo9217c(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(10, Xa);
    }

    /* renamed from: d */
    public final String mo9218d() {
        Parcel a = mo8008a(6, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final void mo9219e() {
        mo8010b(8, mo8007Xa());
    }

    public final Bundle getExtras() {
        Parcel a = mo8008a(13, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C2987bu getVideoController() {
        Parcel a = mo8008a(16, mo8007Xa());
        C2987bu a2 = C3015cu.m12112a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo9222h() {
        Parcel a = mo8008a(4, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: y */
    public final String mo9224y() {
        Parcel a = mo8008a(7, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
