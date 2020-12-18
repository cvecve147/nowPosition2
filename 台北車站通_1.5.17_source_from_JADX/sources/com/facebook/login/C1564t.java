package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.t */
class C1564t implements Parcelable.Creator {
    C1564t() {
    }

    public LoginClient createFromParcel(Parcel parcel) {
        return new LoginClient(parcel);
    }

    public LoginClient[] newArray(int i) {
        return new LoginClient[i];
    }
}
