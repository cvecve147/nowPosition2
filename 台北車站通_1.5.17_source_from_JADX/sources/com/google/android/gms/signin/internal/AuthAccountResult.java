package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C1874i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class AuthAccountResult extends AbstractSafeParcelable implements C1874i {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new C4001a();

    /* renamed from: a */
    private final int f11913a;

    /* renamed from: b */
    private int f11914b;

    /* renamed from: c */
    private Intent f11915c;

    public AuthAccountResult() {
        this(0, (Intent) null);
    }

    AuthAccountResult(int i, int i2, Intent intent) {
        this.f11913a = i;
        this.f11914b = i2;
        this.f11915c = intent;
    }

    public AuthAccountResult(int i, Intent intent) {
        this(2, i, intent);
    }

    /* renamed from: a */
    public Status mo7269a() {
        return this.f11914b == 0 ? Status.f6044a : Status.f6048e;
    }

    /* renamed from: b */
    public int mo11346b() {
        return this.f11914b;
    }

    /* renamed from: c */
    public Intent mo11347c() {
        return this.f11915c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11913a);
        C2049b.m9030a(parcel, 2, mo11346b());
        C2049b.m9034a(parcel, 3, (Parcelable) mo11347c(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
