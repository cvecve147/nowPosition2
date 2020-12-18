package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.f */
class C1595f implements Parcelable.Creator<ShareOpenGraphObject> {
    C1595f() {
    }

    public ShareOpenGraphObject createFromParcel(Parcel parcel) {
        return new ShareOpenGraphObject(parcel);
    }

    public ShareOpenGraphObject[] newArray(int i) {
        return new ShareOpenGraphObject[i];
    }
}
