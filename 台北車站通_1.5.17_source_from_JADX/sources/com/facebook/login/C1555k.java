package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog;

/* renamed from: com.facebook.login.k */
class C1555k implements Parcelable.Creator<DeviceAuthDialog.RequestState> {
    C1555k() {
    }

    public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel) {
        return new DeviceAuthDialog.RequestState(parcel);
    }

    public DeviceAuthDialog.RequestState[] newArray(int i) {
        return new DeviceAuthDialog.RequestState[i];
    }
}
