package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.design.internal.g */
class C0090g implements Parcelable.ClassLoaderCreator<ParcelableSparseArray> {
    C0090g() {
    }

    public ParcelableSparseArray createFromParcel(Parcel parcel) {
        return new ParcelableSparseArray(parcel, (ClassLoader) null);
    }

    public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ParcelableSparseArray(parcel, classLoader);
    }

    public ParcelableSparseArray[] newArray(int i) {
        return new ParcelableSparseArray[i];
    }
}
