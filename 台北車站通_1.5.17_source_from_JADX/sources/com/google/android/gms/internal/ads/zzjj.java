package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.List;

@C2478La
public final class zzjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjj> CREATOR = new C3044dt();

    /* renamed from: a */
    public final int f10875a;

    /* renamed from: b */
    public final long f10876b;

    /* renamed from: c */
    public final Bundle f10877c;

    /* renamed from: d */
    public final int f10878d;

    /* renamed from: e */
    public final List<String> f10879e;

    /* renamed from: f */
    public final boolean f10880f;

    /* renamed from: g */
    public final int f10881g;

    /* renamed from: h */
    public final boolean f10882h;

    /* renamed from: i */
    public final String f10883i;

    /* renamed from: j */
    public final zzmq f10884j;

    /* renamed from: k */
    public final Location f10885k;

    /* renamed from: l */
    public final String f10886l;

    /* renamed from: m */
    public final Bundle f10887m;

    /* renamed from: n */
    public final Bundle f10888n;

    /* renamed from: o */
    public final List<String> f10889o;

    /* renamed from: p */
    public final String f10890p;

    /* renamed from: q */
    public final String f10891q;

    /* renamed from: r */
    public final boolean f10892r;

    public zzjj(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzmq zzmq, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.f10875a = i;
        this.f10876b = j;
        this.f10877c = bundle == null ? new Bundle() : bundle;
        this.f10878d = i2;
        this.f10879e = list;
        this.f10880f = z;
        this.f10881g = i3;
        this.f10882h = z2;
        this.f10883i = str;
        this.f10884j = zzmq;
        this.f10885k = location;
        this.f10886l = str2;
        this.f10887m = bundle2 == null ? new Bundle() : bundle2;
        this.f10888n = bundle3;
        this.f10889o = list2;
        this.f10890p = str3;
        this.f10891q = str4;
        this.f10892r = z3;
    }

    /* renamed from: b */
    public final zzjj mo10310b() {
        Bundle bundle = this.f10887m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f10877c;
            this.f10887m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle);
        }
        return new zzjj(this.f10875a, this.f10876b, bundle, this.f10878d, this.f10879e, this.f10880f, this.f10881g, this.f10882h, this.f10883i, this.f10884j, this.f10885k, this.f10886l, this.f10887m, this.f10888n, this.f10889o, this.f10890p, this.f10891q, this.f10892r);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjj)) {
            return false;
        }
        zzjj zzjj = (zzjj) obj;
        return this.f10875a == zzjj.f10875a && this.f10876b == zzjj.f10876b && C2059x.m9064a(this.f10877c, zzjj.f10877c) && this.f10878d == zzjj.f10878d && C2059x.m9064a(this.f10879e, zzjj.f10879e) && this.f10880f == zzjj.f10880f && this.f10881g == zzjj.f10881g && this.f10882h == zzjj.f10882h && C2059x.m9064a(this.f10883i, zzjj.f10883i) && C2059x.m9064a(this.f10884j, zzjj.f10884j) && C2059x.m9064a(this.f10885k, zzjj.f10885k) && C2059x.m9064a(this.f10886l, zzjj.f10886l) && C2059x.m9064a(this.f10887m, zzjj.f10887m) && C2059x.m9064a(this.f10888n, zzjj.f10888n) && C2059x.m9064a(this.f10889o, zzjj.f10889o) && C2059x.m9064a(this.f10890p, zzjj.f10890p) && C2059x.m9064a(this.f10891q, zzjj.f10891q) && this.f10892r == zzjj.f10892r;
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f10875a), Long.valueOf(this.f10876b), this.f10877c, Integer.valueOf(this.f10878d), this.f10879e, Boolean.valueOf(this.f10880f), Integer.valueOf(this.f10881g), Boolean.valueOf(this.f10882h), this.f10883i, this.f10884j, this.f10885k, this.f10886l, this.f10887m, this.f10888n, this.f10889o, this.f10890p, this.f10891q, Boolean.valueOf(this.f10892r));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f10875a);
        C2049b.m9031a(parcel, 2, this.f10876b);
        C2049b.m9032a(parcel, 3, this.f10877c, false);
        C2049b.m9030a(parcel, 4, this.f10878d);
        C2049b.m9047b(parcel, 5, this.f10879e, false);
        C2049b.m9040a(parcel, 6, this.f10880f);
        C2049b.m9030a(parcel, 7, this.f10881g);
        C2049b.m9040a(parcel, 8, this.f10882h);
        C2049b.m9038a(parcel, 9, this.f10883i, false);
        C2049b.m9034a(parcel, 10, (Parcelable) this.f10884j, i, false);
        C2049b.m9034a(parcel, 11, (Parcelable) this.f10885k, i, false);
        C2049b.m9038a(parcel, 12, this.f10886l, false);
        C2049b.m9032a(parcel, 13, this.f10887m, false);
        C2049b.m9032a(parcel, 14, this.f10888n, false);
        C2049b.m9047b(parcel, 15, this.f10889o, false);
        C2049b.m9038a(parcel, 16, this.f10890p, false);
        C2049b.m9038a(parcel, 17, this.f10891q, false);
        C2049b.m9040a(parcel, 18, this.f10892r);
        C2049b.m9026a(parcel, a);
    }
}
