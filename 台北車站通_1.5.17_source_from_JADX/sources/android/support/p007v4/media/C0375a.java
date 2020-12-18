package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaBrowserCompat;

/* renamed from: android.support.v4.media.a */
class C0375a implements Parcelable.Creator<MediaBrowserCompat.MediaItem> {
    C0375a() {
    }

    public MediaBrowserCompat.MediaItem createFromParcel(Parcel parcel) {
        return new MediaBrowserCompat.MediaItem(parcel);
    }

    public MediaBrowserCompat.MediaItem[] newArray(int i) {
        return new MediaBrowserCompat.MediaItem[i];
    }
}
