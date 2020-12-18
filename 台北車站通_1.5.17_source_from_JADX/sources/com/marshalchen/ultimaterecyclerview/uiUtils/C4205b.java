package com.marshalchen.ultimaterecyclerview.uiUtils;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.marshalchen.ultimaterecyclerview.uiUtils.b */
class C4205b implements Parcelable.Creator<SavedStateScrolling> {
    C4205b() {
    }

    public SavedStateScrolling createFromParcel(Parcel parcel) {
        return new SavedStateScrolling(parcel);
    }

    public SavedStateScrolling[] newArray(int i) {
        return new SavedStateScrolling[i];
    }
}
