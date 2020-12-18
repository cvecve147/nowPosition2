package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzms extends zzjn {
    public zzms(zzjn zzjn) {
        super(zzjn.f10893a, zzjn.f10894b, zzjn.f10895c, zzjn.f10896d, zzjn.f10897e, zzjn.f10898f, zzjn.f10899g, zzjn.f10900h, zzjn.f10901i, zzjn.f10902j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f10893a, false);
        C2049b.m9030a(parcel, 3, this.f10894b);
        C2049b.m9030a(parcel, 6, this.f10897e);
        C2049b.m9026a(parcel, a);
    }
}
