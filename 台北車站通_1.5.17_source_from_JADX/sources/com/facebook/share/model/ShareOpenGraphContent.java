package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C1594e();

    /* renamed from: a */
    private final ShareOpenGraphAction f5381a;

    /* renamed from: b */
    private final String f5382b;

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f5381a = new ShareOpenGraphAction.C1588a().mo6432a(parcel).mo6435a();
        this.f5382b = parcel.readString();
    }

    /* renamed from: c */
    public ShareOpenGraphAction mo6436c() {
        return this.f5381a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5381a, 0);
        parcel.writeString(this.f5382b);
    }
}
