package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.e */
class C1594e implements Parcelable.Creator<ShareOpenGraphContent> {
    C1594e() {
    }

    public ShareOpenGraphContent createFromParcel(Parcel parcel) {
        return new ShareOpenGraphContent(parcel);
    }

    public ShareOpenGraphContent[] newArray(int i) {
        return new ShareOpenGraphContent[i];
    }
}
