package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E> implements ShareModel {

    /* renamed from: a */
    private final Uri f5369a;

    /* renamed from: b */
    private final List<String> f5370b;

    /* renamed from: c */
    private final String f5371c;

    /* renamed from: d */
    private final String f5372d;

    /* renamed from: e */
    private final ShareHashtag f5373e;

    protected ShareContent(Parcel parcel) {
        this.f5369a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5370b = m7356a(parcel);
        this.f5371c = parcel.readString();
        this.f5372d = parcel.readString();
        ShareHashtag.C1587a aVar = new ShareHashtag.C1587a();
        aVar.mo6425a(parcel);
        this.f5373e = aVar.mo6428a();
    }

    /* renamed from: a */
    private List<String> m7356a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public Uri mo6418a() {
        return this.f5369a;
    }

    /* renamed from: b */
    public ShareHashtag mo6419b() {
        return this.f5373e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5369a, 0);
        parcel.writeStringList(this.f5370b);
        parcel.writeString(this.f5371c);
        parcel.writeString(this.f5372d);
        parcel.writeParcelable(this.f5373e, 0);
    }
}
