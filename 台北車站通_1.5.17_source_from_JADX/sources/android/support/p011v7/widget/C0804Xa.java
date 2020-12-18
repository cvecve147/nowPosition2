package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.StaggeredGridLayoutManager;

/* renamed from: android.support.v7.widget.Xa */
class C0804Xa implements Parcelable.Creator<StaggeredGridLayoutManager.SavedState> {
    C0804Xa() {
    }

    public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }

    public StaggeredGridLayoutManager.SavedState[] newArray(int i) {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
