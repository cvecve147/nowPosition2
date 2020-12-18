package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.e */
class C0381e implements Parcelable.Creator<MediaMetadataCompat> {
    C0381e() {
    }

    public MediaMetadataCompat createFromParcel(Parcel parcel) {
        return new MediaMetadataCompat(parcel);
    }

    public MediaMetadataCompat[] newArray(int i) {
        return new MediaMetadataCompat[i];
    }
}
