package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.facebook.share.model.d */
class C1593d implements Parcelable.Creator<ShareOpenGraphAction> {
    C1593d() {
    }

    public ShareOpenGraphAction createFromParcel(Parcel parcel) {
        return new ShareOpenGraphAction(parcel);
    }

    public ShareOpenGraphAction[] newArray(int i) {
        return new ShareOpenGraphAction[i];
    }
}
