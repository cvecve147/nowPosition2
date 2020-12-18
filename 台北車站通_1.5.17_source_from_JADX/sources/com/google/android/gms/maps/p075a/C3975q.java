package com.google.android.gms.maps.p075a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.MarkerOptions;
import p101d.p129g.p131b.p132a.p134b.C5464b;
import p101d.p129g.p131b.p132a.p137e.p141d.C5510a;
import p101d.p129g.p131b.p132a.p137e.p141d.C5512c;
import p101d.p129g.p131b.p132a.p137e.p141d.C5516g;
import p101d.p129g.p131b.p132a.p137e.p141d.C5517h;

/* renamed from: com.google.android.gms.maps.a.q */
public final class C3975q extends C5510a implements C3960b {
    C3975q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.maps.p075a.C3962d mo11218Ea() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo14955Xa()
            r1 = 25
            android.os.Parcel r0 = r4.mo14956a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.maps.p075a.C3962d
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.maps.a.d r1 = (com.google.android.gms.maps.p075a.C3962d) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.maps.a.l r2 = new com.google.android.gms.maps.a.l
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.p075a.C3975q.mo11218Ea():com.google.android.gms.maps.a.d");
    }

    /* renamed from: a */
    public final C5516g mo11219a(MarkerOptions markerOptions) {
        Parcel Xa = mo14955Xa();
        C5512c.m21019a(Xa, (Parcelable) markerOptions);
        Parcel a = mo14956a(11, Xa);
        C5516g a2 = C5517h.m21027a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final void mo11220a(C3967i iVar) {
        Parcel Xa = mo14955Xa();
        C5512c.m21018a(Xa, (IInterface) iVar);
        mo14958b(30, Xa);
    }

    public final void clear() {
        mo14958b(14, mo14955Xa());
    }

    /* renamed from: k */
    public final void mo11222k(boolean z) {
        Parcel Xa = mo14955Xa();
        C5512c.m21020a(Xa, z);
        mo14958b(22, Xa);
    }

    /* renamed from: m */
    public final void mo11223m(C5464b bVar) {
        Parcel Xa = mo14955Xa();
        C5512c.m21018a(Xa, (IInterface) bVar);
        mo14958b(4, Xa);
    }
}
