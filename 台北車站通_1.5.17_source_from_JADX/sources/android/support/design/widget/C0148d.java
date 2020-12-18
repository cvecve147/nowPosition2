package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.AppBarLayout;

/* renamed from: android.support.design.widget.d */
class C0148d implements Parcelable.ClassLoaderCreator<AppBarLayout.Behavior.SavedState> {
    C0148d() {
    }

    public AppBarLayout.Behavior.SavedState createFromParcel(Parcel parcel) {
        return new AppBarLayout.Behavior.SavedState(parcel, (ClassLoader) null);
    }

    public AppBarLayout.Behavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout.Behavior.SavedState(parcel, classLoader);
    }

    public AppBarLayout.Behavior.SavedState[] newArray(int i) {
        return new AppBarLayout.Behavior.SavedState[i];
    }
}
