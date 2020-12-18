package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.l */
class C0405l implements Parcelable.Creator<PlaybackStateCompat> {
    C0405l() {
    }

    public PlaybackStateCompat createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat(parcel);
    }

    public PlaybackStateCompat[] newArray(int i) {
        return new PlaybackStateCompat[i];
    }
}
