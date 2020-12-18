package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.v */
class C1566v implements Parcelable.Creator {
    C1566v() {
    }

    public LoginClient.Result createFromParcel(Parcel parcel) {
        return new LoginClient.Result(parcel, (C1564t) null);
    }

    public LoginClient.Result[] newArray(int i) {
        return new LoginClient.Result[i];
    }
}
