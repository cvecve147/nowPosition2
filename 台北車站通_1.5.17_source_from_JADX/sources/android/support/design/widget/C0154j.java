package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.BottomSheetBehavior;

/* renamed from: android.support.design.widget.j */
class C0154j implements Parcelable.ClassLoaderCreator<BottomSheetBehavior.SavedState> {
    C0154j() {
    }

    public BottomSheetBehavior.SavedState createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    public BottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.SavedState(parcel, classLoader);
    }

    public BottomSheetBehavior.SavedState[] newArray(int i) {
        return new BottomSheetBehavior.SavedState[i];
    }
}
