package android.support.p007v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.view.a */
class C0444a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
    C0444a() {
    }

    public AbsSavedState createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }

    public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.f1642a;
        }
        throw new IllegalStateException("superState must be null");
    }

    public AbsSavedState[] newArray(int i) {
        return new AbsSavedState[i];
    }
}
