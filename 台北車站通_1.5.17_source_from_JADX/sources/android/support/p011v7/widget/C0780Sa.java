package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.SearchView;

/* renamed from: android.support.v7.widget.Sa */
class C0780Sa implements Parcelable.ClassLoaderCreator<SearchView.SavedState> {
    C0780Sa() {
    }

    public SearchView.SavedState createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, (ClassLoader) null);
    }

    public SearchView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }

    public SearchView.SavedState[] newArray(int i) {
        return new SearchView.SavedState[i];
    }
}
