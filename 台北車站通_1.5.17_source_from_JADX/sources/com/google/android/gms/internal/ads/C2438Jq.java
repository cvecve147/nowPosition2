package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.Jq */
public final class C2438Jq extends C2267Dq implements C2382Hq {
    C2438Jq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    /* renamed from: Sa */
    public final void mo8296Sa() {
        mo8010b(3, mo8007Xa());
    }

    /* renamed from: a */
    public final void mo8297a(C5464b bVar, String str, String str2) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Xa.writeString(str);
        Xa.writeString((String) null);
        mo8010b(8, Xa);
    }

    /* renamed from: a */
    public final void mo8298a(byte[] bArr) {
        Parcel Xa = mo8007Xa();
        Xa.writeByteArray(bArr);
        mo8010b(5, Xa);
    }

    /* renamed from: a */
    public final void mo8299a(int[] iArr) {
        Parcel Xa = mo8007Xa();
        Xa.writeIntArray((int[]) null);
        mo8010b(4, Xa);
    }

    /* renamed from: b */
    public final void mo8300b(C5464b bVar, String str) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        Xa.writeString(str);
        mo8010b(2, Xa);
    }

    /* renamed from: g */
    public final void mo8301g(int i) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        mo8010b(6, Xa);
    }

    /* renamed from: h */
    public final void mo8302h(int i) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        mo8010b(7, Xa);
    }
}
