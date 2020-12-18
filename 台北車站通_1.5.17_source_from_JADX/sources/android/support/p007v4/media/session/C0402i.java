package android.support.p007v4.media.session;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.i */
class C0402i implements Parcelable.Creator<MediaSessionCompat$Token> {
    C0402i() {
    }

    public MediaSessionCompat$Token createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
    }

    public MediaSessionCompat$Token[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}
