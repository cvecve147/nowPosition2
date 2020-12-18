package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.location.j */
public final class C3697j extends C3688a implements C3696i {
    C3697j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: a */
    public final void mo10341a(zzbf zzbf) {
        Parcel Xa = mo10333Xa();
        C3712y.m14832a(Xa, (Parcelable) zzbf);
        mo10336b(59, Xa);
    }

    /* renamed from: a */
    public final void mo10342a(zzo zzo) {
        Parcel Xa = mo10333Xa();
        C3712y.m14832a(Xa, (Parcelable) zzo);
        mo10336b(75, Xa);
    }

    /* renamed from: b */
    public final Location mo10343b(String str) {
        Parcel Xa = mo10333Xa();
        Xa.writeString(str);
        Parcel a = mo10334a(21, Xa);
        Location location = (Location) C3712y.m14831a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    /* renamed from: j */
    public final void mo10344j(boolean z) {
        Parcel Xa = mo10333Xa();
        C3712y.m14833a(Xa, z);
        mo10336b(12, Xa);
    }
}
