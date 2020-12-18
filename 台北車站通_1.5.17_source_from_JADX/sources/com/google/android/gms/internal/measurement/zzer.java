package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;
import java.util.Iterator;

public final class zzer extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzer> CREATOR = new C3750J();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Bundle f11780a;

    zzer(Bundle bundle) {
        this.f11780a = bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo11101a(String str) {
        return this.f11780a.get(str);
    }

    /* renamed from: b */
    public final Bundle mo11102b() {
        return new Bundle(this.f11780a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Long mo11103b(String str) {
        return Long.valueOf(this.f11780a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo11104c(String str) {
        return this.f11780a.getString(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Double mo11105d(String str) {
        return Double.valueOf(this.f11780a.getDouble(str));
    }

    public final Iterator<String> iterator() {
        return new C3746I(this);
    }

    public final int size() {
        return this.f11780a.size();
    }

    public final String toString() {
        return this.f11780a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9032a(parcel, 2, mo11102b(), false);
        C2049b.m9026a(parcel, a);
    }
}
