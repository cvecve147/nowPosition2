package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.login.H */
class C1540H implements Parcelable.Creator {
    C1540H() {
    }

    public WebViewLoginMethodHandler createFromParcel(Parcel parcel) {
        return new WebViewLoginMethodHandler(parcel);
    }

    public WebViewLoginMethodHandler[] newArray(int i) {
        return new WebViewLoginMethodHandler[i];
    }
}
