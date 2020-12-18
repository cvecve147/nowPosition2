package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import com.google.android.gms.internal.ads.C2478La;

@C2478La
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new C1770b();

    /* renamed from: a */
    private final String f5870a;

    /* renamed from: b */
    public final String f5871b;

    /* renamed from: c */
    public final String f5872c;

    /* renamed from: d */
    public final String f5873d;

    /* renamed from: e */
    public final String f5874e;

    /* renamed from: f */
    public final String f5875f;

    /* renamed from: g */
    private final String f5876g;

    /* renamed from: h */
    public final Intent f5877h;

    public zzc(Intent intent) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f5870a = str;
        this.f5871b = str2;
        this.f5872c = str3;
        this.f5873d = str4;
        this.f5874e = str5;
        this.f5875f = str6;
        this.f5876g = str7;
        this.f5877h = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f5870a, false);
        C2049b.m9038a(parcel, 3, this.f5871b, false);
        C2049b.m9038a(parcel, 4, this.f5872c, false);
        C2049b.m9038a(parcel, 5, this.f5873d, false);
        C2049b.m9038a(parcel, 6, this.f5874e, false);
        C2049b.m9038a(parcel, 7, this.f5875f, false);
        C2049b.m9038a(parcel, 8, this.f5876g, false);
        C2049b.m9034a(parcel, 9, (Parcelable) this.f5877h, i, false);
        C2049b.m9026a(parcel, a);
    }
}
