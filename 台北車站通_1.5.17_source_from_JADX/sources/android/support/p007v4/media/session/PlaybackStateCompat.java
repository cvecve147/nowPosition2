package android.support.p007v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.media.session.C0407n;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0405l();

    /* renamed from: a */
    final int f1605a;

    /* renamed from: b */
    final long f1606b;

    /* renamed from: c */
    final long f1607c;

    /* renamed from: d */
    final float f1608d;

    /* renamed from: e */
    final long f1609e;

    /* renamed from: f */
    final int f1610f;

    /* renamed from: g */
    final CharSequence f1611g;

    /* renamed from: h */
    final long f1612h;

    /* renamed from: i */
    List<CustomAction> f1613i;

    /* renamed from: j */
    final long f1614j;

    /* renamed from: k */
    final Bundle f1615k;

    /* renamed from: l */
    private Object f1616l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0406m();

        /* renamed from: a */
        private final String f1617a;

        /* renamed from: b */
        private final CharSequence f1618b;

        /* renamed from: c */
        private final int f1619c;

        /* renamed from: d */
        private final Bundle f1620d;

        /* renamed from: e */
        private Object f1621e;

        CustomAction(Parcel parcel) {
            this.f1617a = parcel.readString();
            this.f1618b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f1619c = parcel.readInt();
            this.f1620d = parcel.readBundle();
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f1617a = str;
            this.f1618b = charSequence;
            this.f1619c = i;
            this.f1620d = bundle;
        }

        /* renamed from: a */
        public static CustomAction m1890a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0407n.C0408a.m1961a(obj), C0407n.C0408a.m1964d(obj), C0407n.C0408a.m1963c(obj), C0407n.C0408a.m1962b(obj));
            customAction.f1621e = obj;
            return customAction;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f1618b + ", mIcon=" + this.f1619c + ", mExtras=" + this.f1620d;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1617a);
            TextUtils.writeToParcel(this.f1618b, parcel, i);
            parcel.writeInt(this.f1619c);
            parcel.writeBundle(this.f1620d);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f1605a = i;
        this.f1606b = j;
        this.f1607c = j2;
        this.f1608d = f;
        this.f1609e = j3;
        this.f1610f = i2;
        this.f1611g = charSequence;
        this.f1612h = j4;
        this.f1613i = new ArrayList(list);
        this.f1614j = j5;
        this.f1615k = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f1605a = parcel.readInt();
        this.f1606b = parcel.readLong();
        this.f1608d = parcel.readFloat();
        this.f1612h = parcel.readLong();
        this.f1607c = parcel.readLong();
        this.f1609e = parcel.readLong();
        this.f1611g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1613i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f1614j = parcel.readLong();
        this.f1615k = parcel.readBundle();
        this.f1610f = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m1889a(Object obj) {
        ArrayList arrayList;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj2 == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> d = C0407n.m1955d(obj);
        if (d != null) {
            ArrayList arrayList2 = new ArrayList(d.size());
            for (Object a : d) {
                arrayList2.add(CustomAction.m1890a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C0409o.m1965a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0407n.m1960i(obj), C0407n.m1959h(obj), C0407n.m1954c(obj), C0407n.m1958g(obj), C0407n.m1952a(obj), 0, C0407n.m1956e(obj), C0407n.m1957f(obj), arrayList, C0407n.m1953b(obj), bundle);
        playbackStateCompat.f1616l = obj2;
        return playbackStateCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f1605a + ", position=" + this.f1606b + ", buffered position=" + this.f1607c + ", speed=" + this.f1608d + ", updated=" + this.f1612h + ", actions=" + this.f1609e + ", error code=" + this.f1610f + ", error message=" + this.f1611g + ", custom actions=" + this.f1613i + ", active item id=" + this.f1614j + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1605a);
        parcel.writeLong(this.f1606b);
        parcel.writeFloat(this.f1608d);
        parcel.writeLong(this.f1612h);
        parcel.writeLong(this.f1607c);
        parcel.writeLong(this.f1609e);
        TextUtils.writeToParcel(this.f1611g, parcel, i);
        parcel.writeTypedList(this.f1613i);
        parcel.writeLong(this.f1614j);
        parcel.writeBundle(this.f1615k);
        parcel.writeInt(this.f1610f);
    }
}
