package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.g */
class C0383g implements Parcelable.Creator<RatingCompat> {
    C0383g() {
    }

    public RatingCompat createFromParcel(Parcel parcel) {
        return new RatingCompat(parcel.readInt(), parcel.readFloat());
    }

    public RatingCompat[] newArray(int i) {
        return new RatingCompat[i];
    }
}
