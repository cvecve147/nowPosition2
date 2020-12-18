package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.internal.ads.C2478La;

@C2478La
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C1797r();

    /* renamed from: a */
    public final boolean f5923a;

    /* renamed from: b */
    public final boolean f5924b;

    /* renamed from: c */
    private final String f5925c;

    /* renamed from: d */
    public final boolean f5926d;

    /* renamed from: e */
    public final float f5927e;

    /* renamed from: f */
    public final int f5928f;

    /* renamed from: g */
    public final boolean f5929g;

    /* renamed from: h */
    public final boolean f5930h;

    /* renamed from: i */
    public final boolean f5931i;

    zzaq(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f5923a = z;
        this.f5924b = z2;
        this.f5925c = str;
        this.f5926d = z3;
        this.f5927e = f;
        this.f5928f = i;
        this.f5929g = z4;
        this.f5930h = z5;
        this.f5931i = z6;
    }

    public zzaq(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, i, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 2, this.f5923a);
        C2049b.m9040a(parcel, 3, this.f5924b);
        C2049b.m9038a(parcel, 4, this.f5925c, false);
        C2049b.m9040a(parcel, 5, this.f5926d);
        C2049b.m9029a(parcel, 6, this.f5927e);
        C2049b.m9030a(parcel, 7, this.f5928f);
        C2049b.m9040a(parcel, 8, this.f5929g);
        C2049b.m9040a(parcel, 9, this.f5930h);
        C2049b.m9040a(parcel, 10, this.f5931i);
        C2049b.m9026a(parcel, a);
    }
}
