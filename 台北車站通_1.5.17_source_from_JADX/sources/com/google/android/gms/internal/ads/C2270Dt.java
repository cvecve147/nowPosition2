package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Dt */
public final class C2270Dt extends C2267Dq implements C2213Bt {
    C2270Dt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* renamed from: a */
    public final void mo6961a(C2188Aw aw) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) aw);
        mo8010b(4, Xa);
    }

    /* renamed from: a */
    public final void mo6963a(C2560Nw nw) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) nw);
        mo8010b(10, Xa);
    }

    /* renamed from: a */
    public final void mo6965a(C3562vt vtVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) vtVar);
        mo8010b(2, Xa);
    }

    /* renamed from: a */
    public final void mo6966a(C3621xw xwVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) xwVar);
        mo8010b(3, Xa);
    }

    /* renamed from: a */
    public final void mo6967a(zzpl zzpl) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) zzpl);
        mo8010b(6, Xa);
    }

    /* renamed from: a */
    public final void mo6968a(String str, C2388Hw hw, C2302Ew ew) {
        Parcel Xa = mo8007Xa();
        Xa.writeString(str);
        C2324Fq.m9802a(Xa, (IInterface) hw);
        C2324Fq.m9802a(Xa, (IInterface) ew);
        mo8010b(5, Xa);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: da */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C3646yt mo6969da() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo8007Xa()
            r1 = 1
            android.os.Parcel r0 = r4.mo8008a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C3646yt
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.yt r1 = (com.google.android.gms.internal.ads.C3646yt) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.At r2 = new com.google.android.gms.internal.ads.At
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2270Dt.mo6969da():com.google.android.gms.internal.ads.yt");
    }
}
