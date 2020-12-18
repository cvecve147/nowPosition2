package android.support.p007v4.media.session;

import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0402i();

    /* renamed from: a */
    private final Object f1598a;

    /* renamed from: b */
    private final C0387b f1599b;

    MediaSessionCompat$Token(Object obj) {
        this(obj, (C0387b) null);
    }

    MediaSessionCompat$Token(Object obj, C0387b bVar) {
        this.f1598a = obj;
        this.f1599b = bVar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f1598a;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f1598a == null;
        }
        Object obj3 = mediaSessionCompat$Token.f1598a;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1598a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.f1598a, i);
        } else {
            parcel.writeStrongBinder((IBinder) this.f1598a);
        }
    }
}
