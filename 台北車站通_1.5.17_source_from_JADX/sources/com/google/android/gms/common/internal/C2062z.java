package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.C2047a;

/* renamed from: com.google.android.gms.common.internal.z */
public class C2062z implements Parcelable.Creator<ResolveAccountRequest> {
    public ResolveAccountRequest createFromParcel(Parcel parcel) {
        int b = C2047a.m9004b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = C2047a.m8999a(parcel);
            int a2 = C2047a.m8998a(a);
            if (a2 == 1) {
                i = C2047a.m9020o(parcel, a);
            } else if (a2 == 2) {
                account = (Account) C2047a.m9001a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i2 = C2047a.m9020o(parcel, a);
            } else if (a2 != 4) {
                C2047a.m9024s(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C2047a.m9001a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        C2047a.m9012g(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public ResolveAccountRequest[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
