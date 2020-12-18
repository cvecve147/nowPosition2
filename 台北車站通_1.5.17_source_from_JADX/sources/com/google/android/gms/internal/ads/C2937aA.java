package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.aA */
public final class C2937aA extends C2267Dq implements C2880Yz {
    C2937aA(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* renamed from: C */
    public final boolean mo9092C() {
        Parcel a = mo8008a(13, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: E */
    public final C5464b mo9093E() {
        Parcel a = mo8008a(20, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: H */
    public final boolean mo9094H() {
        Parcel a = mo8008a(14, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: J */
    public final C5464b mo9095J() {
        Parcel a = mo8008a(18, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: a */
    public final List mo9096a() {
        Parcel a = mo8008a(3, mo8007Xa());
        ArrayList b = C2324Fq.m9806b(a);
        a.recycle();
        return b;
    }

    /* renamed from: a */
    public final void mo9097a(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(11, Xa);
    }

    /* renamed from: a */
    public final void mo9098a(C5464b bVar, C5464b bVar2, C5464b bVar3) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        C2324Fq.m9802a(Xa, (IInterface) bVar2);
        C2324Fq.m9802a(Xa, (IInterface) bVar3);
        mo8010b(22, Xa);
    }

    /* renamed from: b */
    public final String mo9099b() {
        Parcel a = mo8008a(2, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo9100b(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(16, Xa);
    }

    /* renamed from: c */
    public final C5464b mo9101c() {
        Parcel a = mo8008a(21, mo8007Xa());
        C5464b asInterface = C5464b.C5465a.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }

    /* renamed from: c */
    public final void mo9102c(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(12, Xa);
    }

    /* renamed from: d */
    public final String mo9103d() {
        Parcel a = mo8008a(6, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: e */
    public final void mo9104e() {
        mo8010b(10, mo8007Xa());
    }

    public final Bundle getExtras() {
        Parcel a = mo8008a(15, mo8007Xa());
        Bundle bundle = (Bundle) C2324Fq.m9801a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final C2987bu getVideoController() {
        Parcel a = mo8008a(17, mo8007Xa());
        C2987bu a2 = C3015cu.m12112a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: h */
    public final String mo9107h() {
        Parcel a = mo8008a(4, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: s */
    public final String mo9109s() {
        Parcel a = mo8008a(9, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: t */
    public final C2903Zv mo9110t() {
        Parcel a = mo8008a(5, mo8007Xa());
        C2903Zv a2 = C2931_v.m11894a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: u */
    public final double mo9111u() {
        Parcel a = mo8008a(7, mo8007Xa());
        double readDouble = a.readDouble();
        a.recycle();
        return readDouble;
    }

    /* renamed from: z */
    public final String mo9112z() {
        Parcel a = mo8008a(8, mo8007Xa());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
