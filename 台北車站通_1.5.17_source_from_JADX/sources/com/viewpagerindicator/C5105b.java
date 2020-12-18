package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;
import com.viewpagerindicator.CirclePageIndicator;

/* renamed from: com.viewpagerindicator.b */
class C5105b implements Parcelable.Creator<CirclePageIndicator.SavedState> {
    C5105b() {
    }

    public CirclePageIndicator.SavedState createFromParcel(Parcel parcel) {
        return new CirclePageIndicator.SavedState(parcel);
    }

    public CirclePageIndicator.SavedState[] newArray(int i) {
        return new CirclePageIndicator.SavedState[i];
    }
}
