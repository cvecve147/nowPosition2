package android.support.p007v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.view.ViewPager;

/* renamed from: android.support.v4.view.D */
class C0422D implements Parcelable.ClassLoaderCreator<ViewPager.SavedState> {
    C0422D() {
    }

    public ViewPager.SavedState createFromParcel(Parcel parcel) {
        return new ViewPager.SavedState(parcel, (ClassLoader) null);
    }

    public ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager.SavedState(parcel, classLoader);
    }

    public ViewPager.SavedState[] newArray(int i) {
        return new ViewPager.SavedState[i];
    }
}
