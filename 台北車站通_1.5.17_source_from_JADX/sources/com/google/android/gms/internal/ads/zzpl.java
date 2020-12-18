package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.formats.C1652d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

@C2478La
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new C2622Pv();

    /* renamed from: a */
    public final int f10908a;

    /* renamed from: b */
    public final boolean f10909b;

    /* renamed from: c */
    public final int f10910c;

    /* renamed from: d */
    public final boolean f10911d;

    /* renamed from: e */
    public final int f10912e;

    /* renamed from: f */
    public final zzmu f10913f;

    public zzpl(int i, boolean z, int i2, boolean z2, int i3, zzmu zzmu) {
        this.f10908a = i;
        this.f10909b = z;
        this.f10910c = i2;
        this.f10911d = z2;
        this.f10912e = i3;
        this.f10913f = zzmu;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzpl(C1652d dVar) {
        this(3, dVar.mo6620e(), dVar.mo6617b(), dVar.mo6619d(), dVar.mo6616a(), dVar.mo6618c() != null ? new zzmu(dVar.mo6618c()) : null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10908a);
        C2049b.m9040a(parcel, 2, this.f10909b);
        C2049b.m9030a(parcel, 3, this.f10910c);
        C2049b.m9040a(parcel, 4, this.f10911d);
        C2049b.m9030a(parcel, 5, this.f10912e);
        C2049b.m9034a(parcel, 6, (Parcelable) this.f10913f, i, false);
        C2049b.m9026a(parcel, a);
    }
}
