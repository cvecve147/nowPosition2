package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzed> CREATOR = new C3904v();

    /* renamed from: a */
    public String f11769a;

    /* renamed from: b */
    public String f11770b;

    /* renamed from: c */
    public zzjx f11771c;

    /* renamed from: d */
    public long f11772d;

    /* renamed from: e */
    public boolean f11773e;

    /* renamed from: f */
    public String f11774f;

    /* renamed from: g */
    public zzeu f11775g;

    /* renamed from: h */
    public long f11776h;

    /* renamed from: i */
    public zzeu f11777i;

    /* renamed from: j */
    public long f11778j;

    /* renamed from: k */
    public zzeu f11779k;

    zzed(zzed zzed) {
        C2061y.m9067a(zzed);
        this.f11769a = zzed.f11769a;
        this.f11770b = zzed.f11770b;
        this.f11771c = zzed.f11771c;
        this.f11772d = zzed.f11772d;
        this.f11773e = zzed.f11773e;
        this.f11774f = zzed.f11774f;
        this.f11775g = zzed.f11775g;
        this.f11776h = zzed.f11776h;
        this.f11777i = zzed.f11777i;
        this.f11778j = zzed.f11778j;
        this.f11779k = zzed.f11779k;
    }

    zzed(String str, String str2, zzjx zzjx, long j, boolean z, String str3, zzeu zzeu, long j2, zzeu zzeu2, long j3, zzeu zzeu3) {
        this.f11769a = str;
        this.f11770b = str2;
        this.f11771c = zzjx;
        this.f11772d = j;
        this.f11773e = z;
        this.f11774f = str3;
        this.f11775g = zzeu;
        this.f11776h = j2;
        this.f11777i = zzeu2;
        this.f11778j = j3;
        this.f11779k = zzeu3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f11769a, false);
        C2049b.m9038a(parcel, 3, this.f11770b, false);
        C2049b.m9034a(parcel, 4, (Parcelable) this.f11771c, i, false);
        C2049b.m9031a(parcel, 5, this.f11772d);
        C2049b.m9040a(parcel, 6, this.f11773e);
        C2049b.m9038a(parcel, 7, this.f11774f, false);
        C2049b.m9034a(parcel, 8, (Parcelable) this.f11775g, i, false);
        C2049b.m9031a(parcel, 9, this.f11776h);
        C2049b.m9034a(parcel, 10, (Parcelable) this.f11777i, i, false);
        C2049b.m9031a(parcel, 11, this.f11778j);
        C2049b.m9034a(parcel, 12, (Parcelable) this.f11779k, i, false);
        C2049b.m9026a(parcel, a);
    }
}
