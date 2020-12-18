package android.support.p007v4.media;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.b */
class C0376b implements Parcelable.Creator<MediaDescriptionCompat> {
    C0376b() {
    }

    public MediaDescriptionCompat createFromParcel(Parcel parcel) {
        return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m1845a(C0377c.m1858a(parcel));
    }

    public MediaDescriptionCompat[] newArray(int i) {
        return new MediaDescriptionCompat[i];
    }
}
