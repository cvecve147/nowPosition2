package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.g */
class C1596g implements Parcelable.Creator<SharePhoto> {
    C1596g() {
    }

    public SharePhoto createFromParcel(Parcel parcel) {
        return new SharePhoto(parcel);
    }

    public SharePhoto[] newArray(int i) {
        return new SharePhoto[i];
    }
}
