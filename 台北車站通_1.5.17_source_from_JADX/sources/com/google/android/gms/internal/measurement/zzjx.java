package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzjx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzjx> CREATOR = new C3863kc();

    /* renamed from: a */
    private final int f11785a;

    /* renamed from: b */
    public final String f11786b;

    /* renamed from: c */
    public final long f11787c;

    /* renamed from: d */
    private final Long f11788d;

    /* renamed from: e */
    private final Float f11789e;

    /* renamed from: f */
    private final String f11790f;

    /* renamed from: g */
    public final String f11791g;

    /* renamed from: h */
    private final Double f11792h;

    zzjx(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.f11785a = i;
        this.f11786b = str;
        this.f11787c = j;
        this.f11788d = l;
        Double d2 = null;
        this.f11789e = null;
        if (i == 1) {
            this.f11792h = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.f11792h = d;
        }
        this.f11790f = str2;
        this.f11791g = str3;
    }

    zzjx(C3867lc lcVar) {
        this(lcVar.f11536c, lcVar.f11537d, lcVar.f11538e, lcVar.f11535b);
    }

    zzjx(String str, long j, Object obj, String str2) {
        C2061y.m9076b(str);
        this.f11785a = 2;
        this.f11786b = str;
        this.f11787c = j;
        this.f11791g = str2;
        if (obj == null) {
            this.f11788d = null;
            this.f11789e = null;
            this.f11792h = null;
            this.f11790f = null;
        } else if (obj instanceof Long) {
            this.f11788d = (Long) obj;
            this.f11789e = null;
            this.f11792h = null;
            this.f11790f = null;
        } else if (obj instanceof String) {
            this.f11788d = null;
            this.f11789e = null;
            this.f11792h = null;
            this.f11790f = (String) obj;
        } else if (obj instanceof Double) {
            this.f11788d = null;
            this.f11789e = null;
            this.f11792h = (Double) obj;
            this.f11790f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* renamed from: b */
    public final Object mo11112b() {
        Long l = this.f11788d;
        if (l != null) {
            return l;
        }
        Double d = this.f11792h;
        if (d != null) {
            return d;
        }
        String str = this.f11790f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11785a);
        C2049b.m9038a(parcel, 2, this.f11786b, false);
        C2049b.m9031a(parcel, 3, this.f11787c);
        C2049b.m9037a(parcel, 4, this.f11788d, false);
        C2049b.m9036a(parcel, 5, (Float) null, false);
        C2049b.m9038a(parcel, 6, this.f11790f, false);
        C2049b.m9038a(parcel, 7, this.f11791g, false);
        C2049b.m9035a(parcel, 8, this.f11792h, false);
        C2049b.m9026a(parcel, a);
    }
}
