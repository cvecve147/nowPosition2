package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.b */
class C1591b implements Parcelable.Creator<ShareLinkContent> {
    C1591b() {
    }

    public ShareLinkContent createFromParcel(Parcel parcel) {
        return new ShareLinkContent(parcel);
    }

    public ShareLinkContent[] newArray(int i) {
        return new ShareLinkContent[i];
    }
}
