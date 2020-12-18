package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C1815k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new C3619xu();

    /* renamed from: a */
    public final boolean f10905a;

    /* renamed from: b */
    public final boolean f10906b;

    /* renamed from: c */
    public final boolean f10907c;

    public zzmu(C1815k kVar) {
        this(kVar.mo7059c(), kVar.mo7058b(), kVar.mo7057a());
    }

    public zzmu(boolean z, boolean z2, boolean z3) {
        this.f10905a = z;
        this.f10906b = z2;
        this.f10907c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 2, this.f10905a);
        C2049b.m9040a(parcel, 3, this.f10906b);
        C2049b.m9040a(parcel, 4, this.f10907c);
        C2049b.m9026a(parcel, a);
    }
}
