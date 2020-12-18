package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C3946l();

    /* renamed from: a */
    private boolean f11833a;

    /* renamed from: b */
    private long f11834b;

    /* renamed from: c */
    private float f11835c;

    /* renamed from: d */
    private long f11836d;

    /* renamed from: e */
    private int f11837e;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f11833a = z;
        this.f11834b = j;
        this.f11835c = f;
        this.f11836d = j2;
        this.f11837e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f11833a == zzj.f11833a && this.f11834b == zzj.f11834b && Float.compare(this.f11835c, zzj.f11835c) == 0 && this.f11836d == zzj.f11836d && this.f11837e == zzj.f11837e;
    }

    public final int hashCode() {
        return C2059x.m9062a(Boolean.valueOf(this.f11833a), Long.valueOf(this.f11834b), Float.valueOf(this.f11835c), Long.valueOf(this.f11836d), Integer.valueOf(this.f11837e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f11833a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f11834b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f11835c);
        long j = this.f11836d;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        if (this.f11837e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f11837e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9040a(parcel, 1, this.f11833a);
        C2049b.m9031a(parcel, 2, this.f11834b);
        C2049b.m9029a(parcel, 3, this.f11835c);
        C2049b.m9031a(parcel, 4, this.f11836d);
        C2049b.m9030a(parcel, 5, this.f11837e);
        C2049b.m9026a(parcel, a);
    }
}
