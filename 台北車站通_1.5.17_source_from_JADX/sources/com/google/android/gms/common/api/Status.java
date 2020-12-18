package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2059x;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class Status extends AbstractSafeParcelable implements C1874i, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C1983q();

    /* renamed from: a */
    public static final Status f6044a = new Status(0);

    /* renamed from: b */
    public static final Status f6045b = new Status(14);

    /* renamed from: c */
    public static final Status f6046c = new Status(8);

    /* renamed from: d */
    public static final Status f6047d = new Status(15);

    /* renamed from: e */
    public static final Status f6048e = new Status(16);

    /* renamed from: f */
    private static final Status f6049f = new Status(17);

    /* renamed from: g */
    public static final Status f6050g = new Status(18);

    /* renamed from: h */
    private final int f6051h;

    /* renamed from: i */
    private final int f6052i;

    /* renamed from: j */
    private final String f6053j;

    /* renamed from: k */
    private final PendingIntent f6054k;

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f6051h = i;
        this.f6052i = i2;
        this.f6053j = str;
        this.f6054k = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final Status mo7269a() {
        return this;
    }

    /* renamed from: b */
    public final int mo7270b() {
        return this.f6052i;
    }

    /* renamed from: c */
    public final String mo7271c() {
        return this.f6053j;
    }

    /* renamed from: d */
    public final boolean mo7272d() {
        return this.f6054k != null;
    }

    /* renamed from: e */
    public final boolean mo7273e() {
        return this.f6052i <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6051h == status.f6051h && this.f6052i == status.f6052i && C2059x.m9064a(this.f6053j, status.f6053j) && C2059x.m9064a(this.f6054k, status.f6054k);
    }

    /* renamed from: f */
    public final String mo7275f() {
        String str = this.f6053j;
        return str != null ? str : C1868d.m8308a(this.f6052i);
    }

    public final int hashCode() {
        return C2059x.m9062a(Integer.valueOf(this.f6051h), Integer.valueOf(this.f6052i), this.f6053j, this.f6054k);
    }

    public final String toString() {
        C2059x.C2060a a = C2059x.m9063a((Object) this);
        a.mo7711a("statusCode", mo7275f());
        a.mo7711a("resolution", this.f6054k);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, mo7270b());
        C2049b.m9038a(parcel, 2, mo7271c(), false);
        C2049b.m9034a(parcel, 3, (Parcelable) this.f6054k, i, false);
        C2049b.m9030a(parcel, 1000, this.f6051h);
        C2049b.m9026a(parcel, a);
    }
}
