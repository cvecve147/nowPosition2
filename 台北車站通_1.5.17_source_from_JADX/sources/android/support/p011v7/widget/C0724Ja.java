package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.RecyclerView;

/* renamed from: android.support.v7.widget.Ja */
class C0724Ja implements Parcelable.ClassLoaderCreator<RecyclerView.SavedState> {
    C0724Ja() {
    }

    public RecyclerView.SavedState createFromParcel(Parcel parcel) {
        return new RecyclerView.SavedState(parcel, (ClassLoader) null);
    }

    public RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.SavedState(parcel, classLoader);
    }

    public RecyclerView.SavedState[] newArray(int i) {
        return new RecyclerView.SavedState[i];
    }
}
