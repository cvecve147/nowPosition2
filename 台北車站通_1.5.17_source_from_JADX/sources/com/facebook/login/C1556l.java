package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.l */
class C1556l implements Parcelable.Creator {
    C1556l() {
    }

    public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
        return new DeviceAuthMethodHandler(parcel);
    }

    public DeviceAuthMethodHandler[] newArray(int i) {
        return new DeviceAuthMethodHandler[i];
    }
}
