package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import org.apache.http.cookie.ClientCookie;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C1990d();

    /* renamed from: a */
    private final String f6012a;
    @Deprecated

    /* renamed from: b */
    private final int f6013b;

    /* renamed from: c */
    private final long f6014c;

    public Feature(String str, int i, long j) {
        this.f6012a = str;
        this.f6013b = i;
        this.f6014c = j;
    }

    /* renamed from: b */
    public String mo7222b() {
        return this.f6012a;
    }

    /* renamed from: c */
    public long mo7223c() {
        long j = this.f6014c;
        return j == -1 ? (long) this.f6013b : j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            return ((mo7222b() != null && mo7222b().equals(feature.mo7222b())) || (mo7222b() == null && feature.mo7222b() == null)) && mo7223c() == feature.mo7223c();
        }
    }

    public int hashCode() {
        return C2059x.m9062a(mo7222b(), Long.valueOf(mo7223c()));
    }

    public String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("name", mo7222b());
        a.mo7711a(ClientCookie.VERSION_ATTR, Long.valueOf(mo7223c()));
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9038a(parcel, 1, mo7222b(), false);
        C2049b.m9030a(parcel, 2, this.f6013b);
        C2049b.m9031a(parcel, 3, mo7223c());
        C2049b.m9026a(parcel, a);
    }
}
