package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C1588a> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new C1593d();

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C1588a extends ShareOpenGraphValueContainer.C1589a<ShareOpenGraphAction, C1588a> {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1588a mo6432a(Parcel parcel) {
            return mo6433a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }

        /* renamed from: a */
        public C1588a mo6433a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            super.mo6443a(shareOpenGraphAction);
            C1588a aVar = this;
            aVar.mo6434a(shareOpenGraphAction.mo6431c());
            return aVar;
        }

        /* renamed from: a */
        public C1588a mo6434a(String str) {
            mo6444a("og:type", str);
            return this;
        }

        /* renamed from: a */
        public ShareOpenGraphAction mo6435a() {
            return new ShareOpenGraphAction(this, (C1593d) null);
        }
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(C1588a aVar) {
        super(aVar);
    }

    /* synthetic */ ShareOpenGraphAction(C1588a aVar, C1593d dVar) {
        this(aVar);
    }

    /* renamed from: c */
    public String mo6431c() {
        return mo6439b("og:type");
    }
}
