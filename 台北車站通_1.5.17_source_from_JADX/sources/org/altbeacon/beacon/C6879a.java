package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: org.altbeacon.beacon.a */
class C6879a implements Parcelable.Creator<AltBeacon> {
    C6879a() {
    }

    public AltBeacon createFromParcel(Parcel parcel) {
        return new AltBeacon(parcel);
    }

    public AltBeacon[] newArray(int i) {
        return new AltBeacon[i];
    }
}
