package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C1590a();

    /* renamed from: a */
    private final String f5374a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C1587a implements C1592c<ShareHashtag, C1587a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f5375a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1587a mo6425a(Parcel parcel) {
            mo6426a((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
            return this;
        }

        /* renamed from: a */
        public C1587a mo6426a(ShareHashtag shareHashtag) {
            if (shareHashtag == null) {
                return this;
            }
            mo6427a(shareHashtag.mo6422a());
            return this;
        }

        /* renamed from: a */
        public C1587a mo6427a(String str) {
            this.f5375a = str;
            return this;
        }

        /* renamed from: a */
        public ShareHashtag mo6428a() {
            return new ShareHashtag(this, (C1590a) null);
        }
    }

    ShareHashtag(Parcel parcel) {
        this.f5374a = parcel.readString();
    }

    private ShareHashtag(C1587a aVar) {
        this.f5374a = aVar.f5375a;
    }

    /* synthetic */ ShareHashtag(C1587a aVar, C1590a aVar2) {
        this(aVar);
    }

    /* renamed from: a */
    public String mo6422a() {
        return this.f5374a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5374a);
    }
}
