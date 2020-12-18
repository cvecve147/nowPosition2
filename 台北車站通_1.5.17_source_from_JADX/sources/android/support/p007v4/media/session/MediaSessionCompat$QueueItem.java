package android.support.p007v4.media.session;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new C0400g();

    /* renamed from: a */
    private final MediaDescriptionCompat f1594a;

    /* renamed from: b */
    private final long f1595b;

    /* renamed from: c */
    private Object f1596c;

    MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f1594a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f1595b = parcel.readLong();
    }

    private MediaSessionCompat$QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
        if (mediaDescriptionCompat == null) {
            throw new IllegalArgumentException("Description cannot be null.");
        } else if (j != -1) {
            this.f1594a = mediaDescriptionCompat;
            this.f1595b = j;
            this.f1596c = obj;
        } else {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
    }

    /* renamed from: a */
    public static MediaSessionCompat$QueueItem m1887a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        return new MediaSessionCompat$QueueItem(obj, MediaDescriptionCompat.m1845a(C0403j.m1950a(obj)), C0403j.m1951b(obj));
    }

    /* renamed from: a */
    public static List<MediaSessionCompat$QueueItem> m1888a(List<?> list) {
        if (list == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object a : list) {
            arrayList.add(m1887a((Object) a));
        }
        return arrayList;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaSession.QueueItem {Description=" + this.f1594a + ", Id=" + this.f1595b + " }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.f1594a.writeToParcel(parcel, i);
        parcel.writeLong(this.f1595b);
    }
}
