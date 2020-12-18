package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.PlaybackStateCompat;

/* renamed from: android.support.v4.media.session.m */
class C0406m implements Parcelable.Creator<PlaybackStateCompat.CustomAction> {
    C0406m() {
    }

    public PlaybackStateCompat.CustomAction createFromParcel(Parcel parcel) {
        return new PlaybackStateCompat.CustomAction(parcel);
    }

    public PlaybackStateCompat.CustomAction[] newArray(int i) {
        return new PlaybackStateCompat.CustomAction[i];
    }
}
