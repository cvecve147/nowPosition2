package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.k */
class C0404k implements Parcelable.Creator<ParcelableVolumeInfo> {
    C0404k() {
    }

    public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
        return new ParcelableVolumeInfo(parcel);
    }

    public ParcelableVolumeInfo[] newArray(int i) {
        return new ParcelableVolumeInfo[i];
    }
}
