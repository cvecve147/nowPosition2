package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.location.C3947m;
import com.google.android.gms.location.C3948n;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C3684C();

    /* renamed from: a */
    private int f10976a;

    /* renamed from: b */
    private zzm f10977b;

    /* renamed from: c */
    private C3947m f10978c;

    /* renamed from: d */
    private C3693f f10979d;

    zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        this.f10976a = i;
        this.f10977b = zzm;
        C3693f fVar = null;
        this.f10978c = iBinder == null ? null : C3948n.m15992a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof C3693f ? (C3693f) queryLocalInterface : new C3695h(iBinder2);
        }
        this.f10979d = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10976a);
        C2049b.m9034a(parcel, 2, (Parcelable) this.f10977b, i, false);
        C3947m mVar = this.f10978c;
        IBinder iBinder = null;
        C2049b.m9033a(parcel, 3, mVar == null ? null : mVar.asBinder(), false);
        C3693f fVar = this.f10979d;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        C2049b.m9033a(parcel, 4, iBinder, false);
        C2049b.m9026a(parcel, a);
    }
}
