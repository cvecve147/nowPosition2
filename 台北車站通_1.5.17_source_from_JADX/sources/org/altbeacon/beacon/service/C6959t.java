package org.altbeacon.beacon.service;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: org.altbeacon.beacon.service.t */
class C6959t implements Parcelable.Creator<StartRMData> {
    C6959t() {
    }

    public StartRMData createFromParcel(Parcel parcel) {
        return new StartRMData(parcel, (C6959t) null);
    }

    public StartRMData[] newArray(int i) {
        return new StartRMData[i];
    }
}
