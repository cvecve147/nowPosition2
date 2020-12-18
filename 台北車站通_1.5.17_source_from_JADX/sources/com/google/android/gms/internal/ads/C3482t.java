package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p101d.p129g.p131b.p132a.p134b.C5464b;

/* renamed from: com.google.android.gms.internal.ads.t */
public final class C3482t extends C2267Dq implements C3425r {
    C3482t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* renamed from: Aa */
    public final boolean mo6988Aa() {
        Parcel a = mo8008a(11, mo8007Xa());
        boolean a2 = C2324Fq.m9805a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: Ma */
    public final void mo6989Ma() {
        mo8010b(2, mo8007Xa());
    }

    /* renamed from: e */
    public final void mo6997e(Bundle bundle) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) bundle);
        mo8010b(1, Xa);
    }

    /* renamed from: fa */
    public final void mo6999fa() {
        mo8010b(9, mo8007Xa());
    }

    /* renamed from: h */
    public final void mo7002h(Bundle bundle) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9803a(Xa, (Parcelable) bundle);
        Parcel a = mo8008a(6, Xa);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    /* renamed from: h */
    public final void mo7003h(C5464b bVar) {
        Parcel Xa = mo8007Xa();
        C2324Fq.m9802a(Xa, (IInterface) bVar);
        mo8010b(13, Xa);
    }

    /* renamed from: k */
    public final void mo7005k() {
        mo8010b(3, mo8007Xa());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel Xa = mo8007Xa();
        Xa.writeInt(i);
        Xa.writeInt(i2);
        C2324Fq.m9803a(Xa, (Parcelable) intent);
        mo8010b(12, Xa);
    }

    public final void onDestroy() {
        mo8010b(8, mo8007Xa());
    }

    public final void onPause() {
        mo8010b(5, mo8007Xa());
    }

    public final void onResume() {
        mo8010b(4, mo8007Xa());
    }

    /* renamed from: p */
    public final void mo7010p() {
        mo8010b(7, mo8007Xa());
    }
}
