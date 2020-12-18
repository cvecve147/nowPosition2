package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C3942h();

    /* renamed from: a */
    private int f11813a;

    /* renamed from: b */
    private long f11814b;

    /* renamed from: c */
    private long f11815c;

    /* renamed from: d */
    private boolean f11816d;

    /* renamed from: e */
    private long f11817e;

    /* renamed from: f */
    private int f11818f;

    /* renamed from: g */
    private float f11819g;

    /* renamed from: h */
    private long f11820h;

    public LocationRequest() {
        this.f11813a = 102;
        this.f11814b = 3600000;
        this.f11815c = 600000;
        this.f11816d = false;
        this.f11817e = Long.MAX_VALUE;
        this.f11818f = Integer.MAX_VALUE;
        this.f11819g = 0.0f;
        this.f11820h = 0;
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f11813a = i;
        this.f11814b = j;
        this.f11815c = j2;
        this.f11816d = z;
        this.f11817e = j3;
        this.f11818f = i2;
        this.f11819g = f;
        this.f11820h = j4;
    }

    /* renamed from: b */
    public static LocationRequest m15977b() {
        return new LocationRequest();
    }

    /* renamed from: d */
    private static void m15978d(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final LocationRequest mo11140a(long j) {
        m15978d(j);
        this.f11816d = true;
        this.f11815c = j;
        return this;
    }

    /* renamed from: b */
    public final LocationRequest mo11141b(long j) {
        m15978d(j);
        this.f11814b = j;
        if (!this.f11816d) {
            this.f11815c = (long) (((double) this.f11814b) / 6.0d);
        }
        return this;
    }

    /* renamed from: c */
    public final long mo11142c() {
        long j = this.f11820h;
        long j2 = this.f11814b;
        return j < j2 ? j2 : j;
    }

    /* renamed from: c */
    public final LocationRequest mo11143c(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.f11813a = i;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final LocationRequest mo11144c(long j) {
        m15978d(j);
        this.f11820h = j;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f11813a == locationRequest.f11813a && this.f11814b == locationRequest.f11814b && this.f11815c == locationRequest.f11815c && this.f11816d == locationRequest.f11816d && this.f11817e == locationRequest.f11817e && this.f11818f == locationRequest.f11818f && this.f11819g == locationRequest.f11819g && mo11142c() == locationRequest.mo11142c();
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f11813a), Long.valueOf(this.f11814b), Float.valueOf(this.f11819g), Long.valueOf(this.f11820h));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.f11813a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f11813a != 105) {
            sb.append(" requested=");
            sb.append(this.f11814b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f11815c);
        sb.append("ms");
        if (this.f11820h > this.f11814b) {
            sb.append(" maxWait=");
            sb.append(this.f11820h);
            sb.append("ms");
        }
        if (this.f11819g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f11819g);
            sb.append("m");
        }
        long j = this.f11817e;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f11818f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f11818f);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11813a);
        C2049b.m9031a(parcel, 2, this.f11814b);
        C2049b.m9031a(parcel, 3, this.f11815c);
        C2049b.m9040a(parcel, 4, this.f11816d);
        C2049b.m9031a(parcel, 5, this.f11817e);
        C2049b.m9030a(parcel, 6, this.f11818f);
        C2049b.m9029a(parcel, 7, this.f11819g);
        C2049b.m9031a(parcel, 8, this.f11820h);
        C2049b.m9026a(parcel, a);
    }
}
