package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.a */
class C1590a implements Parcelable.Creator<ShareHashtag> {
    C1590a() {
    }

    public ShareHashtag createFromParcel(Parcel parcel) {
        return new ShareHashtag(parcel);
    }

    public ShareHashtag[] newArray(int i) {
        return new ShareHashtag[i];
    }
}
