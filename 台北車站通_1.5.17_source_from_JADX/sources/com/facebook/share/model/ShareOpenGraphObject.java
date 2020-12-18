package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new C1595f();

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
