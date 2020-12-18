package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.a */
class C1545a implements Parcelable.Creator {
    C1545a() {
    }

    public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
        return new CustomTabLoginMethodHandler(parcel);
    }

    public CustomTabLoginMethodHandler[] newArray(int i) {
        return new CustomTabLoginMethodHandler[i];
    }
}
