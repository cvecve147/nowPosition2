package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.LinearLayoutManager;

/* renamed from: android.support.v7.widget.ra */
class C0883ra implements Parcelable.Creator<LinearLayoutManager.SavedState> {
    C0883ra() {
    }

    public LinearLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.SavedState(parcel);
    }

    public LinearLayoutManager.SavedState[] newArray(int i) {
        return new LinearLayoutManager.SavedState[i];
    }
}
