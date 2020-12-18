package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.gA */
public final class C3109gA extends C2267Dq implements C3052eA {
    C3109gA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: C */
    public final boolean mo9346C() {
        Parcel a = mo8008a(17, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: E */
    public final C5464b mo9347E() {
        Parcel a = mo8008a(14, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: H */
    public final boolean mo9348H() {
        Parcel a = mo8008a(18, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: J */
    public final C5464b mo9349J() {
        Parcel a = mo8008a(13, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: a */
    public final List mo9350a() {
        Parcel a = mo8008a(3, mo8007Xa());
        ArrayList b = C2324Fq.m9806b(a);
        a.recycle();
        return b;
    }

    /* renamed from: a */
    public final void mo9351a(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(20, Xa);
    }

    /* renamed from: a */
    public final void mo9352a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9802a(Xa, (IInterface) bVar2);
        C2324Fq.m9802a(Xa, (IInterface) bVar3);
        mo8010b(21, Xa);
    }

    /* renamed from: b */
    public final String mo9353b() {
        Parcel a = mo8008a(2, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo9354b(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(22, Xa);
    }

    /* renamed from: c */
    public final C5464b mo9355c() {
        Parcel a = mo8008a(15, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: d */
    public final String mo9356d() {
        Parcel a = mo8008a(6, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final void mo9357e() {
        mo8010b(19, mo8007Xa());
    }

    public final Bundle getExtras() {
        Parcel a = mo8008a(16, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C2987bu getVideoController() {
        Parcel a = mo8008a(11, mo8007Xa());
        C2987bu a2 = C3015cu.m12112a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo9360h() {
        Parcel a = mo8008a(4, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: s */
    public final String mo9362s() {
        Parcel a = mo8008a(10, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: t */
    public final C2903Zv mo9363t() {
        Parcel a = mo8008a(5, mo8007Xa());
        C2903Zv a2 = C2931_v.m11894a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: u */
    public final double mo9364u() {
        Parcel a = mo8008a(8, mo8007Xa());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: y */
    public final String mo9365y() {
        Parcel a = mo8008a(7, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: z */
    public final String mo9366z() {
        Parcel a = mo8008a(9, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
