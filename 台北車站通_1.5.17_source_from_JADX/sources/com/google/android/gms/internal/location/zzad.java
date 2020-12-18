package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzad extends AbstractSafeParcelable implements C1874i {
    public static final Parcelable.Creator<zzad> CREATOR = new C3691d();

    /* renamed from: a */
    private static final zzad f10954a = new zzad(Status.f6044a);

    /* renamed from: b */
    private final Status f10955b;

    public zzad(Status status) {
        this.f10955b = status;
    }

    /* renamed from: a */
    public final Status mo7269a() {
        return this.f10955b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9034a(parcel, 1, (Parcelable) mo7269a(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
