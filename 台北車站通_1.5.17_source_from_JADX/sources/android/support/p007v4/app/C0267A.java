package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.A */
class C0267A implements Parcelable.Creator<FragmentManagerState> {
    C0267A() {
    }

    public FragmentManagerState createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public FragmentManagerState[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
