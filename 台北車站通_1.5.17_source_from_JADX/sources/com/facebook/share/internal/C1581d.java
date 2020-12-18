package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.DeviceShareDialogFragment;

/* renamed from: com.facebook.share.internal.d */
class C1581d implements Parcelable.Creator<DeviceShareDialogFragment.RequestState> {
    C1581d() {
    }

    public DeviceShareDialogFragment.RequestState createFromParcel(Parcel parcel) {
        return new DeviceShareDialogFragment.RequestState(parcel);
    }

    public DeviceShareDialogFragment.RequestState[] newArray(int i) {
        return new DeviceShareDialogFragment.RequestState[i];
    }
}
