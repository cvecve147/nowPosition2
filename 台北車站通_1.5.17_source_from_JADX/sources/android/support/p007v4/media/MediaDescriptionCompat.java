package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.C0377c;
import android.support.p007v4.media.C0379d;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0376b();

    /* renamed from: a */
    private final String f1565a;

    /* renamed from: b */
    private final CharSequence f1566b;

    /* renamed from: c */
    private final CharSequence f1567c;

    /* renamed from: d */
    private final CharSequence f1568d;

    /* renamed from: e */
    private final Bitmap f1569e;

    /* renamed from: f */
    private final Uri f1570f;

    /* renamed from: g */
    private final Bundle f1571g;

    /* renamed from: h */
    private final Uri f1572h;

    /* renamed from: i */
    private Object f1573i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0374a {

        /* renamed from: a */
        private String f1574a;

        /* renamed from: b */
        private CharSequence f1575b;

        /* renamed from: c */
        private CharSequence f1576c;

        /* renamed from: d */
        private CharSequence f1577d;

        /* renamed from: e */
        private Bitmap f1578e;

        /* renamed from: f */
        private Uri f1579f;

        /* renamed from: g */
        private Bundle f1580g;

        /* renamed from: h */
        private Uri f1581h;

        /* renamed from: a */
        public C0374a mo1630a(Bitmap bitmap) {
            this.f1578e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0374a mo1631a(Uri uri) {
            this.f1579f = uri;
            return this;
        }

        /* renamed from: a */
        public C0374a mo1632a(Bundle bundle) {
            this.f1580g = bundle;
            return this;
        }

        /* renamed from: a */
        public C0374a mo1633a(CharSequence charSequence) {
            this.f1577d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0374a mo1634a(String str) {
            this.f1574a = str;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat mo1635a() {
            return new MediaDescriptionCompat(this.f1574a, this.f1575b, this.f1576c, this.f1577d, this.f1578e, this.f1579f, this.f1580g, this.f1581h);
        }

        /* renamed from: b */
        public C0374a mo1636b(Uri uri) {
            this.f1581h = uri;
            return this;
        }

        /* renamed from: b */
        public C0374a mo1637b(CharSequence charSequence) {
            this.f1576c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0374a mo1638c(CharSequence charSequence) {
            this.f1575b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1565a = parcel.readString();
        this.f1566b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1567c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1568d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1569e = (Bitmap) parcel.readParcelable((ClassLoader) null);
        this.f1570f = (Uri) parcel.readParcelable((ClassLoader) null);
        this.f1571g = parcel.readBundle();
        this.f1572h = (Uri) parcel.readParcelable((ClassLoader) null);
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1565a = str;
        this.f1566b = charSequence;
        this.f1567c = charSequence2;
        this.f1568d = charSequence3;
        this.f1569e = bitmap;
        this.f1570f = uri;
        this.f1571g = bundle;
        this.f1572h = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p007v4.media.MediaDescriptionCompat m1845a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x007d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x007d
            android.support.v4.media.MediaDescriptionCompat$a r1 = new android.support.v4.media.MediaDescriptionCompat$a
            r1.<init>()
            java.lang.String r2 = android.support.p007v4.media.C0377c.m1863e(r8)
            r1.mo1634a((java.lang.String) r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0377c.m1865g(r8)
            r1.mo1638c(r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0377c.m1864f(r8)
            r1.mo1637b((java.lang.CharSequence) r2)
            java.lang.CharSequence r2 = android.support.p007v4.media.C0377c.m1857a((java.lang.Object) r8)
            r1.mo1633a((java.lang.CharSequence) r2)
            android.graphics.Bitmap r2 = android.support.p007v4.media.C0377c.m1861c(r8)
            r1.mo1630a((android.graphics.Bitmap) r2)
            android.net.Uri r2 = android.support.p007v4.media.C0377c.m1862d(r8)
            r1.mo1631a((android.net.Uri) r2)
            android.os.Bundle r2 = android.support.p007v4.media.C0377c.m1860b(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 != 0) goto L_0x0042
            r4 = r0
            goto L_0x0048
        L_0x0042:
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
        L_0x0048:
            if (r4 == 0) goto L_0x0060
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x005a
            goto L_0x0061
        L_0x005a:
            r2.remove(r3)
            r2.remove(r5)
        L_0x0060:
            r0 = r2
        L_0x0061:
            r1.mo1632a((android.os.Bundle) r0)
            if (r4 == 0) goto L_0x006a
            r1.mo1636b((android.net.Uri) r4)
            goto L_0x0077
        L_0x006a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r0 < r2) goto L_0x0077
            android.net.Uri r0 = android.support.p007v4.media.C0379d.m1875h(r8)
            r1.mo1636b((android.net.Uri) r0)
        L_0x0077:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.mo1635a()
            r0.f1573i = r8
        L_0x007d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v4.media.MediaDescriptionCompat.m1845a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: a */
    public Object mo1626a() {
        if (this.f1573i != null || Build.VERSION.SDK_INT < 21) {
            return this.f1573i;
        }
        Object a = C0377c.C0378a.m1866a();
        C0377c.C0378a.m1872a(a, this.f1565a);
        C0377c.C0378a.m1874c(a, this.f1566b);
        C0377c.C0378a.m1873b(a, this.f1567c);
        C0377c.C0378a.m1871a(a, this.f1568d);
        C0377c.C0378a.m1868a(a, this.f1569e);
        C0377c.C0378a.m1869a(a, this.f1570f);
        Bundle bundle = this.f1571g;
        if (Build.VERSION.SDK_INT < 23 && this.f1572h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1572h);
        }
        C0377c.C0378a.m1870a(a, bundle);
        if (Build.VERSION.SDK_INT >= 23) {
            C0379d.C0380a.m1876b(a, this.f1572h);
        }
        this.f1573i = C0377c.C0378a.m1867a(a);
        return this.f1573i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f1566b + ", " + this.f1567c + ", " + this.f1568d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1565a);
            TextUtils.writeToParcel(this.f1566b, parcel, i);
            TextUtils.writeToParcel(this.f1567c, parcel, i);
            TextUtils.writeToParcel(this.f1568d, parcel, i);
            parcel.writeParcelable(this.f1569e, i);
            parcel.writeParcelable(this.f1570f, i);
            parcel.writeBundle(this.f1571g);
            parcel.writeParcelable(this.f1572h, i);
            return;
        }
        C0377c.m1859a(mo1626a(), parcel, i);
    }
}
