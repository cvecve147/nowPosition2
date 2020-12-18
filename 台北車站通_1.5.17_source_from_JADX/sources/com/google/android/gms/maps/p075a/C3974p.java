package com.google.android.gms.maps.p075a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p141d.C5510a;
import p101d.p129g.p131b.p132a.p137e.p141d.C5512c;
import p101d.p129g.p131b.p132a.p137e.p141d.C5513d;
import p101d.p129g.p131b.p132a.p137e.p141d.C5514e;

/* renamed from: com.google.android.gms.maps.a.p */
public final class C3974p extends C5510a implements C3973o {
    C3974p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.p075a.C3959a mo11237F() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14955Xa()
            r1 = 4
            android.os.Parcel r0 = r4.mo14956a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.p075a.C3959a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.maps.a.a r1 = (com.google.android.gms.maps.p075a.C3959a) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.maps.a.k r2 = new com.google.android.gms.maps.a.k
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.p075a.C3974p.mo11237F():com.google.android.gms.maps.a.a");
    }

    /* renamed from: Oa */
    public final C5513d mo11238Oa() {
        Parcel a = mo14956a(5, mo14955Xa());
        C5513d a2 = C5514e.m21023a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.p075a.C3961c mo11239a(p101d.p129g.p131b.p132a.p134b.C5464b r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo14955Xa()
            p101d.p129g.p131b.p132a.p137e.p141d.C5512c.m21018a((android.os.Parcel) r0, (android.os.IInterface) r3)
            p101d.p129g.p131b.p132a.p137e.p141d.C5512c.m21019a((android.os.Parcel) r0, (android.os.Parcelable) r4)
            r3 = 3
            android.os.Parcel r3 = r2.mo14956a(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.maps.p075a.C3961c
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.android.gms.maps.a.c r4 = (com.google.android.gms.maps.p075a.C3961c) r4
            goto L_0x002b
        L_0x0025:
            com.google.android.gms.maps.a.r r0 = new com.google.android.gms.maps.a.r
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.p075a.C3974p.mo11239a(d.g.b.a.b.b, com.google.android.gms.maps.GoogleMapOptions):com.google.android.gms.maps.a.c");
    }

    /* renamed from: c */
    public final void mo11240c(C5464b bVar, int i) {
        Parcel Xa = mo14955Xa();
        C5512c.m21018a(Xa, (IInterface) bVar);
        Xa.writeInt(i);
        mo14958b(6, Xa);
    }
}
