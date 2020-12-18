package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.C1589a;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends C1589a> implements ShareModel {

    /* renamed from: a */
    private final Bundle f5383a;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class C1589a<P extends ShareOpenGraphValueContainer, E extends C1589a> implements C1592c<P, E> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Bundle f5384a = new Bundle();

        /* renamed from: a */
        public E mo6443a(P p) {
            if (p != null) {
                this.f5384a.putAll(p.mo6437a());
            }
            return this;
        }

        /* renamed from: a */
        public E mo6444a(String str, String str2) {
            this.f5384a.putString(str, str2);
            return this;
        }
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f5383a = parcel.readBundle(C1589a.class.getClassLoader());
    }

    protected ShareOpenGraphValueContainer(C1589a<P, E> aVar) {
        this.f5383a = (Bundle) aVar.f5384a.clone();
    }

    /* renamed from: a */
    public Bundle mo6437a() {
        return (Bundle) this.f5383a.clone();
    }

    /* renamed from: a */
    public Object mo6438a(String str) {
        return this.f5383a.get(str);
    }

    /* renamed from: b */
    public String mo6439b(String str) {
        return this.f5383a.getString(str);
    }

    /* renamed from: b */
    public Set<String> mo6440b() {
        return this.f5383a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5383a);
    }
}
