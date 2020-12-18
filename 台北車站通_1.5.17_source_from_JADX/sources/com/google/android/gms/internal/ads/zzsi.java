package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new C3105fx();

    /* renamed from: a */
    public final boolean f10917a;

    /* renamed from: b */
    public final String f10918b;

    /* renamed from: c */
    public final int f10919c;

    /* renamed from: d */
    public final byte[] f10920d;

    /* renamed from: e */
    public final String[] f10921e;

    /* renamed from: f */
    public final String[] f10922f;

    /* renamed from: g */
    public final boolean f10923g;

    /* renamed from: h */
    public final long f10924h;

    zzsi(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f10917a = z;
        this.f10918b = str;
        this.f10919c = i;
        this.f10920d = bArr;
        this.f10921e = strArr;
        this.f10922f = strArr2;
        this.f10923g = z2;
        this.f10924h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 1, this.f10917a);
        C2049b.m9038a(parcel, 2, this.f10918b, false);
        C2049b.m9030a(parcel, 3, this.f10919c);
        C2049b.m9041a(parcel, 4, this.f10920d, false);
        C2049b.m9043a(parcel, 5, this.f10921e, false);
        C2049b.m9043a(parcel, 6, this.f10922f, false);
        C2049b.m9040a(parcel, 7, this.f10923g);
        C2049b.m9031a(parcel, 8, this.f10924h);
        C2049b.m9026a(parcel, a);
    }
}
