package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C2061y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C1982p();

    /* renamed from: a */
    private final int f6042a;

    /* renamed from: b */
    private final String f6043b;

    Scope(int i, String str) {
        C2061y.m9069a(str, (Object) "scopeUri must not be null or empty");
        this.f6042a = i;
        this.f6043b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    /* renamed from: b */
    public final String mo7264b() {
        return this.f6043b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6043b.equals(((Scope) obj).f6043b);
    }

    public final int hashCode() {
        return this.f6043b.hashCode();
    }

    public final String toString() {
        return this.f6043b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f6042a);
        C2049b.m9038a(parcel, 2, mo7264b(), false);
        C2049b.m9026a(parcel, a);
    }
}
