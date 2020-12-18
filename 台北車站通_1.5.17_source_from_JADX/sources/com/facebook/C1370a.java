package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.a */
class C1370a implements Parcelable.Creator {
    C1370a() {
    }

    public AccessToken createFromParcel(Parcel parcel) {
        return new AccessToken(parcel);
    }

    public AccessToken[] newArray(int i) {
        return new AccessToken[i];
    }
}
