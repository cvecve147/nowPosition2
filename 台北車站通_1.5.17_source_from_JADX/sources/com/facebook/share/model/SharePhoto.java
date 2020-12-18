package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C1596g();

    /* renamed from: a */
    private final Bitmap f5385a;

    /* renamed from: b */
    private final Uri f5386b;

    /* renamed from: c */
    private final boolean f5387c;

    /* renamed from: d */
    private final String f5388d;

    SharePhoto(Parcel parcel) {
        super(parcel);
        this.f5385a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f5386b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5387c = parcel.readByte() != 0;
        this.f5388d = parcel.readString();
    }

    /* renamed from: a */
    public Uri mo6445a() {
        return this.f5386b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5385a, 0);
        parcel.writeParcelable(this.f5386b, 0);
        parcel.writeByte(this.f5387c ? (byte) 1 : 0);
        parcel.writeString(this.f5388d);
    }
}
