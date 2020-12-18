package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.s */
class C1577s implements Parcelable.Creator<FacebookRequestError> {
    C1577s() {
    }

    public FacebookRequestError createFromParcel(Parcel parcel) {
        return new FacebookRequestError(parcel, (C1577s) null);
    }

    public FacebookRequestError[] newArray(int i) {
        return new FacebookRequestError[i];
    }
}
