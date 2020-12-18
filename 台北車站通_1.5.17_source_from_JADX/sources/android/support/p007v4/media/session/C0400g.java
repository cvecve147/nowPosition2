package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.g */
class C0400g implements Parcelable.Creator<MediaSessionCompat$QueueItem> {
    C0400g() {
    }

    public MediaSessionCompat$QueueItem createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$QueueItem(parcel);
    }

    public MediaSessionCompat$QueueItem[] newArray(int i) {
        return new MediaSessionCompat$QueueItem[i];
    }
}
