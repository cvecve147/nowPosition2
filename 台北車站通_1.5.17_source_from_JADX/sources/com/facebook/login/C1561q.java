package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.q */
class C1561q implements Parcelable.Creator {
    C1561q() {
    }

    public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
        return new GetTokenLoginMethodHandler(parcel);
    }

    public GetTokenLoginMethodHandler[] newArray(int i) {
        return new GetTokenLoginMethodHandler[i];
    }
}
