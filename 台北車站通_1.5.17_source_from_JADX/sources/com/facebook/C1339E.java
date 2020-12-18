package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.GraphRequest;

/* renamed from: com.facebook.E */
class C1339E implements Parcelable.Creator<GraphRequest.ParcelableResourceWithMimeType> {
    C1339E() {
    }

    public GraphRequest.ParcelableResourceWithMimeType createFromParcel(Parcel parcel) {
        return new GraphRequest.ParcelableResourceWithMimeType(parcel, (C1334A) null);
    }

    public GraphRequest.ParcelableResourceWithMimeType[] newArray(int i) {
        return new GraphRequest.ParcelableResourceWithMimeType[i];
    }
}
