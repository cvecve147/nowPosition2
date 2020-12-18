package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionInfo> CREATOR = new C2029h();

    /* renamed from: a */
    private Bundle f6383a;

    /* renamed from: b */
    private Feature[] f6384b;

    public ConnectionInfo() {
    }

    ConnectionInfo(Bundle bundle, Feature[] featureArr) {
        this.f6383a = bundle;
        this.f6384b = featureArr;
    }

    /* renamed from: b */
    public Feature[] mo7566b() {
        return this.f6384b;
    }

    /* renamed from: c */
    public Bundle mo7567c() {
        return this.f6383a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9032a(parcel, 1, this.f6383a, false);
        C2049b.m9042a(parcel, 2, (T[]) this.f6384b, i, false);
        C2049b.m9026a(parcel, a);
    }
}
