package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C2049b;

public class SignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInRequest> CREATOR = new C4009f();

    /* renamed from: a */
    private final int f11916a;

    /* renamed from: b */
    private final ResolveAccountRequest f11917b;

    SignInRequest(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f11916a = i;
        this.f11917b = resolveAccountRequest;
    }

    public SignInRequest(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    /* renamed from: b */
    public ResolveAccountRequest mo11349b() {
        return this.f11917b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C2049b.m9025a(parcel);
        C2049b.m9030a(parcel, 1, this.f11916a);
        C2049b.m9034a(parcel, 2, (Parcelable) mo11349b(), i, false);
        C2049b.m9026a(parcel, a);
    }
}
