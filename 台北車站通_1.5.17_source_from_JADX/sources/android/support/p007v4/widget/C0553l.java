package android.support.p007v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.widget.DrawerLayout;

/* renamed from: android.support.v4.widget.l */
class C0553l implements Parcelable.ClassLoaderCreator<DrawerLayout.SavedState> {
    C0553l() {
    }

    public DrawerLayout.SavedState createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel, (ClassLoader) null);
    }

    public DrawerLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DrawerLayout.SavedState(parcel, classLoader);
    }

    public DrawerLayout.SavedState[] newArray(int i) {
        return new DrawerLayout.SavedState[i];
    }
}
