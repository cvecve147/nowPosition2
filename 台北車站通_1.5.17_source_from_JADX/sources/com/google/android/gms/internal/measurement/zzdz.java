package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzdz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdz> CREATOR = new C3892s();

    /* renamed from: a */
    public final String f11752a;

    /* renamed from: b */
    public final String f11753b;

    /* renamed from: c */
    public final String f11754c;

    /* renamed from: d */
    public final String f11755d;

    /* renamed from: e */
    public final long f11756e;

    /* renamed from: f */
    public final long f11757f;

    /* renamed from: g */
    public final String f11758g;

    /* renamed from: h */
    public final boolean f11759h;

    /* renamed from: i */
    public final boolean f11760i;

    /* renamed from: j */
    public final long f11761j;

    /* renamed from: k */
    public final String f11762k;

    /* renamed from: l */
    public final long f11763l;

    /* renamed from: m */
    public final long f11764m;

    /* renamed from: n */
    public final int f11765n;

    /* renamed from: o */
    public final boolean f11766o;

    /* renamed from: p */
    public final boolean f11767p;

    /* renamed from: q */
    public final boolean f11768q;

    zzdz(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5) {
        C2061y.m9076b(str);
        this.f11752a = str;
        this.f11753b = TextUtils.isEmpty(str2) ? null : str2;
        this.f11754c = str3;
        this.f11761j = j;
        this.f11755d = str4;
        this.f11756e = j2;
        this.f11757f = j3;
        this.f11758g = str5;
        this.f11759h = z;
        this.f11760i = z2;
        this.f11762k = str6;
        this.f11763l = j4;
        this.f11764m = j5;
        this.f11765n = i;
        this.f11766o = z3;
        this.f11767p = z4;
        this.f11768q = z5;
    }

    zzdz(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5) {
        this.f11752a = str;
        this.f11753b = str2;
        this.f11754c = str3;
        this.f11761j = j3;
        this.f11755d = str4;
        this.f11756e = j;
        this.f11757f = j2;
        this.f11758g = str5;
        this.f11759h = z;
        this.f11760i = z2;
        this.f11762k = str6;
        this.f11763l = j4;
        this.f11764m = j5;
        this.f11765n = i;
        this.f11766o = z3;
        this.f11767p = z4;
        this.f11768q = z5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 2, this.f11752a, false);
        C2049b.m9038a(parcel, 3, this.f11753b, false);
        C2049b.m9038a(parcel, 4, this.f11754c, false);
        C2049b.m9038a(parcel, 5, this.f11755d, false);
        C2049b.m9031a(parcel, 6, this.f11756e);
        C2049b.m9031a(parcel, 7, this.f11757f);
        C2049b.m9038a(parcel, 8, this.f11758g, false);
        C2049b.m9040a(parcel, 9, this.f11759h);
        C2049b.m9040a(parcel, 10, this.f11760i);
        C2049b.m9031a(parcel, 11, this.f11761j);
        C2049b.m9038a(parcel, 12, this.f11762k, false);
        C2049b.m9031a(parcel, 13, this.f11763l);
        C2049b.m9031a(parcel, 14, this.f11764m);
        C2049b.m9030a(parcel, 15, this.f11765n);
        C2049b.m9040a(parcel, 16, this.f11766o);
        C2049b.m9040a(parcel, 17, this.f11767p);
        C2049b.m9040a(parcel, 18, this.f11768q);
        C2049b.m9026a(parcel, a);
    }
}
