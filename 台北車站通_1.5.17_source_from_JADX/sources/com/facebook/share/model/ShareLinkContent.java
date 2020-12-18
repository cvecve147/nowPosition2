package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C1591b();

    /* renamed from: a */
    private final String f5376a;

    /* renamed from: b */
    private final String f5377b;

    /* renamed from: c */
    private final Uri f5378c;

    /* renamed from: d */
    private final String f5379d;

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f5376a = parcel.readString();
        this.f5377b = parcel.readString();
        this.f5378c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5379d = parcel.readString();
    }

    /* renamed from: c */
    public String mo6429c() {
        return this.f5379d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5376a);
        parcel.writeString(this.f5377b);
        parcel.writeParcelable(this.f5378c, 0);
        parcel.writeString(this.f5379d);
    }
}
