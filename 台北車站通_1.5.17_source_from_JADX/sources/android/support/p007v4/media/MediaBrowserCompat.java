package android.support.p007v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.p008os.ResultReceiver;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f1554a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    private static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1555d;

        /* renamed from: e */
        private final Bundle f1556e;

        /* renamed from: f */
        private final C0371a f1557f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1615a(int i, Bundle bundle) {
            C0371a aVar = this.f1557f;
            if (aVar != null) {
                if (i == -1) {
                    aVar.mo1619a(this.f1555d, this.f1556e, bundle);
                } else if (i == 0) {
                    aVar.mo1621c(this.f1555d, this.f1556e, bundle);
                } else if (i != 1) {
                    Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f1556e + ", resultData=" + bundle + ")");
                } else {
                    aVar.mo1620b(this.f1555d, this.f1556e, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    private static class ItemReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1558d;

        /* renamed from: e */
        private final C0372b f1559e;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1615a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.f1559e.mo1623a(this.f1558d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.f1559e.mo1622a((MediaItem) parcelable);
            } else {
                this.f1559e.mo1623a(this.f1558d);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new C0375a();

        /* renamed from: a */
        private final int f1560a;

        /* renamed from: b */
        private final MediaDescriptionCompat f1561b;

        MediaItem(Parcel parcel) {
            this.f1560a = parcel.readInt();
            this.f1561b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.f1560a + ", mDescription=" + this.f1561b + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1560a);
            this.f1561b.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    private static class SearchResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final String f1562d;

        /* renamed from: e */
        private final Bundle f1563e;

        /* renamed from: f */
        private final C0373c f1564f;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1615a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.f1564f.mo1624a(this.f1562d, this.f1563e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.f1564f.mo1625a(this.f1562d, this.f1563e, arrayList);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    public static abstract class C0371a {
        /* renamed from: a */
        public abstract void mo1619a(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: b */
        public abstract void mo1620b(String str, Bundle bundle, Bundle bundle2);

        /* renamed from: c */
        public abstract void mo1621c(String str, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static abstract class C0372b {
        /* renamed from: a */
        public abstract void mo1622a(MediaItem mediaItem);

        /* renamed from: a */
        public abstract void mo1623a(String str);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0373c {
        /* renamed from: a */
        public abstract void mo1624a(String str, Bundle bundle);

        /* renamed from: a */
        public abstract void mo1625a(String str, Bundle bundle, List<MediaItem> list);
    }
}
