package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: org.altbeacon.beacon.c */
class C6891c implements Parcelable.Creator<Beacon> {
    C6891c() {
    }

    public Beacon createFromParcel(Parcel parcel) {
        return new Beacon(parcel);
    }

    public Beacon[] newArray(int i) {
        return new Beacon[i];
    }
}
