package android.support.p011v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p011v7.widget.StaggeredGridLayoutManager;

/* renamed from: android.support.v7.widget.Wa */
class C0802Wa implements Parcelable.Creator<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> {
    C0802Wa() {
    }

    public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(parcel);
    }

    public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int i) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[i];
    }
}
