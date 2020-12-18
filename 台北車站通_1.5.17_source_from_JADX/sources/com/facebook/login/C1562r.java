package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.r */
class C1562r implements Parcelable.Creator {
    C1562r() {
    }

    public KatanaProxyLoginMethodHandler createFromParcel(Parcel parcel) {
        return new KatanaProxyLoginMethodHandler(parcel);
    }

    public KatanaProxyLoginMethodHandler[] newArray(int i) {
        return new KatanaProxyLoginMethodHandler[i];
    }
}
