package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.B */
class C0268B implements Parcelable.Creator<FragmentState> {
    C0268B() {
    }

    public FragmentState createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public FragmentState[] newArray(int i) {
        return new FragmentState[i];
    }
}
