package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: org.altbeacon.beacon.n */
class C6916n implements Parcelable.Creator<Region> {
    C6916n() {
    }

    public Region createFromParcel(Parcel parcel) {
        return new Region(parcel);
    }

    public Region[] newArray(int i) {
        return new Region[i];
    }
}
