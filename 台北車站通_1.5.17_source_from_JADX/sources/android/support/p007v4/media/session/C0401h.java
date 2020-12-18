package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.h */
class C0401h implements Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> {
    C0401h() {
    }

    public MediaSessionCompat$ResultReceiverWrapper createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$ResultReceiverWrapper(parcel);
    }

    public MediaSessionCompat$ResultReceiverWrapper[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}
