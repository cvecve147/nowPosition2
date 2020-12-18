package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.u */
class C1565u implements Parcelable.Creator {
    C1565u() {
    }

    public LoginClient.Request createFromParcel(Parcel parcel) {
        return new LoginClient.Request(parcel, (C1564t) null);
    }

    public LoginClient.Request[] newArray(int i) {
        return new LoginClient.Request[i];
    }
}
