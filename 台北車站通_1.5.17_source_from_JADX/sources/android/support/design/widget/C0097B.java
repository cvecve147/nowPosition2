package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.NavigationView;

/* renamed from: android.support.design.widget.B */
class C0097B implements Parcelable.ClassLoaderCreator<NavigationView.SavedState> {
    C0097B() {
    }

    public NavigationView.SavedState createFromParcel(Parcel parcel) {
        return new NavigationView.SavedState(parcel, (ClassLoader) null);
    }

    public NavigationView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new NavigationView.SavedState(parcel, classLoader);
    }

    public NavigationView.SavedState[] newArray(int i) {
        return new NavigationView.SavedState[i];
    }
}
