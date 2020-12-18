package android.support.p007v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.widget.NestedScrollView;

/* renamed from: android.support.v4.widget.r */
class C0564r implements Parcelable.Creator<NestedScrollView.SavedState> {
    C0564r() {
    }

    public NestedScrollView.SavedState createFromParcel(Parcel parcel) {
        return new NestedScrollView.SavedState(parcel);
    }

    public NestedScrollView.SavedState[] newArray(int i) {
        return new NestedScrollView.SavedState[i];
    }
}
