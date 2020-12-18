package android.support.p007v4.media;

import android.media.MediaDescription;
import android.net.Uri;
import android.support.p007v4.media.C0377c;

/* renamed from: android.support.v4.media.d */
class C0379d extends C0377c {

    /* renamed from: android.support.v4.media.d$a */
    static class C0380a extends C0377c.C0378a {
        /* renamed from: b */
        public static void m1876b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: h */
    public static Uri m1875h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
