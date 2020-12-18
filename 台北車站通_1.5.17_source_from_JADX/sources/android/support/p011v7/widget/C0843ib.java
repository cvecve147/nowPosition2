package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.Toolbar;

/* renamed from: android.support.v7.widget.ib */
class C0843ib implements Parcelable.ClassLoaderCreator<Toolbar.SavedState> {
    C0843ib() {
    }

    public Toolbar.SavedState createFromParcel(Parcel parcel) {
        return new Toolbar.SavedState(parcel, (ClassLoader) null);
    }

    public Toolbar.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.SavedState(parcel, classLoader);
    }

    public Toolbar.SavedState[] newArray(int i) {
        return new Toolbar.SavedState[i];
    }
}
