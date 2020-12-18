package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;

public class AltBeacon extends Beacon {
    public static final Parcelable.Creator<AltBeacon> CREATOR = new C6879a();

    protected AltBeacon() {
    }

    protected AltBeacon(Parcel parcel) {
        super(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
