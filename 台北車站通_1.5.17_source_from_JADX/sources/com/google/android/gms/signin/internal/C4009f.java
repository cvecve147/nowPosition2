package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.signin.internal.f */
public class C4009f implements Parcelable.Creator<SignInRequest> {
    public SignInRequest createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 != 2) {
                C2047a.m9024s(parcel, a);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) C2047a.m9001a(parcel, a, ResolveAccountRequest.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new SignInRequest(i, resolveAccountRequest);
    }

    public SignInRequest[] newArray(int i) {
        return new SignInRequest[i];
    }
}
