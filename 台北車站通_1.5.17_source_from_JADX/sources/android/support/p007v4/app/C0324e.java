package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.e */
class C0324e implements Parcelable.Creator<BackStackState> {
    C0324e() {
    }

    public BackStackState createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public BackStackState[] newArray(int i) {
        return new BackStackState[i];
    }
}
