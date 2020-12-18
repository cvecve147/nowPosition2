package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    private final Bundle f5380a;

    ShareMedia(Parcel parcel) {
        this.f5380a = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5380a);
    }
}
