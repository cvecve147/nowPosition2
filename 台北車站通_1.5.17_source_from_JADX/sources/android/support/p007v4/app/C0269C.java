package android.support.p007v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.app.FragmentTabHost;

/* renamed from: android.support.v4.app.C */
class C0269C implements Parcelable.Creator<FragmentTabHost.SavedState> {
    C0269C() {
    }

    public FragmentTabHost.SavedState createFromParcel(Parcel parcel) {
        return new FragmentTabHost.SavedState(parcel);
    }

    public FragmentTabHost.SavedState[] newArray(int i) {
        return new FragmentTabHost.SavedState[i];
    }
}
