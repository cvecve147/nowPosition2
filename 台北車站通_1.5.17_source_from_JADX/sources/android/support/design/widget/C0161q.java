package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;

/* renamed from: android.support.design.widget.q */
class C0161q implements Parcelable.ClassLoaderCreator<CoordinatorLayout.SavedState> {
    C0161q() {
    }

    public CoordinatorLayout.SavedState createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.SavedState(parcel, (ClassLoader) null);
    }

    public CoordinatorLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.SavedState(parcel, classLoader);
    }

    public CoordinatorLayout.SavedState[] newArray(int i) {
        return new CoordinatorLayout.SavedState[i];
    }
}
