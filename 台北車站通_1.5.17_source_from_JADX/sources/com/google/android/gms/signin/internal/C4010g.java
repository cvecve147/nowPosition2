package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.signin.internal.g */
public class C4010g implements Parcelable.Creator<SignInResponse> {
    public SignInResponse createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                connectionResult = (ConnectionResult) C2047a.m9001a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 != 3) {
                C2047a.m9024s(parcel, a);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) C2047a.m9001a(parcel, a, ResolveAccountResponse.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }

    public SignInResponse[] newArray(int i) {
        return new SignInResponse[i];
    }
}
