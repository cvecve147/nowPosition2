package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.p068d.C1643a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzmq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmq> CREATOR = new C3563vu();

    /* renamed from: a */
    public final String f10904a;

    public zzmq(C1643a aVar) {
        aVar.mo6586a();
        throw null;
    }

    zzmq(String str) {
        this.f10904a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 15, this.f10904a, false);
        C2049b.m9026a(parcel, a);
    }
}
