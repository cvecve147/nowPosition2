package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.m */
class C1557m implements Parcelable.Creator {
    C1557m() {
    }

    public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
        return new FacebookLiteLoginMethodHandler(parcel);
    }

    public FacebookLiteLoginMethodHandler[] newArray(int i) {
        return new FacebookLiteLoginMethodHandler[i];
    }
}
