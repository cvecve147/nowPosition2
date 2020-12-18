package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzeu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new C3754K();

    /* renamed from: a */
    public final String f11781a;

    /* renamed from: b */
    public final zzer f11782b;

    /* renamed from: c */
    public final String f11783c;

    /* renamed from: d */
    public final long f11784d;

    zzeu(zzeu zzeu, long j) {
        C2061y.m9067a(zzeu);
        this.f11781a = zzeu.f11781a;
        this.f11782b = zzeu.f11782b;
        this.f11783c = zzeu.f11783c;
        this.f11784d = j;
    }

    public zzeu(String str, zzer zzer, String str2, long j) {
        this.f11781a = str;
        this.f11782b = zzer;
        this.f11783c = str2;
        this.f11784d = j;
    }

    public final String toString() {
        String str = this.f11783c;
        String str2 = this.f11781a;
        String valueOf = String.valueOf(this.f11782b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f11781a, false);
        C2049b.m9034a(parcel, 3, (Parcelable) this.f11782b, i, false);
        C2049b.m9038a(parcel, 4, this.f11783c, false);
        C2049b.m9031a(parcel, 5, this.f11784d);
        C2049b.m9026a(parcel, a);
    }
}
