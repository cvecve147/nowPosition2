package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: android.support.v4.media.c */
class C0377c {

    /* renamed from: android.support.v4.media.c$a */
    static class C0378a {
        /* renamed from: a */
        public static Object m1866a() {
            return new MediaDescription.Builder();
        }

        /* renamed from: a */
        public static Object m1867a(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: a */
        public static void m1868a(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: a */
        public static void m1869a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: a */
        public static void m1870a(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: a */
        public static void m1871a(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: a */
        public static void m1872a(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: b */
        public static void m1873b(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: c */
        public static void m1874c(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: a */
    public static CharSequence m1857a(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: a */
    public static Object m1858a(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m1859a(Object obj, Parcel parcel, int i) {
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }

    /* renamed from: b */
    public static Bundle m1860b(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: c */
    public static Bitmap m1861c(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: d */
    public static Uri m1862d(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: e */
    public static String m1863e(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: f */
    public static CharSequence m1864f(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: g */
    public static CharSequence m1865g(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }
}
