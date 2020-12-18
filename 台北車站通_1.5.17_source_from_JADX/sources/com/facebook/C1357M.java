package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.M */
class C1357M implements Parcelable.Creator {
    C1357M() {
    }

    public Profile createFromParcel(Parcel parcel) {
        return new Profile(parcel, (C1356L) null);
    }

    public Profile[] newArray(int i) {
        return new Profile[i];
    }
}
