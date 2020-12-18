package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.ActionMenuPresenter;

/* renamed from: android.support.v7.widget.i */
class C0841i implements Parcelable.Creator<ActionMenuPresenter.SavedState> {
    C0841i() {
    }

    public ActionMenuPresenter.SavedState createFromParcel(Parcel parcel) {
        return new ActionMenuPresenter.SavedState(parcel);
    }

    public ActionMenuPresenter.SavedState[] newArray(int i) {
        return new ActionMenuPresenter.SavedState[i];
    }
}
